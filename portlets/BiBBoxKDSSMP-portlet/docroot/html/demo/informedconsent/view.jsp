<%@ include file="/html/demo/init.jsp" %> 

<portlet:defineObjects />

<%
com.liferay.portal.model.Group currentGroup =  themeDisplay.getLayout().getGroup();
if (currentGroup.isOrganization()) {
	long organizationId = currentGroup.getClassPK();
  	Organization organization = OrganizationLocalServiceUtil.getOrganization(organizationId);
  	String az = organization.getExpandoBridge().getAttribute("aznummer").toString();
  	String male = organization.getExpandoBridge().getAttribute("male").toString();
  	String date_ = organization.getExpandoBridge().getAttribute("dateofbirth").toString();
  	SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
  	Date dateofbirth = dateFormat.parse(date_);
  	Date now = new Date();
  	long calc = now.getTime() - dateofbirth.getTime();
  	long MILLS_IN_YEAR = 1000L * 60 * 60 * 24 * 365;
  	long age = calc/MILLS_IN_YEAR;
  	String name = organization.getExpandoBridge().getAttribute("firstname").toString() + " " + organization.getExpandoBridge().getAttribute("lastname").toString() + " (" + organization.getExpandoBridge().getAttribute("dateofbirth").toString() + ")";
  	
	%>

<table>
<tr><td>Kontakt: <%= themeDisplay.getUser().getFullName() %></td><td>Serviceunterlage</td></tr>
<tr><td>Letzte �nderung:</td><td>FB<%= az %></td></tr>
</table>
<br>
<div style="margin: auto;width: 100%;text-align: center;">
<h1>PatientInneninformation/Einverst�ndniserkl�rung</h1><br>
<h3>f�r die Diagnostik und Forschungsvorhaben der Medizinischen Universit�t Graz</h3><br><br>
</div>
<b>Bereitstellung von Gewebsproben, Blutproben und anderen K�rperfl�ssigkeiten zu Forschungszwecken und zur Entwicklung neuer Diagnoseverfahren, Vorbeugema�nahmen und Behandlungen </b><br><br>

Sehr geehrte Patientin! Sehr geehrter Patient!<br> <br>

<u>Einleitung</u><br>

Die wissenschaftliche Untersuchung von Gewebsproben, Blutproben und anderen K�rperfl�ssigkeiten in Verbindung mit Krankheitssymptomen ist heute eine der wichtigsten Voraussetzungen f�r ein besseres Verst�ndnis der Ursachen und des Verlaufs von Erkrankungen sowie f�r die darauf aufbauende Entwicklung neuer Verfahren f�r die Diagnose, Vorbeugung und Behandlung dieser Erkrankungen. Hierf�r werden typischerweise aus medizinischen Proben Zellen oder andere Bestandteileisoliert, vermehrt und mit mikroskopischen, biochemischen, immunologischen oder molekularbiologischen Methoden untersucht. Auch genanalytische Methoden k�nnen dabei zum Einsatz kommen. (Alle diese Methoden sind wissenschaftliche Techniken, mit denen die verschiedenen chemischen und biologischen Vorg�nge im menschlichen K�rper bzw. in dessen Zellen erforscht und besser verstanden werden.) Solche Untersuchungen sind nur m�glich, wenn Patientinnen und Patienten sich bereit erkl�ren, medizinische Probenhierf�r zur Verf�gung zu stellen.<br> 
<br>
<b>Wir laden Sie ein, an dem oben genannten Forschungsvorhaben teilzunehmen. Voraussetzung f�r die Durchf�hrung dieser Forschung ist, dass Sie Ihr Einverst�ndnis zur Teilnahme schriftlich erkl�ren. Bitte lesen Sie den folgenden Text als Erg�nzung zu einem ausf�hrlichen Gespr�ch mit Fachleuten sorgf�ltig durch und z�gern Sie nicht, Fragen zu stellen. </b><br>
<br>
<u>Ma�nahmen im Rahmen des Forschungsprojektes:</u>
<ul>
<li>
Sollten bei den ohnehin vorgesehenen Untersuchungen im Rahmen der Diagnose und Behandlung Ihrer Erkrankung Blutproben, andere K�rperfl�ssigkeiten oder Gewebsproben gewonnen werden, ist geplant, jene Anteile dieser medizinischen Proben, welche nicht mehr unmittelbar f�r Ihre medizinische Betreuung ben�tigt werden, ohne zeitliche Befristung in einer sogenannten Biobank zu sammeln, zu archivieren und in Verbindung mit den erhobenen Krankheitsdaten f�r die Forschung zu verwenden. Diese Biobank ist Eigentum der Medizinischen Universit�t Graz und firmenunabh�ngig.<br>
Es wird bei Ihnen keinesfalls mehr oder anderes Gewebe entfernt, als f�r die Diagnose beziehungsweise Therapie der bei Ihnen vorliegenden Erkrankung erforderlich ist. F�r etwaige zus�tzliche Eingriffe im Rahmen von anderen wissenschaftlichen Projekten der medizinischen Universit�t Graz werden sie gesondert dar�ber informiert.<br>
Lediglich im Rahmen von routinem��ig vorgesehenen Blutabnahmen k�nnte Ihnen bis maximal 20 ml Blut zus�tzlich entnommen werden. 
</li>
<li>
Um Zusammenh�nge zwischen den Forschungsergebnissen und Ihrer Erkrankung feststellen zu k�nnen, d�rfen gegebenenfalls von der Medizinischen Universit�t Graz Informationen �ber den Verlauf Ihrer Erkrankung von Ihrem Hausarzt, dem Sie betreuenden Facharzt, oder anderen Krankenh�usern, an denen Sie behandelt werden, eingeholt werden. 
</li>
<li>
Die Forschungsergebnisse werden gemeinsam mit den Daten �ber den Verlauf Ihrer Erkrankung in kodierter Form in einer Datenbank gespeichert. Ebenso werden die Proben kodiert aufbewahrt. Unter kodiert wird verstanden, dass nach menschlichem Ermessen mit Ausnahme der Sie behandelnden �rztinnen und �rzte und des unmittelbar befassten Personals der Biobank keine dritte Person die medizinischen Proben, Ihre Befunde sowie die Angaben �ber Ihre Krankheitssymptome und Lebensumst�nde mit Ihnen in Verbindung bringen kann. Alle Personen, die Zugang zu diesen Proben und Daten haben, unterliegen der Schweigepflicht. Der Schutz vor dem Zugriff Unbefugter ist sichergestellt. <br>
Die Verantwortung f�r die Aufbewahrung bzw. gegebenenfalls Vernichtung der Daten und Proben tr�gt die Leiterin bzw. der Leiter der Biobank der Medizinischen Universit�t Graz. 
</li>
<li>
Die Forschung wird grunds�tzlich an der Medizinischen Universit�t Graz bzw. in Zusammenarbeit mit anderen Forschungseinrichtungen erfolgen. Die Durchf�hrung von Analysen an kodierten Proben oder kodierten Daten kann auch in nationaler und internationaler Zusammenarbeit mit externen Partnern (zB anderen Forschungseinrichtungen, Firmen) erfolgen. 
</li>
<li>
Ihre medizinischen Proben und Daten sollen zu wissenschaftlichen Erkenntnissen �ber Ursachen, Verlauf, Behandlung und Vorbeugung von Krankheiten f�hren und schlie�lich zur Entwicklung und Qualit�tskontrolle von neuen Diagnosemitteln und verfahren eingesetzt werden.<br>
Gegebenenfalls sollen die Forschungsergebnisse in kodierter Form in wissenschaftlichen Schriften publiziert werden, zur Ausbildung von �rztinnen und �rzten eingesetzt werden und durch die Medizinische Universit�t Graz oder in Zusammenarbeit mit anderen Unternehmen und Personen weiter wissenschaftlich oder auch kommerziell, zB mittels Patentierung, verwertet werden. 
</li>
</ul>
F�r Ihre Bereitstellung der medizinischen Proben, Befunde sowie die Angaben �ber Ihre Krankheitssymptome und Lebensumst�nde ist keine finanzielle Abgeltung oder Beteiligung an einer etwaigen kommerziellen Verwertung der Forschungsergebnisse vorgesehen. <br>

Eine individuelle R�ckmeldung von Informationen und Forschungsergebnissen, die aus Ihren medizinischen Proben gewonnen werden, ist nur f�r den Fall vorgesehen, dass es sich um f�r Sie medizinisch bedeutsame Informationen handelt. Sie k�nnen jedoch dar�ber entscheiden, ob Sie diese Informationen bekommen m�chten oder nicht. <br>

Das wissenschaftliche Vorhaben und diese PatientInnen-information/ Einverst�ndniserkl�rung wurden von der zust�ndigen Ethikkommission gepr�ft und bef�rwortet. <br>

Forschungsprojekte, die in Zukunft mit den in der Biobank gespeicherten Proben und/oder Daten vorgesehen sind, werden erst nach Vorliegen einer neuerlichen, projektbezogenen bef�rwortenden Stellungnahme der Ethikkommission durchgef�hrt werden. Nur kodierte Proben und kodierte Daten werden von der Biobank an Forschungsprojekte weitergegeben. <br>


Ihre Einwilligung dazu ist v�llig freiwillig und hat keinen Einfluss auf die f�r Sie vorgesehene Diagnose und Behandlung Ihrer Erkrankung. Durch die Teilnahme an diesem Forschungsvorhaben entstehen f�r Sie keine zus�tzlichen Kosten. Sie k�nnen die Einwilligung ohne Angabe von Gr�nden ablehnen oder Ihre erteilte Einwilligung jederzeit ohne Angabe von Gr�nden durch schriftliche oder m�ndliche Erkl�rung widerrufen. In diesem Fall wird jegliche Verbindung zwischen den von Ihnen gewonnenen Proben sowie Daten und Ihrer Person unwieder bringlich gel�scht. Wenn Sie es w�nschen, werden die Proben aus der Biobank entfernt und vernichtet. F�r weitere Informationen oder den Widerruf der Einwilligung wenden Sie sich bitte an die Leitung der Biobank der Medizinischen Universit�t Graz, Stiftingtalstra�e 24, A-8010 Graz (Tel. 0316-385-72716). <br>

<b>Bitte unterschreiben Sie die Einverst�ndiserkl�rung nur:</b> 
<ul>
<li>wenn Sie Art und Ablauf des Forschungsvorhabens vollst�ndig verstanden haben,</li>
<li>wenn Sie bereit sind, der Teilnahme zuzustimmen, und</li>
<li> wenn Sie sich �ber Ihre Rechte als Teilnehmerin bzw. Teilnehmer an diesem Forschungsvorhabens im Klaren sind.</li>
</ul>

<h2>Einverst�ndniserkl�rung</h2>

Ich, <b><%= organization.getExpandoBridge().getAttribute("firstname").toString() + " " + organization.getExpandoBridge().getAttribute("lastname").toString() %></b> geboren am  
<b><%= dateFormat.format(dateofbirth) %></b> habe die mir zur Kenntnis gebrachte PatientInneninformation zum Forschungsvorhaben: &quot;Bereitstellung von Gewebsproben, Blutproben und anderen K�rperfl�ssigkeiten zu Forschungszwecken und zur Entwicklung neuer Diagnoseverfahren, Vorbeugema�nahmen und Behandlungen&quot;, bestehend aus 3 Seiten, gelesen und verstanden. <br>

Ich wurde im Rahmen eines diesbez�glichen Aufkl�rungsgespr�ches von Herrn/Frau (Dr. med.) <%= themeDisplay.getUser().getFullName() %> f�hrlich und verst�ndlich �ber Wesen, Bedeutung und Tragweite des Forschungsvorhabens informiert. Alle meine Fragen wurden ausreichend beantwortet und ich hatte ausreichend Zeit, mich zu entscheiden. Zur Zeit habe ich keine weiteren Fragen mehr.<br>

Mit meiner Unterschrift erkl�re ich zu den angef�hrten Punkten Folgendes:<br>
<br>
<div style="border: 1px solid;padding:10px;">
Ich willige ein, dass ich die <b>nicht mehr f�r meine medizinische Behandlung ben�tigten Proben</b> der Medizinischen Universit�t Graz f�r das vorliegende Forschungsvorhaben �berlasse.<br>
Ich erkl�re mich bereit, dass <b>im Rahmen von routinem��ig vorgesehenen Blutabnahmen maximal 20 ml Blut zus�tzlich</b> abgenommen werden k�nnen.<br>
</div><br>
Weiters erlaube ich der Medizinischen Universit�t Graz die Verwendung der f�r mich erstellten Befunde und der gesammelten Angaben �ber meine Krankheitssymptome und Lebensumst�nde f�r das vorliegende Forschungsvorhaben. Dies inkludiert neben den Daten, die am LKH/Univ. Klinikum vorhanden sind, auch medizinische Daten weiterer Institutionen (Haus-, Facharzt und andere Krankenh�user), die zu diagnostischen oder therapeutischen Zwecken erhoben wurden.<br>
<br><div style="border: 1px solid;padding:10px;">
Ich bevollm�chtige diesbez�glich die Medizinische Universit�t Graz, diese Daten direkt bei den genannten Institutionen anzufordern.
</div><br>
Beim Umgang mit den Proben und/oder Daten werden die Bestimmungen des Datenschutzgesetzes und des Gentechnikgesetzes beachtet. Bei allf�lliger Weitergabe der Proben und/oder Daten sowie bei etwaigen Ver�ffentlichungen der Daten dieses Forschungsvorhabens werde ich nicht namentlich genannt.<br>
Eine Kopie dieser PatientInneninformation und Einverst�ndniserkl�rung habe ich erhalten. Das Original verbleibt bei der Medizinischen Universit�t Graz.<br>
Meine Teilnahme an diesem Forschungsvorhaben ist freiwillig. Ich kann diese meine Einwilligung jederzeit an der Medizinischen Universit�t Graz ohne Angabe von Gr�nden widerrufen, ohne dass dadurch ein Nachteil f�r meine medizinische Betreuung entsteht.<br>
<br><div style="border: 1px solid;padding:10px;">
Ich w�nsche �ber f�r mich pers�nlich oder meine direkten Nachkommen bedeutsame medizinische Forschungsergebnisse informiert zu werden. 
</div>
<br><br><br><br>
<div style="margin: auto;width: 100%;text-align: center;">
.....................................................................................<br>
(Datum und Unterschrift der /des Patienten/in)
</div>
<br>
<div style="margin: auto;width: 100%;text-align: center;">
Ich habe Herrn /Frau <b><%= organization.getExpandoBridge().getAttribute("firstname").toString() + " " + organization.getExpandoBridge().getAttribute("lastname").toString() %></b> vor der Unterzeichnung dieser Erkl�rung ausf�hrlich beraten und best�tige, keinen Druck ausge�bt zu haben. 
</div>
<br><br><br>
<div style="margin: auto;width: 100%;text-align: center;">
.....................................................................................<br>
(Datum, Name und Unterschrift der/des verantwortlichen �rztin/Arztes) 
</div>
<div style="margin: auto;width: 100%;text-align: center;">
Vielen Dank f�r ihre Teilnahme!
</div>
<%
}
%>
/**
 * New BSD License
 * http://www.opensource.org/licenses/bsd-license.php
 * Copyright (c) 2009, RaptorProject (http://code.google.com/p/raptor-chess-interface/)
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.
 * Neither the name of the RaptorProject nor the names of its contributors may be used to endorse or promote products derived from this software without specific prior written permission.
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package raptor.connector.fics.pref;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;

import raptor.Raptor;
import raptor.pref.PreferenceKeys;
import raptor.pref.TextFieldEditor;

public class FicsPage extends FieldEditorPreferencePage {
	public FicsPage() {
		super(FLAT);
		setTitle("Fics");
		setPreferenceStore(Raptor.getInstance().getPreferences());
	}

	@Override
	protected void createFieldEditors() {
		BooleanFieldEditor bfe2 = new BooleanFieldEditor(
				PreferenceKeys.FICS_KEEP_ALIVE,
				"Keep Alive (Sends date to stop the 60 minute idle kick out)",
				getFieldEditorParent());
		addField(bfe2);

		BooleanFieldEditor bfe = new BooleanFieldEditor(
				PreferenceKeys.FICS_AUTO_CONNECT, "Auto Connect",
				getFieldEditorParent());
		addField(bfe);

		addField(new BooleanFieldEditor(PreferenceKeys.FICS_IS_LOGGING_GAMES,
				"Log games in PGN (Comming Soon)", getFieldEditorParent()));

		addField(new BooleanFieldEditor(
				PreferenceKeys.FICS_SHOW_BUGBUTTONS_ON_CONNECT,
				"Show bughouse buttons on connect", getFieldEditorParent()));

		addField(new StringFieldEditor(PreferenceKeys.FICS_FREECHESS_ORG_URL,
				"Fics url:", getFieldEditorParent()));

		addField(new StringFieldEditor(PreferenceKeys.FICS_COMMANDS_HELP_URL,
				"Fics Commands Help url:", getFieldEditorParent()));

		addField(new StringFieldEditor(PreferenceKeys.FICS_ADJUDICATE_URL,
				"Ajudicate url:", getFieldEditorParent()));

		addField(new StringFieldEditor(PreferenceKeys.FICS_TEAM_LEAGUE_URL,
				"Team League url:", getFieldEditorParent()));

		addField(new StringFieldEditor(PreferenceKeys.FICS_FICS_GAMES_URL,
				"Fics Games url:", getFieldEditorParent()));

		addField(new TextFieldEditor(PreferenceKeys.FICS_LOGIN_SCRIPT,
				"Login Script:", getFieldEditorParent()));
	}
}
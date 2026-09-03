package org.telegram.ui;

import android.appwidget.AppWidgetManager;
import android.content.Intent;
import android.content.SharedPreferences;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.ChatsWidgetProvider;
import org.telegram.messenger.ContactsWidgetProvider;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class sy extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ yy a;

    public sy(yy yyVar) {
        this.a = yyVar;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        yy yyVar = this.a;
        int i12 = yyVar.w;
        ArrayList arrayList = yyVar.e;
        int i13 = yyVar.x;
        if (i10 == -1) {
            if (yyVar.y != null) {
                yyVar.finishFragment();
                return;
            }
            yyVar.Y();
        }
        if (i10 != 1 || yyVar.getParentActivity() == null) {
            return;
        }
        ArrayList<MessagesStorage.TopicKey> arrayList2 = new ArrayList<>();
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i14)).longValue(), 0L));
        }
        yyVar.getMessagesStorage().putWidgetDialogs(i13, arrayList2);
        SharedPreferences.Editor edit = yyVar.getParentActivity().getSharedPreferences("shortcut_widget", 0).edit();
        i11 = ((org.telegram.ui.ActionBar.p2) yyVar).currentAccount;
        edit.putInt("account" + i13, i11);
        edit.putInt(TeXSymbolParser.TYPE_ATTR + i13, i12);
        edit.commit();
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(yyVar.getParentActivity());
        if (i12 == 0) {
            ChatsWidgetProvider.updateWidget(yyVar.getParentActivity(), appWidgetManager, i13);
        } else {
            ContactsWidgetProvider.updateWidget(yyVar.getParentActivity(), appWidgetManager, i13);
        }
        a1 a1Var = yyVar.y;
        if (a1Var == null) {
            yyVar.Y();
            return;
        }
        int i15 = a1Var.a;
        Object obj = a1Var.b;
        switch (i15) {
            case 25:
                ChatsWidgetConfigActivity chatsWidgetConfigActivity = (ChatsWidgetConfigActivity) obj;
                int i16 = ChatsWidgetConfigActivity.C;
                Intent intent = new Intent();
                intent.putExtra("appWidgetId", chatsWidgetConfigActivity.B);
                chatsWidgetConfigActivity.setResult(-1, intent);
                chatsWidgetConfigActivity.finish();
                break;
            default:
                ContactsWidgetConfigActivity contactsWidgetConfigActivity = (ContactsWidgetConfigActivity) obj;
                int i17 = ContactsWidgetConfigActivity.C;
                Intent intent2 = new Intent();
                intent2.putExtra("appWidgetId", contactsWidgetConfigActivity.B);
                contactsWidgetConfigActivity.setResult(-1, intent2);
                contactsWidgetConfigActivity.finish();
                break;
        }
    }
}

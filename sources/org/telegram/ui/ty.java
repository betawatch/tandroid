package org.telegram.ui;

import android.appwidget.AppWidgetManager;
import android.content.Intent;
import android.content.SharedPreferences;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.ChatsWidgetProvider;
import org.telegram.messenger.ContactsWidgetProvider;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class ty extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ zy a;

    public ty(zy zyVar) {
        this.a = zyVar;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        zy zyVar = this.a;
        int i12 = zyVar.w;
        ArrayList arrayList = zyVar.e;
        int i13 = zyVar.x;
        if (i10 == -1) {
            if (zyVar.y != null) {
                zyVar.finishFragment();
                return;
            }
            zyVar.Y();
        }
        if (i10 != 1 || zyVar.getParentActivity() == null) {
            return;
        }
        ArrayList<MessagesStorage.TopicKey> arrayList2 = new ArrayList<>();
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i14)).longValue(), 0L));
        }
        zyVar.getMessagesStorage().putWidgetDialogs(i13, arrayList2);
        SharedPreferences.Editor edit = zyVar.getParentActivity().getSharedPreferences("shortcut_widget", 0).edit();
        i11 = ((org.telegram.ui.ActionBar.m2) zyVar).currentAccount;
        edit.putInt("account" + i13, i11);
        edit.putInt(TeXSymbolParser.TYPE_ATTR + i13, i12);
        edit.commit();
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(zyVar.getParentActivity());
        if (i12 == 0) {
            ChatsWidgetProvider.updateWidget(zyVar.getParentActivity(), appWidgetManager, i13);
        } else {
            ContactsWidgetProvider.updateWidget(zyVar.getParentActivity(), appWidgetManager, i13);
        }
        z0 z0Var = zyVar.y;
        if (z0Var == null) {
            zyVar.Y();
            return;
        }
        int i15 = z0Var.a;
        Object obj = z0Var.b;
        switch (i15) {
            case 25:
                ChatsWidgetConfigActivity chatsWidgetConfigActivity = (ChatsWidgetConfigActivity) obj;
                int i16 = ChatsWidgetConfigActivity.F;
                Intent intent = new Intent();
                intent.putExtra("appWidgetId", chatsWidgetConfigActivity.E);
                chatsWidgetConfigActivity.setResult(-1, intent);
                chatsWidgetConfigActivity.finish();
                break;
            default:
                ContactsWidgetConfigActivity contactsWidgetConfigActivity = (ContactsWidgetConfigActivity) obj;
                int i17 = ContactsWidgetConfigActivity.F;
                Intent intent2 = new Intent();
                intent2.putExtra("appWidgetId", contactsWidgetConfigActivity.E);
                contactsWidgetConfigActivity.setResult(-1, intent2);
                contactsWidgetConfigActivity.finish();
                break;
        }
    }
}

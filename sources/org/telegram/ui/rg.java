package org.telegram.ui;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rg implements ys0, tx {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rg(un unVar, boolean z10, org.telegram.messenger.kj kjVar, int i10) {
        this.c = unVar;
        this.a = z10;
        this.d = kjVar;
        this.b = i10;
    }

    @Override // org.telegram.ui.tx
    public /* synthetic */ boolean H() {
        return false;
    }

    @Override // org.telegram.ui.tx
    public /* synthetic */ boolean O(zx zxVar) {
        return false;
    }

    @Override // org.telegram.ui.ys0
    public void a(TLRPC.MessageMedia messageMedia) {
        int i10;
        un unVar = (un) this.c;
        org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) this.d;
        if (!this.a) {
            if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
                TLRPC.MessageMedia messageMedia2 = kjVar.k.media;
                if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                    ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
                }
            }
            kjVar.k.media = messageMedia;
            unVar.getSendMessagesHelper().t(kjVar, null, null, null, null, null, null, null, false, false, null);
            return;
        }
        TLRPC.TL_messages_appendTodoList tL_messages_appendTodoList = new TLRPC.TL_messages_appendTodoList();
        tL_messages_appendTodoList.peer = unVar.getMessagesController().i1(org.telegram.messenger.kj.B0(kjVar.k));
        tL_messages_appendTodoList.msg_id = kjVar.f1();
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                i10 = this.b;
                if (i11 >= i10) {
                    break;
                }
                i12 = Math.max(i12, tL_messageMediaToDo.todo.list.get(i11).id);
                i11++;
            }
            while (i10 < tL_messageMediaToDo.todo.list.size()) {
                TLRPC.TodoItem todoItem = tL_messageMediaToDo.todo.list.get(i10);
                if (todoItem.id <= i12) {
                    todoItem.id = i12 + 1;
                }
                tL_messages_appendTodoList.list.add(todoItem);
                i12 = Math.max(i12, todoItem.id);
                i10++;
            }
            TLRPC.MessageMedia messageMedia3 = kjVar.k.media;
            if (messageMedia3 instanceof TLRPC.TL_messageMediaToDo) {
                tL_messageMediaToDo.completions = ((TLRPC.TL_messageMediaToDo) messageMedia3).completions;
            }
        }
        kjVar.k.media = messageMedia;
        unVar.getConnectionsManager().sendRequest(tL_messages_appendTodoList, null);
    }

    @Override // org.telegram.ui.tx
    public boolean z(zx zxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, nb1 nb1Var) {
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        String str = (String) this.d;
        Pattern pattern = LaunchActivity.D1;
        long j10 = ((org.telegram.messenger.hs) arrayList.get(0)).a;
        Bundle bundle = new Bundle();
        bundle.putBoolean("scrollToTopOnResume", true);
        bundle.putBoolean("hasUrl", this.a);
        if (org.telegram.messenger.o5.C(j10)) {
            bundle.putInt("enc_id", (int) (4294967295L & j10));
        } else if (org.telegram.messenger.o5.E(j10)) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        int i12 = this.b;
        if (!org.telegram.messenger.wp.r1(i12).E(bundle, zxVar, null, null)) {
            return true;
        }
        org.telegram.messenger.at.f(i12).k(org.telegram.messenger.at.t, new Object[0]);
        org.telegram.messenger.vi.b0(i12).Q1(j10, 0, str, null, null, null, null, 0L, false, false, null);
        ((ActionBarLayout) launchActivity.M()).U(new un(bundle), true, false);
        return true;
    }

    public /* synthetic */ rg(LaunchActivity launchActivity, boolean z10, int i10, String str) {
        this.c = launchActivity;
        this.a = z10;
        this.b = i10;
        this.d = str;
    }
}

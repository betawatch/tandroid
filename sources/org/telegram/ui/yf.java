package org.telegram.ui;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class yf implements mr0, sw {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yf(an anVar, boolean z10, org.telegram.messenger.gj gjVar, int i7) {
        this.c = anVar;
        this.a = z10;
        this.d = gjVar;
        this.b = i7;
    }

    @Override // org.telegram.ui.sw
    public /* synthetic */ boolean H() {
        return false;
    }

    @Override // org.telegram.ui.sw
    public /* synthetic */ boolean P(yw ywVar) {
        return false;
    }

    @Override // org.telegram.ui.mr0
    public void a(TLRPC.MessageMedia messageMedia) {
        int i7;
        an anVar = (an) this.c;
        org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) this.d;
        if (!this.a) {
            if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
                TLRPC.MessageMedia messageMedia2 = gjVar.k.media;
                if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                    ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
                }
            }
            gjVar.k.media = messageMedia;
            anVar.getSendMessagesHelper().t(gjVar, null, null, null, null, null, null, null, false, false, null);
            return;
        }
        TLRPC.TL_messages_appendTodoList tL_messages_appendTodoList = new TLRPC.TL_messages_appendTodoList();
        tL_messages_appendTodoList.peer = anVar.getMessagesController().j1(org.telegram.messenger.gj.B0(gjVar.k));
        tL_messages_appendTodoList.msg_id = gjVar.e1();
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                i7 = this.b;
                if (i10 >= i7) {
                    break;
                }
                i11 = Math.max(i11, tL_messageMediaToDo.todo.list.get(i10).id);
                i10++;
            }
            while (i7 < tL_messageMediaToDo.todo.list.size()) {
                TLRPC.TodoItem todoItem = tL_messageMediaToDo.todo.list.get(i7);
                if (todoItem.id <= i11) {
                    todoItem.id = i11 + 1;
                }
                tL_messages_appendTodoList.list.add(todoItem);
                i11 = Math.max(i11, todoItem.id);
                i7++;
            }
            TLRPC.MessageMedia messageMedia3 = gjVar.k.media;
            if (messageMedia3 instanceof TLRPC.TL_messageMediaToDo) {
                tL_messageMediaToDo.completions = ((TLRPC.TL_messageMediaToDo) messageMedia3).completions;
            }
        }
        gjVar.k.media = messageMedia;
        anVar.getConnectionsManager().sendRequest(tL_messages_appendTodoList, null);
    }

    @Override // org.telegram.ui.sw
    public boolean y(yw ywVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, u91 u91Var) {
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        String str = (String) this.d;
        String str2 = LaunchActivity.C1;
        long j3 = ((org.telegram.messenger.ur) arrayList.get(0)).a;
        Bundle bundle = new Bundle();
        bundle.putBoolean("scrollToTopOnResume", true);
        bundle.putBoolean("hasUrl", this.a);
        if (org.telegram.messenger.m5.C(j3)) {
            bundle.putInt("enc_id", (int) (4294967295L & j3));
        } else if (org.telegram.messenger.m5.E(j3)) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        int i11 = this.b;
        if (!org.telegram.messenger.np.s1(i11).E(bundle, ywVar, null, null)) {
            return true;
        }
        org.telegram.messenger.ns.f(i11).k(org.telegram.messenger.ns.t, new Object[0]);
        org.telegram.messenger.si.b0(i11).Q1(j3, 0, str, null, null, null, null, 0L, false, false, null);
        ((ActionBarLayout) launchActivity.M()).V(new an(bundle), true, false);
        return true;
    }

    public /* synthetic */ yf(LaunchActivity launchActivity, boolean z10, int i7, String str) {
        this.c = launchActivity;
        this.a = z10;
        this.b = i7;
        this.d = str;
    }
}

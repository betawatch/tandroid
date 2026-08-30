package org.telegram.ui;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rg implements ev0, iy {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rg(xn xnVar, boolean z4, MessageObject messageObject, int i10) {
        this.c = xnVar;
        this.a = z4;
        this.d = messageObject;
        this.b = i10;
    }

    @Override // org.telegram.ui.iy
    public /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.iy
    public /* synthetic */ boolean K(oy oyVar) {
        return false;
    }

    @Override // org.telegram.ui.ev0
    public void a(TLRPC.MessageMedia messageMedia) {
        int i10;
        xn xnVar = (xn) this.c;
        MessageObject messageObject = (MessageObject) this.d;
        if (!this.a) {
            if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
                TLRPC.MessageMedia messageMedia2 = messageObject.messageOwner.media;
                if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                    ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
                }
            }
            messageObject.messageOwner.media = messageMedia;
            xnVar.getSendMessagesHelper().editMessage(messageObject, null, null, null, null, null, null, false, false, null);
            return;
        }
        TLRPC.TL_messages_appendTodoList tL_messages_appendTodoList = new TLRPC.TL_messages_appendTodoList();
        tL_messages_appendTodoList.peer = xnVar.getMessagesController().getInputPeer(messageObject.getDialogId());
        tL_messages_appendTodoList.msg_id = messageObject.getId();
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
            TLRPC.MessageMedia messageMedia3 = messageObject.messageOwner.media;
            if (messageMedia3 instanceof TLRPC.TL_messageMediaToDo) {
                tL_messageMediaToDo.completions = ((TLRPC.TL_messageMediaToDo) messageMedia3).completions;
            }
        }
        messageObject.messageOwner.media = messageMedia;
        xnVar.getConnectionsManager().sendRequest(tL_messages_appendTodoList, null);
    }

    @Override // org.telegram.ui.iy
    public boolean w(oy oyVar, ArrayList arrayList, CharSequence charSequence, boolean z4, boolean z10, int i10, int i11, kf1 kf1Var) {
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        String str = (String) this.d;
        Pattern pattern = LaunchActivity.y1;
        long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        Bundle bundle = new Bundle();
        bundle.putBoolean("scrollToTopOnResume", true);
        bundle.putBoolean("hasUrl", this.a);
        if (DialogObject.isEncryptedDialog(j10)) {
            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(j10));
        } else if (DialogObject.isUserDialog(j10)) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        int i12 = this.b;
        if (MessagesController.getInstance(i12).checkCanOpenChat(bundle, oyVar)) {
            NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
            MediaDataController.getInstance(i12).saveDraft(j10, 0, str, null, null, false, 0L);
            ((ActionBarLayout) launchActivity.O()).S(new xn(bundle), true, false);
        }
        return true;
    }

    public /* synthetic */ rg(LaunchActivity launchActivity, boolean z4, int i10, String str) {
        this.c = launchActivity;
        this.a = z4;
        this.b = i10;
        this.d = str;
    }
}

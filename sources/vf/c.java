package vf;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.SparseArray;
import fh.h;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.u70;
import org.telegram.ui.Components.z8;
import org.telegram.ui.qn;
import org.telegram.ui.we1;
import pf.o1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class c {
    public static final /* synthetic */ int a = 0;

    static {
        new SparseArray();
    }

    public static void a(qn qnVar, MessagesStorage.TopicKey topicKey) {
        TLRPC.TL_forumTopic findTopic;
        if (topicKey.topicId == 0 || (findTopic = qnVar.getMessagesController().getTopicsController().findTopic(-topicKey.dialogId, topicKey.topicId)) == null) {
            return;
        }
        if (topicKey.dialogId > 0) {
            if (UserObject.isBotForum(qnVar.getMessagesController().getUser(Long.valueOf(topicKey.dialogId)))) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new MessageObject(qnVar.getCurrentAccount(), findTopic.topicStartMessage, false, false));
                qnVar.pb(arrayList, null, findTopic.id, findTopic.read_inbox_max_id, findTopic.read_outbox_max_id, findTopic);
                qnVar.getMessagesController().setForumLastTopicId(-topicKey.dialogId, topicKey.topicId);
                return;
            }
            return;
        }
        TLRPC.Chat chat = qnVar.getMessagesController().getChat(Long.valueOf(-topicKey.dialogId));
        if (chat == null) {
            return;
        }
        if (!ChatObject.isMonoForum(chat)) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new MessageObject(qnVar.getCurrentAccount(), findTopic.topicStartMessage, false, false));
            qnVar.pb(arrayList2, chat, findTopic.id, findTopic.read_inbox_max_id, findTopic.read_outbox_max_id, findTopic);
        } else if (ChatObject.canManageMonoForum(UserConfig.selectedAccount, chat)) {
            int i9 = findTopic.read_inbox_max_id;
            int i10 = findTopic.read_outbox_max_id;
            qnVar.g4 = i9;
            qnVar.h4 = i10;
            qnVar.i4 = Math.max(1, i9);
            qnVar.Z3 = DialogObject.getPeerDialogId(findTopic.from_id);
            qnVar.zc();
            qnVar.Qc(false);
            qnVar.hc(false);
        }
        qnVar.getMessagesController().setForumLastTopicId(-topicKey.dialogId, topicKey.topicId);
    }

    public static void b(MessageObject messageObject) {
        TLRPC.TL_forumTopic findTopic;
        if (messageObject.getDialogId() <= 0 && (findTopic = MessagesController.getInstance(messageObject.currentAccount).getTopicsController().findTopic(-messageObject.getDialogId(), MessageObject.getTopicId(messageObject.currentAccount, messageObject.messageOwner, true))) != null) {
            Drawable drawable = messageObject.topicIconDrawable[0];
            if (drawable instanceof a) {
                ((a) drawable).b(findTopic.icon_color);
            }
        }
    }

    public static b c(Context context, float f10, int i9, boolean z10) {
        if (context == null) {
            return null;
        }
        b bVar = new b();
        bVar.a = context.getResources().getDrawable(z10 ? R.drawable.msg_filled_general_large : R.drawable.msg_filled_general).mutate();
        bVar.b = f10;
        bVar.a(i9);
        return bVar;
    }

    public static fq d(int i9, String str) {
        a aVar = new a(i9);
        u70 u70Var = new u70(1, null);
        String trim = str.trim();
        u70Var.a(trim.length() >= 1 ? trim.substring(0, 1).toUpperCase() : "");
        fq fqVar = new fq(aVar, u70Var, 0, 0);
        fqVar.w = true;
        return fqVar;
    }

    public static fq e(TLRPC.TL_forumTopic tL_forumTopic) {
        if (tL_forumTopic == null) {
            return null;
        }
        return d(tL_forumTopic.icon_color, tL_forumTopic.title);
    }

    public static void f(long j10, ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        int i9 = 0;
        while (i9 < arrayList.size()) {
            if (j10 != MessageObject.getTopicId(((MessageObject) arrayList.get(i9)).currentAccount, ((MessageObject) arrayList.get(i9)).messageOwner, true)) {
                arrayList.remove(i9);
                i9--;
            }
            i9++;
        }
    }

    public static qn g(o2 o2Var, long j10, TLRPC.TL_forumTopic tL_forumTopic, int i9, Bundle bundle) {
        TLRPC.TL_forumTopic tL_forumTopic2;
        TLRPC.TL_forumTopic findTopic;
        if (o2Var == null || tL_forumTopic == null) {
            return null;
        }
        TLRPC.Chat chat = o2Var.getMessagesController().getChat(Long.valueOf(j10));
        bundle.putLong("chat_id", j10);
        if (i9 != 0) {
            bundle.putInt("message_id", i9);
        } else if (tL_forumTopic.read_inbox_max_id == 0) {
            bundle.putInt("message_id", tL_forumTopic.id);
        }
        bundle.putInt("unread_count", tL_forumTopic.unread_count);
        bundle.putBoolean("historyPreloaded", false);
        qn qnVar = new qn(bundle);
        TLRPC.Message message = tL_forumTopic.topicStartMessage;
        if (message != null || (findTopic = o2Var.getMessagesController().getTopicsController().findTopic(j10, tL_forumTopic.id)) == null) {
            tL_forumTopic2 = tL_forumTopic;
        } else {
            message = findTopic.topicStartMessage;
            tL_forumTopic2 = findTopic;
        }
        if (message == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new MessageObject(o2Var.getCurrentAccount(), message, false, false));
        qnVar.pb(arrayList, chat, tL_forumTopic2.id, tL_forumTopic2.read_inbox_max_id, tL_forumTopic2.read_outbox_max_id, tL_forumTopic2);
        if (i9 != 0) {
            qnVar.H7 = i9;
        }
        return qnVar;
    }

    public static String h(int i9, long j10) {
        return i(MessagesController.getInstance(i9).getChat(Long.valueOf(-j10)), i9, true);
    }

    public static String i(TLRPC.Chat chat, int i9, boolean z10) {
        if (ChatObject.isMonoForum(chat)) {
            TLRPC.Chat chat2 = MessagesController.getInstance(i9).getChat(Long.valueOf(chat.linked_monoforum_id));
            if (chat2 != null) {
                return z10 ? chat2.title : LocaleController.formatString(R.string.MonoforumTitle, chat2.title);
            }
        } else if (chat != null && chat.linked_monoforum_id != 0) {
            return z10 ? chat.title : LocaleController.formatString(R.string.MonoforumTitle, chat.title);
        }
        if (chat != null) {
            return chat.title;
        }
        return null;
    }

    public static CharSequence j(TLRPC.ForumTopic forumTopic, Paint paint, Drawable[] drawableArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!(forumTopic instanceof TLRPC.TL_forumTopic)) {
            return "DELETED";
        }
        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) forumTopic;
        if (tL_forumTopic.id == 1) {
            try {
                b c10 = c(ApplicationLoader.applicationContext, 1.0f, paint == null ? f6.w0(null, f6.Ac, false) : paint.getColor(), false);
                c10.setBounds(0, 0, paint == null ? AndroidUtilities.dp(14.0f) : (int) paint.getTextSize(), paint == null ? AndroidUtilities.dp(14.0f) : (int) paint.getTextSize());
                spannableStringBuilder.append((CharSequence) " ");
                if (drawableArr != null) {
                    drawableArr[0] = c10;
                }
                spannableStringBuilder.setSpan(new ImageSpan(c10, 2), 0, 1, 33);
            } catch (Exception unused) {
            }
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            spannableStringBuilder.append((CharSequence) " ");
            t5 t5Var = new t5(tL_forumTopic.icon_emoji_id, 0.95f, paint != null ? paint.getFontMetricsInt() : null);
            spannableStringBuilder.setSpan(t5Var, 0, 1, 33);
            t5Var.top = true;
            t5Var.cacheType = 13;
        } else {
            spannableStringBuilder.append((CharSequence) " ");
            fq e10 = e(tL_forumTopic);
            if (drawableArr != null) {
                drawableArr[0] = e10.a;
            }
            e10.setBounds(0, 0, (int) (e10.getIntrinsicWidth() * 0.65f), (int) (e10.getIntrinsicHeight() * 0.65f));
            Drawable drawable = e10.b;
            if (drawable instanceof u70) {
                ((u70) drawable).i = 0.7f;
            }
            if (paint != null) {
                eq eqVar = new eq(0, e10);
                eqVar.setSize((int) (Math.abs(paint.getFontMetrics().ascent) + Math.abs(paint.getFontMetrics().descent)));
                spannableStringBuilder.setSpan(eqVar, 0, 1, 33);
            } else {
                spannableStringBuilder.setSpan(new ImageSpan(e10), 0, 1, 33);
            }
        }
        if (!TextUtils.isEmpty(tL_forumTopic.title)) {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) tL_forumTopic.title);
        }
        return spannableStringBuilder;
    }

    public static boolean k(MessageObject messageObject) {
        return messageObject != null && (messageObject.messageOwner.action instanceof TLRPC.TL_messageActionTopicCreate);
    }

    public static ArrayList l(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            TLRPC.savedDialog saveddialog = (TLRPC.savedDialog) obj;
            if (saveddialog instanceof TLRPC.TL_monoForumDialog) {
                TLRPC.TL_monoForumDialog tL_monoForumDialog = (TLRPC.TL_monoForumDialog) saveddialog;
                long peerDialogId = DialogObject.getPeerDialogId(tL_monoForumDialog.peer);
                TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                tL_forumTopic.id = (int) ((peerDialogId >>> 32) ^ peerDialogId);
                tL_forumTopic.title = Long.toString(peerDialogId);
                tL_forumTopic.top_message = tL_monoForumDialog.top_message;
                tL_forumTopic.read_inbox_max_id = tL_monoForumDialog.read_inbox_max_id;
                tL_forumTopic.read_outbox_max_id = tL_monoForumDialog.read_outbox_max_id;
                tL_forumTopic.unread_reactions_count = tL_monoForumDialog.unread_reactions_count;
                tL_forumTopic.unread_count = tL_monoForumDialog.unread_count;
                tL_forumTopic.draft = tL_monoForumDialog.draft;
                tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
                tL_forumTopic.from_id = tL_monoForumDialog.peer;
                tL_forumTopic.nopaid_messages_exception = tL_monoForumDialog.nopaid_messages_exception;
                arrayList2.add(tL_forumTopic);
            }
        }
        return arrayList2;
    }

    public static void m(o2 o2Var, long j10, TLRPC.TL_forumTopic tL_forumTopic, int i9) {
        qn g10 = g(o2Var, j10, tL_forumTopic, i9, new Bundle());
        if (g10 != null) {
            o2Var.presentFragment(g10);
        }
    }

    public static void n(int i9, TLRPC.Chat chat, z8 z8Var, ImageReceiver imageReceiver) {
        TLRPC.Chat chat2 = ChatObject.isMonoForum(chat) ? MessagesController.getInstance(i9).getChat(Long.valueOf(chat.linked_monoforum_id)) : null;
        if (chat2 != null) {
            chat = chat2;
        }
        z8Var.k(i9, chat);
        imageReceiver.setForUserOrChat(chat2, z8Var);
    }

    public static void o(int i9, TLRPC.Chat chat, z8 z8Var, o9 o9Var) {
        TLRPC.Chat chat2 = ChatObject.isMonoForum(chat) ? MessagesController.getInstance(i9).getChat(Long.valueOf(chat.linked_monoforum_id)) : null;
        if (chat2 != null) {
            chat = chat2;
        }
        z8Var.k(i9, chat);
        o9Var.e(chat2, z8Var);
    }

    public static void p(o9 o9Var, TLRPC.TL_forumTopic tL_forumTopic, boolean z10, boolean z11, b6 b6Var) {
        if (tL_forumTopic == null || o9Var == null) {
            return;
        }
        if (tL_forumTopic.id == 1) {
            o9Var.setAnimatedEmojiDrawable(null);
            o9Var.setImageDrawable(c(o9Var.getContext(), 0.75f, f6.v0(f6.v8, b6Var), z11));
            return;
        }
        if (tL_forumTopic.icon_emoji_id == 0) {
            o9Var.setAnimatedEmojiDrawable(null);
            o9Var.setImageDrawable(e(tL_forumTopic));
            return;
        }
        o9Var.setImageDrawable(null);
        k5 k5Var = o9Var.e;
        if (k5Var == null || tL_forumTopic.icon_emoji_id != k5Var.i()) {
            k5 k5Var2 = new k5(z11 ? 11 : 10, UserConfig.selectedAccount, tL_forumTopic.icon_emoji_id);
            k5Var2.setColorFilter(z10 ? new PorterDuffColorFilter(f6.w0(null, f6.A8, false), PorterDuff.Mode.SRC_IN) : f6.n0(b6Var));
            o9Var.setAnimatedEmojiDrawable(k5Var2);
        }
    }

    public static void q(long j10, ActionBarLayout actionBarLayout) {
        o2 lastFragment = actionBarLayout.getLastFragment();
        if (lastFragment instanceof qn) {
            qn qnVar = (qn) lastFragment;
            if ((-qnVar.a()) == j10 && qnVar.getMessagesController().getChat(Long.valueOf(j10)).forum && qnVar.getParentLayout() != null) {
                if (((ActionBarLayout) qnVar.getParentLayout()).j()) {
                    AndroidUtilities.runOnUIThread(new h(qnVar, 1), 500L);
                } else {
                    we1.H0(qnVar);
                }
            }
        }
        if (lastFragment instanceof we1) {
            we1 we1Var = (we1) lastFragment;
            long j11 = we1Var.a;
            if ((-(-j11)) != j10 || we1Var.getMessagesController().getChat(Long.valueOf(j10)).forum) {
                return;
            }
            if (we1Var.getParentLayout() != null && ((ActionBarLayout) we1Var.getParentLayout()).j()) {
                AndroidUtilities.runOnUIThread(new o1(we1Var, 10), 500L);
                return;
            }
            we1Var.D = true;
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", j11);
            qn qnVar2 = new qn(bundle);
            qnVar2.fa = true;
            we1Var.presentFragment(qnVar2);
        }
    }
}

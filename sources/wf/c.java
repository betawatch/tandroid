package wf;

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
import gh.h;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.y70;
import org.telegram.ui.Components.y8;
import org.telegram.ui.rn;
import org.telegram.ui.we1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class c {
    public static final /* synthetic */ int a = 0;

    static {
        new SparseArray();
    }

    public static void a(rn rnVar, MessagesStorage.TopicKey topicKey) {
        TLRPC.TL_forumTopic findTopic;
        if (topicKey.topicId == 0 || (findTopic = rnVar.getMessagesController().getTopicsController().findTopic(-topicKey.dialogId, topicKey.topicId)) == null) {
            return;
        }
        if (topicKey.dialogId > 0) {
            if (UserObject.isBotForum(rnVar.getMessagesController().getUser(Long.valueOf(topicKey.dialogId)))) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new MessageObject(rnVar.getCurrentAccount(), findTopic.topicStartMessage, false, false));
                rnVar.pb(arrayList, null, findTopic.id, findTopic.read_inbox_max_id, findTopic.read_outbox_max_id, findTopic);
                rnVar.getMessagesController().setForumLastTopicId(-topicKey.dialogId, topicKey.topicId);
                return;
            }
            return;
        }
        TLRPC.Chat chat = rnVar.getMessagesController().getChat(Long.valueOf(-topicKey.dialogId));
        if (chat == null) {
            return;
        }
        if (!ChatObject.isMonoForum(chat)) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new MessageObject(rnVar.getCurrentAccount(), findTopic.topicStartMessage, false, false));
            rnVar.pb(arrayList2, chat, findTopic.id, findTopic.read_inbox_max_id, findTopic.read_outbox_max_id, findTopic);
        } else if (ChatObject.canManageMonoForum(UserConfig.selectedAccount, chat)) {
            int i10 = findTopic.read_inbox_max_id;
            int i11 = findTopic.read_outbox_max_id;
            rnVar.g4 = i10;
            rnVar.h4 = i11;
            rnVar.i4 = Math.max(1, i10);
            rnVar.Z3 = DialogObject.getPeerDialogId(findTopic.from_id);
            rnVar.zc();
            rnVar.Qc(false);
            rnVar.hc(false);
        }
        rnVar.getMessagesController().setForumLastTopicId(-topicKey.dialogId, topicKey.topicId);
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

    public static b c(Context context, float f10, int i10, boolean z10) {
        if (context == null) {
            return null;
        }
        b bVar = new b();
        bVar.a = context.getResources().getDrawable(z10 ? R.drawable.msg_filled_general_large : R.drawable.msg_filled_general).mutate();
        bVar.b = f10;
        bVar.a(i10);
        return bVar;
    }

    public static dq d(int i10, String str) {
        a aVar = new a(i10);
        y70 y70Var = new y70(1, null);
        String trim = str.trim();
        y70Var.a(trim.length() >= 1 ? trim.substring(0, 1).toUpperCase() : "");
        dq dqVar = new dq(aVar, y70Var, 0, 0);
        dqVar.w = true;
        return dqVar;
    }

    public static dq e(TLRPC.TL_forumTopic tL_forumTopic) {
        if (tL_forumTopic == null) {
            return null;
        }
        return d(tL_forumTopic.icon_color, tL_forumTopic.title);
    }

    public static void f(long j10, ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        int i10 = 0;
        while (i10 < arrayList.size()) {
            if (j10 != MessageObject.getTopicId(((MessageObject) arrayList.get(i10)).currentAccount, ((MessageObject) arrayList.get(i10)).messageOwner, true)) {
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
    }

    public static rn g(n2 n2Var, long j10, TLRPC.TL_forumTopic tL_forumTopic, int i10, Bundle bundle) {
        TLRPC.TL_forumTopic tL_forumTopic2;
        TLRPC.TL_forumTopic findTopic;
        if (n2Var == null || tL_forumTopic == null) {
            return null;
        }
        TLRPC.Chat chat = n2Var.getMessagesController().getChat(Long.valueOf(j10));
        bundle.putLong("chat_id", j10);
        if (i10 != 0) {
            bundle.putInt("message_id", i10);
        } else if (tL_forumTopic.read_inbox_max_id == 0) {
            bundle.putInt("message_id", tL_forumTopic.id);
        }
        bundle.putInt("unread_count", tL_forumTopic.unread_count);
        bundle.putBoolean("historyPreloaded", false);
        rn rnVar = new rn(bundle);
        TLRPC.Message message = tL_forumTopic.topicStartMessage;
        if (message != null || (findTopic = n2Var.getMessagesController().getTopicsController().findTopic(j10, tL_forumTopic.id)) == null) {
            tL_forumTopic2 = tL_forumTopic;
        } else {
            message = findTopic.topicStartMessage;
            tL_forumTopic2 = findTopic;
        }
        if (message == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new MessageObject(n2Var.getCurrentAccount(), message, false, false));
        rnVar.pb(arrayList, chat, tL_forumTopic2.id, tL_forumTopic2.read_inbox_max_id, tL_forumTopic2.read_outbox_max_id, tL_forumTopic2);
        if (i10 != 0) {
            rnVar.H7 = i10;
        }
        return rnVar;
    }

    public static String h(int i10, long j10) {
        return i(MessagesController.getInstance(i10).getChat(Long.valueOf(-j10)), i10, true);
    }

    public static String i(TLRPC.Chat chat, int i10, boolean z10) {
        if (ChatObject.isMonoForum(chat)) {
            TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(chat.linked_monoforum_id));
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
                b c10 = c(ApplicationLoader.applicationContext, 1.0f, paint == null ? g6.w0(null, g6.Ac, false) : paint.getColor(), false);
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
            dq e9 = e(tL_forumTopic);
            if (drawableArr != null) {
                drawableArr[0] = e9.a;
            }
            e9.setBounds(0, 0, (int) (e9.getIntrinsicWidth() * 0.65f), (int) (e9.getIntrinsicHeight() * 0.65f));
            Drawable drawable = e9.b;
            if (drawable instanceof y70) {
                ((y70) drawable).i = 0.7f;
            }
            if (paint != null) {
                cq cqVar = new cq(0, e9);
                cqVar.setSize((int) (Math.abs(paint.getFontMetrics().ascent) + Math.abs(paint.getFontMetrics().descent)));
                spannableStringBuilder.setSpan(cqVar, 0, 1, 33);
            } else {
                spannableStringBuilder.setSpan(new ImageSpan(e9), 0, 1, 33);
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
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
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

    public static void m(n2 n2Var, long j10, TLRPC.TL_forumTopic tL_forumTopic, int i10) {
        rn g10 = g(n2Var, j10, tL_forumTopic, i10, new Bundle());
        if (g10 != null) {
            n2Var.presentFragment(g10);
        }
    }

    public static void n(int i10, TLRPC.Chat chat, y8 y8Var, ImageReceiver imageReceiver) {
        TLRPC.Chat chat2 = ChatObject.isMonoForum(chat) ? MessagesController.getInstance(i10).getChat(Long.valueOf(chat.linked_monoforum_id)) : null;
        if (chat2 != null) {
            chat = chat2;
        }
        y8Var.k(i10, chat);
        imageReceiver.setForUserOrChat(chat2, y8Var);
    }

    public static void o(int i10, TLRPC.Chat chat, y8 y8Var, n9 n9Var) {
        TLRPC.Chat chat2 = ChatObject.isMonoForum(chat) ? MessagesController.getInstance(i10).getChat(Long.valueOf(chat.linked_monoforum_id)) : null;
        if (chat2 != null) {
            chat = chat2;
        }
        y8Var.k(i10, chat);
        n9Var.e(chat2, y8Var);
    }

    public static void p(n9 n9Var, TLRPC.TL_forumTopic tL_forumTopic, boolean z10, boolean z11, c6 c6Var) {
        if (tL_forumTopic == null || n9Var == null) {
            return;
        }
        if (tL_forumTopic.id == 1) {
            n9Var.setAnimatedEmojiDrawable(null);
            n9Var.setImageDrawable(c(n9Var.getContext(), 0.75f, g6.v0(g6.v8, c6Var), z11));
            return;
        }
        if (tL_forumTopic.icon_emoji_id == 0) {
            n9Var.setAnimatedEmojiDrawable(null);
            n9Var.setImageDrawable(e(tL_forumTopic));
            return;
        }
        n9Var.setImageDrawable(null);
        k5 k5Var = n9Var.e;
        if (k5Var == null || tL_forumTopic.icon_emoji_id != k5Var.i()) {
            k5 k5Var2 = new k5(z11 ? 11 : 10, UserConfig.selectedAccount, tL_forumTopic.icon_emoji_id);
            k5Var2.setColorFilter(z10 ? new PorterDuffColorFilter(g6.w0(null, g6.A8, false), PorterDuff.Mode.SRC_IN) : g6.n0(c6Var));
            n9Var.setAnimatedEmojiDrawable(k5Var2);
        }
    }

    public static void q(long j10, ActionBarLayout actionBarLayout) {
        n2 lastFragment = actionBarLayout.getLastFragment();
        if (lastFragment instanceof rn) {
            rn rnVar = (rn) lastFragment;
            if ((-rnVar.a()) == j10 && rnVar.getMessagesController().getChat(Long.valueOf(j10)).forum && rnVar.getParentLayout() != null) {
                if (((ActionBarLayout) rnVar.getParentLayout()).j()) {
                    AndroidUtilities.runOnUIThread(new h(rnVar, 1), 500L);
                } else {
                    we1.I0(rnVar);
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
                AndroidUtilities.runOnUIThread(new qf.b(we1Var, 17), 500L);
                return;
            }
            we1Var.D = true;
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", j11);
            rn rnVar2 = new rn(bundle);
            rnVar2.fa = true;
            we1Var.presentFragment(rnVar2);
        }
    }
}

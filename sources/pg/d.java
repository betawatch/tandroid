package pg;

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
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.y9;
import org.telegram.ui.Components.zq;
import org.telegram.ui.cf1;
import org.telegram.ui.web.h1;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public abstract class d {
    public static final /* synthetic */ int a = 0;

    static {
        new SparseArray();
    }

    public static void a(wn wnVar, MessagesStorage.TopicKey topicKey) {
        TLRPC.TL_forumTopic findTopic;
        if (topicKey.topicId == 0 || (findTopic = wnVar.getMessagesController().getTopicsController().findTopic(-topicKey.dialogId, topicKey.topicId)) == null) {
            return;
        }
        if (topicKey.dialogId > 0) {
            if (UserObject.isBotForum(wnVar.getMessagesController().getUser(Long.valueOf(topicKey.dialogId)))) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new MessageObject(wnVar.getCurrentAccount(), findTopic.topicStartMessage, false, false));
                wnVar.Eb(arrayList, null, findTopic.id, findTopic.read_inbox_max_id, findTopic.read_outbox_max_id, findTopic);
                wnVar.getMessagesController().setForumLastTopicId(-topicKey.dialogId, topicKey.topicId);
                return;
            }
            return;
        }
        TLRPC.Chat chat = wnVar.getMessagesController().getChat(Long.valueOf(-topicKey.dialogId));
        if (chat == null) {
            return;
        }
        if (!ChatObject.isMonoForum(chat)) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new MessageObject(wnVar.getCurrentAccount(), findTopic.topicStartMessage, false, false));
            wnVar.Eb(arrayList2, chat, findTopic.id, findTopic.read_inbox_max_id, findTopic.read_outbox_max_id, findTopic);
        } else if (ChatObject.canManageMonoForum(UserConfig.selectedAccount, chat)) {
            int i10 = findTopic.read_inbox_max_id;
            int i11 = findTopic.read_outbox_max_id;
            wnVar.w4 = i10;
            wnVar.x4 = i11;
            wnVar.y4 = Math.max(1, i10);
            wnVar.p4 = DialogObject.getPeerDialogId(findTopic.from_id);
            wnVar.Qc();
            wnVar.hd(false);
            wnVar.yc(false);
        }
        wnVar.getMessagesController().setForumLastTopicId(-topicKey.dialogId, topicKey.topicId);
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

    public static c c(Context context, float f7, int i10, boolean z10) {
        if (context == null) {
            return null;
        }
        c cVar = new c();
        cVar.a = context.getResources().getDrawable(z10 ? R.drawable.msg_filled_general_large : R.drawable.msg_filled_general).mutate();
        cVar.b = f7;
        cVar.a(i10);
        return cVar;
    }

    public static ar d(int i10, String str) {
        a aVar = new a(i10);
        i90 i90Var = new i90(1, null);
        String trim = str.trim();
        i90Var.a(trim.length() >= 1 ? trim.substring(0, 1).toUpperCase() : "");
        ar arVar = new ar(aVar, i90Var, 0, 0);
        arVar.w = true;
        return arVar;
    }

    public static ar e(TLRPC.TL_forumTopic tL_forumTopic) {
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

    public static wn g(r2 r2Var, long j10, TLRPC.TL_forumTopic tL_forumTopic, int i10, Bundle bundle) {
        TLRPC.TL_forumTopic tL_forumTopic2;
        TLRPC.TL_forumTopic findTopic;
        if (r2Var == null || tL_forumTopic == null) {
            return null;
        }
        TLRPC.Chat chat = r2Var.getMessagesController().getChat(Long.valueOf(j10));
        bundle.putLong("chat_id", j10);
        if (i10 != 0) {
            bundle.putInt("message_id", i10);
        } else if (tL_forumTopic.read_inbox_max_id == 0) {
            bundle.putInt("message_id", tL_forumTopic.id);
        }
        bundle.putInt("unread_count", tL_forumTopic.unread_count);
        bundle.putBoolean("historyPreloaded", false);
        wn wnVar = new wn(bundle);
        TLRPC.Message message = tL_forumTopic.topicStartMessage;
        if (message != null || (findTopic = r2Var.getMessagesController().getTopicsController().findTopic(j10, tL_forumTopic.id)) == null) {
            tL_forumTopic2 = tL_forumTopic;
        } else {
            message = findTopic.topicStartMessage;
            tL_forumTopic2 = findTopic;
        }
        if (message == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new MessageObject(r2Var.getCurrentAccount(), message, false, false));
        wnVar.Eb(arrayList, chat, tL_forumTopic2.id, tL_forumTopic2.read_inbox_max_id, tL_forumTopic2.read_outbox_max_id, tL_forumTopic2);
        if (i10 != 0) {
            wnVar.b8 = i10;
        }
        return wnVar;
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
                c c10 = c(ApplicationLoader.applicationContext, 1.0f, paint == null ? y6.x0(null, y6.Ac, false) : paint.getColor(), false);
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
            c6 c6Var = new c6(tL_forumTopic.icon_emoji_id, 0.95f, paint != null ? paint.getFontMetricsInt() : null);
            spannableStringBuilder.setSpan(c6Var, 0, 1, 33);
            c6Var.top = true;
            c6Var.cacheType = 13;
        } else {
            spannableStringBuilder.append((CharSequence) " ");
            ar e = e(tL_forumTopic);
            if (drawableArr != null) {
                drawableArr[0] = e.a;
            }
            e.setBounds(0, 0, (int) (e.getIntrinsicWidth() * 0.65f), (int) (e.getIntrinsicHeight() * 0.65f));
            Drawable drawable = e.b;
            if (drawable instanceof i90) {
                ((i90) drawable).i = 0.7f;
            }
            if (paint != null) {
                zq zqVar = new zq(0, e);
                zqVar.setSize((int) (Math.abs(paint.getFontMetrics().ascent) + Math.abs(paint.getFontMetrics().descent)));
                spannableStringBuilder.setSpan(zqVar, 0, 1, 33);
            } else {
                spannableStringBuilder.setSpan(new ImageSpan(e), 0, 1, 33);
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

    public static void m(r2 r2Var, long j10, TLRPC.TL_forumTopic tL_forumTopic, int i10) {
        wn g7 = g(r2Var, j10, tL_forumTopic, i10, new Bundle());
        if (g7 != null) {
            r2Var.presentFragment(g7);
        }
    }

    public static void n(int i10, TLRPC.Chat chat, j9 j9Var, ImageReceiver imageReceiver) {
        TLRPC.Chat chat2 = ChatObject.isMonoForum(chat) ? MessagesController.getInstance(i10).getChat(Long.valueOf(chat.linked_monoforum_id)) : null;
        if (chat2 != null) {
            chat = chat2;
        }
        j9Var.k(i10, chat);
        imageReceiver.setForUserOrChat(chat2, j9Var);
    }

    public static void o(int i10, TLRPC.Chat chat, j9 j9Var, y9 y9Var) {
        TLRPC.Chat chat2 = ChatObject.isMonoForum(chat) ? MessagesController.getInstance(i10).getChat(Long.valueOf(chat.linked_monoforum_id)) : null;
        if (chat2 != null) {
            chat = chat2;
        }
        j9Var.k(i10, chat);
        y9Var.f(chat2, j9Var);
    }

    public static void p(y9 y9Var, TLRPC.TL_forumTopic tL_forumTopic, boolean z10, boolean z11, u6 u6Var) {
        if (tL_forumTopic == null || y9Var == null) {
            return;
        }
        if (tL_forumTopic.id == 1) {
            y9Var.setAnimatedEmojiDrawable(null);
            Context context = y9Var.getContext();
            int i10 = y6.v8;
            c c10 = c(context, 0.75f, y6.w0(i10, u6Var), z11);
            y9Var.setImageDrawable(c10);
            if (c10 != null) {
                f7.y(y9Var, c10, i10, u6Var, PorterDuff.Mode.MULTIPLY);
                return;
            }
            return;
        }
        if (tL_forumTopic.icon_emoji_id == 0) {
            y9Var.setAnimatedEmojiDrawable(null);
            y9Var.setImageDrawable(e(tL_forumTopic));
            return;
        }
        y9Var.setImageDrawable(null);
        t5 t5Var = y9Var.e;
        if (t5Var == null || tL_forumTopic.icon_emoji_id != t5Var.i()) {
            t5 t5Var2 = new t5(z11 ? 11 : 10, UserConfig.selectedAccount, tL_forumTopic.icon_emoji_id);
            t5Var2.setColorFilter(z10 ? new PorterDuffColorFilter(y6.x0(null, y6.A8, false), PorterDuff.Mode.SRC_IN) : y6.o0(u6Var));
            y9Var.setAnimatedEmojiDrawable(t5Var2);
        }
    }

    public static void q(long j10, ActionBarLayout actionBarLayout) {
        r2 lastFragment = actionBarLayout.getLastFragment();
        if (lastFragment instanceof wn) {
            wn wnVar = (wn) lastFragment;
            if ((-wnVar.a()) == j10 && wnVar.getMessagesController().getChat(Long.valueOf(j10)).forum && wnVar.getParentLayout() != null) {
                if (((ActionBarLayout) wnVar.getParentLayout()).i()) {
                    AndroidUtilities.runOnUIThread(new b(wnVar, 0), 500L);
                } else {
                    cf1.I0(wnVar);
                }
            }
        }
        if (lastFragment instanceof cf1) {
            cf1 cf1Var = (cf1) lastFragment;
            long j11 = cf1Var.a;
            if ((-(-j11)) != j10 || cf1Var.getMessagesController().getChat(Long.valueOf(j10)).forum) {
                return;
            }
            if (cf1Var.getParentLayout() != null && ((ActionBarLayout) cf1Var.getParentLayout()).i()) {
                AndroidUtilities.runOnUIThread(new h1(cf1Var, 7), 500L);
                return;
            }
            cf1Var.H = true;
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", j11);
            wn wnVar2 = new wn(bundle);
            wnVar2.za = true;
            cf1Var.presentFragment(wnVar2);
        }
    }
}

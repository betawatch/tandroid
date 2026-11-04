package rg;

import ai.l;
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
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.messenger.m5;
import org.telegram.messenger.pr;
import org.telegram.messenger.t0;
import org.telegram.messenger.t3;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.c70;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xp;
import org.telegram.ui.m91;
import org.telegram.ui.wm;
import r4.u;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class c {
    public static final /* synthetic */ int a = 0;

    static {
        new SparseArray();
    }

    public static void a(wm wmVar, pr prVar) {
        TLRPC.TL_forumTopic f10;
        if (prVar.b == 0 || (f10 = wmVar.getMessagesController().q7.f(-prVar.a, prVar.b)) == null) {
            return;
        }
        if (prVar.a > 0) {
            if (l10.u(wmVar.getMessagesController().a2(Long.valueOf(prVar.a)))) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new zi(wmVar.getCurrentAccount(), f10.topicStartMessage, false, false));
                wmVar.Rb(arrayList, null, f10.id, f10.read_inbox_max_id, f10.read_outbox_max_id, f10);
                wmVar.getMessagesController().J4(-prVar.a, prVar.b);
                return;
            }
            return;
        }
        TLRPC.Chat M0 = wmVar.getMessagesController().M0(Long.valueOf(-prVar.a));
        if (M0 == null) {
            return;
        }
        if (!t3.p0(M0)) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new zi(wmVar.getCurrentAccount(), f10.topicStartMessage, false, false));
            wmVar.Rb(arrayList2, M0, f10.id, f10.read_inbox_max_id, f10.read_outbox_max_id, f10);
        } else if (t3.A(h10.t0, M0, 24)) {
            int i3 = f10.read_inbox_max_id;
            int i10 = f10.read_outbox_max_id;
            wmVar.z4 = i3;
            wmVar.A4 = i10;
            wmVar.B4 = Math.max(1, i3);
            wmVar.s4 = m5.o(f10.from_id);
            wmVar.dd();
            wmVar.vd(false);
            wmVar.Lc(false);
        }
        wmVar.getMessagesController().J4(-prVar.a, prVar.b);
    }

    public static void b(zi ziVar) {
        TLRPC.TL_forumTopic f10;
        TLRPC.Message message = ziVar.k;
        int i3 = ziVar.I1;
        if (zi.B0(message) <= 0 && (f10 = hp.s1(i3).q7.f(-zi.B0(ziVar.k), zi.c2(i3, ziVar.k, true, false))) != null) {
            Drawable drawable = ziVar.g2[0];
            if (drawable instanceof a) {
                ((a) drawable).b(f10.icon_color);
            }
        }
    }

    public static b c(Context context, float f10, int i3, boolean z10) {
        if (context == null) {
            return null;
        }
        b bVar = new b();
        bVar.a = context.getResources().getDrawable(z10 ? R.drawable.msg_filled_general_large : R.drawable.msg_filled_general).mutate();
        bVar.b = f10;
        bVar.a(i3);
        return bVar;
    }

    public static xp d(int i3, String str) {
        a aVar = new a(i3);
        c70 c70Var = new c70(1, null);
        String trim = str.trim();
        c70Var.a(trim.length() >= 1 ? trim.substring(0, 1).toUpperCase() : "");
        xp xpVar = new xp(aVar, c70Var, 0, 0);
        xpVar.x = true;
        return xpVar;
    }

    public static xp e(TLRPC.TL_forumTopic tL_forumTopic) {
        if (tL_forumTopic == null) {
            return null;
        }
        return d(tL_forumTopic.icon_color, tL_forumTopic.title);
    }

    public static void f(ArrayList arrayList, long j10) {
        if (arrayList == null) {
            return;
        }
        int i3 = 0;
        while (i3 < arrayList.size()) {
            if (j10 != zi.c2(((zi) arrayList.get(i3)).I1, ((zi) arrayList.get(i3)).k, true, false)) {
                arrayList.remove(i3);
                i3--;
            }
            i3++;
        }
    }

    public static wm g(d2 d2Var, long j10, TLRPC.TL_forumTopic tL_forumTopic, int i3, Bundle bundle) {
        TLRPC.TL_forumTopic tL_forumTopic2;
        TLRPC.TL_forumTopic f10;
        if (d2Var == null || tL_forumTopic == null) {
            return null;
        }
        TLRPC.Chat M0 = d2Var.getMessagesController().M0(Long.valueOf(j10));
        bundle.putLong("chat_id", j10);
        if (i3 != 0) {
            bundle.putInt("message_id", i3);
        } else if (tL_forumTopic.read_inbox_max_id == 0) {
            bundle.putInt("message_id", tL_forumTopic.id);
        }
        bundle.putInt("unread_count", tL_forumTopic.unread_count);
        bundle.putBoolean("historyPreloaded", false);
        wm wmVar = new wm(bundle);
        TLRPC.Message message = tL_forumTopic.topicStartMessage;
        if (message != null || (f10 = d2Var.getMessagesController().q7.f(j10, tL_forumTopic.id)) == null) {
            tL_forumTopic2 = tL_forumTopic;
        } else {
            message = f10.topicStartMessage;
            tL_forumTopic2 = f10;
        }
        if (message == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new zi(d2Var.getCurrentAccount(), message, false, false));
        wmVar.Rb(arrayList, M0, tL_forumTopic2.id, tL_forumTopic2.read_inbox_max_id, tL_forumTopic2.read_outbox_max_id, tL_forumTopic2);
        if (i3 != 0) {
            wmVar.c8 = i3;
        }
        return wmVar;
    }

    public static String h(int i3, long j10) {
        return i(i3, hp.s1(i3).M0(Long.valueOf(-j10)), true);
    }

    public static String i(int i3, TLRPC.Chat chat, boolean z10) {
        if (t3.p0(chat)) {
            TLRPC.Chat M0 = hp.s1(i3).M0(Long.valueOf(chat.linked_monoforum_id));
            if (M0 != null) {
                String str = M0.title;
                return z10 ? str : bd.a0(null, null, 2131748354, str);
            }
        } else if (chat != null && chat.linked_monoforum_id != 0) {
            String str2 = chat.title;
            return z10 ? str2 : bd.a0(null, null, 2131748354, str2);
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
                b c2 = c(t0.b, 1.0f, paint == null ? k6.x0(null, k6.od, false) : paint.getColor(), false);
                c2.setBounds(0, 0, paint == null ? g0.L(14.0f) : (int) paint.getTextSize(), paint == null ? g0.L(14.0f) : (int) paint.getTextSize());
                spannableStringBuilder.append((CharSequence) " ");
                if (drawableArr != null) {
                    drawableArr[0] = c2;
                }
                spannableStringBuilder.setSpan(new ImageSpan(c2, 2), 0, 1, 33);
            } catch (Exception unused) {
            }
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            spannableStringBuilder.append((CharSequence) " ");
            p5 p5Var = new p5(tL_forumTopic.icon_emoji_id, 0.95f, paint != null ? paint.getFontMetricsInt() : null);
            spannableStringBuilder.setSpan(p5Var, 0, 1, 33);
            p5Var.top = true;
            p5Var.cacheType = 13;
        } else {
            spannableStringBuilder.append((CharSequence) " ");
            xp e10 = e(tL_forumTopic);
            if (drawableArr != null) {
                drawableArr[0] = e10.a;
            }
            e10.setBounds(0, 0, (int) (e10.getIntrinsicWidth() * 0.65f), (int) (e10.getIntrinsicHeight() * 0.65f));
            Drawable drawable = e10.b;
            if (drawable instanceof c70) {
                ((c70) drawable).i = 0.7f;
            }
            if (paint != null) {
                wp wpVar = new wp(0, e10);
                wpVar.c((int) (Math.abs(paint.getFontMetrics().ascent) + Math.abs(paint.getFontMetrics().descent)));
                spannableStringBuilder.setSpan(wpVar, 0, 1, 33);
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

    public static boolean k(zi ziVar) {
        return ziVar != null && (ziVar.k.action instanceof TLRPC.TL_messageActionTopicCreate);
    }

    public static ArrayList l(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            TLRPC.savedDialog saveddialog = (TLRPC.savedDialog) obj;
            if (saveddialog instanceof TLRPC.TL_monoForumDialog) {
                TLRPC.TL_monoForumDialog tL_monoForumDialog = (TLRPC.TL_monoForumDialog) saveddialog;
                long o10 = m5.o(tL_monoForumDialog.peer);
                TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                tL_forumTopic.id = (int) ((o10 >>> 32) ^ o10);
                tL_forumTopic.title = Long.toString(o10);
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

    public static void m(d2 d2Var, long j10, TLRPC.TL_forumTopic tL_forumTopic, int i3) {
        wm g7 = g(d2Var, j10, tL_forumTopic, i3, new Bundle());
        if (g7 != null) {
            d2Var.presentFragment(g7);
        }
    }

    public static void n(int i3, TLRPC.Chat chat, u8 u8Var, ImageReceiver imageReceiver) {
        TLRPC.Chat M0 = t3.p0(chat) ? hp.s1(i3).M0(Long.valueOf(chat.linked_monoforum_id)) : null;
        if (M0 != null) {
            chat = M0;
        }
        u8Var.q(chat);
        imageReceiver.i0(M0, u8Var, null);
    }

    public static void o(int i3, TLRPC.Chat chat, u8 u8Var, k9 k9Var) {
        TLRPC.Chat M0 = t3.p0(chat) ? hp.s1(i3).M0(Long.valueOf(chat.linked_monoforum_id)) : null;
        if (M0 != null) {
            chat = M0;
        }
        u8Var.q(chat);
        k9Var.e(M0, u8Var);
    }

    public static void p(k9 k9Var, TLRPC.TL_forumTopic tL_forumTopic, boolean z10, boolean z11, e6 e6Var) {
        if (tL_forumTopic == null || k9Var == null) {
            return;
        }
        if (tL_forumTopic.id == 1) {
            k9Var.setAnimatedEmojiDrawable(null);
            Context context = k9Var.getContext();
            int i3 = k6.v8;
            b c2 = c(context, 0.75f, k6.w0(i3, e6Var), z11);
            k9Var.setImageDrawable(c2);
            if (c2 != null) {
                r6.y(k9Var, c2, i3, e6Var, PorterDuff.Mode.MULTIPLY);
                return;
            }
            return;
        }
        if (tL_forumTopic.icon_emoji_id == 0) {
            k9Var.setAnimatedEmojiDrawable(null);
            k9Var.setImageDrawable(e(tL_forumTopic));
            return;
        }
        k9Var.setImageDrawable(null);
        g5 g5Var = k9Var.e;
        if (g5Var == null || tL_forumTopic.icon_emoji_id != g5Var.h()) {
            g5 g5Var2 = new g5(z11 ? 11 : 10, h10.t0, tL_forumTopic.icon_emoji_id);
            g5Var2.setColorFilter(z10 ? new PorterDuffColorFilter(k6.x0(null, k6.A8, false), PorterDuff.Mode.SRC_IN) : k6.o0(e6Var));
            k9Var.setAnimatedEmojiDrawable(g5Var2);
        }
    }

    public static void q(long j10, ActionBarLayout actionBarLayout) {
        d2 lastFragment = actionBarLayout.getLastFragment();
        if (lastFragment instanceof wm) {
            wm wmVar = (wm) lastFragment;
            if ((-wmVar.a()) == j10 && wmVar.getMessagesController().M0(Long.valueOf(j10)).forum && wmVar.getParentLayout() != null) {
                if (((ActionBarLayout) wmVar.getParentLayout()).i()) {
                    g0.i3(new l(wmVar, 1), 500L);
                } else {
                    m91.M0(wmVar);
                }
            }
        }
        if (lastFragment instanceof m91) {
            m91 m91Var = (m91) lastFragment;
            long j11 = m91Var.a;
            if ((-(-j11)) != j10 || m91Var.getMessagesController().M0(Long.valueOf(j10)).forum) {
                return;
            }
            if (m91Var.getParentLayout() != null && ((ActionBarLayout) m91Var.getParentLayout()).i()) {
                g0.i3(new u(m91Var, 1), 500L);
                return;
            }
            m91Var.I = true;
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", j11);
            wm wmVar2 = new wm(bundle);
            wmVar2.Da = true;
            m91Var.presentFragment(wmVar2);
        }
    }
}

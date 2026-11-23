package qg;

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
import bi.i;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.i5;
import org.telegram.messenger.k10;
import org.telegram.messenger.n5;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.messenger.t0;
import org.telegram.messenger.tr;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.y5;
import org.telegram.ui.bn;
import org.telegram.ui.web.z0;
import org.telegram.ui.y91;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public abstract class c {
    public static final /* synthetic */ int a = 0;

    static {
        new SparseArray();
    }

    public static void a(bn bnVar, tr trVar) {
        TLRPC.TL_forumTopic f10;
        if (trVar.b == 0 || (f10 = bnVar.getMessagesController().t7.f(-trVar.a, trVar.b)) == null) {
            return;
        }
        if (trVar.a > 0) {
            if (p10.v(bnVar.getMessagesController().c2(Long.valueOf(trVar.a)))) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new gj(bnVar.getCurrentAccount(), f10.topicStartMessage, false, false));
                bnVar.Vb(arrayList, null, f10.id, f10.read_inbox_max_id, f10.read_outbox_max_id, f10);
                bnVar.getMessagesController().V4(-trVar.a, trVar.b);
                return;
            }
            return;
        }
        TLRPC.Chat O0 = bnVar.getMessagesController().O0(Long.valueOf(-trVar.a));
        if (O0 == null) {
            return;
        }
        if (!v3.p0(O0)) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new gj(bnVar.getCurrentAccount(), f10.topicStartMessage, false, false));
            bnVar.Vb(arrayList2, O0, f10.id, f10.read_inbox_max_id, f10.read_outbox_max_id, f10);
        } else if (v3.A(k10.t0, O0, 24)) {
            int i7 = f10.read_inbox_max_id;
            int i10 = f10.read_outbox_max_id;
            bnVar.A4 = i7;
            bnVar.B4 = i10;
            bnVar.C4 = Math.max(1, i7);
            bnVar.s4 = n5.o(f10.from_id);
            bnVar.hd();
            bnVar.zd(false);
            bnVar.Pc(false);
        }
        bnVar.getMessagesController().V4(-trVar.a, trVar.b);
    }

    public static void b(gj gjVar) {
        TLRPC.TL_forumTopic f10;
        TLRPC.Message message = gjVar.k;
        int i7 = gjVar.K1;
        if (gj.B0(message) <= 0 && (f10 = np.u1(i7).t7.f(-gj.B0(gjVar.k), gj.b2(i7, gjVar.k, true, false))) != null) {
            Drawable drawable = gjVar.i2[0];
            if (drawable instanceof a) {
                ((a) drawable).b(f10.icon_color);
            }
        }
    }

    public static SpannableStringBuilder c(TLRPC.TL_forumTopic tL_forumTopic, gj gjVar) {
        TLRPC.Chat O0;
        TLRPC.User user;
        if (tL_forumTopic != null) {
            TLRPC.Message message = gjVar.k;
            int i7 = gjVar.K1;
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionTopicCreate) {
                return g0.K2(hd.N0(2131743756, null), k(tL_forumTopic, null, null), "%s");
            }
            if (messageAction instanceof TLRPC.TL_messageActionTopicEdit) {
                TLRPC.TL_messageActionTopicEdit tL_messageActionTopicEdit = (TLRPC.TL_messageActionTopicEdit) messageAction;
                long Z0 = gjVar.Z0();
                if (n5.E(Z0)) {
                    user = np.u1(i7).c2(Long.valueOf(Z0));
                    O0 = null;
                } else {
                    O0 = np.u1(i7).O0(Long.valueOf(-Z0));
                    user = null;
                }
                String m10 = user != null ? i5.m(0, user.first_name, user.last_name) : O0 != null ? O0.title : null;
                int i10 = tL_messageActionTopicEdit.flags;
                if ((i10 & 8) != 0) {
                    return g0.K2(hd.N0(tL_messageActionTopicEdit.hidden ? 2131743774 : 2131743760, null), m10, "%s");
                }
                if ((i10 & 4) != 0) {
                    return g0.K2(g0.K2(hd.N0(tL_messageActionTopicEdit.closed ? 2131743757 : 2131743752, null), k(tL_forumTopic, null, null), "%2$s"), m10, "%1$s");
                }
                int i11 = i10 & 1;
                if (i11 != 0 && (i10 & 2) != 0) {
                    TLRPC.TL_forumTopic tL_forumTopic2 = new TLRPC.TL_forumTopic();
                    tL_forumTopic2.icon_emoji_id = tL_messageActionTopicEdit.icon_emoji_id;
                    tL_forumTopic2.title = tL_messageActionTopicEdit.title;
                    return g0.K2(g0.K2(hd.N0(2131743753, null), k(tL_forumTopic2, null, null), "%2$s"), m10, "%1$s");
                }
                if (i11 != 0) {
                    return g0.K2(g0.K2(hd.N0(2131743754, null), tL_messageActionTopicEdit.title, "%2$s"), m10, "%1$s");
                }
                if ((i10 & 2) != 0) {
                    TLRPC.TL_forumTopic tL_forumTopic3 = new TLRPC.TL_forumTopic();
                    tL_forumTopic3.icon_emoji_id = tL_messageActionTopicEdit.icon_emoji_id;
                    tL_forumTopic3.title = "";
                    return g0.K2(g0.K2(hd.N0(2131743755, null), k(tL_forumTopic3, null, null), "%2$s"), m10, "%1$s");
                }
            }
        }
        return null;
    }

    public static b d(Context context, float f10, int i7, boolean z10) {
        if (context == null) {
            return null;
        }
        b bVar = new b();
        bVar.a = context.getResources().getDrawable(z10 ? R.drawable.msg_filled_general_large : R.drawable.msg_filled_general).mutate();
        bVar.b = f10;
        bVar.a(i7);
        return bVar;
    }

    public static oq e(int i7, String str) {
        a aVar = new a(i7);
        w70 w70Var = new w70(1, null);
        String trim = str.trim();
        w70Var.a(trim.length() >= 1 ? trim.substring(0, 1).toUpperCase() : "");
        oq oqVar = new oq(aVar, w70Var, 0, 0);
        oqVar.x = true;
        return oqVar;
    }

    public static oq f(TLRPC.TL_forumTopic tL_forumTopic) {
        if (tL_forumTopic == null) {
            return null;
        }
        return e(tL_forumTopic.icon_color, tL_forumTopic.title);
    }

    public static void g(ArrayList arrayList, long j3) {
        if (arrayList == null) {
            return;
        }
        int i7 = 0;
        while (i7 < arrayList.size()) {
            if (j3 != gj.b2(((gj) arrayList.get(i7)).K1, ((gj) arrayList.get(i7)).k, true, false)) {
                arrayList.remove(i7);
                i7--;
            }
            i7++;
        }
    }

    public static bn h(g2 g2Var, long j3, TLRPC.TL_forumTopic tL_forumTopic, int i7, Bundle bundle) {
        TLRPC.TL_forumTopic tL_forumTopic2;
        TLRPC.TL_forumTopic f10;
        if (g2Var == null || tL_forumTopic == null) {
            return null;
        }
        TLRPC.Chat O0 = g2Var.getMessagesController().O0(Long.valueOf(j3));
        bundle.putLong("chat_id", j3);
        if (i7 != 0) {
            bundle.putInt("message_id", i7);
        } else if (tL_forumTopic.read_inbox_max_id == 0) {
            bundle.putInt("message_id", tL_forumTopic.id);
        }
        bundle.putInt("unread_count", tL_forumTopic.unread_count);
        bundle.putBoolean("historyPreloaded", false);
        bn bnVar = new bn(bundle);
        TLRPC.Message message = tL_forumTopic.topicStartMessage;
        if (message != null || (f10 = g2Var.getMessagesController().t7.f(j3, tL_forumTopic.id)) == null) {
            tL_forumTopic2 = tL_forumTopic;
        } else {
            message = f10.topicStartMessage;
            tL_forumTopic2 = f10;
        }
        if (message == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new gj(g2Var.getCurrentAccount(), message, false, false));
        bnVar.Vb(arrayList, O0, tL_forumTopic2.id, tL_forumTopic2.read_inbox_max_id, tL_forumTopic2.read_outbox_max_id, tL_forumTopic2);
        if (i7 != 0) {
            bnVar.d8 = i7;
        }
        return bnVar;
    }

    public static String i(int i7, long j3) {
        return j(i7, np.u1(i7).O0(Long.valueOf(-j3)), true);
    }

    public static String j(int i7, TLRPC.Chat chat, boolean z10) {
        if (v3.p0(chat)) {
            TLRPC.Chat O0 = np.u1(i7).O0(Long.valueOf(chat.linked_monoforum_id));
            if (O0 != null) {
                String str = O0.title;
                return z10 ? str : hd.a0(null, null, 2131748153, str);
            }
        } else if (chat != null && chat.linked_monoforum_id != 0) {
            String str2 = chat.title;
            return z10 ? str2 : hd.a0(null, null, 2131748153, str2);
        }
        if (chat != null) {
            return chat.title;
        }
        return null;
    }

    public static CharSequence k(TLRPC.ForumTopic forumTopic, Paint paint, Drawable[] drawableArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!(forumTopic instanceof TLRPC.TL_forumTopic)) {
            return "DELETED";
        }
        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) forumTopic;
        if (tL_forumTopic.id == 1) {
            try {
                b d = d(t0.b, 1.0f, paint == null ? m6.x0(null, m6.rd, false) : paint.getColor(), false);
                d.setBounds(0, 0, paint == null ? g0.L(14.0f) : (int) paint.getTextSize(), paint == null ? g0.L(14.0f) : (int) paint.getTextSize());
                spannableStringBuilder.append((CharSequence) " ");
                if (drawableArr != null) {
                    drawableArr[0] = d;
                }
                spannableStringBuilder.setSpan(new ImageSpan(d, 2), 0, 1, 33);
            } catch (Exception unused) {
            }
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            spannableStringBuilder.append((CharSequence) " ");
            y5 y5Var = new y5(tL_forumTopic.icon_emoji_id, 0.95f, paint != null ? paint.getFontMetricsInt() : null);
            spannableStringBuilder.setSpan(y5Var, 0, 1, 33);
            y5Var.top = true;
            y5Var.cacheType = 13;
        } else {
            spannableStringBuilder.append((CharSequence) " ");
            oq f10 = f(tL_forumTopic);
            if (drawableArr != null) {
                drawableArr[0] = f10.a;
            }
            f10.setBounds(0, 0, (int) (f10.getIntrinsicWidth() * 0.65f), (int) (f10.getIntrinsicHeight() * 0.65f));
            Drawable drawable = f10.b;
            if (drawable instanceof w70) {
                ((w70) drawable).i = 0.7f;
            }
            if (paint != null) {
                nq nqVar = new nq(0, f10);
                nqVar.c((int) (Math.abs(paint.getFontMetrics().ascent) + Math.abs(paint.getFontMetrics().descent)));
                spannableStringBuilder.setSpan(nqVar, 0, 1, 33);
            } else {
                spannableStringBuilder.setSpan(new ImageSpan(f10), 0, 1, 33);
            }
        }
        if (!TextUtils.isEmpty(tL_forumTopic.title)) {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) tL_forumTopic.title);
        }
        return spannableStringBuilder;
    }

    public static boolean l(gj gjVar) {
        return gjVar != null && (gjVar.k.action instanceof TLRPC.TL_messageActionTopicCreate);
    }

    public static ArrayList m(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            TLRPC.savedDialog saveddialog = (TLRPC.savedDialog) obj;
            if (saveddialog instanceof TLRPC.TL_monoForumDialog) {
                TLRPC.TL_monoForumDialog tL_monoForumDialog = (TLRPC.TL_monoForumDialog) saveddialog;
                long o4 = n5.o(tL_monoForumDialog.peer);
                TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                tL_forumTopic.id = (int) ((o4 >>> 32) ^ o4);
                tL_forumTopic.title = Long.toString(o4);
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

    public static void n(g2 g2Var, long j3, TLRPC.TL_forumTopic tL_forumTopic, int i7) {
        bn h = h(g2Var, j3, tL_forumTopic, i7, new Bundle());
        if (h != null) {
            g2Var.presentFragment(h);
        }
    }

    public static void o(int i7, TLRPC.Chat chat, b9 b9Var, ImageReceiver imageReceiver) {
        TLRPC.Chat O0 = v3.p0(chat) ? np.u1(i7).O0(Long.valueOf(chat.linked_monoforum_id)) : null;
        if (O0 != null) {
            chat = O0;
        }
        b9Var.q(chat);
        imageReceiver.i0(O0, b9Var, null);
    }

    public static void p(int i7, TLRPC.Chat chat, b9 b9Var, q9 q9Var) {
        TLRPC.Chat O0 = v3.p0(chat) ? np.u1(i7).O0(Long.valueOf(chat.linked_monoforum_id)) : null;
        if (O0 != null) {
            chat = O0;
        }
        b9Var.q(chat);
        q9Var.f(O0, b9Var);
    }

    public static void q(q9 q9Var, TLRPC.TL_forumTopic tL_forumTopic, boolean z10, boolean z11, h6 h6Var) {
        if (tL_forumTopic == null || q9Var == null) {
            return;
        }
        if (tL_forumTopic.id == 1) {
            q9Var.setAnimatedEmojiDrawable(null);
            Context context = q9Var.getContext();
            int i7 = m6.v8;
            b d = d(context, 0.75f, m6.w0(i7, h6Var), z11);
            q9Var.setImageDrawable(d);
            if (d != null) {
                t6.x(q9Var, d, i7, h6Var, PorterDuff.Mode.MULTIPLY);
                return;
            }
            return;
        }
        if (tL_forumTopic.icon_emoji_id == 0) {
            q9Var.setAnimatedEmojiDrawable(null);
            q9Var.setImageDrawable(f(tL_forumTopic));
            return;
        }
        q9Var.setImageDrawable(null);
        p5 p5Var = q9Var.e;
        if (p5Var == null || tL_forumTopic.icon_emoji_id != p5Var.h()) {
            p5 p5Var2 = new p5(z11 ? 11 : 10, k10.t0, tL_forumTopic.icon_emoji_id);
            p5Var2.setColorFilter(z10 ? new PorterDuffColorFilter(m6.x0(null, m6.A8, false), PorterDuff.Mode.SRC_IN) : m6.o0(h6Var));
            q9Var.setAnimatedEmojiDrawable(p5Var2);
        }
    }

    public static void r(long j3, ActionBarLayout actionBarLayout) {
        g2 lastFragment = actionBarLayout.getLastFragment();
        if (lastFragment instanceof bn) {
            bn bnVar = (bn) lastFragment;
            if ((-bnVar.a()) == j3 && bnVar.getMessagesController().O0(Long.valueOf(j3)).forum && bnVar.getParentLayout() != null) {
                if (((ActionBarLayout) bnVar.getParentLayout()).i()) {
                    g0.h3(new i(bnVar, 1), 500L);
                } else {
                    y91.M0(bnVar);
                }
            }
        }
        if (lastFragment instanceof y91) {
            y91 y91Var = (y91) lastFragment;
            long j10 = y91Var.a;
            if ((-(-j10)) != j3 || y91Var.getMessagesController().O0(Long.valueOf(j3)).forum) {
                return;
            }
            if (y91Var.getParentLayout() != null && ((ActionBarLayout) y91Var.getParentLayout()).i()) {
                g0.h3(new z0(y91Var, 5), 500L);
                return;
            }
            y91Var.I = true;
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", j10);
            bn bnVar2 = new bn(bundle);
            bnVar2.Ga = true;
            y91Var.presentFragment(bnVar2);
        }
    }
}

// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public abstract class ro4 {
    public static final /* synthetic */ int a = 0;

    public static void a(zu1 zu1Var, if7 if7Var) {
        TLRPC.TL_forumTopic f;
        if (if7Var.b == 0 || (f = zu1Var.getMessagesController().g4.f(-if7Var.a, if7Var.b)) == null) {
            return;
        }
        if (if7Var.a > 0) {
            if (lbc.w(zu1Var.getMessagesController().X1(Long.valueOf(if7Var.a)))) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new r47(zu1Var.getCurrentAccount(), f.topicStartMessage, false, false));
                zu1Var.Ob(arrayList, null, f.id, f.read_inbox_max_id, f.read_outbox_max_id, f);
                zu1Var.getMessagesController().X4(-if7Var.a, if7Var.b);
                return;
            }
            return;
        }
        TLRPC.Chat M0 = zu1Var.getMessagesController().M0(Long.valueOf(-if7Var.a));
        if (M0 == null) {
            return;
        }
        if (!xc2.p0(M0)) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new r47(zu1Var.getCurrentAccount(), f.topicStartMessage, false, false));
            zu1Var.Ob(arrayList2, M0, f.id, f.read_inbox_max_id, f.read_outbox_max_id, f);
        } else if (xc2.A(yac.t0, M0, 24)) {
            int i = f.read_inbox_max_id;
            int i2 = f.read_outbox_max_id;
            zu1Var.A4 = i;
            zu1Var.B4 = i2;
            zu1Var.C4 = Math.max(1, i);
            zu1Var.s4 = wf3.n(f.from_id);
            zu1Var.hd();
            zu1Var.zd(false);
            zu1Var.Pc(false);
        }
        zu1Var.getMessagesController().X4(-if7Var.a, if7Var.b);
    }

    public static void b(r47 r47Var) {
        TLRPC.TL_forumTopic f;
        TLRPC.Message message = r47Var.k;
        int i = r47Var.K1;
        if (r47.B0(message) > 0 || (f = uc7.s1(i).g4.f(-r47.B0(r47Var.k), r47.b2(i, r47Var.k, true, false))) == null) {
            return;
        }
        Drawable drawable = r47Var.i2[0];
        if (drawable instanceof oo4) {
            ((oo4) drawable).b(f.icon_color);
        }
    }

    public static SpannableStringBuilder c(TLRPC.TL_forumTopic tL_forumTopic, r47 r47Var) {
        TLRPC.Chat M0;
        TLRPC.User user;
        if (tL_forumTopic != null) {
            TLRPC.MessageAction messageAction = r47Var.k.action;
            if (messageAction instanceof TLRPC.TL_messageActionTopicCreate) {
                return hl.G2(ob6.M0(2131743656, null), k(tL_forumTopic, null, null), "%s");
            }
            if (messageAction instanceof TLRPC.TL_messageActionTopicEdit) {
                TLRPC.TL_messageActionTopicEdit tL_messageActionTopicEdit = (TLRPC.TL_messageActionTopicEdit) messageAction;
                long Z0 = r47Var.Z0();
                boolean D = wf3.D(Z0);
                int i = r47Var.K1;
                if (D) {
                    user = uc7.s1(i).X1(Long.valueOf(Z0));
                    M0 = null;
                } else {
                    M0 = uc7.s1(i).M0(Long.valueOf(-Z0));
                    user = null;
                }
                String m = user != null ? lv2.m(0, user.first_name, user.last_name) : M0 != null ? M0.title : null;
                int i2 = tL_messageActionTopicEdit.flags;
                if ((i2 & 8) != 0) {
                    return hl.G2(ob6.M0(tL_messageActionTopicEdit.hidden ? 2131743674 : 2131743660, null), m, "%s");
                }
                if ((i2 & 4) != 0) {
                    return hl.G2(hl.G2(ob6.M0(tL_messageActionTopicEdit.closed ? 2131743657 : 2131743652, null), k(tL_forumTopic, null, null), "%2$s"), m, "%1$s");
                }
                int i3 = i2 & 1;
                int i4 = i2 & 2;
                if (i3 != 0) {
                    if (i4 == 0) {
                        return hl.G2(hl.G2(ob6.M0(2131743654, null), tL_messageActionTopicEdit.title, "%2$s"), m, "%1$s");
                    }
                    TLRPC.TL_forumTopic tL_forumTopic2 = new TLRPC.TL_forumTopic();
                    tL_forumTopic2.icon_emoji_id = tL_messageActionTopicEdit.icon_emoji_id;
                    tL_forumTopic2.title = tL_messageActionTopicEdit.title;
                    return hl.G2(hl.G2(ob6.M0(2131743653, null), k(tL_forumTopic2, null, null), "%2$s"), m, "%1$s");
                }
                if (i4 != 0) {
                    TLRPC.TL_forumTopic tL_forumTopic3 = new TLRPC.TL_forumTopic();
                    tL_forumTopic3.icon_emoji_id = tL_messageActionTopicEdit.icon_emoji_id;
                    tL_forumTopic3.title = "";
                    return hl.G2(hl.G2(ob6.M0(2131743655, null), k(tL_forumTopic3, null, null), "%2$s"), m, "%1$s");
                }
            }
        }
        return null;
    }

    public static qo4 d(Context context, float f, int i, boolean z) {
        if (context == null) {
            return null;
        }
        qo4 qo4Var = new qo4();
        qo4Var.a = context.getResources().getDrawable(z ? R.drawable.msg_filled_general_large : R.drawable.msg_filled_general).mutate();
        qo4Var.b = f;
        qo4Var.a(i);
        return qo4Var;
    }

    public static zm2 e(int i, String str) {
        oo4 oo4Var = new oo4(i);
        s26 s26Var = new s26(1, null);
        String trim = str.trim();
        s26Var.a(trim.length() >= 1 ? trim.substring(0, 1).toUpperCase() : "");
        zm2 zm2Var = new zm2(oo4Var, s26Var, 0, 0);
        zm2Var.x = true;
        return zm2Var;
    }

    public static zm2 f(TLRPC.TL_forumTopic tL_forumTopic) {
        if (tL_forumTopic == null) {
            return null;
        }
        return e(tL_forumTopic.icon_color, tL_forumTopic.title);
    }

    public static void g(ArrayList arrayList, long j) {
        if (arrayList != null) {
            int i = 0;
            while (i < arrayList.size()) {
                if (j != r47.b2(((r47) arrayList.get(i)).K1, ((r47) arrayList.get(i)).k, true, false)) {
                    arrayList.remove(i);
                    i--;
                }
                i++;
            }
        }
    }

    public static zu1 h(e eVar, long j, TLRPC.TL_forumTopic tL_forumTopic, int i, Bundle bundle) {
        TLRPC.TL_forumTopic tL_forumTopic2;
        TLRPC.TL_forumTopic f;
        if (eVar == null || tL_forumTopic == null) {
            return null;
        }
        TLRPC.Chat M0 = eVar.getMessagesController().M0(Long.valueOf(j));
        bundle.putLong("chat_id", j);
        if (i != 0) {
            bundle.putInt("message_id", i);
        } else if (tL_forumTopic.read_inbox_max_id == 0) {
            bundle.putInt("message_id", tL_forumTopic.id);
        }
        bundle.putInt("unread_count", tL_forumTopic.unread_count);
        bundle.putBoolean("historyPreloaded", false);
        zu1 zu1Var = new zu1(bundle);
        TLRPC.Message message = tL_forumTopic.topicStartMessage;
        if (message != null || (f = eVar.getMessagesController().g4.f(j, tL_forumTopic.id)) == null) {
            tL_forumTopic2 = tL_forumTopic;
        } else {
            message = f.topicStartMessage;
            tL_forumTopic2 = f;
        }
        if (message == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new r47(eVar.getCurrentAccount(), message, false, false));
        zu1Var.Ob(arrayList, M0, tL_forumTopic2.id, tL_forumTopic2.read_inbox_max_id, tL_forumTopic2.read_outbox_max_id, tL_forumTopic2);
        if (i != 0) {
            zu1Var.d8 = i;
        }
        return zu1Var;
    }

    public static String i(int i, long j) {
        return j(i, uc7.s1(i).M0(Long.valueOf(-j)), true);
    }

    public static String j(int i, TLRPC.Chat chat, boolean z) {
        if (xc2.p0(chat)) {
            TLRPC.Chat M0 = uc7.s1(i).M0(Long.valueOf(chat.linked_monoforum_id));
            if (M0 != null) {
                String str = M0.title;
                return z ? str : ob6.a0(null, null, 2131748100, str);
            }
        } else if (chat != null && chat.linked_monoforum_id != 0) {
            String str2 = chat.title;
            return z ? str2 : ob6.a0(null, null, 2131748100, str2);
        }
        if (chat != null) {
            return chat.title;
        }
        return null;
    }

    public static CharSequence k(TLRPC.ForumTopic forumTopic, TextPaint textPaint, Drawable[] drawableArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!(forumTopic instanceof TLRPC.TL_forumTopic)) {
            return "DELETED";
        }
        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) forumTopic;
        if (tL_forumTopic.id == 1) {
            try {
                qo4 d = d(a.b, 1.0f, textPaint == null ? aob.w0(null, aob.rd, false) : textPaint.getColor(), false);
                d.setBounds(0, 0, textPaint == null ? hl.L(14.0f) : (int) textPaint.getTextSize(), textPaint == null ? hl.L(14.0f) : (int) textPaint.getTextSize());
                spannableStringBuilder.append((CharSequence) " ");
                if (drawableArr != null) {
                    drawableArr[0] = d;
                }
                spannableStringBuilder.setSpan(new ImageSpan(d, 2), 0, 1, 33);
            } catch (Exception unused) {
            }
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            spannableStringBuilder.append((CharSequence) " ");
            hm hmVar = new hm(tL_forumTopic.icon_emoji_id, 0.95f, textPaint != null ? textPaint.getFontMetricsInt() : null);
            spannableStringBuilder.setSpan(hmVar, 0, 1, 33);
            hmVar.top = true;
            hmVar.cacheType = 13;
        } else {
            spannableStringBuilder.append((CharSequence) " ");
            zm2 f = f(tL_forumTopic);
            if (drawableArr != null) {
                drawableArr[0] = f.a;
            }
            f.setBounds(0, 0, (int) (f.getIntrinsicWidth() * 0.65f), (int) (f.getIntrinsicHeight() * 0.65f));
            Drawable drawable = f.b;
            if (drawable instanceof s26) {
                ((s26) drawable).i = 0.7f;
            }
            if (textPaint != null) {
                wm2 wm2Var = new wm2(0, f);
                wm2Var.c((int) (Math.abs(textPaint.getFontMetrics().ascent) + Math.abs(textPaint.getFontMetrics().descent)));
                spannableStringBuilder.setSpan(wm2Var, 0, 1, 33);
            } else {
                spannableStringBuilder.setSpan(new ImageSpan(f), 0, 1, 33);
            }
        }
        if (!TextUtils.isEmpty(tL_forumTopic.title)) {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) tL_forumTopic.title);
        }
        return spannableStringBuilder;
    }

    public static boolean l(r47 r47Var) {
        return r47Var != null && (r47Var.k.action instanceof TLRPC.TL_messageActionTopicCreate);
    }

    public static ArrayList m(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            TLRPC.savedDialog saveddialog = (TLRPC.savedDialog) obj;
            if (saveddialog instanceof TLRPC.TL_monoForumDialog) {
                TLRPC.TL_monoForumDialog tL_monoForumDialog = (TLRPC.TL_monoForumDialog) saveddialog;
                long n = wf3.n(tL_monoForumDialog.peer);
                TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                tL_forumTopic.id = (int) ((n >>> 32) ^ n);
                tL_forumTopic.title = Long.toString(n);
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

    public static void n(e eVar, long j, TLRPC.TL_forumTopic tL_forumTopic, int i) {
        zu1 h = h(eVar, j, tL_forumTopic, i, new Bundle());
        if (h != null) {
            eVar.presentFragment(h);
        }
    }

    public static void o(int i, TLRPC.Chat chat, rb0 rb0Var, de0 de0Var) {
        TLRPC.Chat M0 = xc2.p0(chat) ? uc7.s1(i).M0(Long.valueOf(chat.linked_monoforum_id)) : null;
        if (M0 != null) {
            chat = M0;
        }
        rb0Var.p(chat);
        de0Var.f(M0, rb0Var);
    }

    public static void p(int i, TLRPC.Chat chat, rb0 rb0Var, ImageReceiver imageReceiver) {
        TLRPC.Chat M0 = xc2.p0(chat) ? uc7.s1(i).M0(Long.valueOf(chat.linked_monoforum_id)) : null;
        if (M0 != null) {
            chat = M0;
        }
        rb0Var.p(chat);
        imageReceiver.U(M0, rb0Var, null);
    }

    public static void q(de0 de0Var, TLRPC.TL_forumTopic tL_forumTopic, boolean z, boolean z2, vnb vnbVar) {
        if (tL_forumTopic == null || de0Var == null) {
            return;
        }
        if (tL_forumTopic.id == 1) {
            de0Var.setAnimatedEmojiDrawable(null);
            Context context = de0Var.getContext();
            int i = aob.v8;
            qo4 d = d(context, 0.75f, aob.v0(i, vnbVar), z2);
            de0Var.setImageDrawable(d);
            if (d != null) {
                yob.x(de0Var, d, i, vnbVar, PorterDuff.Mode.MULTIPLY);
                return;
            }
            return;
        }
        if (tL_forumTopic.icon_emoji_id == 0) {
            de0Var.setAnimatedEmojiDrawable(null);
            de0Var.setImageDrawable(f(tL_forumTopic));
            return;
        }
        de0Var.setImageDrawable(null);
        wl wlVar = de0Var.e;
        if (wlVar == null || tL_forumTopic.icon_emoji_id != wlVar.h()) {
            wl wlVar2 = new wl(z2 ? 11 : 10, yac.t0, tL_forumTopic.icon_emoji_id);
            wlVar2.setColorFilter(z ? new PorterDuffColorFilter(aob.w0(null, aob.A8, false), PorterDuff.Mode.SRC_IN) : aob.n0(vnbVar));
            de0Var.setAnimatedEmojiDrawable(wlVar2);
        }
    }

    public static void r(long j, ActionBarLayout actionBarLayout) {
        e lastFragment = actionBarLayout.getLastFragment();
        if (lastFragment instanceof zu1) {
            zu1 zu1Var = (zu1) lastFragment;
            if ((-zu1Var.a()) == j && zu1Var.getMessagesController().M0(Long.valueOf(j)).forum && zu1Var.getParentLayout() != null) {
                if (((ActionBarLayout) zu1Var.getParentLayout()).h()) {
                    hl.d3(new zo1(zu1Var, (byte) 8), 500L);
                } else {
                    tzb.M0(zu1Var);
                }
            }
        }
        if (lastFragment instanceof tzb) {
            tzb tzbVar = (tzb) lastFragment;
            long j2 = tzbVar.a;
            if ((-(-j2)) != j || tzbVar.getMessagesController().M0(Long.valueOf(j)).forum) {
                return;
            }
            if (tzbVar.getParentLayout() != null && ((ActionBarLayout) tzbVar.getParentLayout()).h()) {
                hl.d3(new po4(tzbVar, (byte) 0), 500L);
                return;
            }
            tzbVar.I = true;
            zu1 zu1Var2 = new zu1(qu6.k(j2, "chat_id"));
            zu1Var2.Ga = true;
            tzbVar.presentFragment(zu1Var2);
        }
    }
}

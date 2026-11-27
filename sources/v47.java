// default package

import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class v47 {
    public t47 a;
    public t47 b;
    public t47 c;
    public ou1 d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public final boolean s;
    public final boolean t;
    public boolean u;
    public TLRPC.WebPage v;
    public URLSpan w;
    public ks1 x;

    public v47(boolean z, boolean z2, boolean z3) {
        this.i = z;
        this.s = z || z2;
        this.t = z3;
    }

    public static boolean a(String str, String str2) {
        if (str == null) {
            return true;
        }
        if (str2 == null) {
            return false;
        }
        Uri parse = Uri.parse(str);
        Uri parse2 = Uri.parse(str2);
        if (parse == parse2) {
            return true;
        }
        if (parse == null || parse2 == null || parse.getHost() == null || !parse.getHost().equalsIgnoreCase(parse2.getHost()) || parse.getPort() != parse2.getPort()) {
            return false;
        }
        String path = parse.getPath();
        if (path == null) {
            path = "";
        } else if (!path.endsWith("/")) {
            path = path.concat("/");
        }
        String path2 = parse2.getPath();
        if (path.equals(path2 != null ? path2.endsWith("/") ? path2 : path2.concat("/") : "")) {
            return parse.getQuery() == null ? parse2.getQuery() == null : parse.getQuery().equals(parse2.getQuery());
        }
        return false;
    }

    public final void b(r47 r47Var) {
        TLRPC.WebPage webPage;
        this.w = null;
        if (r47Var != null) {
            CharSequence charSequence = r47Var.v;
            if (!(charSequence instanceof Spanned) || (webPage = this.v) == null || webPage.url == null) {
                return;
            }
            Spanned spanned = (Spanned) charSequence;
            URLSpan[] uRLSpanArr = (URLSpan[]) spanned.getSpans(0, spanned.length(), URLSpan.class);
            for (int i = 0; i < uRLSpanArr.length; i++) {
                if (a(uRLSpanArr[i].getURL(), this.v.url)) {
                    this.w = uRLSpanArr[i];
                    return;
                }
            }
        }
    }

    public final boolean c() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        t47 t47Var = this.b;
        if (t47Var != null && (arrayList3 = t47Var.e) != null && !arrayList3.isEmpty()) {
            return false;
        }
        t47 t47Var2 = this.a;
        if (t47Var2 != null && (arrayList2 = t47Var2.e) != null && !arrayList2.isEmpty()) {
            return false;
        }
        t47 t47Var3 = this.c;
        return t47Var3 == null || (arrayList = t47Var3.e) == null || arrayList.isEmpty();
    }

    public final void d(ArrayList arrayList, long j) {
        long j2;
        TLRPC.MessageFwdHeader messageFwdHeader;
        this.g = false;
        this.h = false;
        this.i = wf3.B(j);
        this.j = false;
        if (arrayList == null) {
            this.b = null;
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            r47 r47Var = (r47) arrayList.get(i);
            if (!TextUtils.isEmpty(r47Var.z)) {
                this.g = true;
            }
            if (!this.i && (messageFwdHeader = r47Var.k.fwd_from) != null && messageFwdHeader.from_id == null && !arrayList2.contains(messageFwdHeader.from_name)) {
                arrayList2.add(messageFwdHeader.from_name);
            }
        }
        Boolean bool = Boolean.TRUE;
        t47 t47Var = this.b;
        t47 t47Var2 = new t47(this, bool, 0, arrayList, j, t47Var != null ? t47Var.g : null);
        this.b = t47Var2;
        if (t47Var2.e.isEmpty()) {
            this.b = null;
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            r47 r47Var2 = (r47) arrayList.get(i2);
            if (r47Var2.p3()) {
                j2 = r47Var2.k.from_id.user_id;
            } else {
                TLRPC.Chat M0 = uc7.s1(r47Var2.K1).M0(Long.valueOf(r47Var2.k.peer_id.channel_id));
                j2 = -((xc2.T(M0) && M0.megagroup && r47Var2.k3()) ? r47Var2.k.fwd_from.from_id.channel_id : r47Var2.k.peer_id.channel_id);
            }
            if (!arrayList3.contains(Long.valueOf(j2))) {
                arrayList3.add(Long.valueOf(j2));
            }
        }
        if (arrayList2.size() + arrayList3.size() > 1) {
            this.j = true;
        }
    }

    public final void e(int i, TLRPC.WebPage webPage, CharSequence charSequence, r47 r47Var, ou1 ou1Var, r47 r47Var2) {
        TLRPC.MessageMedia messageMedia;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.Message message2;
        this.o = false;
        this.p = false;
        this.n = true;
        boolean z = this.v != webPage;
        this.v = webPage;
        if (TextUtils.isEmpty(charSequence) && this.v == null) {
            this.c = null;
        } else {
            CharSequence charSequence2 = charSequence == null ? "" : charSequence;
            t47 t47Var = this.c;
            boolean z2 = t47Var == null || z;
            if (t47Var == null && r47Var2 != null && (message2 = r47Var2.k) != null) {
                this.r = message2.invert_media;
                TLRPC.MessageMedia messageMedia3 = message2.media;
                if (messageMedia3 != null && messageMedia3.force_small_media) {
                    this.q = true;
                }
            }
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            CharSequence[] charSequenceArr = {new SpannableStringBuilder(hl.m1(charSequence2))};
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.peer_id = tL_peerUser;
            tL_peerUser.user_id = yac.h(i).e();
            TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser2;
            tL_peerUser2.user_id = yac.h(i).e();
            tL_message.entities = ls6.d0(i).Y(charSequenceArr, true, true);
            tL_message.message = charSequenceArr[0].toString();
            tL_message.invert_media = this.r;
            if (webPage != null) {
                tL_message.flags |= 512;
                TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                tL_message.media = tL_messageMediaWebPage;
                tL_messageMediaWebPage.webpage = webPage;
                boolean z3 = this.q;
                tL_messageMediaWebPage.force_large_media = !z3;
                tL_messageMediaWebPage.force_small_media = z3;
                this.o = webPage.photo != null;
                this.p = r47.J4(webPage.document);
            } else {
                this.o = false;
            }
            tL_message.out = true;
            tL_message.unread = false;
            if (r47Var != null) {
                tL_message.replyMessage = r47Var.k;
                TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                tL_message.reply_to = tL_messageReplyHeader;
                if (ou1Var != null) {
                    tL_messageReplyHeader.quote_text = ou1Var.i;
                    int i2 = tL_messageReplyHeader.flags;
                    tL_messageReplyHeader.flags = i2 | 64;
                    ArrayList<TLRPC.MessageEntity> arrayList = ou1Var.j;
                    tL_messageReplyHeader.quote_entities = arrayList;
                    if (arrayList != null) {
                        tL_messageReplyHeader.flags = i2 | jn7.V2;
                    }
                }
            }
            Boolean bool = Boolean.TRUE;
            r47 r47Var3 = new r47(i, tL_message, true, false);
            t47 t47Var2 = new t47(this, bool, 2, qd4.t(r47Var3), r47.B0(r47Var3.k), null);
            this.c = t47Var2;
            if (t47Var2.e.isEmpty()) {
                this.c = null;
            } else {
                r47 r47Var4 = (r47) this.c.e.get(0);
                CharSequence charSequence3 = r47Var4.v;
                if (!(charSequence3 instanceof Spanned) || TextUtils.isEmpty(charSequence3)) {
                    CharSequence charSequence4 = r47Var4.z;
                    if ((charSequence4 instanceof Spanned) && !TextUtils.isEmpty(charSequence4)) {
                        URLSpan[] uRLSpanArr = (URLSpan[]) ((Spanned) r47Var4.v).getSpans(0, r47Var4.z.length(), URLSpan.class);
                        this.n = uRLSpanArr == null || uRLSpanArr.length <= 1;
                    }
                } else {
                    CharSequence charSequence5 = r47Var4.v;
                    URLSpan[] uRLSpanArr2 = (URLSpan[]) ((Spanned) charSequence5).getSpans(0, charSequence5.length(), URLSpan.class);
                    this.n = uRLSpanArr2 == null || uRLSpanArr2.length <= 1;
                }
                boolean z4 = !r47Var4.G0 && !r47Var4.N2 && (r47.n1(r47Var4.k) instanceof TLRPC.TL_messageMediaWebPage) && (r47.n1(r47Var4.k).webpage instanceof TLRPC.TL_webPage);
                TLRPC.WebPage webPage2 = z4 ? r47.n1(r47Var4.k).webpage : null;
                String str = webPage2 != null ? webPage2.type : null;
                this.o = z4 && !r47Var4.v3() && webPage2 != null && (webPage2.photo != null || r47.J4(webPage2.document)) && !((TextUtils.isEmpty(webPage2.description) && TextUtils.isEmpty(webPage2.title)) || r47Var4.q4() || "telegram_megagroup".equals(str) || "telegram_background".equals(str) || "telegram_voicechat".equals(str) || "telegram_videochat".equals(str) || "telegram_livestream".equals(str) || "telegram_user".equals(str) || "telegram_story".equals(str) || "telegram_channel_boost".equals(str) || "telegram_group_boost".equals(str) || "telegram_chat".equals(str));
                if (z2 && r47Var2 != null && (message = r47Var2.k) != null && (messageMedia2 = message.media) != null) {
                    this.q = messageMedia2.force_small_media || (r47Var4.A3() && !r47Var2.k.media.force_large_media);
                } else if (z2) {
                    this.q = r47Var4.A3();
                }
                TLRPC.Message message3 = r47Var4.k;
                if (message3 != null && (messageMedia = message3.media) != null) {
                    boolean z5 = this.q;
                    messageMedia.force_large_media = !z5;
                    messageMedia.force_small_media = z5;
                }
            }
        }
        ks1 ks1Var = this.x;
        if (ks1Var == null) {
            return;
        }
        v47 v47Var = ks1Var.d;
        int i3 = 0;
        while (true) {
            View[] viewArr = ks1Var.f.e;
            if (i3 >= viewArr.length) {
                return;
            }
            View view = viewArr[i3];
            if (view != null) {
                m57 m57Var = (m57) view;
                FrameLayout frameLayout = m57Var.G;
                if (m57Var.a == 2) {
                    r57 r57Var = m57Var.I;
                    r57 r57Var2 = m57Var.H;
                    frameLayout.setVisibility((!v47Var.n || v47Var.o) ? 0 : 8);
                    r57Var2.setVisibility(v47Var.p ? 4 : 0);
                    r57Var.setVisibility(v47Var.p ? 0 : 4);
                    frameLayout.animate().alpha(v47Var.o ? 1.0f : 0.5f).start();
                    r57Var2.a(v47Var.q, true);
                    r57Var.a(v47Var.q, true);
                    m57Var.F.a(!v47Var.r, true);
                    m57Var.i();
                }
            }
            i3++;
        }
    }

    public final void f(r47 r47Var, m47 m47Var, long j, ou1 ou1Var) {
        r47 r47Var2;
        ou1 ou1Var2;
        t47 t47Var;
        int i;
        if (this.i || r47Var == null || (i = r47Var.D) == 10 || i == 11 || i == 22 || i == 21 || i == 18 || i == 25 || i == 16) {
            r47Var2 = null;
            ou1Var2 = null;
        } else {
            r47Var2 = r47Var;
            ou1Var2 = ou1Var;
        }
        this.u = r47Var2 != null && (r47Var2.R4() || r47Var2.f4() || r47Var2.D == 30);
        if (r47Var2 == null && ou1Var2 == null) {
            this.a = null;
            this.d = null;
            return;
        }
        if (m47Var != null) {
            t47Var = new t47(this, null, 1, m47Var.d, j, null);
            this.a = t47Var;
        } else {
            r47 r47Var3 = r47Var2;
            if (r47Var3 == null) {
                r47Var3 = ou1Var2.a;
            }
            t47Var = new t47(this, null, 1, qd4.t(r47Var3), j, null);
            this.a = t47Var;
        }
        if (t47Var.e.isEmpty()) {
            this.a = null;
            return;
        }
        this.d = ou1Var2;
        if (ou1Var2 != null) {
            this.e = ou1Var2.b;
            this.f = ou1Var2.c;
        }
    }
}

package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class wz extends FrameLayout implements org.telegram.ui.ActionBar.z5, org.telegram.messenger.cs, qe.b {
    public static final SpannableStringBuilder[] t0 = new SpannableStringBuilder[3];
    public kg.l0 E;
    public long F;
    public long G;
    public long H;
    public long I;
    public String J;
    public boolean K;
    public final Activity L;
    public final org.telegram.ui.ActionBar.d2 M;
    public boolean N;
    public boolean O;
    public int P;
    public int Q;
    public String R;
    public int S;
    public final pz T;
    public final qz U;
    public final uz V;
    public final rz W;
    public final qe.a a;
    public final tz a0;
    public final xs b;
    public final rz b0;
    public final org.telegram.ui.Components.zu0 c;
    public final rz c0;
    public org.telegram.ui.Components.sj0 d;
    public final ArrayList d0;
    public gz e;
    public final ArrayList e0;
    public final ArrayList f;
    public boolean f0;
    public final o4 g0;
    public final SparseArray h;
    public final jz h0;
    public nz i0;
    public org.telegram.ui.Components.em0 j0;
    public final u4.b0 k0;
    public final kz l0;
    public final g2.g m0;
    public final ArrayList n;
    public final oz n0;
    public final fz o0;
    public vz p0;
    public boolean q0;
    public final HashMap r;
    public int r0;
    public int s;
    public boolean s0;
    public int w;
    public String x;
    public String y;

    public wz(org.telegram.ui.ActionBar.d2 d2Var) {
        super(d2Var.getParentActivity());
        this.a = new qe.a(0, this, org.telegram.ui.Components.xq.h, 380L, false);
        this.f = new ArrayList();
        this.h = new SparseArray();
        this.n = new ArrayList();
        this.r = new HashMap();
        this.s = 3;
        this.T = new pz(0, 0L);
        this.d0 = new ArrayList();
        this.e0 = new ArrayList();
        this.g0 = new o4(this, 5);
        this.h0 = new jz(this);
        this.m0 = new g2.g((int[]) null);
        this.o0 = new fz(this, 0);
        this.M = d2Var;
        Activity parentActivity = d2Var.getParentActivity();
        this.L = parentActivity;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, this, null);
        xs xsVar = new xs(2, parentActivity, this);
        this.b = xsVar;
        xsVar.setOnItemClickListener(new h(this, 12));
        xsVar.setOnItemLongClickListener(new f(this, 15));
        u4.b0 b0Var = new u4.b0();
        this.k0 = b0Var;
        xsVar.setLayoutManager(b0Var);
        kz kzVar = new kz(0, parentActivity, this);
        this.l0 = kzVar;
        addView(kzVar);
        addView(xsVar);
        xsVar.setSectionsType(2);
        xsVar.setSkipDrawSection(true);
        xsVar.setOnScrollListener(new lz(this));
        oz ozVar = new oz(parentActivity);
        this.n0 = ozVar;
        String u10 = org.telegram.messenger.bd.u((int) (System.currentTimeMillis() / 1000), false);
        if (!TextUtils.equals(ozVar.c, u10)) {
            ozVar.c = u10;
            ozVar.a.t(u10, true, true);
        }
        addView(ozVar, b8.mf.d(-1, 33.0f, 49, 0.0f, -2.0f, 0.0f, 0.0f));
        this.U = new qz(this);
        this.V = new uz(this, getContext());
        this.W = new rz(this, getContext(), 1);
        this.a0 = new tz(this, getContext());
        this.b0 = new rz(this, getContext(), 4);
        this.c0 = new rz(this, getContext(), 2);
        org.telegram.ui.Components.zu0 zu0Var = new org.telegram.ui.Components.zu0(parentActivity, kzVar, 1, null);
        this.c = zu0Var;
        addView(zu0Var);
        xsVar.setEmptyView(zu0Var);
        zu0Var.setVisibility(8);
        b();
    }

    public static void a(wz wzVar, org.telegram.messenger.zi ziVar, View view, int i3) {
        if (!wzVar.p0.I()) {
            wzVar.p0.h();
        }
        if (wzVar.p0.I()) {
            wzVar.p0.w(ziVar, view, i3);
        }
    }

    public static CharSequence c(org.telegram.messenger.zi ziVar, boolean z10) {
        return d(ziVar, z10, 0, null);
    }

    public static CharSequence d(org.telegram.messenger.zi ziVar, boolean z10, int i3, TextPaint textPaint) {
        TLRPC.Message message;
        TLRPC.Chat M0;
        TLRPC.Chat M02;
        TLRPC.User user;
        TLRPC.TL_forumTopic f10;
        TLRPC.TL_forumTopic f11;
        int i10;
        if (ziVar == null || (message = ziVar.k) == null) {
            return "";
        }
        if (org.telegram.messenger.zi.c4(message)) {
            lg.t1 c2 = lg.u1.f(ziVar.I1).c(org.telegram.messenger.zi.J1(ziVar.k));
            return c2 == null ? "" : c2.b;
        }
        CharSequence charSequence = null;
        if (ziVar.s4()) {
            return ziVar.Z0 ? org.telegram.messenger.bd.M0(2131745268, null) : ziVar.S0 ? org.telegram.messenger.bd.M0(2131745269, null) : org.telegram.messenger.bd.M0(2131745270, null);
        }
        SpannableStringBuilder[] spannableStringBuilderArr = t0;
        if (spannableStringBuilderArr[i3] == null) {
            spannableStringBuilderArr[i3] = new SpannableStringBuilder(">");
            if (i3 == 0) {
                i10 = R.drawable.attach_arrow_right;
            } else if (i3 == 1) {
                i10 = R.drawable.msg_mini_arrow_mediathin;
            } else {
                if (i3 != 2) {
                    return "";
                }
                i10 = R.drawable.msg_mini_arrow_mediabold;
            }
            org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(i3 == 0 ? 2 : 1, org.telegram.messenger.t0.b.getDrawable(i10).mutate());
            if (i3 == 1 || i3 == 2) {
                wpVar.I = 0.85f;
            }
            SpannableStringBuilder spannableStringBuilder = spannableStringBuilderArr[i3];
            spannableStringBuilder.setSpan(wpVar, 0, spannableStringBuilder.length(), 0);
        }
        TLRPC.Message message2 = ziVar.k;
        if (message2.saved_peer_id != null) {
            if (ziVar.Q1() >= 0) {
                user = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).a2(Long.valueOf(ziVar.Q1()));
                M0 = null;
            } else if (ziVar.Q1() < 0) {
                M0 = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).M0(Long.valueOf(-ziVar.Q1()));
                user = null;
                M02 = null;
            } else {
                user = null;
                M0 = null;
            }
            M02 = M0;
        } else {
            TLRPC.User a22 = message2.from_id.user_id != 0 ? org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).a2(Long.valueOf(ziVar.k.from_id.user_id)) : null;
            M0 = ziVar.k.from_id.chat_id != 0 ? org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).M0(Long.valueOf(ziVar.k.peer_id.chat_id)) : null;
            if (M0 == null) {
                M0 = ziVar.k.from_id.channel_id != 0 ? org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).M0(Long.valueOf(ziVar.k.peer_id.channel_id)) : null;
            }
            M02 = ziVar.k.peer_id.channel_id != 0 ? org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).M0(Long.valueOf(ziVar.k.peer_id.channel_id)) : null;
            if (M02 == null) {
                M02 = ziVar.k.peer_id.chat_id != 0 ? org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).M0(Long.valueOf(ziVar.k.peer_id.chat_id)) : null;
            }
            if (!org.telegram.messenger.t3.V(M02) && !z10) {
                M02 = null;
            }
            user = a22;
        }
        if (user != null && M02 != null) {
            CharSequence charSequence2 = M02.title;
            if (org.telegram.messenger.t3.c0(M02) && (f11 = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).q7.f(M02.id, org.telegram.messenger.zi.c2(ziVar.I1, ziVar.k, true, false))) != null) {
                charSequence2 = rg.c.j(f11, null, null);
            }
            CharSequence m10 = org.telegram.messenger.i6.m(charSequence2, textPaint == null ? null : textPaint.getFontMetricsInt(), false, null, 0);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append(org.telegram.messenger.i6.m(org.telegram.messenger.l10.j(user, true), textPaint == null ? null : textPaint.getFontMetricsInt(), false, null, 0)).append((char) 8202).append((CharSequence) spannableStringBuilderArr[i3]).append((char) 8202).append(m10);
            charSequence = spannableStringBuilder2;
        } else if (user != null) {
            charSequence = org.telegram.messenger.i6.m(org.telegram.messenger.l10.p(user), textPaint == null ? null : textPaint.getFontMetricsInt(), false, null, 0);
        } else if (M0 != null) {
            CharSequence charSequence3 = M0.title;
            if (org.telegram.messenger.t3.c0(M0) && (f10 = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).q7.f(M0.id, org.telegram.messenger.zi.c2(ziVar.I1, ziVar.k, true, false))) != null) {
                charSequence3 = rg.c.j(f10, null, null);
            }
            charSequence = org.telegram.messenger.i6.m(charSequence3, textPaint == null ? null : textPaint.getFontMetricsInt(), false, null, 0);
        }
        return charSequence == null ? "" : charSequence;
    }

    @Override // qe.b
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        if (i3 == 0) {
            b();
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.c9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.C9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.y9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.x9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.w9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.u9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.q9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.p9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.j9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.i9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.b9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.a9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.W8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.xi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.yi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.K6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.pj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.wi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
    }

    public final void b() {
        float f10 = this.a.e;
        oz ozVar = this.n0;
        ozVar.setTranslationY((1.0f - f10) * (-org.telegram.messenger.g0.L(24.0f)));
        ozVar.setAlpha(f10);
        ozVar.setVisibility(f10 > 0.0f ? 0 : 4);
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.i4) {
            xs xsVar = this.b;
            int childCount = xsVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                if (xsVar.getChildAt(i11) instanceof org.telegram.ui.Cells.t2) {
                    ((org.telegram.ui.Cells.t2) xsVar.getChildAt(i11)).i0(0, true);
                }
                xsVar.getChildAt(i11).invalidate();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0028, code lost:
    
        if (org.telegram.messenger.t3.S(org.telegram.messenger.h10.t0, r5) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(ArrayList arrayList, long j10) {
        org.telegram.ui.Components.sj0 sj0Var;
        int i3;
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList2 = this.f;
            if (i10 >= arrayList2.size()) {
                break;
            }
            org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList2.get(i10);
            TLRPC.Message message = ziVar.k;
            String str = ziVar.Y;
            long B0 = org.telegram.messenger.zi.B0(message);
            if (B0 < 0) {
                i3 = (int) (-B0);
            }
            i3 = 0;
            if (i3 == j10) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    if (ziVar.f1() == ((Integer) arrayList.get(i11)).intValue()) {
                        arrayList2.remove(i10);
                        this.h.remove(ziVar.f1());
                        HashMap hashMap = this.r;
                        ArrayList arrayList3 = (ArrayList) hashMap.get(str);
                        arrayList3.remove(ziVar);
                        if (arrayList3.size() == 0) {
                            this.n.remove(str);
                            hashMap.remove(str);
                        }
                        i10--;
                        this.P--;
                        z10 = true;
                    }
                }
            }
            i10++;
        }
        if (!z10 || (sj0Var = this.d) == null) {
            return;
        }
        sj0Var.f();
    }

    public final void f(int i3, View view, org.telegram.messenger.zi ziVar, int i10) {
        String str;
        if (ziVar == null) {
            return;
        }
        if (this.p0.I()) {
            this.p0.w(ziVar, view, i10);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.t2) {
            this.p0.o(ziVar);
            return;
        }
        int i11 = this.E.d;
        jz jzVar = this.h0;
        ArrayList arrayList = this.f;
        String str2 = null;
        org.telegram.ui.ActionBar.d2 d2Var = this.M;
        if (i11 == 0) {
            PhotoViewer.v1().N2(null, d2Var, null);
            PhotoViewer.v1().e2(arrayList, i3, 0L, 0L, 0L, jzVar);
            this.S = PhotoViewer.v1().c;
            return;
        }
        if (i11 == 3 || i11 == 5) {
            if (view instanceof org.telegram.ui.Cells.f7) {
                ((org.telegram.ui.Cells.f7) view).a();
                return;
            }
            return;
        }
        if (i11 == 1) {
            if (view instanceof org.telegram.ui.Cells.g7) {
                org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
                TLRPC.Document F0 = ziVar.F0();
                if (!g7Var.H) {
                    if (g7Var.G) {
                        org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.h10.t0).a).f(F0);
                        g7Var.f(true);
                        return;
                    } else {
                        org.telegram.messenger.zi message = g7Var.getMessage();
                        message.P = true;
                        org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.h10.t0).a).X(F0, message, 0, 0);
                        g7Var.f(true);
                        return;
                    }
                }
                if (!ziVar.x()) {
                    org.telegram.messenger.g0.s2(ziVar, this.L, d2Var);
                    return;
                }
                PhotoViewer.v1().N2(null, d2Var, null);
                int indexOf = arrayList.indexOf(ziVar);
                if (indexOf >= 0) {
                    PhotoViewer.v1().N2(null, d2Var, null);
                    PhotoViewer.v1().e2(arrayList, indexOf, 0L, 0L, 0L, jzVar);
                    this.S = PhotoViewer.v1().c;
                    return;
                } else {
                    ArrayList k10 = org.telegram.messenger.k5.k(ziVar);
                    PhotoViewer.v1().N2(null, d2Var, null);
                    PhotoViewer.v1().e2(k10, 0, 0L, 0L, 0L, jzVar);
                    this.S = PhotoViewer.v1().c;
                    return;
                }
            }
            return;
        }
        if (i11 == 2) {
            try {
                TLRPC.MessageMedia messageMedia = ziVar.k.media;
                TLRPC.WebPage webPage = messageMedia != null ? messageMedia.webpage : null;
                if (webPage == null || (webPage instanceof TLRPC.TL_webPageEmpty)) {
                    str = null;
                } else {
                    if (webPage.cached_page != null) {
                        LaunchActivity launchActivity = LaunchActivity.K1;
                        if (launchActivity == null || launchActivity.O() == null || LaunchActivity.K1.O().l(ziVar) == null) {
                            d2Var.createArticleViewer(false).L(ziVar, null, null, null);
                            return;
                        }
                        return;
                    }
                    String str3 = webPage.embed_url;
                    if (str3 != null && str3.length() != 0) {
                        org.telegram.ui.Components.ut.K0(this.M, ziVar, this.h0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                        return;
                    }
                    str = webPage.url;
                }
                if (str == null) {
                    ArrayList arrayList2 = ((org.telegram.ui.Cells.j7) view).F;
                    if (arrayList2.size() > 0) {
                        str2 = ((CharSequence) arrayList2.get(0)).toString();
                    }
                    str = str2;
                }
                if (str != null) {
                    g(str);
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void g(String str) {
        if (org.telegram.messenger.g0.J3(str)) {
            org.telegram.ui.Components.t4.p0(this.M, str, true, true);
        } else {
            sf.c.t(this.L, str);
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.t6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.t6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.a7));
        int i3 = org.telegram.ui.ActionBar.k6.i7;
        xs xsVar = this.b;
        arrayList.add(new org.telegram.ui.ActionBar.t6(xsVar, TLObject.FLAG_13, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        int i10 = org.telegram.ui.ActionBar.k6.k7;
        arrayList.add(new org.telegram.ui.ActionBar.t6(xsVar, TLObject.FLAG_14, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(xsVar, 8, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.nj));
        arrayList.add(new org.telegram.ui.ActionBar.t6(xsVar, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(xsVar, TLObject.FLAG_13, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(xsVar, TLObject.FLAG_14, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(xsVar, TLObject.FLAG_13, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(xsVar, TLObject.FLAG_14, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        org.telegram.ui.Components.zu0 zu0Var = this.c;
        arrayList.add(new org.telegram.ui.ActionBar.t6(zu0Var.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(zu0Var.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.y6));
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Runnable, org.telegram.ui.gz] */
    public final void h(final long j10, final long j11, final long j12, final long j13, final kg.l0 l0Var, final boolean z10, String str, boolean z11) {
        ArrayList arrayList;
        final String str2 = str == null ? "" : str;
        Locale locale = Locale.ENGLISH;
        final String str3 = j10 + j11 + j12 + j13 + (l0Var == null ? -1 : l0Var.d) + str2 + z10;
        String str4 = this.y;
        boolean z12 = str4 != null && str4.equals(str3);
        boolean z13 = !z12 && z11;
        this.E = l0Var;
        this.F = j10;
        this.G = j11;
        this.I = j12;
        this.H = j13;
        this.J = str2;
        this.K = z10;
        gz gzVar = this.e;
        if (gzVar != null) {
            org.telegram.messenger.g0.r(gzVar);
        }
        o4 o4Var = this.g0;
        org.telegram.messenger.g0.r(o4Var);
        if (z12 && z11) {
            return;
        }
        ArrayList arrayList2 = this.e0;
        final boolean z14 = z12;
        ArrayList arrayList3 = this.d0;
        org.telegram.ui.Components.zu0 zu0Var = this.c;
        ArrayList arrayList4 = this.f;
        if (z13 || (l0Var == null && j11 == 0 && j10 == 0 && j12 == 0 && j13 == 0)) {
            arrayList4.clear();
            this.n.clear();
            this.r.clear();
            this.N = true;
            zu0Var.setVisibility(0);
            org.telegram.ui.Components.sj0 sj0Var = this.d;
            if (sj0Var != null) {
                sj0Var.f();
            }
            this.Q++;
            xs xsVar = this.b;
            if (xsVar.getPinnedHeader() != null) {
                arrayList = arrayList4;
                xsVar.getPinnedHeader().setAlpha(0.0f);
            } else {
                arrayList = arrayList4;
            }
            arrayList3.clear();
            arrayList2.clear();
            if (!z13) {
                return;
            }
        } else if (z11 && !arrayList4.isEmpty()) {
            return;
        } else {
            arrayList = arrayList4;
        }
        this.N = true;
        org.telegram.ui.Components.sj0 sj0Var2 = this.d;
        if (sj0Var2 != null) {
            sj0Var2.f();
        }
        if (!z14) {
            o4Var.run();
            zu0Var.e(true, !z11);
        }
        if (TextUtils.isEmpty(str2)) {
            arrayList2.clear();
            arrayList3.clear();
            nz nzVar = this.i0;
            if (nzVar != null) {
                ((du) nzVar).j(false, null, null, false);
            }
        }
        final int i3 = this.Q + 1;
        this.Q = i3;
        final int i10 = org.telegram.messenger.h10.t0;
        ?? r02 = new Runnable() { // from class: org.telegram.ui.gz
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                int i11;
                String str5;
                kg.l0 l0Var2;
                int i12;
                long j14;
                boolean z15;
                long j15;
                int i13;
                int i14;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal;
                final wz wzVar = wz.this;
                ArrayList arrayList5 = wzVar.f;
                final long j16 = j10;
                long j17 = j11;
                String str6 = str2;
                kg.l0 l0Var3 = l0Var;
                int i15 = i10;
                long j18 = j12;
                long j19 = j13;
                boolean z16 = z14;
                ArrayList arrayList6 = null;
                if (j16 == 0 || j17 != 0) {
                    boolean isEmpty = TextUtils.isEmpty(str6);
                    boolean z17 = z10;
                    if (isEmpty) {
                        i11 = i15;
                        str5 = str6;
                        l0Var2 = l0Var3;
                        i12 = z17 ? 1 : 0;
                        j14 = j18;
                        z15 = z16;
                        j15 = j19;
                        i13 = 20;
                    } else {
                        j14 = j18;
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = new ArrayList();
                        z15 = z16;
                        ArrayList arrayList9 = new ArrayList();
                        org.telegram.messenger.qr a02 = org.telegram.messenger.qr.a0(i15);
                        j15 = j19;
                        i11 = i15;
                        str5 = str6;
                        l0Var2 = l0Var3;
                        i13 = 20;
                        a02.M0(0, str5, arrayList7, arrayList8, arrayList9, null, z17 ? 1 : 0);
                        i12 = z17 ? 1 : 0;
                        arrayList6 = arrayList7;
                    }
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = new TLRPC.TL_messages_searchGlobal();
                    tL_messages_searchGlobal2.limit = i13;
                    tL_messages_searchGlobal2.q = str5;
                    tL_messages_searchGlobal2.filter = l0Var2 == null ? new TLRPC.TL_inputMessagesFilterEmpty() : l0Var2.e;
                    tL_messages_searchGlobal2.community = org.telegram.messenger.hp.s1(i11).h1(j17);
                    if (j14 > 0) {
                        tL_messages_searchGlobal2.min_date = (int) (j14 / 1000);
                    }
                    if (j15 > 0) {
                        tL_messages_searchGlobal2.max_date = (int) (j15 / 1000);
                    }
                    if (z15 && str5.equals(wzVar.x) && !arrayList5.isEmpty()) {
                        i14 = 1;
                        org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) k2.p1.h(1, arrayList5);
                        tL_messages_searchGlobal2.offset_id = ziVar.f1();
                        tL_messages_searchGlobal2.offset_rate = wzVar.w;
                        tL_messages_searchGlobal2.offset_peer = org.telegram.messenger.hp.s1(i11).j1(org.telegram.messenger.zi.C1(ziVar.k.peer_id));
                    } else {
                        i14 = 1;
                        tL_messages_searchGlobal2.offset_rate = 0;
                        tL_messages_searchGlobal2.offset_id = 0;
                        tL_messages_searchGlobal2.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    }
                    tL_messages_searchGlobal2.flags |= i14;
                    tL_messages_searchGlobal2.folder_id = i12;
                    tL_messages_searchGlobal = tL_messages_searchGlobal2;
                } else {
                    TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                    tL_messages_search.q = str6;
                    tL_messages_search.limit = 20;
                    tL_messages_search.filter = l0Var3 == null ? new TLRPC.TL_inputMessagesFilterEmpty() : l0Var3.e;
                    tL_messages_search.peer = org.telegram.messenger.hp.s1(org.telegram.messenger.c.a(i15).a).j1(j16);
                    if (j18 > 0) {
                        tL_messages_search.min_date = (int) (j18 / 1000);
                    }
                    if (j19 > 0) {
                        tL_messages_search.max_date = (int) (j19 / 1000);
                    }
                    if (z16 && str6.equals(wzVar.x) && !arrayList5.isEmpty()) {
                        tL_messages_search.offset_id = ((org.telegram.messenger.zi) k2.p1.h(1, arrayList5)).f1();
                    } else {
                        tL_messages_search.offset_id = 0;
                    }
                    i11 = i15;
                    str5 = str6;
                    l0Var2 = l0Var3;
                    j14 = j18;
                    tL_messages_searchGlobal = tL_messages_search;
                    z15 = z16;
                }
                wzVar.x = str5;
                wzVar.y = str3;
                final ArrayList arrayList10 = new ArrayList();
                kg.n0.B1(wzVar.x, arrayList10);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                final boolean z18 = z15;
                final int i16 = i3;
                final kg.l0 l0Var4 = l0Var2;
                final String str7 = str5;
                final int i17 = i11;
                final ArrayList arrayList11 = arrayList6;
                final long j20 = j14;
                connectionsManager.sendRequestTyped(tL_messages_searchGlobal, new org.telegram.messenger.n10() { // from class: org.telegram.ui.hz
                    @Override // org.telegram.messenger.n10
                    public final void a(Object obj, Object obj2) {
                        final TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                        final TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        final ArrayList arrayList12 = new ArrayList();
                        final int i18 = i17;
                        final String str8 = str7;
                        if (tL_error == null) {
                            int size = messages_messages.messages.size();
                            for (int i19 = 0; i19 < size; i19++) {
                                org.telegram.messenger.zi ziVar2 = new org.telegram.messenger.zi(i18, messages_messages.messages.get(i19), false, true);
                                ziVar2.L5(str8, true);
                                arrayList12.add(ziVar2);
                            }
                        }
                        final wz wzVar2 = wz.this;
                        final int i20 = i16;
                        final boolean z19 = z18;
                        final kg.l0 l0Var5 = l0Var4;
                        final long j21 = j16;
                        final long j22 = j20;
                        final ArrayList arrayList13 = arrayList11;
                        final ArrayList arrayList14 = arrayList10;
                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.iz
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:110:0x02a9  */
                            /* JADX WARN: Removed duplicated region for block: B:116:0x02cc  */
                            /* JADX WARN: Removed duplicated region for block: B:139:0x02c7  */
                            /* JADX WARN: Type inference failed for: r12v12 */
                            /* JADX WARN: Type inference failed for: r12v13, types: [boolean] */
                            /* JADX WARN: Type inference failed for: r12v16 */
                            /* JADX WARN: Type inference failed for: r16v0 */
                            /* JADX WARN: Type inference failed for: r16v1 */
                            /* JADX WARN: Type inference failed for: r16v2 */
                            @Override // java.lang.Runnable
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final void run() {
                                View view;
                                int i21;
                                ?? r12;
                                nz nzVar2;
                                ArrayList arrayList15;
                                ArrayList arrayList16;
                                SparseArray sparseArray;
                                ?? r16;
                                char c2;
                                wz wzVar3 = wz.this;
                                qz qzVar = wzVar3.U;
                                uz uzVar = wzVar3.V;
                                ArrayList arrayList17 = wzVar3.n;
                                SparseArray sparseArray2 = wzVar3.h;
                                ArrayList arrayList18 = wzVar3.e0;
                                HashMap hashMap = wzVar3.r;
                                ArrayList arrayList19 = wzVar3.f;
                                ArrayList arrayList20 = wzVar3.d0;
                                xs xsVar2 = wzVar3.b;
                                org.telegram.ui.Components.zu0 zu0Var2 = wzVar3.c;
                                if (i20 != wzVar3.Q) {
                                    return;
                                }
                                wzVar3.N = false;
                                if (tL_error != null) {
                                    yh.l lVar = zu0Var2.d;
                                    org.telegram.ui.Components.s70 s70Var = zu0Var2.e;
                                    lVar.setText(org.telegram.messenger.bd.M0(2131745810, null));
                                    s70Var.setVisibility(0);
                                    s70Var.setText(org.telegram.messenger.bd.M0(2131745817, null));
                                    zu0Var2.e(false, true);
                                    return;
                                }
                                zu0Var2.e(false, true);
                                yh.l lVar2 = zu0Var2.d;
                                org.telegram.ui.Components.s70 s70Var2 = zu0Var2.e;
                                TLRPC.messages_Messages messages_messages2 = messages_messages;
                                wzVar3.w = messages_messages2.next_rate;
                                int i22 = i18;
                                org.telegram.messenger.qr.a0(i22).m1(messages_messages2.users, messages_messages2.chats, true, true);
                                org.telegram.messenger.hp.s1(i22).Y3(messages_messages2.users, false);
                                org.telegram.messenger.hp.s1(i22).S3(messages_messages2.chats, false);
                                boolean z20 = z19;
                                if (!z20) {
                                    arrayList19.clear();
                                    sparseArray2.clear();
                                    arrayList17.clear();
                                    hashMap.clear();
                                }
                                wzVar3.P = messages_messages2.count;
                                String str9 = str8;
                                wzVar3.R = str9;
                                ArrayList arrayList21 = arrayList12;
                                int size2 = arrayList21.size();
                                int i23 = 0;
                                while (i23 < size2) {
                                    boolean z21 = z20;
                                    org.telegram.messenger.zi ziVar3 = (org.telegram.messenger.zi) arrayList21.get(i23);
                                    ArrayList arrayList22 = arrayList21;
                                    String str10 = ziVar3.Y;
                                    ArrayList arrayList23 = (ArrayList) hashMap.get(str10);
                                    int i24 = i23;
                                    if (arrayList23 == null) {
                                        arrayList15 = new ArrayList();
                                        hashMap.put(str10, arrayList15);
                                        arrayList17.add(str10);
                                    } else {
                                        arrayList15 = arrayList23;
                                    }
                                    arrayList15.add(ziVar3);
                                    arrayList19.add(ziVar3);
                                    sparseArray2.put(ziVar3.f1(), ziVar3);
                                    if (PhotoViewer.v1().U1()) {
                                        PhotoViewer v12 = PhotoViewer.v1();
                                        int i25 = wzVar3.S;
                                        arrayList16 = arrayList17;
                                        SparseArray[] sparseArrayArr = v12.a7;
                                        ArrayList arrayList24 = v12.Z6;
                                        sparseArray = sparseArray2;
                                        if (i25 == v12.c) {
                                            if (sparseArrayArr[0].indexOfKey(ziVar3.f1()) < 0) {
                                                if (v12.R5) {
                                                    arrayList24.add(ziVar3);
                                                    c2 = 0;
                                                } else {
                                                    c2 = 0;
                                                    arrayList24.add(0, ziVar3);
                                                }
                                                r16 = c2;
                                                sparseArrayArr[c2].put(ziVar3.f1(), ziVar3);
                                            } else {
                                                r16 = 0;
                                            }
                                            v12.Q5[r16] = arrayList24.size() == v12.K5 ? true : r16;
                                            v12.G2();
                                        }
                                    } else {
                                        arrayList16 = arrayList17;
                                        sparseArray = sparseArray2;
                                    }
                                    i23 = i24 + 1;
                                    arrayList21 = arrayList22;
                                    z20 = z21;
                                    arrayList17 = arrayList16;
                                    sparseArray2 = sparseArray;
                                }
                                boolean z22 = z20;
                                if (arrayList19.size() > wzVar3.P) {
                                    wzVar3.P = arrayList19.size();
                                }
                                wzVar3.O = arrayList19.size() >= wzVar3.P;
                                boolean isEmpty2 = arrayList19.isEmpty();
                                kg.l0 l0Var6 = l0Var5;
                                if (isEmpty2) {
                                    if (l0Var6 == null) {
                                        lVar2.setText(org.telegram.messenger.bd.M0(2131745810, null));
                                        s70Var2.setVisibility(8);
                                    } else if (TextUtils.isEmpty(wzVar3.R) && j21 == 0 && j22 == 0) {
                                        lVar2.setText(org.telegram.messenger.bd.M0(2131745811, null));
                                        int i26 = l0Var6.d;
                                        String M0 = i26 == 1 ? org.telegram.messenger.bd.M0(2131745816, null) : i26 == 0 ? org.telegram.messenger.bd.M0(2131745814, null) : i26 == 2 ? org.telegram.messenger.bd.M0(2131745815, null) : i26 == 3 ? org.telegram.messenger.bd.M0(2131745813, null) : org.telegram.messenger.bd.M0(2131745812, null);
                                        s70Var2.setVisibility(0);
                                        s70Var2.setText(M0);
                                    } else {
                                        lVar2.setText(org.telegram.messenger.bd.M0(2131745810, null));
                                        s70Var2.setVisibility(0);
                                        s70Var2.setText(org.telegram.messenger.bd.M0(2131745817, null));
                                    }
                                }
                                if (l0Var6 != null) {
                                    int i27 = l0Var6.d;
                                    if (i27 != 0) {
                                        if (i27 == 1) {
                                            wzVar3.d = wzVar3.W;
                                        } else if (i27 == 2) {
                                            wzVar3.d = wzVar3.a0;
                                        } else if (i27 == 3) {
                                            wzVar3.d = wzVar3.b0;
                                        } else if (i27 == 5) {
                                            wzVar3.d = wzVar3.c0;
                                        }
                                    } else if (TextUtils.isEmpty(wzVar3.R)) {
                                        wzVar3.d = uzVar;
                                    } else {
                                        wzVar3.d = qzVar;
                                    }
                                } else {
                                    wzVar3.d = qzVar;
                                }
                                u4.h0 adapter = xsVar2.getAdapter();
                                org.telegram.ui.Components.sj0 sj0Var3 = wzVar3.d;
                                if (adapter != sj0Var3) {
                                    xsVar2.setAdapter(sj0Var3);
                                }
                                if (z22) {
                                    view = null;
                                    i21 = 0;
                                } else {
                                    arrayList20.clear();
                                    ArrayList arrayList25 = arrayList13;
                                    if (arrayList25 != null) {
                                        arrayList20.addAll(arrayList25);
                                    }
                                    if (str9.length() >= 3 && (org.telegram.messenger.bd.M0(2131745911, null).toLowerCase().startsWith(str9) || "saved messages".startsWith(str9))) {
                                        for (int i28 = 0; i28 < arrayList20.size(); i28++) {
                                            if (!(arrayList20.get(i28) instanceof TLRPC.User) || org.telegram.messenger.h10.i(org.telegram.messenger.h10.t0).f().id != ((TLRPC.User) arrayList20.get(i28)).id) {
                                            }
                                        }
                                        r12 = 0;
                                        arrayList20.add(0, org.telegram.messenger.h10.i(org.telegram.messenger.h10.t0).f());
                                        arrayList18.clear();
                                        arrayList18.addAll(arrayList14);
                                        wzVar3.f0 = r12;
                                        if (str9.length() < 3) {
                                            view = null;
                                            if (org.telegram.messenger.bd.M0(2131754150, null).toLowerCase().startsWith(str9) || "archive".startsWith(str9)) {
                                                wzVar3.f0 = true;
                                            }
                                        } else {
                                            view = null;
                                        }
                                        nzVar2 = wzVar3.i0;
                                        i21 = r12;
                                        if (nzVar2 != null) {
                                            ((du) nzVar2).j(TextUtils.isEmpty(wzVar3.R), arrayList20, arrayList18, wzVar3.f0);
                                            i21 = r12;
                                        }
                                    }
                                    r12 = 0;
                                    arrayList18.clear();
                                    arrayList18.addAll(arrayList14);
                                    wzVar3.f0 = r12;
                                    if (str9.length() < 3) {
                                    }
                                    nzVar2 = wzVar3.i0;
                                    i21 = r12;
                                    if (nzVar2 != null) {
                                    }
                                }
                                int i29 = -1;
                                View view2 = view;
                                for (int i30 = i21; i30 < size2; i30++) {
                                    View childAt = xsVar2.getChildAt(i30);
                                    if (childAt instanceof org.telegram.ui.Components.iz) {
                                        i29 = RecyclerView.R(childAt);
                                        view2 = childAt;
                                    }
                                }
                                if (view2 != null) {
                                    xsVar2.removeView(view2);
                                }
                                if ((wzVar3.l0.getVisibility() == 0 && xsVar2.getChildCount() == 0) || (xsVar2.getAdapter() != uzVar && view2 != null)) {
                                    wzVar3.getViewTreeObserver().addOnPreDrawListener(new tp(wzVar3, (org.telegram.ui.Components.iz) view2, i29, 3));
                                }
                                wzVar3.d.f();
                            }
                        });
                    }
                });
            }
        };
        this.e = r02;
        org.telegram.messenger.g0.i3(r02, (!z14 || arrayList.isEmpty()) ? 350L : 0L);
        kz kzVar = this.l0;
        if (l0Var == null) {
            kzVar.setViewType(1);
            return;
        }
        int i11 = l0Var.d;
        if (i11 == 0) {
            if (TextUtils.isEmpty(this.J)) {
                kzVar.setViewType(2);
                return;
            } else {
                kzVar.setViewType(1);
                return;
            }
        }
        if (i11 == 1) {
            kzVar.setViewType(3);
            return;
        }
        if (i11 == 3 || i11 == 5) {
            kzVar.setViewType(4);
        } else if (i11 == 2) {
            kzVar.setViewType(5);
        }
    }

    public final void i(nz nzVar, boolean z10) {
        this.i0 = nzVar;
        if (!z10 || nzVar == null) {
            return;
        }
        ArrayList arrayList = this.d0;
        if (arrayList.isEmpty()) {
            return;
        }
        ((du) nzVar).j(false, arrayList, this.e0, this.f0);
    }

    public final void j(int i3, int i10, boolean z10) {
        setClipToPadding(false);
        this.s0 = z10;
        setPadding(0, i3, 0, i10);
        xs xsVar = this.b;
        if (z10) {
            xsVar.q1(0, i3, 0, i10);
        } else {
            xsVar.setPadding(0, i3, 0, i10);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) xsVar.getLayoutParams();
        marginLayoutParams.topMargin = -i3;
        marginLayoutParams.bottomMargin = -i10;
        this.s0 = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i3 = org.telegram.messenger.h10.t0;
        this.r0 = i3;
        org.telegram.messenger.hs.f(i3).c(this, org.telegram.messenger.hs.i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.hs.f(this.r0).n(this, org.telegram.messenger.hs.i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        org.telegram.ui.Components.sj0 sj0Var;
        int i11 = this.s;
        if (org.telegram.messenger.g0.Q1()) {
            this.s = 3;
        } else if (getResources().getConfiguration().orientation == 2) {
            this.s = 6;
        } else {
            this.s = 3;
        }
        if (i11 != this.s && (sj0Var = this.d) == this.V) {
            this.s0 = true;
            sj0Var.f();
            this.s0 = false;
        }
        super.onMeasure(i3, i10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.s0) {
            return;
        }
        super.requestLayout();
    }

    public void setBlurredBackgroundDrawableFactory(eh.c cVar) {
        hh.e eVar = new hh.e(null);
        eVar.e = new gi.i8(12);
        eVar.f(385875968, 402653183);
        eVar.e(385875968, 402653183);
        eVar.d(0, 0);
        eVar.f = 1.0f;
        eVar.h = 1.0f;
        oz ozVar = this.n0;
        gh.g c2 = cVar.c(ozVar, eVar, false);
        ozVar.b = c2;
        c2.r(org.telegram.messenger.g0.L(11.5f));
        ozVar.b.q(org.telegram.messenger.g0.L(5.0f));
    }

    public void setChatPreviewDelegate(org.telegram.ui.Components.em0 em0Var) {
        this.j0 = em0Var;
    }

    public void setUiCallback(vz vzVar) {
        this.p0 = vzVar;
    }

    public void setUseFromUserAsAvatar(boolean z10) {
        this.q0 = z10;
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            oz ozVar = this.n0;
            if (ozVar != null) {
                ozVar.updateColors();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // qe.b
    public final /* synthetic */ void F(float f10, int i3) {
    }
}

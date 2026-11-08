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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class yz extends FrameLayout implements org.telegram.ui.ActionBar.a6, org.telegram.messenger.ls, te.b {
    public static final SpannableStringBuilder[] s0 = new SpannableStringBuilder[3];
    public jg.o0 D;
    public long E;
    public long F;
    public long G;
    public long H;
    public String I;
    public boolean J;
    public final Activity K;
    public final org.telegram.ui.ActionBar.f2 L;
    public boolean M;
    public boolean N;
    public int O;
    public int P;
    public String Q;
    public int R;
    public final rz S;
    public final sz T;
    public final wz U;
    public final tz V;
    public final vz W;
    public final te.a a;
    public final tz a0;
    public final zs b;
    public final tz b0;
    public final org.telegram.ui.Components.av0 c;
    public final ArrayList c0;
    public org.telegram.ui.Components.oj0 d;
    public final ArrayList d0;
    public iz e;
    public boolean e0;
    public final ArrayList f;
    public final m4 f0;
    public final lz g0;
    public final SparseArray h;
    public pz h0;
    public org.telegram.ui.Components.bm0 i0;
    public final v4.b0 j0;
    public final mz k0;
    public final h2.f l0;
    public final qz m0;
    public final ArrayList n;
    public final hz n0;
    public xz o0;
    public boolean p0;
    public int q0;
    public final HashMap r;
    public boolean r0;
    public int s;
    public int w;
    public String x;
    public String y;

    public yz(org.telegram.ui.ActionBar.f2 f2Var) {
        super(f2Var.getParentActivity());
        this.a = new te.a(0, this, org.telegram.ui.Components.xq.h, 380L, false);
        this.f = new ArrayList();
        this.h = new SparseArray();
        this.n = new ArrayList();
        this.r = new HashMap();
        this.s = 3;
        this.S = new rz(0, 0L);
        this.c0 = new ArrayList();
        this.d0 = new ArrayList();
        this.f0 = new m4(this, 5);
        this.g0 = new lz(this);
        this.l0 = new h2.f((int[]) null);
        this.n0 = new hz(this, 0);
        this.L = f2Var;
        Activity parentActivity = f2Var.getParentActivity();
        this.K = parentActivity;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, this, null);
        zs zsVar = new zs(2, parentActivity, this);
        this.b = zsVar;
        zsVar.setOnItemClickListener(new h(this, 12));
        zsVar.setOnItemLongClickListener(new f(this, 15));
        v4.b0 b0Var = new v4.b0();
        this.j0 = b0Var;
        zsVar.setLayoutManager(b0Var);
        mz mzVar = new mz(0, parentActivity, this);
        this.k0 = mzVar;
        addView(mzVar);
        addView(zsVar);
        zsVar.setSectionsType(2);
        zsVar.setSkipDrawSection(true);
        zsVar.setOnScrollListener(new nz(this));
        qz qzVar = new qz(parentActivity);
        this.m0 = qzVar;
        String u10 = org.telegram.messenger.id.u((int) (System.currentTimeMillis() / 1000), false);
        if (!TextUtils.equals(qzVar.c, u10)) {
            qzVar.c = u10;
            qzVar.a.t(u10, true, true);
        }
        addView(qzVar, c8.ha.d(-1, 33.0f, 49, 0.0f, -2.0f, 0.0f, 0.0f));
        this.T = new sz(this);
        this.U = new wz(this, getContext());
        this.V = new tz(this, getContext(), 1);
        this.W = new vz(this, getContext());
        this.a0 = new tz(this, getContext(), 4);
        this.b0 = new tz(this, getContext(), 2);
        org.telegram.ui.Components.av0 av0Var = new org.telegram.ui.Components.av0(parentActivity, mzVar, 1, null);
        this.c = av0Var;
        addView(av0Var);
        zsVar.setEmptyView(av0Var);
        av0Var.setVisibility(8);
        b();
    }

    public static void a(yz yzVar, org.telegram.messenger.ij ijVar, View view, int i7) {
        if (!yzVar.o0.i()) {
            yzVar.o0.e();
        }
        if (yzVar.o0.i()) {
            yzVar.o0.h(ijVar, view, i7);
        }
    }

    public static CharSequence c(org.telegram.messenger.ij ijVar, boolean z9) {
        return d(ijVar, z9, 0, null);
    }

    public static CharSequence d(org.telegram.messenger.ij ijVar, boolean z9, int i7, TextPaint textPaint) {
        TLRPC.Message message;
        TLRPC.Chat M0;
        TLRPC.Chat M02;
        TLRPC.User user;
        TLRPC.TL_forumTopic f10;
        TLRPC.TL_forumTopic f11;
        int i10;
        if (ijVar == null || (message = ijVar.k) == null) {
            return "";
        }
        if (org.telegram.messenger.ij.c4(message)) {
            kg.s1 c10 = kg.t1.f(ijVar.I1).c(org.telegram.messenger.ij.J1(ijVar.k));
            return c10 == null ? "" : c10.b;
        }
        CharSequence charSequence = null;
        if (ijVar.s4()) {
            return ijVar.Z0 ? org.telegram.messenger.id.M0(2131745261, null) : ijVar.S0 ? org.telegram.messenger.id.M0(2131745262, null) : org.telegram.messenger.id.M0(2131745263, null);
        }
        SpannableStringBuilder[] spannableStringBuilderArr = s0;
        if (spannableStringBuilderArr[i7] == null) {
            spannableStringBuilderArr[i7] = new SpannableStringBuilder(">");
            if (i7 == 0) {
                i10 = R.drawable.attach_arrow_right;
            } else if (i7 == 1) {
                i10 = R.drawable.msg_mini_arrow_mediathin;
            } else {
                if (i7 != 2) {
                    return "";
                }
                i10 = R.drawable.msg_mini_arrow_mediabold;
            }
            org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(i7 == 0 ? 2 : 1, org.telegram.messenger.t0.b.getDrawable(i10).mutate());
            if (i7 == 1 || i7 == 2) {
                wpVar.H = 0.85f;
            }
            SpannableStringBuilder spannableStringBuilder = spannableStringBuilderArr[i7];
            spannableStringBuilder.setSpan(wpVar, 0, spannableStringBuilder.length(), 0);
        }
        TLRPC.Message message2 = ijVar.k;
        if (message2.saved_peer_id != null) {
            if (ijVar.Q1() >= 0) {
                user = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).a2(Long.valueOf(ijVar.Q1()));
                M0 = null;
            } else if (ijVar.Q1() < 0) {
                M0 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).M0(Long.valueOf(-ijVar.Q1()));
                user = null;
                M02 = null;
            } else {
                user = null;
                M0 = null;
            }
            M02 = M0;
        } else {
            TLRPC.User a22 = message2.from_id.user_id != 0 ? org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).a2(Long.valueOf(ijVar.k.from_id.user_id)) : null;
            M0 = ijVar.k.from_id.chat_id != 0 ? org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).M0(Long.valueOf(ijVar.k.peer_id.chat_id)) : null;
            if (M0 == null) {
                M0 = ijVar.k.from_id.channel_id != 0 ? org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).M0(Long.valueOf(ijVar.k.peer_id.channel_id)) : null;
            }
            M02 = ijVar.k.peer_id.channel_id != 0 ? org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).M0(Long.valueOf(ijVar.k.peer_id.channel_id)) : null;
            if (M02 == null) {
                M02 = ijVar.k.peer_id.chat_id != 0 ? org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).M0(Long.valueOf(ijVar.k.peer_id.chat_id)) : null;
            }
            if (!org.telegram.messenger.t3.V(M02) && !z9) {
                M02 = null;
            }
            user = a22;
        }
        if (user != null && M02 != null) {
            CharSequence charSequence2 = M02.title;
            if (org.telegram.messenger.t3.c0(M02) && (f11 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).q7.f(M02.id, org.telegram.messenger.ij.c2(ijVar.I1, ijVar.k, true, false))) != null) {
                charSequence2 = qg.d.j(f11, null, null);
            }
            CharSequence m10 = org.telegram.messenger.i6.m(charSequence2, textPaint == null ? null : textPaint.getFontMetricsInt(), false, null, 0);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append(org.telegram.messenger.i6.m(org.telegram.messenger.t10.j(user, true), textPaint == null ? null : textPaint.getFontMetricsInt(), false, null, 0)).append((char) 8202).append((CharSequence) spannableStringBuilderArr[i7]).append((char) 8202).append(m10);
            charSequence = spannableStringBuilder2;
        } else if (user != null) {
            charSequence = org.telegram.messenger.i6.m(org.telegram.messenger.t10.p(user), textPaint == null ? null : textPaint.getFontMetricsInt(), false, null, 0);
        } else if (M0 != null) {
            CharSequence charSequence3 = M0.title;
            if (org.telegram.messenger.t3.c0(M0) && (f10 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).q7.f(M0.id, org.telegram.messenger.ij.c2(ijVar.I1, ijVar.k, true, false))) != null) {
                charSequence3 = qg.d.j(f10, null, null);
            }
            charSequence = org.telegram.messenger.i6.m(charSequence3, textPaint == null ? null : textPaint.getFontMetricsInt(), false, null, 0);
        }
        return charSequence == null ? "" : charSequence;
    }

    @Override // te.b
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            b();
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
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
        qz qzVar = this.m0;
        qzVar.setTranslationY((1.0f - f10) * (-org.telegram.messenger.g0.L(24.0f)));
        qzVar.setAlpha(f10);
        qzVar.setVisibility(f10 > 0.0f ? 0 : 4);
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.i4) {
            zs zsVar = this.b;
            int childCount = zsVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                if (zsVar.getChildAt(i11) instanceof org.telegram.ui.Cells.t2) {
                    ((org.telegram.ui.Cells.t2) zsVar.getChildAt(i11)).j0(0, true);
                }
                zsVar.getChildAt(i11).invalidate();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0028, code lost:
    
        if (org.telegram.messenger.t3.S(org.telegram.messenger.p10.s0, r5) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(ArrayList arrayList, long j3) {
        org.telegram.ui.Components.oj0 oj0Var;
        int i7;
        int i10 = 0;
        boolean z9 = false;
        while (true) {
            ArrayList arrayList2 = this.f;
            if (i10 >= arrayList2.size()) {
                break;
            }
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList2.get(i10);
            TLRPC.Message message = ijVar.k;
            String str = ijVar.Y;
            long B0 = org.telegram.messenger.ij.B0(message);
            if (B0 < 0) {
                i7 = (int) (-B0);
            }
            i7 = 0;
            if (i7 == j3) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    if (ijVar.f1() == ((Integer) arrayList.get(i11)).intValue()) {
                        arrayList2.remove(i10);
                        this.h.remove(ijVar.f1());
                        HashMap hashMap = this.r;
                        ArrayList arrayList3 = (ArrayList) hashMap.get(str);
                        arrayList3.remove(ijVar);
                        if (arrayList3.size() == 0) {
                            this.n.remove(str);
                            hashMap.remove(str);
                        }
                        i10--;
                        this.O--;
                        z9 = true;
                    }
                }
            }
            i10++;
        }
        if (!z9 || (oj0Var = this.d) == null) {
            return;
        }
        oj0Var.f();
    }

    public final void f(int i7, View view, org.telegram.messenger.ij ijVar, int i10) {
        String str;
        if (ijVar == null) {
            return;
        }
        if (this.o0.i()) {
            this.o0.h(ijVar, view, i10);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.t2) {
            this.o0.g(ijVar);
            return;
        }
        int i11 = this.D.d;
        lz lzVar = this.g0;
        ArrayList arrayList = this.f;
        String str2 = null;
        org.telegram.ui.ActionBar.f2 f2Var = this.L;
        if (i11 == 0) {
            PhotoViewer.p1().H2(null, f2Var, null);
            PhotoViewer.p1().Z1(arrayList, i7, 0L, 0L, 0L, lzVar);
            this.R = PhotoViewer.p1().c;
            return;
        }
        if (i11 == 3 || i11 == 5) {
            if (view instanceof org.telegram.ui.Cells.g7) {
                ((org.telegram.ui.Cells.g7) view).a();
                return;
            }
            return;
        }
        if (i11 == 1) {
            if (view instanceof org.telegram.ui.Cells.h7) {
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
                TLRPC.Document F0 = ijVar.F0();
                if (!h7Var.G) {
                    if (h7Var.F) {
                        org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.p10.s0).a).f(F0);
                        h7Var.f(true);
                        return;
                    } else {
                        org.telegram.messenger.ij message = h7Var.getMessage();
                        message.P = true;
                        org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.p10.s0).a).W(F0, message, 0, 0);
                        h7Var.f(true);
                        return;
                    }
                }
                if (!ijVar.x()) {
                    org.telegram.messenger.g0.s2(ijVar, this.K, f2Var);
                    return;
                }
                PhotoViewer.p1().H2(null, f2Var, null);
                int indexOf = arrayList.indexOf(ijVar);
                if (indexOf >= 0) {
                    PhotoViewer.p1().H2(null, f2Var, null);
                    PhotoViewer.p1().Z1(arrayList, indexOf, 0L, 0L, 0L, lzVar);
                    this.R = PhotoViewer.p1().c;
                    return;
                } else {
                    ArrayList k10 = org.telegram.messenger.k5.k(ijVar);
                    PhotoViewer.p1().H2(null, f2Var, null);
                    PhotoViewer.p1().Z1(k10, 0, 0L, 0L, 0L, lzVar);
                    this.R = PhotoViewer.p1().c;
                    return;
                }
            }
            return;
        }
        if (i11 == 2) {
            try {
                TLRPC.MessageMedia messageMedia = ijVar.k.media;
                TLRPC.WebPage webPage = messageMedia != null ? messageMedia.webpage : null;
                if (webPage == null || (webPage instanceof TLRPC.TL_webPageEmpty)) {
                    str = null;
                } else {
                    if (webPage.cached_page != null) {
                        LaunchActivity launchActivity = LaunchActivity.G1;
                        if (launchActivity == null || launchActivity.O() == null || LaunchActivity.G1.O().l(ijVar) == null) {
                            f2Var.createArticleViewer(false).L(ijVar, null, null, null);
                            return;
                        }
                        return;
                    }
                    String str3 = webPage.embed_url;
                    if (str3 != null && str3.length() != 0) {
                        org.telegram.ui.Components.wt.N0(this.L, ijVar, this.g0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                        return;
                    }
                    str = webPage.url;
                }
                if (str == null) {
                    ArrayList arrayList2 = ((org.telegram.ui.Cells.k7) view).E;
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
            org.telegram.ui.Components.v4.n0(this.L, str, true, true);
        } else {
            vf.c.t(this.K, str);
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.t6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.t6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.a7));
        int i7 = org.telegram.ui.ActionBar.k6.i7;
        zs zsVar = this.b;
        arrayList.add(new org.telegram.ui.ActionBar.t6(zsVar, TLObject.FLAG_13, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        int i10 = org.telegram.ui.ActionBar.k6.k7;
        arrayList.add(new org.telegram.ui.ActionBar.t6(zsVar, TLObject.FLAG_14, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(zsVar, 8, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.nj));
        arrayList.add(new org.telegram.ui.ActionBar.t6(zsVar, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(zsVar, TLObject.FLAG_13, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(zsVar, TLObject.FLAG_14, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(zsVar, TLObject.FLAG_13, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(zsVar, TLObject.FLAG_14, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        org.telegram.ui.Components.av0 av0Var = this.c;
        arrayList.add(new org.telegram.ui.ActionBar.t6(av0Var.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(av0Var.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.y6));
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Runnable, org.telegram.ui.iz] */
    public final void h(final long j3, final long j10, final long j11, final long j12, final jg.o0 o0Var, final boolean z9, String str, boolean z10) {
        ArrayList arrayList;
        final String str2 = str == null ? "" : str;
        Locale locale = Locale.ENGLISH;
        final String str3 = j3 + j10 + j11 + j12 + (o0Var == null ? -1 : o0Var.d) + str2 + z9;
        String str4 = this.y;
        boolean z11 = str4 != null && str4.equals(str3);
        boolean z12 = !z11 && z10;
        this.D = o0Var;
        this.E = j3;
        this.F = j10;
        this.H = j11;
        this.G = j12;
        this.I = str2;
        this.J = z9;
        iz izVar = this.e;
        if (izVar != null) {
            org.telegram.messenger.g0.r(izVar);
        }
        m4 m4Var = this.f0;
        org.telegram.messenger.g0.r(m4Var);
        if (z11 && z10) {
            return;
        }
        ArrayList arrayList2 = this.d0;
        final boolean z13 = z11;
        ArrayList arrayList3 = this.c0;
        org.telegram.ui.Components.av0 av0Var = this.c;
        ArrayList arrayList4 = this.f;
        if (z12 || (o0Var == null && j10 == 0 && j3 == 0 && j11 == 0 && j12 == 0)) {
            arrayList4.clear();
            this.n.clear();
            this.r.clear();
            this.M = true;
            av0Var.setVisibility(0);
            org.telegram.ui.Components.oj0 oj0Var = this.d;
            if (oj0Var != null) {
                oj0Var.f();
            }
            this.P++;
            zs zsVar = this.b;
            if (zsVar.getPinnedHeader() != null) {
                arrayList = arrayList4;
                zsVar.getPinnedHeader().setAlpha(0.0f);
            } else {
                arrayList = arrayList4;
            }
            arrayList3.clear();
            arrayList2.clear();
            if (!z12) {
                return;
            }
        } else if (z10 && !arrayList4.isEmpty()) {
            return;
        } else {
            arrayList = arrayList4;
        }
        this.M = true;
        org.telegram.ui.Components.oj0 oj0Var2 = this.d;
        if (oj0Var2 != null) {
            oj0Var2.f();
        }
        if (!z13) {
            m4Var.run();
            av0Var.e(true, !z10);
        }
        if (TextUtils.isEmpty(str2)) {
            arrayList2.clear();
            arrayList3.clear();
            pz pzVar = this.h0;
            if (pzVar != null) {
                ((fu) pzVar).j(false, null, null, false);
            }
        }
        final int i7 = this.P + 1;
        this.P = i7;
        final int i10 = org.telegram.messenger.p10.s0;
        ?? r02 = new Runnable() { // from class: org.telegram.ui.iz
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                int i11;
                String str5;
                jg.o0 o0Var2;
                int i12;
                long j13;
                boolean z14;
                long j14;
                int i13;
                int i14;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal;
                final yz yzVar = yz.this;
                ArrayList arrayList5 = yzVar.f;
                final long j15 = j3;
                long j16 = j10;
                String str6 = str2;
                jg.o0 o0Var3 = o0Var;
                int i15 = i10;
                long j17 = j11;
                long j18 = j12;
                boolean z15 = z13;
                ArrayList arrayList6 = null;
                if (j15 == 0 || j16 != 0) {
                    boolean isEmpty = TextUtils.isEmpty(str6);
                    boolean z16 = z9;
                    if (isEmpty) {
                        i11 = i15;
                        str5 = str6;
                        o0Var2 = o0Var3;
                        i12 = z16 ? 1 : 0;
                        j13 = j17;
                        z14 = z15;
                        j14 = j18;
                        i13 = 20;
                    } else {
                        j13 = j17;
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = new ArrayList();
                        z14 = z15;
                        ArrayList arrayList9 = new ArrayList();
                        org.telegram.messenger.yr a02 = org.telegram.messenger.yr.a0(i15);
                        j14 = j18;
                        i11 = i15;
                        str5 = str6;
                        o0Var2 = o0Var3;
                        i13 = 20;
                        a02.M0(0, str5, arrayList7, arrayList8, arrayList9, null, z16 ? 1 : 0);
                        i12 = z16 ? 1 : 0;
                        arrayList6 = arrayList7;
                    }
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = new TLRPC.TL_messages_searchGlobal();
                    tL_messages_searchGlobal2.limit = i13;
                    tL_messages_searchGlobal2.q = str5;
                    tL_messages_searchGlobal2.filter = o0Var2 == null ? new TLRPC.TL_inputMessagesFilterEmpty() : o0Var2.e;
                    tL_messages_searchGlobal2.community = org.telegram.messenger.qp.s1(i11).h1(j16);
                    if (j13 > 0) {
                        tL_messages_searchGlobal2.min_date = (int) (j13 / 1000);
                    }
                    if (j14 > 0) {
                        tL_messages_searchGlobal2.max_date = (int) (j14 / 1000);
                    }
                    if (z14 && str5.equals(yzVar.x) && !arrayList5.isEmpty()) {
                        i14 = 1;
                        org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) jg.g.i(1, arrayList5);
                        tL_messages_searchGlobal2.offset_id = ijVar.f1();
                        tL_messages_searchGlobal2.offset_rate = yzVar.w;
                        tL_messages_searchGlobal2.offset_peer = org.telegram.messenger.qp.s1(i11).j1(org.telegram.messenger.ij.C1(ijVar.k.peer_id));
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
                    tL_messages_search.filter = o0Var3 == null ? new TLRPC.TL_inputMessagesFilterEmpty() : o0Var3.e;
                    tL_messages_search.peer = org.telegram.messenger.qp.s1(org.telegram.messenger.c.a(i15).a).j1(j15);
                    if (j17 > 0) {
                        tL_messages_search.min_date = (int) (j17 / 1000);
                    }
                    if (j18 > 0) {
                        tL_messages_search.max_date = (int) (j18 / 1000);
                    }
                    if (z15 && str6.equals(yzVar.x) && !arrayList5.isEmpty()) {
                        tL_messages_search.offset_id = ((org.telegram.messenger.ij) jg.g.i(1, arrayList5)).f1();
                    } else {
                        tL_messages_search.offset_id = 0;
                    }
                    i11 = i15;
                    str5 = str6;
                    o0Var2 = o0Var3;
                    j13 = j17;
                    tL_messages_searchGlobal = tL_messages_search;
                    z14 = z15;
                }
                yzVar.x = str5;
                yzVar.y = str3;
                final ArrayList arrayList10 = new ArrayList();
                jg.q0.B1(yzVar.x, arrayList10);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                final boolean z17 = z14;
                final int i16 = i7;
                final jg.o0 o0Var4 = o0Var2;
                final String str7 = str5;
                final int i17 = i11;
                final ArrayList arrayList11 = arrayList6;
                final long j19 = j13;
                connectionsManager.sendRequestTyped(tL_messages_searchGlobal, new org.telegram.messenger.v10() { // from class: org.telegram.ui.jz
                    @Override // org.telegram.messenger.v10
                    public final void a(Object obj, Object obj2) {
                        final TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                        final TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        final ArrayList arrayList12 = new ArrayList();
                        final int i18 = i17;
                        final String str8 = str7;
                        if (tL_error == null) {
                            int size = messages_messages.messages.size();
                            for (int i19 = 0; i19 < size; i19++) {
                                org.telegram.messenger.ij ijVar2 = new org.telegram.messenger.ij(i18, messages_messages.messages.get(i19), false, true);
                                ijVar2.L5(str8, true);
                                arrayList12.add(ijVar2);
                            }
                        }
                        final yz yzVar2 = yz.this;
                        final int i20 = i16;
                        final boolean z18 = z17;
                        final jg.o0 o0Var5 = o0Var4;
                        final long j20 = j15;
                        final long j21 = j19;
                        final ArrayList arrayList13 = arrayList11;
                        final ArrayList arrayList14 = arrayList10;
                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.kz
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
                                pz pzVar2;
                                ArrayList arrayList15;
                                ArrayList arrayList16;
                                SparseArray sparseArray;
                                ?? r16;
                                char c10;
                                yz yzVar3 = yz.this;
                                sz szVar = yzVar3.T;
                                wz wzVar = yzVar3.U;
                                ArrayList arrayList17 = yzVar3.n;
                                SparseArray sparseArray2 = yzVar3.h;
                                ArrayList arrayList18 = yzVar3.d0;
                                HashMap hashMap = yzVar3.r;
                                ArrayList arrayList19 = yzVar3.f;
                                ArrayList arrayList20 = yzVar3.c0;
                                zs zsVar2 = yzVar3.b;
                                org.telegram.ui.Components.av0 av0Var2 = yzVar3.c;
                                if (i20 != yzVar3.P) {
                                    return;
                                }
                                yzVar3.M = false;
                                if (tL_error != null) {
                                    xh.l lVar = av0Var2.d;
                                    org.telegram.ui.Components.w70 w70Var = av0Var2.e;
                                    lVar.setText(org.telegram.messenger.id.M0(2131745803, null));
                                    w70Var.setVisibility(0);
                                    w70Var.setText(org.telegram.messenger.id.M0(2131745810, null));
                                    av0Var2.e(false, true);
                                    return;
                                }
                                av0Var2.e(false, true);
                                xh.l lVar2 = av0Var2.d;
                                org.telegram.ui.Components.w70 w70Var2 = av0Var2.e;
                                TLRPC.messages_Messages messages_messages2 = messages_messages;
                                yzVar3.w = messages_messages2.next_rate;
                                int i22 = i18;
                                org.telegram.messenger.yr.a0(i22).m1(messages_messages2.users, messages_messages2.chats, true, true);
                                org.telegram.messenger.qp.s1(i22).Y3(messages_messages2.users, false);
                                org.telegram.messenger.qp.s1(i22).S3(messages_messages2.chats, false);
                                boolean z19 = z18;
                                if (!z19) {
                                    arrayList19.clear();
                                    sparseArray2.clear();
                                    arrayList17.clear();
                                    hashMap.clear();
                                }
                                yzVar3.O = messages_messages2.count;
                                String str9 = str8;
                                yzVar3.Q = str9;
                                ArrayList arrayList21 = arrayList12;
                                int size2 = arrayList21.size();
                                int i23 = 0;
                                while (i23 < size2) {
                                    boolean z20 = z19;
                                    org.telegram.messenger.ij ijVar3 = (org.telegram.messenger.ij) arrayList21.get(i23);
                                    ArrayList arrayList22 = arrayList21;
                                    String str10 = ijVar3.Y;
                                    ArrayList arrayList23 = (ArrayList) hashMap.get(str10);
                                    int i24 = i23;
                                    if (arrayList23 == null) {
                                        arrayList15 = new ArrayList();
                                        hashMap.put(str10, arrayList15);
                                        arrayList17.add(str10);
                                    } else {
                                        arrayList15 = arrayList23;
                                    }
                                    arrayList15.add(ijVar3);
                                    arrayList19.add(ijVar3);
                                    sparseArray2.put(ijVar3.f1(), ijVar3);
                                    if (PhotoViewer.p1().P1()) {
                                        PhotoViewer p12 = PhotoViewer.p1();
                                        int i25 = yzVar3.R;
                                        arrayList16 = arrayList17;
                                        SparseArray[] sparseArrayArr = p12.Y6;
                                        ArrayList arrayList24 = p12.X6;
                                        sparseArray = sparseArray2;
                                        if (i25 == p12.c) {
                                            if (sparseArrayArr[0].indexOfKey(ijVar3.f1()) < 0) {
                                                if (p12.P5) {
                                                    arrayList24.add(ijVar3);
                                                    c10 = 0;
                                                } else {
                                                    c10 = 0;
                                                    arrayList24.add(0, ijVar3);
                                                }
                                                r16 = c10;
                                                sparseArrayArr[c10].put(ijVar3.f1(), ijVar3);
                                            } else {
                                                r16 = 0;
                                            }
                                            p12.O5[r16] = arrayList24.size() == p12.I5 ? true : r16;
                                            p12.A2();
                                        }
                                    } else {
                                        arrayList16 = arrayList17;
                                        sparseArray = sparseArray2;
                                    }
                                    i23 = i24 + 1;
                                    arrayList21 = arrayList22;
                                    z19 = z20;
                                    arrayList17 = arrayList16;
                                    sparseArray2 = sparseArray;
                                }
                                boolean z21 = z19;
                                if (arrayList19.size() > yzVar3.O) {
                                    yzVar3.O = arrayList19.size();
                                }
                                yzVar3.N = arrayList19.size() >= yzVar3.O;
                                boolean isEmpty2 = arrayList19.isEmpty();
                                jg.o0 o0Var6 = o0Var5;
                                if (isEmpty2) {
                                    if (o0Var6 == null) {
                                        lVar2.setText(org.telegram.messenger.id.M0(2131745803, null));
                                        w70Var2.setVisibility(8);
                                    } else if (TextUtils.isEmpty(yzVar3.Q) && j20 == 0 && j21 == 0) {
                                        lVar2.setText(org.telegram.messenger.id.M0(2131745804, null));
                                        int i26 = o0Var6.d;
                                        String M0 = i26 == 1 ? org.telegram.messenger.id.M0(2131745809, null) : i26 == 0 ? org.telegram.messenger.id.M0(2131745807, null) : i26 == 2 ? org.telegram.messenger.id.M0(2131745808, null) : i26 == 3 ? org.telegram.messenger.id.M0(2131745806, null) : org.telegram.messenger.id.M0(2131745805, null);
                                        w70Var2.setVisibility(0);
                                        w70Var2.setText(M0);
                                    } else {
                                        lVar2.setText(org.telegram.messenger.id.M0(2131745803, null));
                                        w70Var2.setVisibility(0);
                                        w70Var2.setText(org.telegram.messenger.id.M0(2131745810, null));
                                    }
                                }
                                if (o0Var6 != null) {
                                    int i27 = o0Var6.d;
                                    if (i27 != 0) {
                                        if (i27 == 1) {
                                            yzVar3.d = yzVar3.V;
                                        } else if (i27 == 2) {
                                            yzVar3.d = yzVar3.W;
                                        } else if (i27 == 3) {
                                            yzVar3.d = yzVar3.a0;
                                        } else if (i27 == 5) {
                                            yzVar3.d = yzVar3.b0;
                                        }
                                    } else if (TextUtils.isEmpty(yzVar3.Q)) {
                                        yzVar3.d = wzVar;
                                    } else {
                                        yzVar3.d = szVar;
                                    }
                                } else {
                                    yzVar3.d = szVar;
                                }
                                v4.g0 adapter = zsVar2.getAdapter();
                                org.telegram.ui.Components.oj0 oj0Var3 = yzVar3.d;
                                if (adapter != oj0Var3) {
                                    zsVar2.setAdapter(oj0Var3);
                                }
                                if (z21) {
                                    view = null;
                                    i21 = 0;
                                } else {
                                    arrayList20.clear();
                                    ArrayList arrayList25 = arrayList13;
                                    if (arrayList25 != null) {
                                        arrayList20.addAll(arrayList25);
                                    }
                                    if (str9.length() >= 3 && (org.telegram.messenger.id.M0(2131745904, null).toLowerCase().startsWith(str9) || "saved messages".startsWith(str9))) {
                                        for (int i28 = 0; i28 < arrayList20.size(); i28++) {
                                            if (!(arrayList20.get(i28) instanceof TLRPC.User) || org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).f().id != ((TLRPC.User) arrayList20.get(i28)).id) {
                                            }
                                        }
                                        r12 = 0;
                                        arrayList20.add(0, org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).f());
                                        arrayList18.clear();
                                        arrayList18.addAll(arrayList14);
                                        yzVar3.e0 = r12;
                                        if (str9.length() < 3) {
                                            view = null;
                                            if (org.telegram.messenger.id.M0(2131754150, null).toLowerCase().startsWith(str9) || "archive".startsWith(str9)) {
                                                yzVar3.e0 = true;
                                            }
                                        } else {
                                            view = null;
                                        }
                                        pzVar2 = yzVar3.h0;
                                        i21 = r12;
                                        if (pzVar2 != null) {
                                            ((fu) pzVar2).j(TextUtils.isEmpty(yzVar3.Q), arrayList20, arrayList18, yzVar3.e0);
                                            i21 = r12;
                                        }
                                    }
                                    r12 = 0;
                                    arrayList18.clear();
                                    arrayList18.addAll(arrayList14);
                                    yzVar3.e0 = r12;
                                    if (str9.length() < 3) {
                                    }
                                    pzVar2 = yzVar3.h0;
                                    i21 = r12;
                                    if (pzVar2 != null) {
                                    }
                                }
                                int i29 = -1;
                                View view2 = view;
                                for (int i30 = i21; i30 < size2; i30++) {
                                    View childAt = zsVar2.getChildAt(i30);
                                    if (childAt instanceof org.telegram.ui.Components.mz) {
                                        i29 = RecyclerView.R(childAt);
                                        view2 = childAt;
                                    }
                                }
                                if (view2 != null) {
                                    zsVar2.removeView(view2);
                                }
                                if ((yzVar3.k0.getVisibility() == 0 && zsVar2.getChildCount() == 0) || (zsVar2.getAdapter() != wzVar && view2 != null)) {
                                    yzVar3.getViewTreeObserver().addOnPreDrawListener(new vp(yzVar3, (org.telegram.ui.Components.mz) view2, i29, 3));
                                }
                                yzVar3.d.f();
                            }
                        });
                    }
                });
            }
        };
        this.e = r02;
        org.telegram.messenger.g0.i3(r02, (!z13 || arrayList.isEmpty()) ? 350L : 0L);
        mz mzVar = this.k0;
        if (o0Var == null) {
            mzVar.setViewType(1);
            return;
        }
        int i11 = o0Var.d;
        if (i11 == 0) {
            if (TextUtils.isEmpty(this.I)) {
                mzVar.setViewType(2);
                return;
            } else {
                mzVar.setViewType(1);
                return;
            }
        }
        if (i11 == 1) {
            mzVar.setViewType(3);
            return;
        }
        if (i11 == 3 || i11 == 5) {
            mzVar.setViewType(4);
        } else if (i11 == 2) {
            mzVar.setViewType(5);
        }
    }

    public final void i(pz pzVar, boolean z9) {
        this.h0 = pzVar;
        if (!z9 || pzVar == null) {
            return;
        }
        ArrayList arrayList = this.c0;
        if (arrayList.isEmpty()) {
            return;
        }
        ((fu) pzVar).j(false, arrayList, this.d0, this.e0);
    }

    public final void j(int i7, int i10, boolean z9) {
        setClipToPadding(false);
        this.r0 = z9;
        setPadding(0, i7, 0, i10);
        zs zsVar = this.b;
        if (z9) {
            zsVar.q1(0, i7, 0, i10);
        } else {
            zsVar.setPadding(0, i7, 0, i10);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) zsVar.getLayoutParams();
        marginLayoutParams.topMargin = -i7;
        marginLayoutParams.bottomMargin = -i10;
        this.r0 = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = org.telegram.messenger.p10.s0;
        this.q0 = i7;
        org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.qs.f(this.q0).n(this, org.telegram.messenger.qs.i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.Components.oj0 oj0Var;
        int i11 = this.s;
        if (org.telegram.messenger.g0.Q1()) {
            this.s = 3;
        } else if (getResources().getConfiguration().orientation == 2) {
            this.s = 6;
        } else {
            this.s = 3;
        }
        if (i11 != this.s && (oj0Var = this.d) == this.U) {
            this.r0 = true;
            oj0Var.f();
            this.r0 = false;
        }
        super.onMeasure(i7, i10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.r0) {
            return;
        }
        super.requestLayout();
    }

    public void setBlurredBackgroundDrawableFactory(dh.c cVar) {
        gh.e eVar = new gh.e(null);
        eVar.e = new g2.c(12);
        eVar.f(385875968, 402653183);
        eVar.e(385875968, 402653183);
        eVar.d(0, 0);
        eVar.f = 1.0f;
        eVar.h = 1.0f;
        qz qzVar = this.m0;
        fh.g c10 = cVar.c(qzVar, eVar, false);
        qzVar.b = c10;
        c10.r(org.telegram.messenger.g0.L(11.5f));
        qzVar.b.q(org.telegram.messenger.g0.L(5.0f));
    }

    public void setChatPreviewDelegate(org.telegram.ui.Components.bm0 bm0Var) {
        this.i0 = bm0Var;
    }

    public void setUiCallback(xz xzVar) {
        this.o0 = xzVar;
    }

    public void setUseFromUserAsAvatar(boolean z9) {
        this.p0 = z9;
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        try {
            qz qzVar = this.m0;
            if (qzVar != null) {
                qzVar.updateColors();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // te.b
    public final /* synthetic */ void F(float f10, int i7) {
    }
}

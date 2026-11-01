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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class y00 extends FrameLayout implements org.telegram.ui.ActionBar.k6, org.telegram.messenger.vs, fe.e {
    public static final SpannableStringBuilder[] s0 = new SpannableStringBuilder[3];
    public zf.e0 D;
    public long E;
    public long F;
    public long G;
    public long H;
    public String I;
    public boolean J;
    public final Activity K;
    public final org.telegram.ui.ActionBar.k2 L;
    public boolean M;
    public boolean N;
    public int O;
    public int P;
    public String Q;
    public int R;
    public final r00 S;
    public final s00 T;
    public final w00 U;
    public final t00 V;
    public final v00 W;
    public final fe.b a;
    public final t00 a0;
    public final ag.b1 b;
    public final t00 b0;
    public final org.telegram.ui.Components.ew0 c;
    public final ArrayList c0;
    public org.telegram.ui.Components.tk0 d;
    public final ArrayList d0;
    public i00 e;
    public boolean e0;
    public final ArrayList f;
    public final m4 f0;
    public final l00 g0;
    public final SparseArray h;
    public p00 h0;
    public org.telegram.ui.Components.dn0 i0;
    public final s4.a0 j0;
    public final m00 k0;
    public final e2.f l0;
    public final q00 m0;
    public final ArrayList n;
    public final yy n0;
    public x00 o0;
    public boolean p0;
    public int q0;
    public final HashMap r;
    public boolean r0;
    public int s;
    public int w;
    public String x;
    public String y;

    public y00(org.telegram.ui.ActionBar.k2 k2Var) {
        super(k2Var.getParentActivity());
        this.a = new fe.b(0, this, org.telegram.ui.Components.gr.h, 380L, false);
        this.f = new ArrayList();
        this.h = new SparseArray();
        this.n = new ArrayList();
        this.r = new HashMap();
        this.s = 3;
        this.S = new r00(0, 0L);
        this.c0 = new ArrayList();
        this.d0 = new ArrayList();
        this.f0 = new m4(this, 5);
        this.g0 = new l00(this);
        this.l0 = new e2.f((int[]) null);
        this.n0 = new yy(this, 1);
        this.L = k2Var;
        Activity parentActivity = k2Var.getParentActivity();
        this.K = parentActivity;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, this, null);
        ag.b1 b1Var = new ag.b1(this, parentActivity, 27);
        this.b = b1Var;
        b1Var.setOnItemClickListener(new g(this, 12));
        b1Var.setOnItemLongClickListener(new e(this, 15));
        s4.a0 a0Var = new s4.a0();
        this.j0 = a0Var;
        b1Var.setLayoutManager(a0Var);
        m00 m00Var = new m00(this, parentActivity, 0);
        this.k0 = m00Var;
        addView(m00Var);
        addView(b1Var);
        b1Var.setSectionsType(2);
        b1Var.setSkipDrawSection(true);
        b1Var.setOnScrollListener(new n00(this));
        q00 q00Var = new q00(parentActivity);
        this.m0 = q00Var;
        String u10 = org.telegram.messenger.dd.u((int) (System.currentTimeMillis() / 1000), false);
        if (!TextUtils.equals(q00Var.c, u10)) {
            q00Var.c = u10;
            q00Var.a.t(u10, true, true);
        }
        addView(q00Var, w7.b6.d(-1, 33.0f, 49, 0.0f, -2.0f, 0.0f, 0.0f));
        this.T = new s00(this);
        this.U = new w00(this, getContext());
        this.V = new t00(this, getContext(), 1);
        this.W = new v00(this, getContext());
        this.a0 = new t00(this, getContext(), 4);
        this.b0 = new t00(this, getContext(), 2);
        org.telegram.ui.Components.ew0 ew0Var = new org.telegram.ui.Components.ew0(parentActivity, m00Var, 1, null);
        this.c = ew0Var;
        addView(ew0Var);
        b1Var.setEmptyView(ew0Var);
        ew0Var.setVisibility(8);
        b();
    }

    public static void a(y00 y00Var, org.telegram.messenger.kj kjVar, View view, int i10) {
        if (!y00Var.o0.f()) {
            y00Var.o0.a();
        }
        if (y00Var.o0.f()) {
            y00Var.o0.e(kjVar, view, i10);
        }
    }

    public static CharSequence c(org.telegram.messenger.kj kjVar, boolean z10) {
        return d(kjVar, z10, 0, null);
    }

    public static CharSequence d(org.telegram.messenger.kj kjVar, boolean z10, int i10, TextPaint textPaint) {
        TLRPC.Message message;
        TLRPC.Chat L0;
        TLRPC.Chat L02;
        TLRPC.User user;
        TLRPC.TL_forumTopic f7;
        TLRPC.TL_forumTopic f10;
        int i11;
        if (kjVar == null || (message = kjVar.k) == null) {
            return "";
        }
        if (org.telegram.messenger.kj.b4(message)) {
            ag.h3 c10 = ag.i3.f(kjVar.I1).c(org.telegram.messenger.kj.J1(kjVar.k));
            return c10 == null ? "" : c10.b;
        }
        CharSequence charSequence = null;
        if (kjVar.r4()) {
            return kjVar.Z0 ? org.telegram.messenger.dd.L0(2131745276, null) : kjVar.S0 ? org.telegram.messenger.dd.L0(2131745277, null) : org.telegram.messenger.dd.L0(2131745278, null);
        }
        SpannableStringBuilder[] spannableStringBuilderArr = s0;
        if (spannableStringBuilderArr[i10] == null) {
            spannableStringBuilderArr[i10] = new SpannableStringBuilder(">");
            if (i10 == 0) {
                i11 = R.drawable.attach_arrow_right;
            } else if (i10 == 1) {
                i11 = R.drawable.msg_mini_arrow_mediathin;
            } else {
                if (i10 != 2) {
                    return "";
                }
                i11 = R.drawable.msg_mini_arrow_mediabold;
            }
            org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(i10 == 0 ? 2 : 1, org.telegram.messenger.w0.b.getDrawable(i11).mutate());
            if (i10 == 1 || i10 == 2) {
                dqVar.H = 0.85f;
            }
            SpannableStringBuilder spannableStringBuilder = spannableStringBuilderArr[i10];
            spannableStringBuilder.setSpan(dqVar, 0, spannableStringBuilder.length(), 0);
        }
        TLRPC.Message message2 = kjVar.k;
        if (message2.saved_peer_id != null) {
            if (kjVar.Q1() >= 0) {
                user = org.telegram.messenger.wp.r1(org.telegram.messenger.e20.s0).Z1(Long.valueOf(kjVar.Q1()));
                L0 = null;
            } else if (kjVar.Q1() < 0) {
                L0 = org.telegram.messenger.wp.r1(org.telegram.messenger.e20.s0).L0(Long.valueOf(-kjVar.Q1()));
                user = null;
                L02 = null;
            } else {
                user = null;
                L0 = null;
            }
            L02 = L0;
        } else {
            TLRPC.User Z1 = message2.from_id.user_id != 0 ? org.telegram.messenger.wp.r1(org.telegram.messenger.e20.s0).Z1(Long.valueOf(kjVar.k.from_id.user_id)) : null;
            L0 = kjVar.k.from_id.chat_id != 0 ? org.telegram.messenger.wp.r1(org.telegram.messenger.e20.s0).L0(Long.valueOf(kjVar.k.peer_id.chat_id)) : null;
            if (L0 == null) {
                L0 = kjVar.k.from_id.channel_id != 0 ? org.telegram.messenger.wp.r1(org.telegram.messenger.e20.s0).L0(Long.valueOf(kjVar.k.peer_id.channel_id)) : null;
            }
            L02 = kjVar.k.peer_id.channel_id != 0 ? org.telegram.messenger.wp.r1(org.telegram.messenger.e20.s0).L0(Long.valueOf(kjVar.k.peer_id.channel_id)) : null;
            if (L02 == null) {
                L02 = kjVar.k.peer_id.chat_id != 0 ? org.telegram.messenger.wp.r1(org.telegram.messenger.e20.s0).L0(Long.valueOf(kjVar.k.peer_id.chat_id)) : null;
            }
            if (!org.telegram.messenger.w3.V(L02) && !z10) {
                L02 = null;
            }
            user = Z1;
        }
        if (user != null && L02 != null) {
            CharSequence charSequence2 = L02.title;
            if (org.telegram.messenger.w3.c0(L02) && (f10 = org.telegram.messenger.wp.r1(org.telegram.messenger.e20.s0).r7.f(L02.id, org.telegram.messenger.kj.c2(kjVar.I1, kjVar.k, true, false))) != null) {
                charSequence2 = gg.e.j(f10, null, null);
            }
            CharSequence m10 = org.telegram.messenger.k6.m(charSequence2, textPaint == null ? null : textPaint.getFontMetricsInt(), false, null, 0);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append(org.telegram.messenger.k6.m(org.telegram.messenger.i20.j(user, true), textPaint == null ? null : textPaint.getFontMetricsInt(), false, null, 0)).append((char) 8202).append((CharSequence) spannableStringBuilderArr[i10]).append((char) 8202).append(m10);
            charSequence = spannableStringBuilder2;
        } else if (user != null) {
            charSequence = org.telegram.messenger.k6.m(org.telegram.messenger.i20.p(user), textPaint == null ? null : textPaint.getFontMetricsInt(), false, null, 0);
        } else if (L0 != null) {
            CharSequence charSequence3 = L0.title;
            if (org.telegram.messenger.w3.c0(L0) && (f7 = org.telegram.messenger.wp.r1(org.telegram.messenger.e20.s0).r7.f(L0.id, org.telegram.messenger.kj.c2(kjVar.I1, kjVar.k, true, false))) != null) {
                charSequence3 = gg.e.j(f7, null, null);
            }
            charSequence = org.telegram.messenger.k6.m(charSequence3, textPaint == null ? null : textPaint.getFontMetricsInt(), false, null, 0);
        }
        return charSequence == null ? "" : charSequence;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.c9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.C9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.y9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.x9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.w9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.v9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.u9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.t9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.s9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.q9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.p9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.j9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.i9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.b9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.a9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.W8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.xi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.yi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.K6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.pj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.wi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A6));
    }

    public final void b() {
        float f7 = this.a.e;
        q00 q00Var = this.m0;
        q00Var.setTranslationY((1.0f - f7) * (-org.telegram.messenger.i0.L(24.0f)));
        q00Var.setAlpha(f7);
        q00Var.setVisibility(f7 > 0.0f ? 0 : 4);
    }

    @Override // org.telegram.messenger.vs
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.at.i4) {
            ag.b1 b1Var = this.b;
            int childCount = b1Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                if (b1Var.getChildAt(i12) instanceof org.telegram.ui.Cells.v2) {
                    ((org.telegram.ui.Cells.v2) b1Var.getChildAt(i12)).i0(0, true);
                }
                b1Var.getChildAt(i12).invalidate();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0028, code lost:
    
        if (org.telegram.messenger.w3.S(org.telegram.messenger.e20.s0, r5) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(ArrayList arrayList, long j10) {
        org.telegram.ui.Components.tk0 tk0Var;
        int i10;
        int i11 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList2 = this.f;
            if (i11 >= arrayList2.size()) {
                break;
            }
            org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) arrayList2.get(i11);
            TLRPC.Message message = kjVar.k;
            String str = kjVar.Y;
            long B0 = org.telegram.messenger.kj.B0(message);
            if (B0 < 0) {
                i10 = (int) (-B0);
            }
            i10 = 0;
            if (i10 == j10) {
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    if (kjVar.f1() == ((Integer) arrayList.get(i12)).intValue()) {
                        arrayList2.remove(i11);
                        this.h.remove(kjVar.f1());
                        HashMap hashMap = this.r;
                        ArrayList arrayList3 = (ArrayList) hashMap.get(str);
                        arrayList3.remove(kjVar);
                        if (arrayList3.size() == 0) {
                            this.n.remove(str);
                            hashMap.remove(str);
                        }
                        i11--;
                        this.O--;
                        z10 = true;
                    }
                }
            }
            i11++;
        }
        if (!z10 || (tk0Var = this.d) == null) {
            return;
        }
        tk0Var.f();
    }

    public final void f(int i10, View view, org.telegram.messenger.kj kjVar, int i11) {
        String str;
        if (kjVar == null) {
            return;
        }
        if (this.o0.f()) {
            this.o0.e(kjVar, view, i11);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.v2) {
            this.o0.c(kjVar);
            return;
        }
        int i12 = this.D.d;
        l00 l00Var = this.g0;
        ArrayList arrayList = this.f;
        String str2 = null;
        org.telegram.ui.ActionBar.k2 k2Var = this.L;
        if (i12 == 0) {
            PhotoViewer.v1().N2(null, k2Var, null);
            PhotoViewer.v1().e2(arrayList, i10, 0L, 0L, 0L, l00Var);
            this.R = PhotoViewer.v1().c;
            return;
        }
        if (i12 == 3 || i12 == 5) {
            if (view instanceof org.telegram.ui.Cells.k7) {
                ((org.telegram.ui.Cells.k7) view).a();
                return;
            }
            return;
        }
        if (i12 == 1) {
            if (view instanceof org.telegram.ui.Cells.l7) {
                org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
                TLRPC.Document F0 = kjVar.F0();
                if (!l7Var.G) {
                    if (l7Var.F) {
                        org.telegram.messenger.b8.G(org.telegram.messenger.c.a(org.telegram.messenger.e20.s0).a).f(F0);
                        l7Var.f(true);
                        return;
                    } else {
                        org.telegram.messenger.kj message = l7Var.getMessage();
                        message.P = true;
                        org.telegram.messenger.b8.G(org.telegram.messenger.c.a(org.telegram.messenger.e20.s0).a).X(F0, message, 0, 0);
                        l7Var.f(true);
                        return;
                    }
                }
                if (!kjVar.x()) {
                    org.telegram.messenger.i0.s2(kjVar, this.K, k2Var);
                    return;
                }
                PhotoViewer.v1().N2(null, k2Var, null);
                int indexOf = arrayList.indexOf(kjVar);
                if (indexOf >= 0) {
                    PhotoViewer.v1().N2(null, k2Var, null);
                    PhotoViewer.v1().e2(arrayList, indexOf, 0L, 0L, 0L, l00Var);
                    this.R = PhotoViewer.v1().c;
                    return;
                } else {
                    ArrayList j10 = org.telegram.messenger.m5.j(kjVar);
                    PhotoViewer.v1().N2(null, k2Var, null);
                    PhotoViewer.v1().e2(j10, 0, 0L, 0L, 0L, l00Var);
                    this.R = PhotoViewer.v1().c;
                    return;
                }
            }
            return;
        }
        if (i12 == 2) {
            try {
                TLRPC.MessageMedia messageMedia = kjVar.k.media;
                TLRPC.WebPage webPage = messageMedia != null ? messageMedia.webpage : null;
                if (webPage == null || (webPage instanceof TLRPC.TL_webPageEmpty)) {
                    str = null;
                } else {
                    if (webPage.cached_page != null) {
                        LaunchActivity launchActivity = LaunchActivity.I1;
                        if (launchActivity == null || launchActivity.N() == null || LaunchActivity.I1.N().k(kjVar) == null) {
                            k2Var.createArticleViewer(false).L(kjVar, null, null, null);
                            return;
                        }
                        return;
                    }
                    String str3 = webPage.embed_url;
                    if (str3 != null && str3.length() != 0) {
                        org.telegram.ui.Components.hu.K0(this.L, kjVar, this.g0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                        return;
                    }
                    str = webPage.url;
                }
                if (str == null) {
                    ArrayList arrayList2 = ((org.telegram.ui.Cells.o7) view).E;
                    if (arrayList2.size() > 0) {
                        str2 = ((CharSequence) arrayList2.get(0)).toString();
                    }
                    str = str2;
                }
                if (str != null) {
                    g(str);
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }

    public final void g(String str) {
        if (org.telegram.messenger.i0.I3(str)) {
            org.telegram.ui.Components.s4.p0(this.L, str, true, true);
        } else {
            gf.f.r(this.K, str);
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.c7> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.c7> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.a7));
        int i10 = org.telegram.ui.ActionBar.t6.i7;
        ag.b1 b1Var = this.b;
        arrayList.add(new org.telegram.ui.ActionBar.c7(b1Var, TLObject.FLAG_13, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        int i11 = org.telegram.ui.ActionBar.t6.k7;
        arrayList.add(new org.telegram.ui.ActionBar.c7(b1Var, TLObject.FLAG_14, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(b1Var, 8, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.nj));
        arrayList.add(new org.telegram.ui.ActionBar.c7(b1Var, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(b1Var, TLObject.FLAG_13, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(b1Var, TLObject.FLAG_14, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(b1Var, TLObject.FLAG_13, new Class[]{org.telegram.ui.Cells.o7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(b1Var, TLObject.FLAG_14, new Class[]{org.telegram.ui.Cells.o7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        org.telegram.ui.Components.ew0 ew0Var = this.c;
        arrayList.add(new org.telegram.ui.ActionBar.c7(ew0Var.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(ew0Var.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.y6));
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Runnable, org.telegram.ui.i00] */
    public final void h(final long j10, final long j11, final long j12, final long j13, final zf.e0 e0Var, final boolean z10, String str, boolean z11) {
        ArrayList arrayList;
        final String str2 = str == null ? "" : str;
        Locale locale = Locale.ENGLISH;
        final String str3 = j10 + j11 + j12 + j13 + (e0Var == null ? -1 : e0Var.d) + str2 + z10;
        String str4 = this.y;
        boolean z12 = str4 != null && str4.equals(str3);
        boolean z13 = !z12 && z11;
        this.D = e0Var;
        this.E = j10;
        this.F = j11;
        this.H = j12;
        this.G = j13;
        this.I = str2;
        this.J = z10;
        i00 i00Var = this.e;
        if (i00Var != null) {
            org.telegram.messenger.i0.r(i00Var);
        }
        m4 m4Var = this.f0;
        org.telegram.messenger.i0.r(m4Var);
        if (z12 && z11) {
            return;
        }
        ArrayList arrayList2 = this.d0;
        final boolean z14 = z12;
        ArrayList arrayList3 = this.c0;
        org.telegram.ui.Components.ew0 ew0Var = this.c;
        ArrayList arrayList4 = this.f;
        if (z13 || (e0Var == null && j11 == 0 && j10 == 0 && j12 == 0 && j13 == 0)) {
            arrayList4.clear();
            this.n.clear();
            this.r.clear();
            this.M = true;
            ew0Var.setVisibility(0);
            org.telegram.ui.Components.tk0 tk0Var = this.d;
            if (tk0Var != null) {
                tk0Var.f();
            }
            this.P++;
            ag.b1 b1Var = this.b;
            if (b1Var.getPinnedHeader() != null) {
                arrayList = arrayList4;
                b1Var.getPinnedHeader().setAlpha(0.0f);
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
        this.M = true;
        org.telegram.ui.Components.tk0 tk0Var2 = this.d;
        if (tk0Var2 != null) {
            tk0Var2.f();
        }
        if (!z14) {
            m4Var.run();
            ew0Var.e(true, !z11);
        }
        if (TextUtils.isEmpty(str2)) {
            arrayList2.clear();
            arrayList3.clear();
            p00 p00Var = this.h0;
            if (p00Var != null) {
                ((hv) p00Var).k(false, null, null, false);
            }
        }
        final int i10 = this.P + 1;
        this.P = i10;
        final int i11 = org.telegram.messenger.e20.s0;
        ?? r02 = new Runnable() { // from class: org.telegram.ui.i00
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                int i12;
                String str5;
                zf.e0 e0Var2;
                int i13;
                long j14;
                boolean z15;
                long j15;
                int i14;
                int i15;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal;
                final y00 y00Var = y00.this;
                ArrayList arrayList5 = y00Var.f;
                final long j16 = j10;
                long j17 = j11;
                String str6 = str2;
                zf.e0 e0Var3 = e0Var;
                int i16 = i11;
                long j18 = j12;
                long j19 = j13;
                boolean z16 = z14;
                ArrayList arrayList6 = null;
                if (j16 == 0 || j17 != 0) {
                    boolean isEmpty = TextUtils.isEmpty(str6);
                    boolean z17 = z10;
                    if (isEmpty) {
                        i12 = i16;
                        str5 = str6;
                        e0Var2 = e0Var3;
                        i13 = z17 ? 1 : 0;
                        j14 = j18;
                        z15 = z16;
                        j15 = j19;
                        i14 = 20;
                    } else {
                        j14 = j18;
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = new ArrayList();
                        z15 = z16;
                        ArrayList arrayList9 = new ArrayList();
                        org.telegram.messenger.is a02 = org.telegram.messenger.is.a0(i16);
                        j15 = j19;
                        i12 = i16;
                        str5 = str6;
                        e0Var2 = e0Var3;
                        i14 = 20;
                        a02.M0(0, str5, arrayList7, arrayList8, arrayList9, null, z17 ? 1 : 0);
                        i13 = z17 ? 1 : 0;
                        arrayList6 = arrayList7;
                    }
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = new TLRPC.TL_messages_searchGlobal();
                    tL_messages_searchGlobal2.limit = i14;
                    tL_messages_searchGlobal2.q = str5;
                    tL_messages_searchGlobal2.filter = e0Var2 == null ? new TLRPC.TL_inputMessagesFilterEmpty() : e0Var2.e;
                    tL_messages_searchGlobal2.community = org.telegram.messenger.wp.r1(i12).g1(j17);
                    if (j14 > 0) {
                        tL_messages_searchGlobal2.min_date = (int) (j14 / 1000);
                    }
                    if (j15 > 0) {
                        tL_messages_searchGlobal2.max_date = (int) (j15 / 1000);
                    }
                    if (z15 && str5.equals(y00Var.x) && !arrayList5.isEmpty()) {
                        i15 = 1;
                        org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) i0.a.g(1, arrayList5);
                        tL_messages_searchGlobal2.offset_id = kjVar.f1();
                        tL_messages_searchGlobal2.offset_rate = y00Var.w;
                        tL_messages_searchGlobal2.offset_peer = org.telegram.messenger.wp.r1(i12).i1(org.telegram.messenger.kj.C1(kjVar.k.peer_id));
                    } else {
                        i15 = 1;
                        tL_messages_searchGlobal2.offset_rate = 0;
                        tL_messages_searchGlobal2.offset_id = 0;
                        tL_messages_searchGlobal2.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    }
                    tL_messages_searchGlobal2.flags |= i15;
                    tL_messages_searchGlobal2.folder_id = i13;
                    tL_messages_searchGlobal = tL_messages_searchGlobal2;
                } else {
                    TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                    tL_messages_search.q = str6;
                    tL_messages_search.limit = 20;
                    tL_messages_search.filter = e0Var3 == null ? new TLRPC.TL_inputMessagesFilterEmpty() : e0Var3.e;
                    tL_messages_search.peer = org.telegram.messenger.wp.r1(org.telegram.messenger.c.a(i16).a).i1(j16);
                    if (j18 > 0) {
                        tL_messages_search.min_date = (int) (j18 / 1000);
                    }
                    if (j19 > 0) {
                        tL_messages_search.max_date = (int) (j19 / 1000);
                    }
                    if (z16 && str6.equals(y00Var.x) && !arrayList5.isEmpty()) {
                        tL_messages_search.offset_id = ((org.telegram.messenger.kj) i0.a.g(1, arrayList5)).f1();
                    } else {
                        tL_messages_search.offset_id = 0;
                    }
                    i12 = i16;
                    str5 = str6;
                    e0Var2 = e0Var3;
                    j14 = j18;
                    tL_messages_searchGlobal = tL_messages_search;
                    z15 = z16;
                }
                y00Var.x = str5;
                y00Var.y = str3;
                final ArrayList arrayList10 = new ArrayList();
                zf.g0.B1(y00Var.x, arrayList10);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i12);
                final boolean z18 = z15;
                final int i17 = i10;
                final zf.e0 e0Var4 = e0Var2;
                final String str7 = str5;
                final int i18 = i12;
                final ArrayList arrayList11 = arrayList6;
                final long j20 = j14;
                connectionsManager.sendRequestTyped(tL_messages_searchGlobal, new org.telegram.messenger.k20() { // from class: org.telegram.ui.j00
                    @Override // org.telegram.messenger.k20
                    public final void a(Object obj, Object obj2) {
                        final TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                        final TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        final ArrayList arrayList12 = new ArrayList();
                        final int i19 = i18;
                        final String str8 = str7;
                        if (tL_error == null) {
                            int size = messages_messages.messages.size();
                            for (int i20 = 0; i20 < size; i20++) {
                                org.telegram.messenger.kj kjVar2 = new org.telegram.messenger.kj(i19, messages_messages.messages.get(i20), false, true);
                                kjVar2.J5(str8, true);
                                arrayList12.add(kjVar2);
                            }
                        }
                        final y00 y00Var2 = y00.this;
                        final int i21 = i17;
                        final boolean z19 = z18;
                        final zf.e0 e0Var5 = e0Var4;
                        final long j21 = j16;
                        final long j22 = j20;
                        final ArrayList arrayList13 = arrayList11;
                        final ArrayList arrayList14 = arrayList10;
                        org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.k00
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
                                int i22;
                                ?? r12;
                                p00 p00Var2;
                                ArrayList arrayList15;
                                ArrayList arrayList16;
                                SparseArray sparseArray;
                                ?? r16;
                                char c10;
                                y00 y00Var3 = y00.this;
                                s00 s00Var = y00Var3.T;
                                w00 w00Var = y00Var3.U;
                                ArrayList arrayList17 = y00Var3.n;
                                SparseArray sparseArray2 = y00Var3.h;
                                ArrayList arrayList18 = y00Var3.d0;
                                HashMap hashMap = y00Var3.r;
                                ArrayList arrayList19 = y00Var3.f;
                                ArrayList arrayList20 = y00Var3.c0;
                                ag.b1 b1Var2 = y00Var3.b;
                                org.telegram.ui.Components.ew0 ew0Var2 = y00Var3.c;
                                if (i21 != y00Var3.P) {
                                    return;
                                }
                                y00Var3.M = false;
                                if (tL_error != null) {
                                    nh.p pVar = ew0Var2.d;
                                    org.telegram.ui.Components.p80 p80Var = ew0Var2.e;
                                    pVar.setText(org.telegram.messenger.dd.L0(2131745817, null));
                                    p80Var.setVisibility(0);
                                    p80Var.setText(org.telegram.messenger.dd.L0(2131745824, null));
                                    ew0Var2.e(false, true);
                                    return;
                                }
                                ew0Var2.e(false, true);
                                nh.p pVar2 = ew0Var2.d;
                                org.telegram.ui.Components.p80 p80Var2 = ew0Var2.e;
                                TLRPC.messages_Messages messages_messages2 = messages_messages;
                                y00Var3.w = messages_messages2.next_rate;
                                int i23 = i19;
                                org.telegram.messenger.is.a0(i23).m1(messages_messages2.users, messages_messages2.chats, true, true);
                                org.telegram.messenger.wp.r1(i23).V3(messages_messages2.users, false);
                                org.telegram.messenger.wp.r1(i23).P3(messages_messages2.chats, false);
                                boolean z20 = z19;
                                if (!z20) {
                                    arrayList19.clear();
                                    sparseArray2.clear();
                                    arrayList17.clear();
                                    hashMap.clear();
                                }
                                y00Var3.O = messages_messages2.count;
                                String str9 = str8;
                                y00Var3.Q = str9;
                                ArrayList arrayList21 = arrayList12;
                                int size2 = arrayList21.size();
                                int i24 = 0;
                                while (i24 < size2) {
                                    boolean z21 = z20;
                                    org.telegram.messenger.kj kjVar3 = (org.telegram.messenger.kj) arrayList21.get(i24);
                                    ArrayList arrayList22 = arrayList21;
                                    String str10 = kjVar3.Y;
                                    ArrayList arrayList23 = (ArrayList) hashMap.get(str10);
                                    int i25 = i24;
                                    if (arrayList23 == null) {
                                        arrayList15 = new ArrayList();
                                        hashMap.put(str10, arrayList15);
                                        arrayList17.add(str10);
                                    } else {
                                        arrayList15 = arrayList23;
                                    }
                                    arrayList15.add(kjVar3);
                                    arrayList19.add(kjVar3);
                                    sparseArray2.put(kjVar3.f1(), kjVar3);
                                    if (PhotoViewer.v1().U1()) {
                                        PhotoViewer v12 = PhotoViewer.v1();
                                        int i26 = y00Var3.R;
                                        arrayList16 = arrayList17;
                                        SparseArray[] sparseArrayArr = v12.Z6;
                                        ArrayList arrayList24 = v12.Y6;
                                        sparseArray = sparseArray2;
                                        if (i26 == v12.c) {
                                            if (sparseArrayArr[0].indexOfKey(kjVar3.f1()) < 0) {
                                                if (v12.Q5) {
                                                    arrayList24.add(kjVar3);
                                                    c10 = 0;
                                                } else {
                                                    c10 = 0;
                                                    arrayList24.add(0, kjVar3);
                                                }
                                                r16 = c10;
                                                sparseArrayArr[c10].put(kjVar3.f1(), kjVar3);
                                            } else {
                                                r16 = 0;
                                            }
                                            v12.P5[r16] = arrayList24.size() == v12.J5 ? true : r16;
                                            v12.G2();
                                        }
                                    } else {
                                        arrayList16 = arrayList17;
                                        sparseArray = sparseArray2;
                                    }
                                    i24 = i25 + 1;
                                    arrayList21 = arrayList22;
                                    z20 = z21;
                                    arrayList17 = arrayList16;
                                    sparseArray2 = sparseArray;
                                }
                                boolean z22 = z20;
                                if (arrayList19.size() > y00Var3.O) {
                                    y00Var3.O = arrayList19.size();
                                }
                                y00Var3.N = arrayList19.size() >= y00Var3.O;
                                boolean isEmpty2 = arrayList19.isEmpty();
                                zf.e0 e0Var6 = e0Var5;
                                if (isEmpty2) {
                                    if (e0Var6 == null) {
                                        pVar2.setText(org.telegram.messenger.dd.L0(2131745817, null));
                                        p80Var2.setVisibility(8);
                                    } else if (TextUtils.isEmpty(y00Var3.Q) && j21 == 0 && j22 == 0) {
                                        pVar2.setText(org.telegram.messenger.dd.L0(2131745818, null));
                                        int i27 = e0Var6.d;
                                        String L0 = i27 == 1 ? org.telegram.messenger.dd.L0(2131745823, null) : i27 == 0 ? org.telegram.messenger.dd.L0(2131745821, null) : i27 == 2 ? org.telegram.messenger.dd.L0(2131745822, null) : i27 == 3 ? org.telegram.messenger.dd.L0(2131745820, null) : org.telegram.messenger.dd.L0(2131745819, null);
                                        p80Var2.setVisibility(0);
                                        p80Var2.setText(L0);
                                    } else {
                                        pVar2.setText(org.telegram.messenger.dd.L0(2131745817, null));
                                        p80Var2.setVisibility(0);
                                        p80Var2.setText(org.telegram.messenger.dd.L0(2131745824, null));
                                    }
                                }
                                if (e0Var6 != null) {
                                    int i28 = e0Var6.d;
                                    if (i28 != 0) {
                                        if (i28 == 1) {
                                            y00Var3.d = y00Var3.V;
                                        } else if (i28 == 2) {
                                            y00Var3.d = y00Var3.W;
                                        } else if (i28 == 3) {
                                            y00Var3.d = y00Var3.a0;
                                        } else if (i28 == 5) {
                                            y00Var3.d = y00Var3.b0;
                                        }
                                    } else if (TextUtils.isEmpty(y00Var3.Q)) {
                                        y00Var3.d = w00Var;
                                    } else {
                                        y00Var3.d = s00Var;
                                    }
                                } else {
                                    y00Var3.d = s00Var;
                                }
                                s4.g0 adapter = b1Var2.getAdapter();
                                org.telegram.ui.Components.tk0 tk0Var3 = y00Var3.d;
                                if (adapter != tk0Var3) {
                                    b1Var2.setAdapter(tk0Var3);
                                }
                                if (z22) {
                                    view = null;
                                    i22 = 0;
                                } else {
                                    arrayList20.clear();
                                    ArrayList arrayList25 = arrayList13;
                                    if (arrayList25 != null) {
                                        arrayList20.addAll(arrayList25);
                                    }
                                    if (str9.length() >= 3 && (org.telegram.messenger.dd.L0(2131745918, null).toLowerCase().startsWith(str9) || "saved messages".startsWith(str9))) {
                                        for (int i29 = 0; i29 < arrayList20.size(); i29++) {
                                            if (!(arrayList20.get(i29) instanceof TLRPC.User) || org.telegram.messenger.e20.i(org.telegram.messenger.e20.s0).f().id != ((TLRPC.User) arrayList20.get(i29)).id) {
                                            }
                                        }
                                        r12 = 0;
                                        arrayList20.add(0, org.telegram.messenger.e20.i(org.telegram.messenger.e20.s0).f());
                                        arrayList18.clear();
                                        arrayList18.addAll(arrayList14);
                                        y00Var3.e0 = r12;
                                        if (str9.length() < 3) {
                                            view = null;
                                            if (org.telegram.messenger.dd.L0(2131754150, null).toLowerCase().startsWith(str9) || "archive".startsWith(str9)) {
                                                y00Var3.e0 = true;
                                            }
                                        } else {
                                            view = null;
                                        }
                                        p00Var2 = y00Var3.h0;
                                        i22 = r12;
                                        if (p00Var2 != null) {
                                            ((hv) p00Var2).k(TextUtils.isEmpty(y00Var3.Q), arrayList20, arrayList18, y00Var3.e0);
                                            i22 = r12;
                                        }
                                    }
                                    r12 = 0;
                                    arrayList18.clear();
                                    arrayList18.addAll(arrayList14);
                                    y00Var3.e0 = r12;
                                    if (str9.length() < 3) {
                                    }
                                    p00Var2 = y00Var3.h0;
                                    i22 = r12;
                                    if (p00Var2 != null) {
                                    }
                                }
                                int i30 = -1;
                                View view2 = view;
                                for (int i31 = i22; i31 < size2; i31++) {
                                    View childAt = b1Var2.getChildAt(i31);
                                    if (childAt instanceof org.telegram.ui.Components.zz) {
                                        i30 = RecyclerView.R(childAt);
                                        view2 = childAt;
                                    }
                                }
                                if (view2 != null) {
                                    b1Var2.removeView(view2);
                                }
                                if ((y00Var3.k0.getVisibility() == 0 && b1Var2.getChildCount() == 0) || (b1Var2.getAdapter() != w00Var && view2 != null)) {
                                    y00Var3.getViewTreeObserver().addOnPreDrawListener(new uq(y00Var3, (org.telegram.ui.Components.zz) view2, i30, 3));
                                }
                                y00Var3.d.f();
                            }
                        });
                    }
                });
            }
        };
        this.e = r02;
        org.telegram.messenger.i0.h3(r02, (!z14 || arrayList.isEmpty()) ? 350L : 0L);
        m00 m00Var = this.k0;
        if (e0Var == null) {
            m00Var.setViewType(1);
            return;
        }
        int i12 = e0Var.d;
        if (i12 == 0) {
            if (TextUtils.isEmpty(this.I)) {
                m00Var.setViewType(2);
                return;
            } else {
                m00Var.setViewType(1);
                return;
            }
        }
        if (i12 == 1) {
            m00Var.setViewType(3);
            return;
        }
        if (i12 == 3 || i12 == 5) {
            m00Var.setViewType(4);
        } else if (i12 == 2) {
            m00Var.setViewType(5);
        }
    }

    public final void i(p00 p00Var, boolean z10) {
        this.h0 = p00Var;
        if (!z10 || p00Var == null) {
            return;
        }
        ArrayList arrayList = this.c0;
        if (arrayList.isEmpty()) {
            return;
        }
        ((hv) p00Var).k(false, arrayList, this.d0, this.e0);
    }

    public final void j(int i10, int i11, boolean z10) {
        setClipToPadding(false);
        this.r0 = z10;
        setPadding(0, i10, 0, i11);
        ag.b1 b1Var = this.b;
        if (z10) {
            b1Var.q1(0, i10, 0, i11);
        } else {
            b1Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) b1Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
        this.r0 = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = org.telegram.messenger.e20.s0;
        this.q0 = i10;
        org.telegram.messenger.at.f(i10).c(this, org.telegram.messenger.at.i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.at.f(this.q0).n(this, org.telegram.messenger.at.i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.Components.tk0 tk0Var;
        int i12 = this.s;
        if (org.telegram.messenger.i0.Q1()) {
            this.s = 3;
        } else if (getResources().getConfiguration().orientation == 2) {
            this.s = 6;
        } else {
            this.s = 3;
        }
        if (i12 != this.s && (tk0Var = this.d) == this.U) {
            this.r0 = true;
            tk0Var.f();
            this.r0 = false;
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.r0) {
            return;
        }
        super.requestLayout();
    }

    public void setBlurredBackgroundDrawableFactory(tg.b bVar) {
        wg.d dVar = new wg.d(null);
        dVar.e = new xg.a(3);
        dVar.f(385875968, 402653183);
        dVar.e(385875968, 402653183);
        dVar.d(0, 0);
        dVar.f = 1.0f;
        dVar.h = 1.0f;
        q00 q00Var = this.m0;
        vg.f c10 = bVar.c(q00Var, dVar, false);
        q00Var.b = c10;
        c10.q(org.telegram.messenger.i0.L(11.5f));
        q00Var.b.p(org.telegram.messenger.i0.L(5.0f));
    }

    public void setChatPreviewDelegate(org.telegram.ui.Components.dn0 dn0Var) {
        this.i0 = dn0Var;
    }

    public void setUiCallback(x00 x00Var) {
        this.o0 = x00Var;
    }

    public void setUseFromUserAsAvatar(boolean z10) {
        this.p0 = z10;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            q00 q00Var = this.m0;
            if (q00Var != null) {
                q00Var.updateColors();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // fe.e
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        if (i10 == 0) {
            b();
        }
    }

    @Override // fe.e
    public final /* synthetic */ void E(float f7, int i10) {
    }
}

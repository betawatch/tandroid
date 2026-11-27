// default package

import android.app.Activity;
import android.content.Context;
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
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class yg4 extends FrameLayout implements snb, fn7, s84 {
    public static final SpannableStringBuilder[] t0 = new SpannableStringBuilder[3];
    public ph4 E;
    public long F;
    public long G;
    public long H;
    public long I;
    public String J;
    public boolean K;
    public final Activity L;
    public final e M;
    public boolean N;
    public boolean O;
    public int P;
    public int Q;
    public String R;
    public int S;
    public final qg4 T;
    public final rg4 U;
    public final wg4 V;
    public final tg4 W;
    public final fm0 a;
    public final vg4 a0;
    public final gu b;
    public final tg4 b0;
    public final z2b c;
    public final tg4 c0;
    public c79 d;
    public final ArrayList d0;
    public hg4 e;
    public final ArrayList e0;
    public final ArrayList f;
    public boolean f0;
    public final zz3 g0;
    public final SparseArray h;
    public final kg4 h0;
    public og4 i0;
    public jx9 j0;
    public final x46 k0;
    public final lg4 l0;
    public final pn m0;
    public final ArrayList n;
    public final pg4 n0;
    public final lw3 o0;
    public xg4 p0;
    public boolean q0;
    public final HashMap r;
    public int r0;
    public byte s;
    public boolean s0;
    public int w;
    public String x;
    public String y;

    public yg4(e eVar) {
        super(eVar.getParentActivity());
        this.a = new fm0(0, this, k43.h, 380L, false);
        this.f = new ArrayList();
        this.h = new SparseArray();
        this.n = new ArrayList();
        this.r = new HashMap();
        this.s = (byte) 3;
        this.T = new qg4(0, 0L);
        this.d0 = new ArrayList();
        this.e0 = new ArrayList();
        this.g0 = new zz3(this, (byte) 3);
        this.h0 = new kg4(this);
        this.m0 = new pn(null);
        this.o0 = new lw3((Object) this, (byte) 24);
        this.M = eVar;
        Activity parentActivity = eVar.getParentActivity();
        this.L = parentActivity;
        yob.h(aob.d6, null, this);
        gu guVar = new gu((byte) 19, (Context) parentActivity, (Object) this);
        this.b = guVar;
        byte b = 1;
        guVar.setOnItemClickListener(new bwc(this, b));
        guVar.setOnItemLongClickListener(new v34(this, b));
        x46 x46Var = new x46();
        this.k0 = x46Var;
        guVar.setLayoutManager(x46Var);
        lg4 lg4Var = new lg4((byte) 0, parentActivity, this);
        this.l0 = lg4Var;
        addView(lg4Var);
        addView(guVar);
        guVar.setSectionsType(2);
        guVar.setSkipDrawSection(true);
        guVar.setOnScrollListener(new mg4(this));
        pg4 pg4Var = new pg4(parentActivity);
        this.n0 = pg4Var;
        String u = ob6.u((int) (System.currentTimeMillis() / 1000), false);
        if (!TextUtils.equals(pg4Var.c, u)) {
            pg4Var.c = u;
            pg4Var.a.t(u, true, true);
        }
        addView(pg4Var, tre.d(-1, 33.0f, 49, 0.0f, -2.0f, 0.0f, 0.0f));
        this.U = new rg4(this);
        this.V = new wg4(this, getContext());
        this.W = new tg4(this, getContext(), 1);
        this.a0 = new vg4(this, getContext());
        this.b0 = new tg4(this, getContext(), 4);
        this.c0 = new tg4(this, getContext(), 2);
        z2b z2bVar = new z2b(parentActivity, lg4Var, 1, null);
        this.c = z2bVar;
        addView(z2bVar);
        guVar.setEmptyView(z2bVar);
        z2bVar.setVisibility(8);
        a();
    }

    public static CharSequence b(r47 r47Var, boolean z) {
        return c(r47Var, z, 0, null);
    }

    public static CharSequence c(r47 r47Var, boolean z, int i, TextPaint textPaint) {
        TLRPC.Message message;
        TLRPC.Chat M0;
        TLRPC.Chat M02;
        TLRPC.User user;
        TLRPC.TL_forumTopic f;
        TLRPC.TL_forumTopic f2;
        int i2;
        if (r47Var == null || (message = r47Var.k) == null) {
            return "";
        }
        if (r47.a4(message)) {
            a19 c = b19.f(r47Var.K1).c(r47.I1(r47Var.k));
            return c != null ? c.b : "";
        }
        CharSequence charSequence = null;
        if (r47Var.q4()) {
            return r47Var.b1 ? ob6.M0(2131744915, null) : r47Var.U0 ? ob6.M0(2131744916, null) : ob6.M0(2131744917, null);
        }
        SpannableStringBuilder[] spannableStringBuilderArr = t0;
        if (spannableStringBuilderArr[i] == null) {
            spannableStringBuilderArr[i] = new SpannableStringBuilder(">");
            if (i == 0) {
                i2 = R.drawable.attach_arrow_right;
            } else if (i == 1) {
                i2 = R.drawable.msg_mini_arrow_mediathin;
            } else {
                if (i != 2) {
                    return "";
                }
                i2 = R.drawable.msg_mini_arrow_mediabold;
            }
            wm2 wm2Var = new wm2(i == 0 ? 2 : 1, a.b.getDrawable(i2).mutate());
            if (i == 1 || i == 2) {
                wm2Var.I = 0.85f;
            }
            SpannableStringBuilder spannableStringBuilder = spannableStringBuilderArr[i];
            spannableStringBuilder.setSpan(wm2Var, 0, spannableStringBuilder.length(), 0);
        }
        TLRPC.Message message2 = r47Var.k;
        if (message2.saved_peer_id != null) {
            if (r47Var.P1() >= 0) {
                user = uc7.s1(yac.t0).X1(Long.valueOf(r47Var.P1()));
                M0 = null;
            } else if (r47Var.P1() < 0) {
                M0 = uc7.s1(yac.t0).M0(Long.valueOf(-r47Var.P1()));
                user = null;
                M02 = null;
            } else {
                user = null;
                M0 = null;
            }
            M02 = M0;
        } else {
            TLRPC.User X1 = message2.from_id.user_id != 0 ? uc7.s1(yac.t0).X1(Long.valueOf(r47Var.k.from_id.user_id)) : null;
            M0 = r47Var.k.from_id.chat_id != 0 ? uc7.s1(yac.t0).M0(Long.valueOf(r47Var.k.peer_id.chat_id)) : null;
            if (M0 == null) {
                M0 = r47Var.k.from_id.channel_id != 0 ? uc7.s1(yac.t0).M0(Long.valueOf(r47Var.k.peer_id.channel_id)) : null;
            }
            M02 = r47Var.k.peer_id.channel_id != 0 ? uc7.s1(yac.t0).M0(Long.valueOf(r47Var.k.peer_id.channel_id)) : null;
            if (M02 == null) {
                M02 = r47Var.k.peer_id.chat_id != 0 ? uc7.s1(yac.t0).M0(Long.valueOf(r47Var.k.peer_id.chat_id)) : null;
            }
            if (!xc2.V(M02) && !z) {
                M02 = null;
            }
            user = X1;
        }
        if (user != null) {
            if (M02 != null) {
                CharSequence charSequence2 = M02.title;
                if (xc2.c0(M02) && (f2 = uc7.s1(yac.t0).h4.f(M02.id, r47.b2(r47Var.K1, r47Var.k, true, false))) != null) {
                    charSequence2 = ro4.k(f2, null, null);
                }
                CharSequence m = pv3.m(charSequence2, textPaint == null ? null : textPaint.getFontMetricsInt(), false, null, 0);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append(pv3.m(lbc.k(user, true), textPaint == null ? null : textPaint.getFontMetricsInt(), false, null, 0)).append((char) 8202).append((CharSequence) spannableStringBuilderArr[i]).append((char) 8202).append(m);
                charSequence = spannableStringBuilder2;
            } else {
                charSequence = pv3.m(lbc.r(user), textPaint == null ? null : textPaint.getFontMetricsInt(), false, null, 0);
            }
        } else if (M0 != null) {
            CharSequence charSequence3 = M0.title;
            if (xc2.c0(M0) && (f = uc7.s1(yac.t0).h4.f(M0.id, r47.b2(r47Var.K1, r47Var.k, true, false))) != null) {
                charSequence3 = ro4.k(f, null, null);
            }
            charSequence = pv3.m(charSequence3, textPaint == null ? null : textPaint.getFontMetricsInt(), false, null, 0);
        }
        return charSequence != null ? charSequence : "";
    }

    public final void a() {
        float f = this.a.e;
        pg4 pg4Var = this.n0;
        pg4Var.setTranslationY((1.0f - f) * (-hl.L(24.0f)));
        pg4Var.setAlpha(f);
        pg4Var.setVisibility(f > 0.0f ? 0 : 4);
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.e7));
        hashSet.add(Integer.valueOf(aob.f7));
        hashSet.add(Integer.valueOf(aob.k7));
        hashSet.add(Integer.valueOf(aob.T8));
        hashSet.add(Integer.valueOf(aob.c9));
        hashSet.add(Integer.valueOf(aob.d9));
        hashSet.add(Integer.valueOf(aob.C9));
        hashSet.add(Integer.valueOf(aob.B9));
        hashSet.add(Integer.valueOf(aob.z9));
        hashSet.add(Integer.valueOf(aob.A9));
        hashSet.add(Integer.valueOf(aob.y9));
        hashSet.add(Integer.valueOf(aob.x9));
        hashSet.add(Integer.valueOf(aob.w9));
        hashSet.add(Integer.valueOf(aob.v9));
        hashSet.add(Integer.valueOf(aob.u9));
        hashSet.add(Integer.valueOf(aob.t9));
        hashSet.add(Integer.valueOf(aob.s9));
        hashSet.add(Integer.valueOf(aob.q9));
        hashSet.add(Integer.valueOf(aob.p9));
        hashSet.add(Integer.valueOf(aob.j9));
        hashSet.add(Integer.valueOf(aob.m9));
        hashSet.add(Integer.valueOf(aob.g9));
        hashSet.add(Integer.valueOf(aob.i9));
        hashSet.add(Integer.valueOf(aob.Z8));
        hashSet.add(Integer.valueOf(aob.X8));
        hashSet.add(Integer.valueOf(aob.b9));
        hashSet.add(Integer.valueOf(aob.a9));
        hashSet.add(Integer.valueOf(aob.W8));
        hashSet.add(Integer.valueOf(aob.V8));
        hashSet.add(Integer.valueOf(aob.U8));
        hashSet.add(Integer.valueOf(aob.J7));
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.Ai));
        hashSet.add(Integer.valueOf(aob.Bi));
        hashSet.add(Integer.valueOf(aob.K6));
        hashSet.add(Integer.valueOf(aob.J6));
        hashSet.add(Integer.valueOf(aob.z6));
        hashSet.add(Integer.valueOf(aob.sj));
        hashSet.add(Integer.valueOf(aob.zi));
        hashSet.add(Integer.valueOf(aob.A6));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0028, code lost:
    
        if (xc2.S(yac.t0, r5) == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(ArrayList arrayList, long j) {
        c79 c79Var;
        int i;
        int i2 = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList2 = this.f;
            if (i2 >= arrayList2.size()) {
                break;
            }
            r47 r47Var = (r47) arrayList2.get(i2);
            TLRPC.Message message = r47Var.k;
            String str = r47Var.Y;
            long B0 = r47.B0(message);
            if (B0 < 0) {
                i = (int) (-B0);
            }
            i = 0;
            if (i == j) {
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    if (r47Var.e1() == ((Integer) arrayList.get(i3)).intValue()) {
                        arrayList2.remove(i2);
                        this.h.remove(r47Var.e1());
                        HashMap hashMap = this.r;
                        ArrayList arrayList3 = (ArrayList) hashMap.get(str);
                        arrayList3.remove(r47Var);
                        if (arrayList3.size() == 0) {
                            this.n.remove(str);
                            hashMap.remove(str);
                        }
                        i2--;
                        this.P--;
                        z = true;
                    }
                }
            }
            i2++;
        }
        if (!z || (c79Var = this.d) == null) {
            return;
        }
        c79Var.f();
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.l4) {
            gu guVar = this.b;
            int childCount = guVar.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                if (guVar.getChildAt(i3) instanceof of3) {
                    ((of3) guVar.getChildAt(i3)).j0(0, true);
                }
                guVar.getChildAt(i3).invalidate();
            }
        }
    }

    public final void e(int i, View view, r47 r47Var, int i2) {
        String str;
        if (r47Var != null) {
            if (this.p0.u()) {
                this.p0.h(r47Var, view, i2);
                return;
            }
            if (view instanceof of3) {
                this.p0.r(r47Var);
                return;
            }
            byte b = this.E.d;
            kg4 kg4Var = this.h0;
            ArrayList arrayList = this.f;
            e eVar = this.M;
            if (b == 0) {
                PhotoViewer.q0().T1(null, eVar, null);
                PhotoViewer.q0().n1(arrayList, i, 0L, 0L, 0L, kg4Var);
                this.S = PhotoViewer.q0().c;
                return;
            }
            if (b == 3 || b == 5) {
                if (view instanceof vea) {
                    ((vea) view).a();
                    return;
                }
                return;
            }
            if (b == 1) {
                if (view instanceof zea) {
                    zea zeaVar = (zea) view;
                    TLRPC.Document F0 = r47Var.F0();
                    if (!zeaVar.H) {
                        if (zeaVar.G) {
                            xb4.G(k5.a(yac.t0).a).f(F0);
                            zeaVar.f(true);
                            return;
                        } else {
                            r47 message = zeaVar.getMessage();
                            message.P = true;
                            xb4.G(k5.a(yac.t0).a).X(F0, message, 0, 0);
                            zeaVar.f(true);
                            return;
                        }
                    }
                    if (!r47Var.x()) {
                        hl.q2(r47Var, this.L, eVar);
                        return;
                    }
                    PhotoViewer.q0().T1(null, eVar, null);
                    int indexOf = arrayList.indexOf(r47Var);
                    if (indexOf >= 0) {
                        PhotoViewer.q0().T1(null, eVar, null);
                        PhotoViewer.q0().n1(arrayList, indexOf, 0L, 0L, 0L, kg4Var);
                        this.S = PhotoViewer.q0().c;
                        return;
                    } else {
                        ArrayList t = qd4.t(r47Var);
                        PhotoViewer.q0().T1(null, eVar, null);
                        PhotoViewer.q0().n1(t, 0, 0L, 0L, 0L, kg4Var);
                        this.S = PhotoViewer.q0().c;
                        return;
                    }
                }
                return;
            }
            if (b == 2) {
                try {
                    TLRPC.MessageMedia messageMedia = r47Var.k.media;
                    TLRPC.WebPage webPage = messageMedia != null ? messageMedia.webpage : null;
                    if (webPage == null || (webPage instanceof TLRPC.TL_webPageEmpty)) {
                        str = null;
                    } else {
                        if (webPage.cached_page != null) {
                            LaunchActivity launchActivity = LaunchActivity.H1;
                            if (launchActivity == null || launchActivity.O() == null || LaunchActivity.H1.O().k(r47Var) == null) {
                                eVar.createArticleViewer(false).L(r47Var, null, null, null);
                                return;
                            }
                            return;
                        }
                        String str2 = webPage.embed_url;
                        if (str2 != null && str2.length() != 0) {
                            iv3.J0(this.M, r47Var, this.h0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                            return;
                        }
                        str = webPage.url;
                    }
                    if (str == null) {
                        ArrayList arrayList2 = ((cfa) view).F;
                        str = arrayList2.size() > 0 ? ((CharSequence) arrayList2.get(0)).toString() : null;
                    }
                    if (str != null) {
                        g(str);
                    }
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            }
        }
    }

    public final void f(r47 r47Var, View view, int i) {
        if (!this.p0.u()) {
            this.p0.e();
        }
        if (this.p0.u()) {
            this.p0.h(r47Var, view, i);
        }
    }

    public final void g(String str) {
        if (hl.D3(str)) {
            jj.n0(this.M, str, true, true);
        } else {
            m01.u(this.L, str);
        }
    }

    public ArrayList<apb> getThemeDescriptions() {
        ArrayList<apb> arrayList = new ArrayList<>();
        arrayList.add(new apb(this, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.h5));
        arrayList.add(new apb(this, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.a7));
        int i = aob.i7;
        gu guVar = this.b;
        arrayList.add(new apb(guVar, TLObject.FLAG_13, new Class[]{zea.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, i));
        int i2 = aob.k7;
        arrayList.add(new apb(guVar, TLObject.FLAG_14, new Class[]{zea.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, i2));
        arrayList.add(new apb(guVar, 8, new Class[]{zea.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (zob) null, aob.qj));
        arrayList.add(new apb(guVar, 0, new Class[]{ua6.class}, new String[]{"progressBar"}, (Drawable[]) null, (zob) null, aob.h6));
        arrayList.add(new apb(guVar, TLObject.FLAG_13, new Class[]{vea.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(guVar, TLObject.FLAG_14, new Class[]{vea.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, i2));
        arrayList.add(new apb(guVar, TLObject.FLAG_13, new Class[]{cfa.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(guVar, TLObject.FLAG_14, new Class[]{cfa.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, i2));
        z2b z2bVar = this.c;
        arrayList.add(new apb(z2bVar.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.G6));
        arrayList.add(new apb(z2bVar.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.y6));
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [hg4, java.lang.Runnable] */
    public final void h(final long j, final long j2, final long j3, final long j4, final ph4 ph4Var, final boolean z, String str, boolean z2) {
        ArrayList arrayList;
        final String str2 = str == null ? "" : str;
        Locale locale = Locale.ENGLISH;
        final String str3 = j + j2 + j3 + j4 + ((int) (ph4Var == null ? (byte) -1 : ph4Var.d)) + str2 + z;
        String str4 = this.y;
        boolean z3 = str4 != null && str4.equals(str3);
        boolean z4 = !z3 && z2;
        this.E = ph4Var;
        this.F = j;
        this.G = j2;
        this.I = j3;
        this.H = j4;
        this.J = str2;
        this.K = z;
        hg4 hg4Var = this.e;
        if (hg4Var != null) {
            hl.r(hg4Var);
        }
        zz3 zz3Var = this.g0;
        hl.r(zz3Var);
        if (z3 && z2) {
            return;
        }
        ArrayList arrayList2 = this.e0;
        final boolean z5 = z3;
        ArrayList arrayList3 = this.d0;
        z2b z2bVar = this.c;
        ArrayList arrayList4 = this.f;
        if (z4 || (ph4Var == null && j2 == 0 && j == 0 && j3 == 0 && j4 == 0)) {
            arrayList4.clear();
            this.n.clear();
            this.r.clear();
            this.N = true;
            z2bVar.setVisibility(0);
            c79 c79Var = this.d;
            if (c79Var != null) {
                c79Var.f();
            }
            this.Q++;
            gu guVar = this.b;
            if (guVar.getPinnedHeader() != null) {
                arrayList = arrayList4;
                guVar.getPinnedHeader().setAlpha(0.0f);
            } else {
                arrayList = arrayList4;
            }
            arrayList3.clear();
            arrayList2.clear();
            if (!z4) {
                return;
            }
        } else if (z2 && !arrayList4.isEmpty()) {
            return;
        } else {
            arrayList = arrayList4;
        }
        this.N = true;
        c79 c79Var2 = this.d;
        if (c79Var2 != null) {
            c79Var2.f();
        }
        if (!z5) {
            zz3Var.run();
            z2bVar.e(true, !z2);
        }
        if (TextUtils.isEmpty(str2)) {
            arrayList2.clear();
            arrayList3.clear();
            og4 og4Var = this.i0;
            if (og4Var != null) {
                ((xg3) og4Var).i(false, null, null, false);
            }
        }
        final int i = this.Q + 1;
        this.Q = i;
        final int i2 = yac.t0;
        ?? r0 = new Runnable() { // from class: hg4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                long j5;
                int i3;
                int i4;
                long j6;
                int i5;
                int i6;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal;
                final yg4 yg4Var = yg4.this;
                ArrayList arrayList5 = yg4Var.f;
                final long j7 = j;
                long j8 = j2;
                String str5 = str2;
                final ph4 ph4Var2 = ph4Var;
                int i7 = i2;
                long j9 = j3;
                long j10 = j4;
                final boolean z6 = z5;
                ArrayList arrayList6 = null;
                if (j7 == 0 || j8 != 0) {
                    boolean isEmpty = TextUtils.isEmpty(str5);
                    boolean z7 = z;
                    if (isEmpty) {
                        j5 = j10;
                        i3 = i7;
                        i4 = z7 ? 1 : 0;
                        j6 = j9;
                        i5 = 20;
                        i6 = 1;
                    } else {
                        ArrayList arrayList7 = new ArrayList();
                        j6 = j9;
                        i5 = 20;
                        j5 = j10;
                        i3 = i7;
                        i6 = 1;
                        kf7.a0(i7).M0(0, str5, arrayList7, new ArrayList(), new ArrayList(), null, z7 ? 1 : 0);
                        i4 = z7 ? 1 : 0;
                        arrayList6 = arrayList7;
                    }
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = new TLRPC.TL_messages_searchGlobal();
                    tL_messages_searchGlobal2.limit = i5;
                    tL_messages_searchGlobal2.q = str5;
                    tL_messages_searchGlobal2.filter = ph4Var2 == null ? new TLRPC.TL_inputMessagesFilterEmpty() : ph4Var2.e;
                    tL_messages_searchGlobal2.community = uc7.s1(i3).h1(j8);
                    if (j6 > 0) {
                        tL_messages_searchGlobal2.min_date = (int) (j6 / 1000);
                    }
                    if (j5 > 0) {
                        tL_messages_searchGlobal2.max_date = (int) (j5 / 1000);
                    }
                    if (z6 && str5.equals(yg4Var.x) && !arrayList5.isEmpty()) {
                        r47 r47Var = (r47) c00.g(i6, arrayList5);
                        tL_messages_searchGlobal2.offset_id = r47Var.e1();
                        tL_messages_searchGlobal2.offset_rate = yg4Var.w;
                        tL_messages_searchGlobal2.offset_peer = uc7.s1(i3).j1(r47.B1(r47Var.k.peer_id));
                    } else {
                        tL_messages_searchGlobal2.offset_rate = 0;
                        tL_messages_searchGlobal2.offset_id = 0;
                        tL_messages_searchGlobal2.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    }
                    tL_messages_searchGlobal2.flags |= i6;
                    tL_messages_searchGlobal2.folder_id = i4;
                    tL_messages_searchGlobal = tL_messages_searchGlobal2;
                } else {
                    TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                    tL_messages_search.q = str5;
                    tL_messages_search.limit = 20;
                    tL_messages_search.filter = ph4Var2 == null ? new TLRPC.TL_inputMessagesFilterEmpty() : ph4Var2.e;
                    tL_messages_search.peer = uc7.s1(k5.a(i7).a).j1(j7);
                    if (j9 > 0) {
                        tL_messages_search.min_date = (int) (j9 / 1000);
                    }
                    if (j10 > 0) {
                        tL_messages_search.max_date = (int) (j10 / 1000);
                    }
                    if (z6) {
                        str5 = str5;
                        if (str5.equals(yg4Var.x) && !arrayList5.isEmpty()) {
                            tL_messages_search.offset_id = ((r47) c00.g(1, arrayList5)).e1();
                            i3 = i7;
                            j6 = j9;
                            tL_messages_searchGlobal = tL_messages_search;
                        }
                    } else {
                        str5 = str5;
                    }
                    tL_messages_search.offset_id = 0;
                    i3 = i7;
                    j6 = j9;
                    tL_messages_searchGlobal = tL_messages_search;
                }
                final ArrayList arrayList8 = arrayList6;
                yg4Var.x = str5;
                yg4Var.y = str3;
                final ArrayList arrayList9 = new ArrayList();
                rh4.C1(yg4Var.x, arrayList9);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i3);
                final int i8 = i;
                final String str6 = str5;
                final int i9 = i3;
                final long j11 = j6;
                connectionsManager.sendRequestTyped(tL_messages_searchGlobal, new icc() { // from class: ig4
                    @Override // icc
                    public final void a(Object obj, Object obj2) {
                        final TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                        final TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        final ArrayList arrayList10 = new ArrayList();
                        final int i10 = i9;
                        final String str7 = str6;
                        if (tL_error == null) {
                            int size = messages_messages.messages.size();
                            for (int i11 = 0; i11 < size; i11++) {
                                r47 r47Var2 = new r47(i10, messages_messages.messages.get(i11), false, true);
                                r47Var2.J5(str7, true);
                                arrayList10.add(r47Var2);
                            }
                        }
                        final yg4 yg4Var2 = yg4.this;
                        final int i12 = i8;
                        final boolean z8 = z6;
                        final ph4 ph4Var3 = ph4Var2;
                        final long j12 = j7;
                        final long j13 = j11;
                        final ArrayList arrayList11 = arrayList8;
                        final ArrayList arrayList12 = arrayList9;
                        hl.c3(new Runnable() { // from class: jg4
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:109:0x02d3  */
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
                                String str8;
                                View view;
                                int i13;
                                ?? r12;
                                og4 og4Var2;
                                ArrayList arrayList13;
                                ArrayList arrayList14;
                                SparseArray sparseArray;
                                ?? r16;
                                char c;
                                yg4 yg4Var3 = yg4.this;
                                rg4 rg4Var = yg4Var3.U;
                                wg4 wg4Var = yg4Var3.V;
                                ArrayList arrayList15 = yg4Var3.n;
                                SparseArray sparseArray2 = yg4Var3.h;
                                ArrayList arrayList16 = yg4Var3.e0;
                                HashMap hashMap = yg4Var3.r;
                                ArrayList arrayList17 = yg4Var3.d0;
                                ArrayList arrayList18 = yg4Var3.f;
                                gu guVar2 = yg4Var3.b;
                                z2b z2bVar2 = yg4Var3.c;
                                if (i12 != yg4Var3.Q) {
                                    return;
                                }
                                yg4Var3.N = false;
                                if (tL_error != null) {
                                    tpa tpaVar = z2bVar2.d;
                                    p66 p66Var = z2bVar2.e;
                                    tpaVar.setText(ob6.M0(2131745528, null));
                                    p66Var.setVisibility(0);
                                    p66Var.setText(ob6.M0(2131745535, null));
                                    z2bVar2.e(false, true);
                                    return;
                                }
                                z2bVar2.e(false, true);
                                tpa tpaVar2 = z2bVar2.d;
                                p66 p66Var2 = z2bVar2.e;
                                TLRPC.messages_Messages messages_messages2 = messages_messages;
                                yg4Var3.w = messages_messages2.next_rate;
                                int i14 = i10;
                                kf7.a0(i14).n1(messages_messages2.users, messages_messages2.chats, true, true);
                                uc7.s1(i14).j4(messages_messages2.users, false);
                                uc7.s1(i14).c4(messages_messages2.chats, false);
                                boolean z9 = z8;
                                if (!z9) {
                                    arrayList18.clear();
                                    sparseArray2.clear();
                                    arrayList15.clear();
                                    hashMap.clear();
                                }
                                yg4Var3.P = messages_messages2.count;
                                String str9 = str7;
                                yg4Var3.R = str9;
                                ArrayList arrayList19 = arrayList10;
                                int size2 = arrayList19.size();
                                int i15 = 0;
                                while (i15 < size2) {
                                    boolean z10 = z9;
                                    r47 r47Var3 = (r47) arrayList19.get(i15);
                                    ArrayList arrayList20 = arrayList19;
                                    String str10 = r47Var3.Y;
                                    ArrayList arrayList21 = (ArrayList) hashMap.get(str10);
                                    int i16 = i15;
                                    if (arrayList21 == null) {
                                        arrayList13 = new ArrayList();
                                        hashMap.put(str10, arrayList13);
                                        arrayList15.add(str10);
                                    } else {
                                        arrayList13 = arrayList21;
                                    }
                                    arrayList13.add(r47Var3);
                                    arrayList18.add(r47Var3);
                                    sparseArray2.put(r47Var3.e1(), r47Var3);
                                    if (PhotoViewer.q0().V0()) {
                                        PhotoViewer q0 = PhotoViewer.q0();
                                        int i17 = yg4Var3.S;
                                        arrayList14 = arrayList15;
                                        ArrayList arrayList22 = q0.X6;
                                        sparseArray = sparseArray2;
                                        SparseArray[] sparseArrayArr = q0.Y6;
                                        if (i17 == q0.c) {
                                            if (sparseArrayArr[0].indexOfKey(r47Var3.e1()) < 0) {
                                                if (q0.P5) {
                                                    arrayList22.add(r47Var3);
                                                    c = 0;
                                                } else {
                                                    c = 0;
                                                    arrayList22.add(0, r47Var3);
                                                }
                                                r16 = c;
                                                sparseArrayArr[c].put(r47Var3.e1(), r47Var3);
                                            } else {
                                                r16 = 0;
                                            }
                                            q0.O5[r16] = arrayList22.size() == q0.I5 ? true : r16;
                                            q0.M1();
                                        }
                                    } else {
                                        arrayList14 = arrayList15;
                                        sparseArray = sparseArray2;
                                    }
                                    i15 = i16 + 1;
                                    arrayList19 = arrayList20;
                                    z9 = z10;
                                    arrayList15 = arrayList14;
                                    sparseArray2 = sparseArray;
                                }
                                boolean z11 = z9;
                                if (arrayList18.size() > yg4Var3.P) {
                                    yg4Var3.P = arrayList18.size();
                                }
                                yg4Var3.O = arrayList18.size() >= yg4Var3.P;
                                boolean isEmpty2 = arrayList18.isEmpty();
                                ph4 ph4Var4 = ph4Var3;
                                byte b = 2;
                                if (!isEmpty2) {
                                    str8 = str9;
                                } else if (ph4Var4 != null) {
                                    if (TextUtils.isEmpty(yg4Var3.R)) {
                                        str8 = str9;
                                        if (j12 == 0 && j13 == 0) {
                                            tpaVar2.setText(ob6.M0(2131745529, null));
                                            byte b2 = ph4Var4.d;
                                            String M0 = b2 == 1 ? ob6.M0(2131745534, null) : b2 == 0 ? ob6.M0(2131745532, null) : b2 == 2 ? ob6.M0(2131745533, null) : b2 == 3 ? ob6.M0(2131745531, null) : ob6.M0(2131745530, null);
                                            p66Var2.setVisibility(0);
                                            p66Var2.setText(M0);
                                        }
                                    } else {
                                        str8 = str9;
                                    }
                                    tpaVar2.setText(ob6.M0(2131745528, null));
                                    p66Var2.setVisibility(0);
                                    p66Var2.setText(ob6.M0(2131745535, null));
                                } else {
                                    str8 = str9;
                                    tpaVar2.setText(ob6.M0(2131745528, null));
                                    p66Var2.setVisibility(8);
                                }
                                if (ph4Var4 != null) {
                                    byte b3 = ph4Var4.d;
                                    if (b3 != 0) {
                                        if (b3 == 1) {
                                            yg4Var3.d = yg4Var3.W;
                                        } else if (b3 == 2) {
                                            yg4Var3.d = yg4Var3.a0;
                                        } else if (b3 == 3) {
                                            yg4Var3.d = yg4Var3.b0;
                                        } else if (b3 == 5) {
                                            yg4Var3.d = yg4Var3.c0;
                                        }
                                    } else if (TextUtils.isEmpty(yg4Var3.R)) {
                                        yg4Var3.d = wg4Var;
                                    } else {
                                        yg4Var3.d = rg4Var;
                                    }
                                } else {
                                    yg4Var3.d = rg4Var;
                                }
                                j79 adapter = guVar2.getAdapter();
                                c79 c79Var3 = yg4Var3.d;
                                if (adapter != c79Var3) {
                                    guVar2.setAdapter(c79Var3);
                                }
                                if (z11) {
                                    view = null;
                                    i13 = 0;
                                } else {
                                    arrayList17.clear();
                                    ArrayList arrayList23 = arrayList11;
                                    if (arrayList23 != null) {
                                        arrayList17.addAll(arrayList23);
                                    }
                                    if (str8 != null && str8.length() >= 3 && (ob6.M0(2131745629, null).toLowerCase().startsWith(str8) || "saved messages".startsWith(str8))) {
                                        for (int i18 = 0; i18 < arrayList17.size(); i18++) {
                                            if (!(arrayList17.get(i18) instanceof TLRPC.User) || yac.h(yac.t0).f().id != ((TLRPC.User) arrayList17.get(i18)).id) {
                                            }
                                        }
                                        r12 = 0;
                                        arrayList17.add(0, yac.h(yac.t0).f());
                                        arrayList16.clear();
                                        arrayList16.addAll(arrayList12);
                                        yg4Var3.f0 = r12;
                                        if (str8 != null || str8.length() < 3) {
                                            view = null;
                                        } else {
                                            view = null;
                                            if (ob6.M0(2131754143, null).toLowerCase().startsWith(str8) || "archive".startsWith(str8)) {
                                                yg4Var3.f0 = true;
                                            }
                                        }
                                        og4Var2 = yg4Var3.i0;
                                        i13 = r12;
                                        if (og4Var2 != null) {
                                            ((xg3) og4Var2).i(TextUtils.isEmpty(yg4Var3.R), arrayList17, arrayList16, yg4Var3.f0);
                                            i13 = r12;
                                        }
                                    }
                                    r12 = 0;
                                    arrayList16.clear();
                                    arrayList16.addAll(arrayList12);
                                    yg4Var3.f0 = r12;
                                    if (str8 != null) {
                                    }
                                    view = null;
                                    og4Var2 = yg4Var3.i0;
                                    i13 = r12;
                                    if (og4Var2 != null) {
                                    }
                                }
                                int i19 = -1;
                                View view2 = view;
                                for (int i20 = i13; i20 < size2; i20++) {
                                    View childAt = guVar2.getChildAt(i20);
                                    if (childAt instanceof tk4) {
                                        i19 = RecyclerView.S(childAt);
                                        view2 = childAt;
                                    }
                                }
                                if (view2 != null) {
                                    guVar2.removeView(view2);
                                }
                                if ((yg4Var3.l0.getVisibility() == 0 && guVar2.getChildCount() == 0) || (guVar2.getAdapter() != wg4Var && view2 != null)) {
                                    yg4Var3.getViewTreeObserver().addOnPreDrawListener(new r32(yg4Var3, (tk4) view2, i19, b));
                                }
                                yg4Var3.d.f();
                            }
                        });
                    }
                });
            }
        };
        this.e = r0;
        hl.d3(r0, (!z5 || arrayList.isEmpty()) ? 350L : 0L);
        lg4 lg4Var = this.l0;
        if (ph4Var == null) {
            lg4Var.setViewType(1);
            return;
        }
        byte b = ph4Var.d;
        if (b == 0) {
            if (TextUtils.isEmpty(this.J)) {
                lg4Var.setViewType(2);
                return;
            } else {
                lg4Var.setViewType(1);
                return;
            }
        }
        if (b == 1) {
            lg4Var.setViewType(3);
            return;
        }
        if (b == 3 || b == 5) {
            lg4Var.setViewType(4);
        } else if (b == 2) {
            lg4Var.setViewType(5);
        }
    }

    public final void i(og4 og4Var, boolean z) {
        this.i0 = og4Var;
        if (!z || og4Var == null) {
            return;
        }
        ArrayList arrayList = this.d0;
        if (arrayList.isEmpty()) {
            return;
        }
        ((xg3) og4Var).i(false, arrayList, this.e0, this.f0);
    }

    public final void j(int i, int i2, boolean z) {
        setClipToPadding(false);
        this.s0 = z;
        setPadding(0, i, 0, i2);
        gu guVar = this.b;
        if (z) {
            guVar.r1(0, i, 0, i2);
        } else {
            guVar.setPadding(0, i, 0, i2);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) guVar.getLayoutParams();
        marginLayoutParams.topMargin = -i;
        marginLayoutParams.bottomMargin = -i2;
        this.s0 = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = yac.t0;
        this.r0 = i;
        jn7.f(i).b(this, jn7.l4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.f(this.r0).n(this, jn7.l4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        c79 c79Var;
        byte b = this.s;
        byte b2 = 3;
        if (hl.O1()) {
            this.s = (byte) 3;
        } else if (getResources().getConfiguration().orientation == 2) {
            b2 = 6;
            this.s = (byte) 6;
        } else {
            this.s = (byte) 3;
        }
        if (b != b2 && (c79Var = this.d) == this.V) {
            this.s0 = true;
            c79Var.f();
            this.s0 = false;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.s0) {
            return;
        }
        super.requestLayout();
    }

    public void setBlurredBackgroundDrawableFactory(ll0 ll0Var) {
        ol0 ol0Var = new ol0(null);
        ol0Var.e = new xz((byte) 17);
        ol0Var.f(385875968, 402653183);
        ol0Var.e(385875968, 402653183);
        ol0Var.d(0, 0);
        ol0Var.f = 1.0f;
        ol0Var.h = 1.0f;
        pg4 pg4Var = this.n0;
        jl0 c = ll0Var.c(pg4Var, ol0Var, false);
        pg4Var.b = c;
        c.r(hl.L(11.5f));
        pg4Var.b.q(hl.L(5.0f));
    }

    public void setChatPreviewDelegate(jx9 jx9Var) {
        this.j0 = jx9Var;
    }

    public void setUiCallback(xg4 xg4Var) {
        this.p0 = xg4Var;
    }

    public void setUseFromUserAsAvatar(boolean z) {
        this.q0 = z;
    }

    @Override // s84
    public final void t(int i, float f, float f2, t84 t84Var) {
        if (i == 0) {
            a();
        }
    }

    @Override // snb
    public final void updateColors() {
        try {
            pg4 pg4Var = this.n0;
            if (pg4Var != null) {
                pg4Var.updateColors();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // s84
    public final void v0(float f, int i) {
    }
}

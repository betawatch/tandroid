package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class xm0 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public int D;
    public final boolean E;
    public boolean F;
    public String G;
    public int H;
    public boolean I;
    public final org.telegram.messenger.we J;
    public org.telegram.ui.Components.pj0 K;
    public l4 L;
    public um0 M;
    public org.telegram.ui.Components.av0 N;
    public fi.s2 O;
    public org.telegram.ui.ActionBar.r0 P;
    public org.telegram.ui.ActionBar.z0 Q;
    public int R;
    public boolean S;
    public final int T;
    public final an U;
    public org.telegram.ui.Components.tj0 V;
    public int W;
    public boolean X;
    public boolean Y;
    public FrameLayout Z;
    public final int a;
    public k0 a0;
    public final HashMap b;
    public l00 b0;
    public final ArrayList c;
    public View c0;
    public CharSequence d;
    public org.telegram.ui.Components.kt d0;
    public boolean e;
    public ImageView e0;
    public final ArrayList f;
    public tm0 f0;
    public int g0;
    public final HashMap h;
    public final TextPaint h0;
    public final RectF i0;
    public final Paint j0;
    public AnimatorSet k0;
    public boolean l0;
    public org.telegram.ui.ActionBar.g1 m0;
    public final ArrayList n;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout n0;
    public org.telegram.ui.ActionBar.z0[] o0;
    public String p0;
    public boolean q0;
    public boolean r;
    public final boolean r0;
    public boolean s;
    public wm0 s0;
    public ym0 t0;
    public final int u0;
    public final int v0;
    public String w;
    public final int w0;
    public String x;
    public final rm0 x0;
    public int y;

    public xm0(int i7, org.telegram.messenger.we weVar, HashMap hashMap, ArrayList arrayList, int i10, boolean z9, an anVar, boolean z10) {
        super(null);
        this.f = new ArrayList();
        this.h = new HashMap();
        new HashMap();
        this.n = new ArrayList();
        this.s = true;
        this.I = true;
        this.R = 100;
        this.g0 = 3;
        this.h0 = new TextPaint(1);
        this.i0 = new RectF();
        this.j0 = new Paint(1);
        this.q0 = true;
        this.x0 = new rm0(this);
        this.J = weVar;
        this.b = hashMap;
        this.c = arrayList;
        this.a = i7;
        this.T = i10;
        this.U = anVar;
        this.E = z9;
        this.r0 = z10;
        if (weVar == null) {
            SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("web_recent_search", 0);
            int i11 = sharedPreferences.getInt("count", 0);
            for (int i12 = 0; i12 < i11; i12++) {
                String string = sharedPreferences.getString("recent" + i12, null);
                if (string == null) {
                    break;
                }
                this.n.add(string);
            }
        }
        if (z10) {
            this.u0 = org.telegram.ui.ActionBar.k6.ih;
            this.v0 = org.telegram.ui.ActionBar.k6.Vg;
            this.w0 = org.telegram.ui.ActionBar.k6.Wg;
        } else {
            this.u0 = org.telegram.ui.ActionBar.k6.h5;
            this.v0 = org.telegram.ui.ActionBar.k6.j5;
            this.w0 = org.telegram.ui.ActionBar.k6.I5;
        }
    }

    public static /* synthetic */ void Z(xm0 xm0Var, TLObject tLObject, boolean z9) {
        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
        org.telegram.messenger.qp.s1(xm0Var.currentAccount).Y3(tL_contacts_resolvedPeer.users, false);
        org.telegram.messenger.qp.s1(xm0Var.currentAccount).S3(tL_contacts_resolvedPeer.chats, false);
        org.telegram.messenger.yr.a0(xm0Var.currentAccount).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
        String str = xm0Var.G;
        xm0Var.G = null;
        xm0Var.i0(str, "", z9, false);
    }

    public static org.telegram.ui.Cells.q5 a0(xm0 xm0Var, int i7) {
        int childCount = xm0Var.K.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = xm0Var.K.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.q5) {
                org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                int intValue = ((Integer) q5Var.getTag()).intValue();
                org.telegram.messenger.we weVar = xm0Var.J;
                if (weVar == null ? !(intValue < 0 || intValue >= xm0Var.f.size()) : !(intValue < 0 || intValue >= weVar.e.size())) {
                    if (intValue == i7) {
                        return q5Var;
                    }
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.da));
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        this.Y = false;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i7 = this.u0;
        org.telegram.ui.ActionBar.r6.i(i7, kVar, null);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = this.v0;
        org.telegram.ui.ActionBar.r6.m(kVar2, 5, i10, null);
        int i11 = 1;
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 1, i10, null);
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 3, this.w0, null);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i12 = this.a;
        org.telegram.messenger.we weVar = this.J;
        if (weVar != null) {
            this.actionBar.setTitle(weVar.c);
        } else if (i12 == 0) {
            this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131745762, null));
        } else if (i12 == 1) {
            this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131745765, null));
        }
        this.actionBar.setActionBarMenuOnItemClick(new ux(this, 24));
        int i13 = 2;
        if (this.l0) {
            org.telegram.ui.ActionBar.r0 a10 = this.actionBar.q().a(0, R.drawable.ic_ab_other);
            a10.setSubMenuDelegate(new sm0(this));
            this.Q = a10.e(1, R.drawable.msg_list, org.telegram.messenger.hd.M0(2131745346, null));
            a10.e(2, R.drawable.msg_openin, org.telegram.messenger.hd.M0(2131747795, null));
        }
        if (weVar == null) {
            org.telegram.ui.ActionBar.r0 a11 = this.actionBar.q().a(0, R.drawable.outline_header_search);
            a11.N();
            a11.H = new fi.u2(this);
            this.P = a11;
            EditTextBoldCursor searchField = a11.getSearchField();
            org.telegram.ui.ActionBar.r6.V(searchField, i10, null);
            org.telegram.ui.ActionBar.r6.w(searchField, i10, null);
            org.telegram.ui.ActionBar.r6.E(searchField, org.telegram.ui.ActionBar.k6.Je, null);
        }
        if (weVar == null) {
            if (i12 == 0) {
                this.P.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745762, null));
            } else if (i12 == 1) {
                this.P.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745765, null));
            }
        }
        tm0 tm0Var = new tm0(this, context);
        this.f0 = tm0Var;
        org.telegram.ui.ActionBar.r6.i(i7, tm0Var, null);
        this.fragmentView = this.f0;
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.K = pj0Var;
        pj0Var.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(50.0f));
        this.K.setClipToPadding(false);
        this.K.setHorizontalScrollBarEnabled(false);
        this.K.setVerticalScrollBarEnabled(false);
        this.K.setItemAnimator(null);
        this.K.setLayoutAnimation(null);
        org.telegram.ui.Components.pj0 pj0Var2 = this.K;
        int i14 = 4;
        um0 um0Var = new um0(4);
        this.M = um0Var;
        pj0Var2.setLayoutManager(um0Var);
        this.M.O = new ai.l(this, 13);
        this.f0.addView(this.K, c8.ha.e(-1, -1, 51));
        org.telegram.ui.Components.pj0 pj0Var3 = this.K;
        int i15 = 14;
        l4 l4Var = new l4(i15, this, context);
        this.L = l4Var;
        pj0Var3.setAdapter(l4Var);
        org.telegram.ui.ActionBar.r6.I(this.K, i7, null);
        this.K.setOnItemClickListener(new h(this, 21));
        if (this.H != 1) {
            this.K.setOnItemLongClickListener(new qm0(this, i13));
        }
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(new sm0(this));
        this.V = tj0Var;
        if (this.H != 1) {
            this.K.E.add(tj0Var);
        }
        fi.s2 s2Var = new fi.s2(i11, context, getResourceProvider());
        this.O = s2Var;
        s2Var.setAlpha(0.0f);
        this.O.setVisibility(8);
        org.telegram.ui.Components.av0 av0Var = new org.telegram.ui.Components.av0(context, this.O, 1, getResourceProvider());
        this.N = av0Var;
        av0Var.setAnimateLayoutChange(true);
        this.N.d.setTypeface(Typeface.DEFAULT);
        this.N.d.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.V(this.N.d, org.telegram.ui.ActionBar.k6.y6, getResourceProvider());
        this.N.addView(this.O, 0);
        if (weVar != null) {
            this.N.d.setText(org.telegram.messenger.hd.M0(2131748179, null));
        } else {
            this.N.d.setText(org.telegram.messenger.hd.M0(2131748168, null));
        }
        this.N.e(false, false);
        this.f0.addView(this.N, c8.ha.d(-1, -1.0f, 51, 0.0f, 126.0f, 0.0f, 0.0f));
        this.K.setOnScrollListener(new g3(this, 23));
        if (weVar == null) {
            o0();
        }
        if (this.q0) {
            View view = new View(context);
            this.c0 = view;
            view.setBackgroundResource(R.drawable.header_shadow_reverse);
            this.c0.setTranslationY(org.telegram.messenger.g0.L(48.0f));
            this.f0.addView(this.c0, c8.ha.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            this.Z = frameLayout;
            org.telegram.ui.ActionBar.r6.i(i7, frameLayout, null);
            this.Z.setVisibility(4);
            this.Z.setTranslationY(org.telegram.messenger.g0.L(48.0f));
            this.f0.addView(this.Z, c8.ha.e(-1, 48, 83));
            this.Z.setOnTouchListener(new ei.b(i13));
            org.telegram.ui.Components.kt ktVar = this.d0;
            if (ktVar != null) {
                ktVar.o();
            }
            this.d0 = new org.telegram.ui.Components.kt(context, this.f0, null, 1, false, null);
            this.d0.setFilters(new InputFilter[]{new InputFilter.LengthFilter(org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).H0())});
            this.d0.setHint(org.telegram.messenger.hd.M0(2131754454, null));
            this.d0.s();
            org.telegram.ui.Components.ys editText = this.d0.getEditText();
            editText.setMaxLines(1);
            editText.setSingleLine(true);
            this.Z.addView(this.d0, c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 84.0f, 0.0f));
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.d0.setText(charSequence);
            }
            this.d0.getEditText().addTextChangedListener(new m0(this, i15));
            k0 k0Var = new k0(18, context, this);
            this.a0 = k0Var;
            k0Var.setFocusable(true);
            this.a0.setFocusableInTouchMode(true);
            this.a0.setVisibility(4);
            this.a0.setScaleX(0.2f);
            this.a0.setScaleY(0.2f);
            this.a0.setAlpha(0.0f);
            this.f0.addView(this.a0, c8.ha.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
            this.e0 = new ImageView(context);
            this.e0.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.j0(org.telegram.messenger.g0.L(56.0f), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.S5, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.T5, false)));
            this.e0.setImageResource(R.drawable.attach_send);
            this.e0.setImportantForAccessibility(2);
            org.telegram.ui.ActionBar.r6.t(this.e0, org.telegram.ui.ActionBar.k6.U5, null, PorterDuff.Mode.MULTIPLY);
            this.e0.setScaleType(ImageView.ScaleType.CENTER);
            this.e0.setOutlineProvider(new bg.q0(20));
            this.a0.addView(this.e0, c8.ha.d(56, 56.0f, 51, 2.0f, 0.0f, 0.0f, 0.0f));
            this.e0.setOnClickListener(new g40(this, 19));
            this.e0.setOnLongClickListener(new t(this, i14));
            float L = org.telegram.messenger.g0.L(12.0f);
            TextPaint textPaint = this.h0;
            textPaint.setTextSize(L);
            textPaint.setTypeface(org.telegram.messenger.g0.o());
            l00 l00Var = new l00(i14, context, this);
            this.b0 = l00Var;
            l00Var.setAlpha(0.0f);
            this.b0.setScaleX(0.2f);
            this.b0.setScaleY(0.2f);
            this.f0.addView(this.b0, c8.ha.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
            if (this.T != 0) {
                this.d0.setVisibility(8);
            }
        }
        this.e = (weVar != null || i12 == 0 || i12 == 1) && this.I;
        this.K.setEmptyView(this.N);
        org.telegram.ui.Components.pj0 pj0Var4 = this.K;
        pj0Var4.W1 = true;
        pj0Var4.X1 = 0;
        n0(0);
        return this.fragmentView;
    }

    public final int d0(int i7, Object obj) {
        boolean z9 = obj instanceof org.telegram.messenger.gf;
        Object valueOf = z9 ? Integer.valueOf(((org.telegram.messenger.gf) obj).C) : obj instanceof org.telegram.messenger.kf ? ((org.telegram.messenger.kf) obj).B : null;
        if (valueOf == null) {
            return -1;
        }
        HashMap hashMap = this.b;
        boolean containsKey = hashMap.containsKey(valueOf);
        ArrayList arrayList = this.c;
        if (!containsKey) {
            hashMap.put(valueOf, obj);
            arrayList.add(valueOf);
            return -1;
        }
        hashMap.remove(valueOf);
        int indexOf = arrayList.indexOf(valueOf);
        if (indexOf >= 0) {
            arrayList.remove(indexOf);
        }
        if (this.e) {
            m0();
        }
        if (i7 >= 0) {
            if (z9) {
                ((org.telegram.messenger.gf) obj).e();
            } else if (obj instanceof org.telegram.messenger.kf) {
                ((org.telegram.messenger.kf) obj).e();
            }
            this.x0.X(i7);
        }
        return indexOf;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.t) {
            removeSelfFromStack(true);
        }
    }

    public final void e0() {
        this.n.clear();
        l4 l4Var = this.L;
        if (l4Var != null) {
            l4Var.f();
        }
        this.N.e(false, true);
        h0();
    }

    public final void f0(View view, Object obj) {
        boolean z9 = d0(-1, obj) == -1;
        if (view instanceof org.telegram.ui.Cells.h7) {
            ((org.telegram.ui.Cells.h7) view).b(this.c.contains(Integer.valueOf(((org.telegram.messenger.gf) this.J.e.get(((Integer) view.getTag()).intValue())).C)), true);
        }
        n0(z9 ? 1 : 2);
        this.s0.A();
    }

    public final void g0(EditText editText) {
        if (editText.getText().length() == 0) {
            return;
        }
        String obj = editText.getText().toString();
        this.f.clear();
        this.h.clear();
        this.s = true;
        i0(obj, "", this.a == 1, true);
        this.w = obj;
        if (obj.length() == 0) {
            this.w = null;
            this.N.d.setText(org.telegram.messenger.hd.M0(2131748168, null));
        } else {
            this.N.d.setText(org.telegram.messenger.hd.a0("NoResultFoundFor", null, 2131748165, this.w));
        }
        o0();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f0, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, this.u0));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, this.u0));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 64, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, this.v0));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 128, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, this.v0));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 256, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, this.w0));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, this.v0));
        org.telegram.ui.ActionBar.r0 r0Var = this.P;
        arrayList.add(new org.telegram.ui.ActionBar.t6(r0Var != null ? r0Var.getSearchField() : null, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, this.v0));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.K, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, this.u0));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.K, 0, new Class[]{View.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.X9));
        return arrayList;
    }

    public final void h0() {
        SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("web_recent_search", 0).edit();
        edit.clear();
        edit.putInt("count", this.n.size());
        int size = this.n.size();
        for (int i7 = 0; i7 < size; i7++) {
            edit.putString(jg.g.j(i7, "recent"), (String) this.n.get(i7));
        }
        edit.commit();
    }

    public final void i0(String str, String str2, boolean z9, boolean z10) {
        if (this.r) {
            this.r = false;
            if (this.y != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.y, true);
                this.y = 0;
            }
        }
        this.G = str;
        this.r = true;
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(this.currentAccount);
        org.telegram.messenger.qp s13 = org.telegram.messenger.qp.s1(this.currentAccount);
        TLObject f22 = s12.f2(z9 ? s13.K3 : s13.L3);
        if (!(f22 instanceof TLRPC.User)) {
            if (!z10 || this.F) {
                return;
            }
            this.F = true;
            TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
            org.telegram.messenger.qp s14 = org.telegram.messenger.qp.s1(this.currentAccount);
            tL_contacts_resolveUsername.username = z9 ? s14.K3 : s14.L3;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_resolveUsername, new fi.d3(10, this, z9));
            return;
        }
        TLRPC.User user = (TLRPC.User) f22;
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.query = str == null ? "" : str;
        tL_messages_getInlineBotResults.bot = org.telegram.messenger.qp.s1(this.currentAccount).q1(user);
        tL_messages_getInlineBotResults.offset = str2;
        an anVar = this.U;
        if (anVar != null) {
            long a10 = anVar.a();
            if (org.telegram.messenger.m5.C(a10)) {
                tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            } else {
                tL_messages_getInlineBotResults.peer = getMessagesController().j1(a10);
            }
        } else {
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        }
        int i7 = this.D + 1;
        this.D = i7;
        this.y = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getInlineBotResults, new org.telegram.messenger.cn(this, str, i7, z9, user));
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(this.y, this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isLightStatusBar() {
        return org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.a7, false)) > 0.721f;
    }

    public final void j0(int i7, boolean z9) {
        HashMap hashMap = this.b;
        if (hashMap.isEmpty() || this.s0 == null || this.S) {
            return;
        }
        org.telegram.ui.Components.kt ktVar = this.d0;
        if (ktVar != null && ktVar.a.length() > 0) {
            Object obj = hashMap.get(this.c.get(0));
            if (obj instanceof org.telegram.messenger.gf) {
                ((org.telegram.messenger.gf) obj).a = this.d0.getText().toString();
            } else if (obj instanceof org.telegram.messenger.kf) {
                ((org.telegram.messenger.kf) obj).I = this.d0.getText().toString();
            }
        }
        this.S = true;
        this.s0.v0(i7, false, z9);
        if (this.T != 2) {
            wm0 wm0Var = this.s0;
            if (wm0Var == null || wm0Var.e()) {
                finishFragment();
            }
        }
    }

    public final void k0(int i7, boolean z9) {
        this.H = i7;
        this.I = z9;
        if (i7 <= 0 || this.a != 1) {
            return;
        }
        this.H = 1;
    }

    public final boolean l0(boolean z9, boolean z10) {
        if (this.d0 != null) {
            if (z9 != (this.Z.getTag() != null)) {
                AnimatorSet animatorSet = this.k0;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                this.Z.setTag(z9 ? 1 : null);
                if (this.d0.getEditText().isFocused()) {
                    org.telegram.messenger.g0.v1(this.d0.getEditText());
                }
                this.d0.k(true);
                if (z9) {
                    this.Z.setVisibility(0);
                    this.a0.setVisibility(0);
                }
                if (!z10) {
                    this.a0.setScaleX(z9 ? 1.0f : 0.2f);
                    this.a0.setScaleY(z9 ? 1.0f : 0.2f);
                    this.a0.setAlpha(z9 ? 1.0f : 0.0f);
                    this.b0.setScaleX(z9 ? 1.0f : 0.2f);
                    this.b0.setScaleY(z9 ? 1.0f : 0.2f);
                    this.b0.setAlpha(z9 ? 1.0f : 0.0f);
                    this.Z.setTranslationY(z9 ? 0.0f : org.telegram.messenger.g0.L(48.0f));
                    this.c0.setTranslationY(z9 ? 0.0f : org.telegram.messenger.g0.L(48.0f));
                    if (!z9) {
                        this.Z.setVisibility(4);
                        this.a0.setVisibility(4);
                    }
                    return true;
                }
                this.k0 = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                k0 k0Var = this.a0;
                Property property = View.SCALE_X;
                arrayList.add(ObjectAnimator.ofFloat(k0Var, (Property<k0, Float>) property, z9 ? 1.0f : 0.2f));
                k0 k0Var2 = this.a0;
                Property property2 = View.SCALE_Y;
                arrayList.add(ObjectAnimator.ofFloat(k0Var2, (Property<k0, Float>) property2, z9 ? 1.0f : 0.2f));
                k0 k0Var3 = this.a0;
                Property property3 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(k0Var3, (Property<k0, Float>) property3, z9 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.b0, (Property<l00, Float>) property, z9 ? 1.0f : 0.2f));
                arrayList.add(ObjectAnimator.ofFloat(this.b0, (Property<l00, Float>) property2, z9 ? 1.0f : 0.2f));
                arrayList.add(ObjectAnimator.ofFloat(this.b0, (Property<l00, Float>) property3, z9 ? 1.0f : 0.0f));
                FrameLayout frameLayout = this.Z;
                Property property4 = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property4, z9 ? 0.0f : org.telegram.messenger.g0.L(48.0f)));
                arrayList.add(ObjectAnimator.ofFloat(this.c0, (Property<View, Float>) property4, z9 ? 0.0f : org.telegram.messenger.g0.L(48.0f)));
                this.k0.playTogether(arrayList);
                this.k0.setInterpolator(new DecelerateInterpolator());
                this.k0.setDuration(180L);
                this.k0.addListener(new z40(3, this, z9));
                this.k0.start();
                return true;
            }
        }
        return false;
    }

    public final void m0() {
        if (this.e) {
            int childCount = this.K.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = this.K.getChildAt(i7);
                boolean z9 = childAt instanceof org.telegram.ui.Cells.q5;
                org.telegram.messenger.we weVar = this.J;
                ArrayList arrayList = this.c;
                if (z9) {
                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                    Integer num = (Integer) childAt.getTag();
                    if (weVar != null) {
                        q5Var.setNum(this.e ? arrayList.indexOf(Integer.valueOf(((org.telegram.messenger.gf) weVar.e.get(num.intValue())).C)) : -1);
                    } else {
                        q5Var.setNum(this.e ? arrayList.indexOf(((org.telegram.messenger.kf) this.f.get(num.intValue())).B) : -1);
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.h7) {
                    ((org.telegram.ui.Cells.h7) childAt).b(arrayList.indexOf(Integer.valueOf(((org.telegram.messenger.gf) weVar.e.get(((Integer) childAt.getTag()).intValue())).C)) != 0, false);
                }
            }
        }
    }

    public final void n0(int i7) {
        if (this.b.size() == 0) {
            this.b0.setPivotX(0.0f);
            this.b0.setPivotY(0.0f);
            l0(false, i7 != 0);
            return;
        }
        this.b0.invalidate();
        if (l0(true, i7 != 0) || i7 == 0) {
            this.b0.setPivotX(0.0f);
            this.b0.setPivotY(0.0f);
            return;
        }
        this.b0.setPivotX(org.telegram.messenger.g0.L(21.0f));
        this.b0.setPivotY(org.telegram.messenger.g0.L(12.0f));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.b0, (Property<l00, Float>) View.SCALE_X, i7 == 1 ? 1.1f : 0.9f, 1.0f), ObjectAnimator.ofFloat(this.b0, (Property<l00, Float>) View.SCALE_Y, i7 == 1 ? 1.1f : 0.9f, 1.0f));
        animatorSet.setInterpolator(new OvershootInterpolator());
        animatorSet.setDuration(180L);
        animatorSet.start();
    }

    public final void o0() {
        String str;
        l4 l4Var = this.L;
        if (l4Var != null) {
            l4Var.f();
        }
        if (this.r || (this.n.size() > 0 && ((str = this.w) == null || TextUtils.isEmpty(str)))) {
            this.N.e(true, true);
        } else {
            this.N.e(false, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onBackPressed(boolean z9) {
        org.telegram.ui.Components.kt ktVar = this.d0;
        if (ktVar == null || !ktVar.e) {
            return super.onBackPressed(z9);
        }
        if (!z9) {
            return false;
        }
        ktVar.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.t);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.t);
        if (this.y != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.y, true);
            this.y = 0;
        }
        org.telegram.ui.Components.kt ktVar = this.d0;
        if (ktVar != null) {
            ktVar.o();
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onPanTranslationUpdate(float f10) {
        org.telegram.ui.Components.pj0 pj0Var = this.K;
        if (pj0Var == null) {
            return;
        }
        if (!this.d0.e) {
            pj0Var.setTranslationY(f10);
        } else {
            this.fragmentView.setTranslationY(f10);
            this.K.setTranslationY(0.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        l4 l4Var = this.L;
        if (l4Var != null) {
            l4Var.f();
        }
        org.telegram.ui.Components.kt ktVar = this.d0;
        if (ktVar != null) {
            ktVar.s();
        }
        org.telegram.ui.ActionBar.r0 r0Var = this.P;
        if (r0Var != null) {
            r0Var.F(true);
            if (!TextUtils.isEmpty(this.p0)) {
                this.P.P(this.p0, false);
                this.p0 = null;
                g0(this.P.getSearchField());
            }
            getParentActivity().getWindow().setSoftInputMode(32);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        org.telegram.ui.ActionBar.r0 r0Var;
        if (!z9 || (r0Var = this.P) == null) {
            return;
        }
        org.telegram.messenger.g0.K3(r0Var.getSearchField());
    }
}

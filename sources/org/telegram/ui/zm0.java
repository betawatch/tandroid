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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class zm0 extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is {
    public int E;
    public final boolean F;
    public boolean G;
    public String H;
    public int I;
    public boolean J;
    public final org.telegram.messenger.ve K;
    public org.telegram.ui.Components.uj0 L;
    public l4 M;
    public wm0 N;
    public org.telegram.ui.Components.cv0 O;
    public hi.q2 P;
    public org.telegram.ui.ActionBar.q0 Q;
    public org.telegram.ui.ActionBar.z0 R;
    public int S;
    public boolean T;
    public final int U;
    public final an V;
    public org.telegram.ui.Components.yj0 W;
    public int X;
    public boolean Y;
    public boolean Z;
    public final int a;
    public FrameLayout a0;
    public final HashMap b;
    public k0 b0;
    public final ArrayList c;
    public rv c0;
    public CharSequence d;
    public View d0;
    public boolean e;
    public org.telegram.ui.Components.rt e0;
    public final ArrayList f;
    public ImageView f0;
    public vm0 g0;
    public final HashMap h;
    public int h0;
    public final TextPaint i0;
    public final RectF j0;
    public final Paint k0;
    public AnimatorSet l0;
    public boolean m0;
    public final ArrayList n;
    public org.telegram.ui.ActionBar.g1 n0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout o0;
    public org.telegram.ui.ActionBar.z0[] p0;
    public String q0;
    public boolean r;
    public boolean r0;
    public boolean s;
    public final boolean s0;
    public ym0 t0;
    public an0 u0;
    public final int v0;
    public String w;
    public final int w0;
    public String x;
    public final int x0;
    public int y;
    public final tm0 y0;

    public zm0(int i7, org.telegram.messenger.ve veVar, HashMap hashMap, ArrayList arrayList, int i10, boolean z10, an anVar, boolean z11) {
        super(null);
        this.f = new ArrayList();
        this.h = new HashMap();
        new HashMap();
        this.n = new ArrayList();
        this.s = true;
        this.J = true;
        this.S = 100;
        this.h0 = 3;
        this.i0 = new TextPaint(1);
        this.j0 = new RectF();
        this.k0 = new Paint(1);
        this.r0 = true;
        this.y0 = new tm0(this);
        this.K = veVar;
        this.b = hashMap;
        this.c = arrayList;
        this.a = i7;
        this.U = i10;
        this.V = anVar;
        this.F = z10;
        this.s0 = z11;
        if (veVar == null) {
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
        if (z11) {
            this.v0 = org.telegram.ui.ActionBar.j6.lh;
            this.w0 = org.telegram.ui.ActionBar.j6.Yg;
            this.x0 = org.telegram.ui.ActionBar.j6.Zg;
        } else {
            this.v0 = org.telegram.ui.ActionBar.j6.h5;
            this.w0 = org.telegram.ui.ActionBar.j6.j5;
            this.x0 = org.telegram.ui.ActionBar.j6.I5;
        }
    }

    public static /* synthetic */ void Z(zm0 zm0Var, TLObject tLObject, boolean z10) {
        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
        org.telegram.messenger.np.s1(zm0Var.currentAccount).Y3(tL_contacts_resolvedPeer.users, false);
        org.telegram.messenger.np.s1(zm0Var.currentAccount).S3(tL_contacts_resolvedPeer.chats, false);
        org.telegram.messenger.vr.a0(zm0Var.currentAccount).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
        String str = zm0Var.H;
        zm0Var.H = null;
        zm0Var.i0(str, "", z10, false);
    }

    public static org.telegram.ui.Cells.q5 a0(zm0 zm0Var, int i7) {
        int childCount = zm0Var.L.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = zm0Var.L.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.q5) {
                org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                int intValue = ((Integer) q5Var.getTag()).intValue();
                org.telegram.messenger.ve veVar = zm0Var.K;
                if (veVar == null ? !(intValue < 0 || intValue >= zm0Var.f.size()) : !(intValue < 0 || intValue >= veVar.e.size())) {
                    if (intValue == i7) {
                        return q5Var;
                    }
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.da));
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        this.Z = false;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i7 = this.v0;
        org.telegram.ui.ActionBar.q6.h(i7, kVar, null);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = this.w0;
        org.telegram.ui.ActionBar.q6.l(kVar2, 5, i10, null);
        int i11 = 1;
        org.telegram.ui.ActionBar.q6.l(this.actionBar, 1, i10, null);
        org.telegram.ui.ActionBar.q6.l(this.actionBar, 3, this.x0, null);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i12 = this.a;
        org.telegram.messenger.ve veVar = this.K;
        if (veVar != null) {
            this.actionBar.setTitle(veVar.c);
        } else if (i12 == 0) {
            this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131745761, null));
        } else if (i12 == 1) {
            this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131745764, null));
        }
        this.actionBar.setActionBarMenuOnItemClick(new lx(this, 25));
        int i13 = 2;
        if (this.m0) {
            org.telegram.ui.ActionBar.q0 a10 = this.actionBar.s().a(0, R.drawable.ic_ab_other);
            a10.setSubMenuDelegate(new um0(this));
            this.R = a10.e(1, R.drawable.msg_list, org.telegram.messenger.hd.M0(2131745345, null));
            a10.e(2, R.drawable.msg_openin, org.telegram.messenger.hd.M0(2131747796, null));
        }
        if (veVar == null) {
            org.telegram.ui.ActionBar.q0 a11 = this.actionBar.s().a(0, R.drawable.outline_header_search);
            a11.O();
            a11.I = new hi.s2(this);
            this.Q = a11;
            EditTextBoldCursor searchField = a11.getSearchField();
            org.telegram.ui.ActionBar.q6.U(searchField, i10, null);
            org.telegram.ui.ActionBar.q6.v(searchField, i10, null);
            org.telegram.ui.ActionBar.q6.D(searchField, org.telegram.ui.ActionBar.j6.Me, null);
        }
        if (veVar == null) {
            if (i12 == 0) {
                this.Q.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745761, null));
            } else if (i12 == 1) {
                this.Q.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745764, null));
            }
        }
        vm0 vm0Var = new vm0(this, context);
        this.g0 = vm0Var;
        org.telegram.ui.ActionBar.q6.h(i7, vm0Var, null);
        this.fragmentView = this.g0;
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(context, null);
        this.L = uj0Var;
        uj0Var.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(50.0f));
        this.L.setClipToPadding(false);
        this.L.setHorizontalScrollBarEnabled(false);
        this.L.setVerticalScrollBarEnabled(false);
        this.L.setItemAnimator(null);
        this.L.setLayoutAnimation(null);
        org.telegram.ui.Components.uj0 uj0Var2 = this.L;
        int i14 = 4;
        wm0 wm0Var = new wm0(4);
        this.N = wm0Var;
        uj0Var2.setLayoutManager(wm0Var);
        this.N.O = new bi.y1(this, 16);
        this.g0.addView(this.L, c8.ja.e(-1, -1, 51));
        org.telegram.ui.Components.uj0 uj0Var3 = this.L;
        l4 l4Var = new l4(14, this, context);
        this.M = l4Var;
        uj0Var3.setAdapter(l4Var);
        org.telegram.ui.ActionBar.q6.H(this.L, i7, null);
        this.L.setOnItemClickListener(new h(this, 21));
        if (this.I != 1) {
            this.L.setOnItemLongClickListener(new sm0(this, i13));
        }
        org.telegram.ui.Components.yj0 yj0Var = new org.telegram.ui.Components.yj0(new um0(this));
        this.W = yj0Var;
        if (this.I != 1) {
            this.L.F.add(yj0Var);
        }
        hi.q2 q2Var = new hi.q2(i11, context, getResourceProvider());
        this.P = q2Var;
        q2Var.setAlpha(0.0f);
        this.P.setVisibility(8);
        org.telegram.ui.Components.cv0 cv0Var = new org.telegram.ui.Components.cv0(context, this.P, 1, getResourceProvider());
        this.O = cv0Var;
        cv0Var.setAnimateLayoutChange(true);
        this.O.d.setTypeface(Typeface.DEFAULT);
        this.O.d.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.q6.U(this.O.d, org.telegram.ui.ActionBar.j6.y6, getResourceProvider());
        this.O.addView(this.P, 0);
        if (veVar != null) {
            this.O.d.setText(org.telegram.messenger.hd.M0(2131748180, null));
        } else {
            this.O.d.setText(org.telegram.messenger.hd.M0(2131748169, null));
        }
        this.O.e(false, false);
        this.g0.addView(this.O, c8.ja.d(-1, -1.0f, 51, 0.0f, 126.0f, 0.0f, 0.0f));
        this.L.setOnScrollListener(new g3(this, 23));
        if (veVar == null) {
            o0();
        }
        if (this.r0) {
            View view = new View(context);
            this.d0 = view;
            view.setBackgroundResource(R.drawable.header_shadow_reverse);
            this.d0.setTranslationY(org.telegram.messenger.g0.L(48.0f));
            this.g0.addView(this.d0, c8.ja.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            this.a0 = frameLayout;
            org.telegram.ui.ActionBar.q6.h(i7, frameLayout, null);
            this.a0.setVisibility(4);
            this.a0.setTranslationY(org.telegram.messenger.g0.L(48.0f));
            this.g0.addView(this.a0, c8.ja.e(-1, 48, 83));
            this.a0.setOnTouchListener(new gi.a(i13));
            org.telegram.ui.Components.rt rtVar = this.e0;
            if (rtVar != null) {
                rtVar.o();
            }
            int i15 = 14;
            this.e0 = new org.telegram.ui.Components.rt(context, this.g0, null, 1, false, null);
            this.e0.setFilters(new InputFilter[]{new InputFilter.LengthFilter(org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).H0())});
            this.e0.setHint(org.telegram.messenger.hd.M0(2131754454, null));
            this.e0.s();
            org.telegram.ui.Components.ft editText = this.e0.getEditText();
            editText.setMaxLines(1);
            editText.setSingleLine(true);
            this.a0.addView(this.e0, c8.ja.d(-1, -1.0f, 51, 0.0f, 0.0f, 84.0f, 0.0f));
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.e0.setText(charSequence);
            }
            this.e0.getEditText().addTextChangedListener(new m0(this, i15));
            k0 k0Var = new k0(18, context, this);
            this.b0 = k0Var;
            k0Var.setFocusable(true);
            this.b0.setFocusableInTouchMode(true);
            this.b0.setVisibility(4);
            this.b0.setScaleX(0.2f);
            this.b0.setScaleY(0.2f);
            this.b0.setAlpha(0.0f);
            this.g0.addView(this.b0, c8.ja.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
            this.f0 = new ImageView(context);
            this.f0.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.j0(org.telegram.messenger.g0.L(56.0f), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.S5, false), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.T5, false)));
            this.f0.setImageResource(R.drawable.attach_send);
            this.f0.setImportantForAccessibility(2);
            org.telegram.ui.ActionBar.q6.s(this.f0, org.telegram.ui.ActionBar.j6.U5, null, PorterDuff.Mode.MULTIPLY);
            this.f0.setScaleType(ImageView.ScaleType.CENTER);
            this.f0.setOutlineProvider(new bg.p0(20));
            this.b0.addView(this.f0, c8.ja.d(56, 56.0f, 51, 2.0f, 0.0f, 0.0f, 0.0f));
            this.f0.setOnClickListener(new g40(this, 19));
            this.f0.setOnLongClickListener(new t(this, i14));
            float L = org.telegram.messenger.g0.L(12.0f);
            TextPaint textPaint = this.i0;
            textPaint.setTextSize(L);
            textPaint.setTypeface(org.telegram.messenger.g0.o());
            rv rvVar = new rv(5, context, this);
            this.c0 = rvVar;
            rvVar.setAlpha(0.0f);
            this.c0.setScaleX(0.2f);
            this.c0.setScaleY(0.2f);
            this.g0.addView(this.c0, c8.ja.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
            if (this.U != 0) {
                this.e0.setVisibility(8);
            }
        }
        this.e = (veVar != null || i12 == 0 || i12 == 1) && this.J;
        this.L.setEmptyView(this.O);
        org.telegram.ui.Components.uj0 uj0Var4 = this.L;
        uj0Var4.X1 = true;
        uj0Var4.Y1 = 0;
        n0(0);
        return this.fragmentView;
    }

    public final int d0(int i7, Object obj) {
        boolean z10 = obj instanceof org.telegram.messenger.ff;
        Object valueOf = z10 ? Integer.valueOf(((org.telegram.messenger.ff) obj).C) : obj instanceof org.telegram.messenger.jf ? ((org.telegram.messenger.jf) obj).B : null;
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
            if (z10) {
                ((org.telegram.messenger.ff) obj).e();
            } else if (obj instanceof org.telegram.messenger.jf) {
                ((org.telegram.messenger.jf) obj).e();
            }
            this.y0.X(i7);
        }
        return indexOf;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.t) {
            removeSelfFromStack(true);
        }
    }

    public final void e0() {
        this.n.clear();
        l4 l4Var = this.M;
        if (l4Var != null) {
            l4Var.f();
        }
        this.O.e(false, true);
        h0();
    }

    public final void f0(View view, Object obj) {
        boolean z10 = d0(-1, obj) == -1;
        if (view instanceof org.telegram.ui.Cells.g7) {
            ((org.telegram.ui.Cells.g7) view).b(this.c.contains(Integer.valueOf(((org.telegram.messenger.ff) this.K.e.get(((Integer) view.getTag()).intValue())).C)), true);
        }
        n0(z10 ? 1 : 2);
        this.t0.y();
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
            this.O.d.setText(org.telegram.messenger.hd.M0(2131748169, null));
        } else {
            this.O.d.setText(org.telegram.messenger.hd.a0("NoResultFoundFor", null, 2131748166, this.w));
        }
        o0();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.g0, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, this.v0));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.actionBar, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, this.v0));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.actionBar, 64, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, this.w0));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.actionBar, 128, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, this.w0));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.actionBar, 256, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, this.x0));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, this.w0));
        org.telegram.ui.ActionBar.q0 q0Var = this.Q;
        arrayList.add(new org.telegram.ui.ActionBar.s6(q0Var != null ? q0Var.getSearchField() : null, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, this.w0));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.L, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, this.v0));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.L, 0, new Class[]{View.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.X9));
        return arrayList;
    }

    public final void h0() {
        SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("web_recent_search", 0).edit();
        edit.clear();
        edit.putInt("count", this.n.size());
        int size = this.n.size();
        for (int i7 = 0; i7 < size; i7++) {
            edit.putString(i5.c.i(i7, "recent"), (String) this.n.get(i7));
        }
        edit.commit();
    }

    public final void i0(String str, String str2, boolean z10, boolean z11) {
        if (this.r) {
            this.r = false;
            if (this.y != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.y, true);
                this.y = 0;
            }
        }
        this.H = str;
        this.r = true;
        org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(this.currentAccount);
        org.telegram.messenger.np s13 = org.telegram.messenger.np.s1(this.currentAccount);
        TLObject f22 = s12.f2(z10 ? s13.L3 : s13.M3);
        if (!(f22 instanceof TLRPC.User)) {
            if (!z11 || this.G) {
                return;
            }
            this.G = true;
            TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
            org.telegram.messenger.np s14 = org.telegram.messenger.np.s1(this.currentAccount);
            tL_contacts_resolveUsername.username = z10 ? s14.L3 : s14.M3;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_resolveUsername, new hi.b3(10, this, z10));
            return;
        }
        TLRPC.User user = (TLRPC.User) f22;
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.query = str == null ? "" : str;
        tL_messages_getInlineBotResults.bot = org.telegram.messenger.np.s1(this.currentAccount).q1(user);
        tL_messages_getInlineBotResults.offset = str2;
        an anVar = this.V;
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
        int i7 = this.E + 1;
        this.E = i7;
        this.y = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getInlineBotResults, new org.telegram.messenger.zm(this, str, i7, z10, user));
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(this.y, this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isLightStatusBar() {
        return org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.a7, false)) > 0.721f;
    }

    public final void j0(int i7, boolean z10) {
        HashMap hashMap = this.b;
        if (hashMap.isEmpty() || this.t0 == null || this.T) {
            return;
        }
        org.telegram.ui.Components.rt rtVar = this.e0;
        if (rtVar != null && rtVar.a.length() > 0) {
            Object obj = hashMap.get(this.c.get(0));
            if (obj instanceof org.telegram.messenger.ff) {
                ((org.telegram.messenger.ff) obj).a = this.e0.getText().toString();
            } else if (obj instanceof org.telegram.messenger.jf) {
                ((org.telegram.messenger.jf) obj).I = this.e0.getText().toString();
            }
        }
        this.T = true;
        this.t0.t0(i7, false, z10);
        if (this.U != 2) {
            ym0 ym0Var = this.t0;
            if (ym0Var == null || ym0Var.e()) {
                finishFragment();
            }
        }
    }

    public final void k0(int i7, boolean z10) {
        this.I = i7;
        this.J = z10;
        if (i7 <= 0 || this.a != 1) {
            return;
        }
        this.I = 1;
    }

    public final boolean l0(boolean z10, boolean z11) {
        if (this.e0 != null) {
            if (z10 != (this.a0.getTag() != null)) {
                AnimatorSet animatorSet = this.l0;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                this.a0.setTag(z10 ? 1 : null);
                if (this.e0.getEditText().isFocused()) {
                    org.telegram.messenger.g0.v1(this.e0.getEditText());
                }
                this.e0.k(true);
                if (z10) {
                    this.a0.setVisibility(0);
                    this.b0.setVisibility(0);
                }
                int i7 = 4;
                if (!z11) {
                    this.b0.setScaleX(z10 ? 1.0f : 0.2f);
                    this.b0.setScaleY(z10 ? 1.0f : 0.2f);
                    this.b0.setAlpha(z10 ? 1.0f : 0.0f);
                    this.c0.setScaleX(z10 ? 1.0f : 0.2f);
                    this.c0.setScaleY(z10 ? 1.0f : 0.2f);
                    this.c0.setAlpha(z10 ? 1.0f : 0.0f);
                    this.a0.setTranslationY(z10 ? 0.0f : org.telegram.messenger.g0.L(48.0f));
                    this.d0.setTranslationY(z10 ? 0.0f : org.telegram.messenger.g0.L(48.0f));
                    if (!z10) {
                        this.a0.setVisibility(4);
                        this.b0.setVisibility(4);
                    }
                    return true;
                }
                this.l0 = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                k0 k0Var = this.b0;
                Property property = View.SCALE_X;
                arrayList.add(ObjectAnimator.ofFloat(k0Var, (Property<k0, Float>) property, z10 ? 1.0f : 0.2f));
                k0 k0Var2 = this.b0;
                Property property2 = View.SCALE_Y;
                arrayList.add(ObjectAnimator.ofFloat(k0Var2, (Property<k0, Float>) property2, z10 ? 1.0f : 0.2f));
                k0 k0Var3 = this.b0;
                Property property3 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(k0Var3, (Property<k0, Float>) property3, z10 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.c0, (Property<rv, Float>) property, z10 ? 1.0f : 0.2f));
                arrayList.add(ObjectAnimator.ofFloat(this.c0, (Property<rv, Float>) property2, z10 ? 1.0f : 0.2f));
                arrayList.add(ObjectAnimator.ofFloat(this.c0, (Property<rv, Float>) property3, z10 ? 1.0f : 0.0f));
                FrameLayout frameLayout = this.a0;
                Property property4 = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property4, z10 ? 0.0f : org.telegram.messenger.g0.L(48.0f)));
                arrayList.add(ObjectAnimator.ofFloat(this.d0, (Property<View, Float>) property4, z10 ? 0.0f : org.telegram.messenger.g0.L(48.0f)));
                this.l0.playTogether(arrayList);
                this.l0.setInterpolator(new DecelerateInterpolator());
                this.l0.setDuration(180L);
                this.l0.addListener(new z20(i7, this, z10));
                this.l0.start();
                return true;
            }
        }
        return false;
    }

    public final void m0() {
        if (this.e) {
            int childCount = this.L.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = this.L.getChildAt(i7);
                boolean z10 = childAt instanceof org.telegram.ui.Cells.q5;
                org.telegram.messenger.ve veVar = this.K;
                ArrayList arrayList = this.c;
                if (z10) {
                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                    Integer num = (Integer) childAt.getTag();
                    if (veVar != null) {
                        q5Var.setNum(this.e ? arrayList.indexOf(Integer.valueOf(((org.telegram.messenger.ff) veVar.e.get(num.intValue())).C)) : -1);
                    } else {
                        q5Var.setNum(this.e ? arrayList.indexOf(((org.telegram.messenger.jf) this.f.get(num.intValue())).B) : -1);
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.g7) {
                    ((org.telegram.ui.Cells.g7) childAt).b(arrayList.indexOf(Integer.valueOf(((org.telegram.messenger.ff) veVar.e.get(((Integer) childAt.getTag()).intValue())).C)) != 0, false);
                }
            }
        }
    }

    public final void n0(int i7) {
        if (this.b.size() == 0) {
            this.c0.setPivotX(0.0f);
            this.c0.setPivotY(0.0f);
            l0(false, i7 != 0);
            return;
        }
        this.c0.invalidate();
        if (l0(true, i7 != 0) || i7 == 0) {
            this.c0.setPivotX(0.0f);
            this.c0.setPivotY(0.0f);
            return;
        }
        this.c0.setPivotX(org.telegram.messenger.g0.L(21.0f));
        this.c0.setPivotY(org.telegram.messenger.g0.L(12.0f));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.c0, (Property<rv, Float>) View.SCALE_X, i7 == 1 ? 1.1f : 0.9f, 1.0f), ObjectAnimator.ofFloat(this.c0, (Property<rv, Float>) View.SCALE_Y, i7 == 1 ? 1.1f : 0.9f, 1.0f));
        animatorSet.setInterpolator(new OvershootInterpolator());
        animatorSet.setDuration(180L);
        animatorSet.start();
    }

    public final void o0() {
        String str;
        l4 l4Var = this.M;
        if (l4Var != null) {
            l4Var.f();
        }
        if (this.r || (this.n.size() > 0 && ((str = this.w) == null || TextUtils.isEmpty(str)))) {
            this.O.e(true, true);
        } else {
            this.O.e(false, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.rt rtVar = this.e0;
        if (rtVar == null || !rtVar.e) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        rtVar.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onFragmentCreate() {
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.t);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onFragmentDestroy() {
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.t);
        if (this.y != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.y, true);
            this.y = 0;
        }
        org.telegram.ui.Components.rt rtVar = this.e0;
        if (rtVar != null) {
            rtVar.o();
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onPanTranslationUpdate(float f10) {
        org.telegram.ui.Components.uj0 uj0Var = this.L;
        if (uj0Var == null) {
            return;
        }
        if (!this.e0.e) {
            uj0Var.setTranslationY(f10);
        } else {
            this.fragmentView.setTranslationY(f10);
            this.L.setTranslationY(0.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onResume() {
        super.onResume();
        l4 l4Var = this.M;
        if (l4Var != null) {
            l4Var.f();
        }
        org.telegram.ui.Components.rt rtVar = this.e0;
        if (rtVar != null) {
            rtVar.s();
        }
        org.telegram.ui.ActionBar.q0 q0Var = this.Q;
        if (q0Var != null) {
            q0Var.G(true);
            if (!TextUtils.isEmpty(this.q0)) {
                this.Q.Q(this.q0, false);
                this.q0 = null;
                g0(this.Q.getSearchField());
            }
            getParentActivity().getWindow().setSoftInputMode(32);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.q0 q0Var;
        if (!z10 || (q0Var = this.Q) == null) {
            return;
        }
        org.telegram.messenger.g0.J3(q0Var.getSearchField());
    }
}

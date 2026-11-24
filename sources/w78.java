// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class w78 extends d implements jm7 {
    public int E;
    public final boolean F;
    public boolean G;
    public String H;
    public int I;
    public boolean J;
    public final yn6 K;
    public r59 L;
    public s30 M;
    public s78 N;
    public a1b O;
    public jm2 P;
    public r7 Q;
    public a8 R;
    public int S;
    public boolean T;
    public final byte U;
    public final yv1 V;
    public y69 W;
    public byte X;
    public boolean Y;
    public boolean Z;
    public final boolean a;
    public FrameLayout a0;
    public final HashMap b;
    public ne6 b0;
    public final ArrayList c;
    public sb c0;
    public Editable d;
    public View d0;
    public boolean e;
    public cv3 e0;
    public final ArrayList f;
    public ImageView f0;
    public r78 g0;
    public final HashMap h;
    public byte h0;
    public final TextPaint i0;
    public final RectF j0;
    public final Paint k0;
    public AnimatorSet l0;
    public boolean m0;
    public final ArrayList n;
    public m8 n0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout o0;
    public a8[] p0;
    public String q0;
    public boolean r;
    public boolean r0;
    public boolean s;
    public final boolean s0;
    public u78 t0;
    public v78 u0;
    public final int v0;
    public String w;
    public final int w0;
    public String x;
    public final int x0;
    public int y;
    public final p78 y0;

    /* JADX WARN: Multi-variable type inference failed */
    public w78(int i, yn6 yn6Var, HashMap hashMap, ArrayList arrayList, int i2, boolean z, yv1 yv1Var, boolean z2) {
        super(null);
        this.f = new ArrayList();
        this.h = new HashMap();
        this.n = new ArrayList();
        this.s = true;
        this.J = true;
        this.S = 100;
        this.h0 = (byte) 3;
        this.i0 = new TextPaint(1);
        this.j0 = new RectF();
        this.k0 = new Paint(1);
        this.r0 = true;
        this.y0 = new p78(this);
        this.K = yn6Var;
        this.b = hashMap;
        this.c = arrayList;
        this.a = i;
        this.U = i2;
        this.V = yv1Var;
        this.F = z;
        this.s0 = z2;
        if (yn6Var == null) {
            SharedPreferences sharedPreferences = a.b.getSharedPreferences("web_recent_search", 0);
            int i3 = sharedPreferences.getInt("count", 0);
            for (int i4 = 0; i4 < i3; i4++) {
                String string = sharedPreferences.getString("recent" + i4, null);
                if (string == null) {
                    break;
                }
                this.n.add(string);
            }
        }
        if (z2) {
            this.v0 = cmb.kh;
            this.w0 = cmb.Xg;
            this.x0 = cmb.Yg;
        } else {
            this.v0 = cmb.g5;
            this.w0 = cmb.i5;
            this.x0 = cmb.H5;
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.ca));
    }

    public final int b0(int i, Object obj) {
        boolean z = obj instanceof jo6;
        Object valueOf = z ? Integer.valueOf(((jo6) obj).C) : obj instanceof no6 ? ((no6) obj).B : null;
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
        if (i >= 0) {
            if (z) {
                ((jo6) obj).e();
            } else if (obj instanceof no6) {
                ((no6) obj).e();
            }
            this.y0.Y(i);
        }
        return indexOf;
    }

    public final void c0() {
        this.n.clear();
        s30 s30Var = this.M;
        if (s30Var != null) {
            s30Var.f();
        }
        this.O.e(false, true);
        h0();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        this.Z = false;
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        int i = this.v0;
        anb.h(i, null, aVar);
        org.telegram.ui.ActionBar.a aVar2 = this.actionBar;
        int i2 = this.w0;
        anb.l(aVar2, 5, i2, null);
        byte b = 1;
        anb.l(this.actionBar, 1, i2, null);
        byte b2 = 3;
        anb.l(this.actionBar, 3, this.x0, null);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        boolean z = this.a;
        yn6 yn6Var = this.K;
        if (yn6Var != null) {
            this.actionBar.setTitle(yn6Var.c);
        } else if (!z) {
            this.actionBar.setTitle(jb6.M0(2131745495, null));
        } else if (z) {
            this.actionBar.setTitle(jb6.M0(2131745498, null));
        }
        this.actionBar.setActionBarMenuOnItemClick(new wl5(this, (byte) 20));
        if (this.m0) {
            r7 a = this.actionBar.t().a(0, R.drawable.ic_ab_other);
            a.setSubMenuDelegate(new k44(this, (byte) 24));
            this.R = a.e(1, R.drawable.msg_list, jb6.M0(2131745079, null));
            a.e(2, R.drawable.msg_openin, jb6.M0(2131747529, null));
        }
        if (yn6Var == null) {
            r7 a2 = this.actionBar.t().a(0, R.drawable.outline_header_search);
            a2.N();
            a2.I = new cn0(this);
            this.Q = a2;
            EditTextBoldCursor searchField = a2.getSearchField();
            anb.X(searchField, i2, null);
            anb.v(searchField, i2, null);
            anb.D(searchField, cmb.Le, null);
            if (!z) {
                this.Q.setSearchFieldHint(jb6.M0(2131745495, null));
            } else if (z) {
                this.Q.setSearchFieldHint(jb6.M0(2131745498, null));
            }
        }
        r78 r78Var = new r78(this, context);
        this.g0 = r78Var;
        anb.h(i, null, r78Var);
        this.fragmentView = this.g0;
        r59 r59Var = new r59(context, null);
        this.L = r59Var;
        r59Var.setPadding(gm.L(2.0f), gm.L(2.0f), gm.L(2.0f), gm.L(50.0f));
        this.L.setClipToPadding(false);
        this.L.setHorizontalScrollBarEnabled(false);
        this.L.setVerticalScrollBarEnabled(false);
        this.L.setItemAnimator(null);
        this.L.setLayoutAnimation(null);
        r59 r59Var2 = this.L;
        s78 s78Var = new s78(4);
        this.N = s78Var;
        r59Var2.setLayoutManager(s78Var);
        byte b3 = 12;
        this.N.O = new zr1(this, b3);
        this.g0.addView(this.L, qoe.e(-1, -1, 51));
        r59 r59Var3 = this.L;
        s30 s30Var = new s30(this, context, b3);
        this.M = s30Var;
        r59Var3.setAdapter(s30Var);
        anb.H(this.L, i, null);
        this.L.setOnItemClickListener(new kg4(this, (byte) 19));
        if (this.I != 1) {
            this.L.setOnItemLongClickListener(new o78(this, b2));
        }
        y69 y69Var = new y69(new lj4(this));
        this.W = y69Var;
        if (this.I != 1) {
            this.L.F.add(y69Var);
        }
        jm2 jm2Var = new jm2(context, getResourceProvider(), b2);
        this.P = jm2Var;
        jm2Var.setAlpha(0.0f);
        this.P.setVisibility(8);
        a1b a1bVar = new a1b(context, this.P, 1, getResourceProvider());
        this.O = a1bVar;
        a1bVar.setAnimateLayoutChange(true);
        this.O.d.setTypeface(Typeface.DEFAULT);
        this.O.d.setTextSize(1, 16.0f);
        anb.X(this.O.d, cmb.x6, getResourceProvider());
        this.O.addView(this.P, 0);
        a1b a1bVar2 = this.O;
        if (yn6Var != null) {
            a1bVar2.d.setText(jb6.M0(2131747914, null));
        } else {
            a1bVar2.d.setText(jb6.M0(2131747903, null));
        }
        this.O.e(false, false);
        this.g0.addView(this.O, qoe.d(-1, -1.0f, 51, 0.0f, 126.0f, 0.0f, 0.0f));
        this.L.setOnScrollListener(new so7(this, b));
        if (yn6Var == null) {
            o0();
        }
        if (this.r0) {
            View view = new View(context);
            this.d0 = view;
            view.setBackgroundResource(R.drawable.header_shadow_reverse);
            this.d0.setTranslationY(gm.L(48.0f));
            this.g0.addView(this.d0, qoe.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            this.a0 = frameLayout;
            anb.h(i, null, frameLayout);
            this.a0.setVisibility(4);
            this.a0.setTranslationY(gm.L(48.0f));
            this.g0.addView(this.a0, qoe.e(-1, 48, 83));
            this.a0.setOnTouchListener(new w02((byte) 20));
            cv3 cv3Var = this.e0;
            if (cv3Var != null) {
                cv3Var.o();
            }
            this.e0 = new cv3(context, this.g0, null, 1, false, null);
            this.e0.setFilters(new InputFilter[]{new InputFilter.LengthFilter(oc7.r1(z8c.t0).G0())});
            this.e0.setHint(jb6.M0(2131754451, null));
            this.e0.s();
            qu3 editText = this.e0.getEditText();
            editText.setMaxLines(1);
            editText.setSingleLine(true);
            this.a0.addView(this.e0, qoe.d(-1, -1.0f, 51, 0.0f, 0.0f, 84.0f, 0.0f));
            Editable editable = this.d;
            if (editable != null) {
                this.e0.setText(editable);
            }
            this.e0.getEditText().addTextChangedListener(new og6(this, (byte) 6));
            ne6 ne6Var = new ne6((byte) 7, context, this);
            this.b0 = ne6Var;
            ne6Var.setFocusable(true);
            this.b0.setFocusableInTouchMode(true);
            this.b0.setVisibility(4);
            this.b0.setScaleX(0.2f);
            this.b0.setScaleY(0.2f);
            this.b0.setAlpha(0.0f);
            this.g0.addView(this.b0, qoe.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
            this.f0 = new ImageView(context);
            this.f0.setBackgroundDrawable(cmb.h0(gm.L(56.0f), cmb.w0(null, cmb.R5, false), cmb.w0(null, cmb.S5, false)));
            this.f0.setImageResource(R.drawable.attach_send);
            this.f0.setImportantForAccessibility(2);
            anb.s(this.f0, cmb.T5, null, PorterDuff.Mode.MULTIPLY);
            this.f0.setScaleType(ImageView.ScaleType.CENTER);
            byte b4 = 9;
            this.f0.setOutlineProvider(new xj(b4));
            this.b0.addView(this.f0, qoe.d(56, 56.0f, 51, 2.0f, 0.0f, 0.0f, 0.0f));
            this.f0.setOnClickListener(new m67(this, (byte) 15));
            this.f0.setOnLongClickListener(new au(this, b4));
            float L = gm.L(12.0f);
            TextPaint textPaint = this.i0;
            textPaint.setTextSize(L);
            textPaint.setTypeface(gm.o());
            sb sbVar = new sb((byte) 25, context, this);
            this.c0 = sbVar;
            sbVar.setAlpha(0.0f);
            this.c0.setScaleX(0.2f);
            this.c0.setScaleY(0.2f);
            this.g0.addView(this.c0, qoe.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
            if (this.U != 0) {
                this.e0.setVisibility(8);
            }
        }
        this.e = !(yn6Var == null && z && !z) && this.J;
        this.L.setEmptyView(this.O);
        r59 r59Var4 = this.L;
        r59Var4.X1 = true;
        r59Var4.Y1 = false;
        n0(0);
        return this.fragmentView;
    }

    public final q68 d0(int i) {
        int childCount = this.L.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.L.getChildAt(i2);
            if (childAt instanceof q68) {
                q68 q68Var = (q68) childAt;
                int intValue = ((Integer) q68Var.getTag()).intValue();
                yn6 yn6Var = this.K;
                if (yn6Var == null ? !(intValue < 0 || intValue >= this.f.size()) : !(intValue < 0 || intValue >= yn6Var.e.size())) {
                    if (intValue == i) {
                        return q68Var;
                    }
                }
            }
        }
        return null;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.s) {
            removeSelfFromStack(true);
        }
    }

    public final /* synthetic */ void e0(TLObject tLObject, boolean z) {
        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
        oc7.r1(this.currentAccount).d4(tL_contacts_resolvedPeer.users, false);
        oc7.r1(this.currentAccount).X3(tL_contacts_resolvedPeer.chats, false);
        cf7.Y(this.currentAccount).j1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
        String str = this.H;
        this.H = null;
        i0(str, "", z, false);
    }

    public final void f0(View view, Object obj) {
        boolean z = b0(-1, obj) == -1;
        if (view instanceof ida) {
            ((ida) view).b(this.c.contains(Integer.valueOf(((jo6) this.K.e.get(((Integer) view.getTag()).intValue())).C)), true);
        }
        n0(z ? 1 : 2);
        this.t0.e();
    }

    public final void g0(EditTextBoldCursor editTextBoldCursor) {
        if (editTextBoldCursor.getText().length() == 0) {
            return;
        }
        String obj = editTextBoldCursor.getText().toString();
        this.f.clear();
        this.h.clear();
        this.s = true;
        i0(obj, "", this.a, true);
        this.w = obj;
        if (obj.length() == 0) {
            this.w = null;
            this.O.d.setText(jb6.M0(2131747903, null));
        } else {
            this.O.d.setText(jb6.a0("NoResultFoundFor", null, 2131747900, this.w));
        }
        o0();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new cnb(this.g0, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, this.v0));
        arrayList.add(new cnb(this.actionBar, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, this.v0));
        arrayList.add(new cnb(this.actionBar, 64, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, this.w0));
        arrayList.add(new cnb(this.actionBar, 128, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, this.w0));
        arrayList.add(new cnb(this.actionBar, 256, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, this.x0));
        arrayList.add(new cnb(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, this.w0));
        r7 r7Var = this.Q;
        arrayList.add(new cnb(r7Var != null ? r7Var.getSearchField() : null, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, this.w0));
        arrayList.add(new cnb(this.L, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, this.v0));
        arrayList.add(new cnb(this.L, 0, new Class[]{View.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.W9));
        return arrayList;
    }

    public final void h0() {
        SharedPreferences.Editor edit = a.b.getSharedPreferences("web_recent_search", 0).edit();
        edit.clear();
        edit.putInt("count", this.n.size());
        int size = this.n.size();
        for (int i = 0; i < size; i++) {
            edit.putString(hg9.j(i, "recent"), (String) this.n.get(i));
        }
        edit.commit();
    }

    public final void i0(String str, String str2, boolean z, boolean z2) {
        if (this.r) {
            this.r = false;
            if (this.y != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.y, true);
                this.y = 0;
            }
        }
        this.H = str;
        this.r = true;
        oc7 r1 = oc7.r1(this.currentAccount);
        oc7 r12 = oc7.r1(this.currentAccount);
        TLObject b2 = r1.b2(z ? r12.o3 : r12.p3);
        if (!(b2 instanceof TLRPC.User)) {
            if (!z2 || this.G) {
                return;
            }
            this.G = true;
            TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
            oc7 r13 = oc7.r1(this.currentAccount);
            tL_contacts_resolveUsername.username = z ? r13.o3 : r13.p3;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_resolveUsername, new r91((byte) 10, this, z));
            return;
        }
        TLRPC.User user = (TLRPC.User) b2;
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.query = str == null ? "" : str;
        tL_messages_getInlineBotResults.bot = oc7.r1(this.currentAccount).p1(user);
        tL_messages_getInlineBotResults.offset = str2;
        yv1 yv1Var = this.V;
        if (yv1Var != null) {
            long a = yv1Var.a();
            if (pg3.B(a)) {
                tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            } else {
                tL_messages_getInlineBotResults.peer = getMessagesController().i1(a);
            }
        } else {
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        }
        int i = this.E + 1;
        this.E = i;
        this.y = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getInlineBotResults, new ia7(this, str, i, z, user));
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(this.y, this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isLightStatusBar() {
        return gm.B(cmb.w0(null, cmb.Z6, false)) > 0.721f;
    }

    public final void j0(int i, boolean z) {
        HashMap hashMap = this.b;
        if (hashMap.isEmpty() || this.t0 == null || this.T) {
            return;
        }
        cv3 cv3Var = this.e0;
        if (cv3Var != null && cv3Var.a.length() > 0) {
            Object obj = hashMap.get(this.c.get(0));
            if (obj instanceof jo6) {
                ((jo6) obj).a = this.e0.getText().toString();
            } else if (obj instanceof no6) {
                ((no6) obj).I = this.e0.getText().toString();
            }
        }
        this.T = true;
        this.t0.k(i, false, z);
        if (this.U != 2) {
            u78 u78Var = this.t0;
            if (u78Var == null || u78Var.c()) {
                finishFragment();
            }
        }
    }

    public final void k0(int i, boolean z) {
        this.I = i;
        this.J = z;
        if (i <= 0 || !this.a) {
            return;
        }
        this.I = 1;
    }

    public final boolean l0(boolean z, boolean z2) {
        if (this.e0 != null) {
            if (z != (this.a0.getTag() != null)) {
                AnimatorSet animatorSet = this.l0;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                this.a0.setTag(z ? 1 : null);
                if (this.e0.getEditText().isFocused()) {
                    gm.t1(this.e0.getEditText());
                }
                this.e0.k(true);
                if (z) {
                    this.a0.setVisibility(0);
                    this.b0.setVisibility(0);
                }
                if (!z2) {
                    this.b0.setScaleX(z ? 1.0f : 0.2f);
                    this.b0.setScaleY(z ? 1.0f : 0.2f);
                    this.b0.setAlpha(z ? 1.0f : 0.0f);
                    this.c0.setScaleX(z ? 1.0f : 0.2f);
                    this.c0.setScaleY(z ? 1.0f : 0.2f);
                    this.c0.setAlpha(z ? 1.0f : 0.0f);
                    this.a0.setTranslationY(z ? 0.0f : gm.L(48.0f));
                    this.d0.setTranslationY(z ? 0.0f : gm.L(48.0f));
                    if (!z) {
                        this.a0.setVisibility(4);
                        this.b0.setVisibility(4);
                    }
                    return true;
                }
                this.l0 = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                ne6 ne6Var = this.b0;
                Property property = View.SCALE_X;
                arrayList.add(ObjectAnimator.ofFloat(ne6Var, (Property<ne6, Float>) property, z ? 1.0f : 0.2f));
                ne6 ne6Var2 = this.b0;
                Property property2 = View.SCALE_Y;
                arrayList.add(ObjectAnimator.ofFloat(ne6Var2, (Property<ne6, Float>) property2, z ? 1.0f : 0.2f));
                ne6 ne6Var3 = this.b0;
                Property property3 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(ne6Var3, (Property<ne6, Float>) property3, z ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.c0, (Property<sb, Float>) property, z ? 1.0f : 0.2f));
                arrayList.add(ObjectAnimator.ofFloat(this.c0, (Property<sb, Float>) property2, z ? 1.0f : 0.2f));
                arrayList.add(ObjectAnimator.ofFloat(this.c0, (Property<sb, Float>) property3, z ? 1.0f : 0.0f));
                FrameLayout frameLayout = this.a0;
                Property property4 = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property4, z ? 0.0f : gm.L(48.0f)));
                arrayList.add(ObjectAnimator.ofFloat(this.d0, (Property<View, Float>) property4, z ? 0.0f : gm.L(48.0f)));
                this.l0.playTogether(arrayList);
                this.l0.setInterpolator(new DecelerateInterpolator());
                this.l0.setDuration(180L);
                this.l0.addListener(new jf4((byte) 21, this, z));
                this.l0.start();
                return true;
            }
        }
        return false;
    }

    public final void m0() {
        if (this.e) {
            int childCount = this.L.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.L.getChildAt(i);
                boolean z = childAt instanceof q68;
                yn6 yn6Var = this.K;
                ArrayList arrayList = this.c;
                if (z) {
                    q68 q68Var = (q68) childAt;
                    Integer num = (Integer) childAt.getTag();
                    if (yn6Var != null) {
                        q68Var.setNum(this.e ? arrayList.indexOf(Integer.valueOf(((jo6) yn6Var.e.get(num.intValue())).C)) : -1);
                    } else {
                        q68Var.setNum(this.e ? arrayList.indexOf(((no6) this.f.get(num.intValue())).B) : -1);
                    }
                } else if (childAt instanceof ida) {
                    ((ida) childAt).b(arrayList.indexOf(Integer.valueOf(((jo6) yn6Var.e.get(((Integer) childAt.getTag()).intValue())).C)) != 0, false);
                }
            }
        }
    }

    public final void n0(int i) {
        int size = this.b.size();
        sb sbVar = this.c0;
        if (size == 0) {
            sbVar.setPivotX(0.0f);
            this.c0.setPivotY(0.0f);
            l0(false, i != 0);
            return;
        }
        sbVar.invalidate();
        if (l0(true, i != 0) || i == 0) {
            this.c0.setPivotX(0.0f);
            this.c0.setPivotY(0.0f);
            return;
        }
        this.c0.setPivotX(gm.L(21.0f));
        this.c0.setPivotY(gm.L(12.0f));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.c0, (Property<sb, Float>) View.SCALE_X, i == 1 ? 1.1f : 0.9f, 1.0f), ObjectAnimator.ofFloat(this.c0, (Property<sb, Float>) View.SCALE_Y, i == 1 ? 1.1f : 0.9f, 1.0f));
        animatorSet.setInterpolator(new OvershootInterpolator());
        animatorSet.setDuration(180L);
        animatorSet.start();
    }

    public final void o0() {
        String str;
        s30 s30Var = this.M;
        if (s30Var != null) {
            s30Var.f();
        }
        if (this.r || (this.n.size() > 0 && ((str = this.w) == null || TextUtils.isEmpty(str)))) {
            this.O.e(true, true);
        } else {
            this.O.e(false, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onBackPressed(boolean z) {
        cv3 cv3Var = this.e0;
        if (cv3Var == null || !cv3Var.e) {
            return super.onBackPressed(z);
        }
        if (!z) {
            return false;
        }
        cv3Var.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        nm7.f(this.currentAccount).b(this, nm7.s);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        nm7.f(this.currentAccount).n(this, nm7.s);
        if (this.y != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.y, true);
            this.y = 0;
        }
        cv3 cv3Var = this.e0;
        if (cv3Var != null) {
            cv3Var.o();
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onPanTranslationUpdate(float f) {
        r59 r59Var = this.L;
        if (r59Var == null) {
            return;
        }
        if (!this.e0.e) {
            r59Var.setTranslationY(f);
        } else {
            this.fragmentView.setTranslationY(f);
            this.L.setTranslationY(0.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        s30 s30Var = this.M;
        if (s30Var != null) {
            s30Var.f();
        }
        cv3 cv3Var = this.e0;
        if (cv3Var != null) {
            cv3Var.s();
        }
        r7 r7Var = this.Q;
        if (r7Var != null) {
            r7Var.G(true);
            if (!TextUtils.isEmpty(this.q0)) {
                this.Q.P(this.q0, false);
                this.q0 = null;
                g0(this.Q.getSearchField());
            }
            getParentActivity().getWindow().setSoftInputMode(32);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        r7 r7Var;
        if (!z || (r7Var = this.Q) == null) {
            return;
        }
        gm.E3(r7Var.getSearchField());
    }
}

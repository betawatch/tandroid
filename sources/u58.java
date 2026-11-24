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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class u58 extends d implements gk7 {
    public int E;
    public final boolean F;
    public boolean G;
    public String H;
    public int I;
    public boolean J;
    public final xl6 K;
    public o39 L;
    public s20 M;
    public q58 N;
    public zya O;
    public xk2 P;
    public r7 Q;
    public a8 R;
    public int S;
    public boolean T;
    public final byte U;
    public final mu1 V;
    public w49 W;
    public byte X;
    public boolean Y;
    public boolean Z;
    public final boolean a;
    public FrameLayout a0;
    public final HashMap b;
    public oc6 b0;
    public final ArrayList c;
    public sb c0;
    public Editable d;
    public View d0;
    public boolean e;
    public rt3 e0;
    public final ArrayList f;
    public ImageView f0;
    public p58 g0;
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
    public s58 t0;
    public t58 u0;
    public final int v0;
    public String w;
    public final int w0;
    public String x;
    public final int x0;
    public int y;
    public final o58 y0;

    /* JADX WARN: Multi-variable type inference failed */
    public u58(int i, xl6 xl6Var, HashMap hashMap, ArrayList arrayList, int i2, boolean z, mu1 mu1Var, boolean z2) {
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
        this.y0 = new o58(this);
        this.K = xl6Var;
        this.b = hashMap;
        this.c = arrayList;
        this.a = i;
        this.U = i2;
        this.V = mu1Var;
        this.F = z;
        this.s0 = z2;
        if (xl6Var == null) {
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
            this.v0 = bkb.kh;
            this.w0 = bkb.Xg;
            this.x0 = bkb.Yg;
        } else {
            this.v0 = bkb.g5;
            this.w0 = bkb.i5;
            this.x0 = bkb.H5;
        }
    }

    public final int a0(int i, Object obj) {
        boolean z = obj instanceof jm6;
        Object valueOf = z ? Integer.valueOf(((jm6) obj).C) : obj instanceof nm6 ? ((nm6) obj).B : null;
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
            l0();
        }
        if (i >= 0) {
            if (z) {
                ((jm6) obj).e();
            } else if (obj instanceof nm6) {
                ((nm6) obj).e();
            }
            this.y0.X(i);
        }
        return indexOf;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.ca));
    }

    public final void b0() {
        this.n.clear();
        s20 s20Var = this.M;
        if (s20Var != null) {
            s20Var.f();
        }
        this.O.e(false, true);
        g0();
    }

    public final o48 c0(int i) {
        int childCount = this.L.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.L.getChildAt(i2);
            if (childAt instanceof o48) {
                o48 o48Var = (o48) childAt;
                int intValue = ((Integer) o48Var.getTag()).intValue();
                xl6 xl6Var = this.K;
                if (xl6Var == null ? !(intValue < 0 || intValue >= this.f.size()) : !(intValue < 0 || intValue >= xl6Var.e.size())) {
                    if (intValue == i) {
                        return o48Var;
                    }
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        byte b = 0;
        this.Z = false;
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        int i = this.v0;
        zkb.h(i, null, aVar);
        org.telegram.ui.ActionBar.a aVar2 = this.actionBar;
        int i2 = this.w0;
        zkb.l(aVar2, 5, i2, null);
        zkb.l(this.actionBar, 1, i2, null);
        byte b2 = 3;
        zkb.l(this.actionBar, 3, this.x0, null);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        boolean z = this.a;
        xl6 xl6Var = this.K;
        if (xl6Var != null) {
            this.actionBar.setTitle(xl6Var.c);
        } else if (!z) {
            this.actionBar.setTitle(k96.M0(2131745569, null));
        } else if (z) {
            this.actionBar.setTitle(k96.M0(2131745572, null));
        }
        this.actionBar.setActionBarMenuOnItemClick(new bq5(this, (byte) 19));
        if (this.m0) {
            r7 a = this.actionBar.t().a(0, R.drawable.ic_ab_other);
            a.setSubMenuDelegate(new pj4((Object) this, (byte) 23));
            this.R = a.e(1, R.drawable.msg_list, k96.M0(2131745153, null));
            a.e(2, R.drawable.msg_openin, k96.M0(2131747603, null));
        }
        if (xl6Var == null) {
            r7 a2 = this.actionBar.t().a(0, R.drawable.outline_header_search);
            a2.N();
            a2.I = new cm0(this);
            this.Q = a2;
            EditTextBoldCursor searchField = a2.getSearchField();
            zkb.X(searchField, i2, null);
            zkb.v(searchField, i2, null);
            zkb.D(searchField, bkb.Le, null);
            if (!z) {
                this.Q.setSearchFieldHint(k96.M0(2131745569, null));
            } else if (z) {
                this.Q.setSearchFieldHint(k96.M0(2131745572, null));
            }
        }
        p58 p58Var = new p58(this, context);
        this.g0 = p58Var;
        zkb.h(i, null, p58Var);
        this.fragmentView = this.g0;
        o39 o39Var = new o39(context, null);
        this.L = o39Var;
        o39Var.setPadding(gl.L(2.0f), gl.L(2.0f), gl.L(2.0f), gl.L(50.0f));
        this.L.setClipToPadding(false);
        this.L.setHorizontalScrollBarEnabled(false);
        this.L.setVerticalScrollBarEnabled(false);
        this.L.setItemAnimator(null);
        this.L.setLayoutAnimation(null);
        o39 o39Var2 = this.L;
        q58 q58Var = new q58(4);
        this.N = q58Var;
        o39Var2.setLayoutManager(q58Var);
        byte b3 = 12;
        this.N.O = new nq1(this, b3);
        this.g0.addView(this.L, nme.e(-1, -1, 51));
        o39 o39Var3 = this.L;
        s20 s20Var = new s20(this, context, b3);
        this.M = s20Var;
        o39Var3.setAdapter(s20Var);
        zkb.H(this.L, i, null);
        this.L.setOnItemClickListener(new bf4(this, (byte) 18));
        if (this.I != 1) {
            this.L.setOnItemLongClickListener(new m58(this, b2));
        }
        w49 w49Var = new w49(new gi3(this));
        this.W = w49Var;
        if (this.I != 1) {
            this.L.F.add(w49Var);
        }
        xk2 xk2Var = new xk2(context, getResourceProvider(), b2);
        this.P = xk2Var;
        xk2Var.setAlpha(0.0f);
        this.P.setVisibility(8);
        zya zyaVar = new zya(context, this.P, 1, getResourceProvider());
        this.O = zyaVar;
        zyaVar.setAnimateLayoutChange(true);
        this.O.d.setTypeface(Typeface.DEFAULT);
        this.O.d.setTextSize(1, 16.0f);
        zkb.X(this.O.d, bkb.x6, getResourceProvider());
        this.O.addView(this.P, 0);
        zya zyaVar2 = this.O;
        if (xl6Var != null) {
            zyaVar2.d.setText(k96.M0(2131747988, null));
        } else {
            zyaVar2.d.setText(k96.M0(2131747977, null));
        }
        this.O.e(false, false);
        this.g0.addView(this.O, nme.d(-1, -1.0f, 51, 0.0f, 126.0f, 0.0f, 0.0f));
        this.L.setOnScrollListener(new n58(this, b));
        if (xl6Var == null) {
            n0();
        }
        if (this.r0) {
            View view = new View(context);
            this.d0 = view;
            view.setBackgroundResource(R.drawable.header_shadow_reverse);
            this.d0.setTranslationY(gl.L(48.0f));
            this.g0.addView(this.d0, nme.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            this.a0 = frameLayout;
            zkb.h(i, null, frameLayout);
            this.a0.setVisibility(4);
            this.a0.setTranslationY(gl.L(48.0f));
            this.g0.addView(this.a0, nme.e(-1, 48, 83));
            this.a0.setOnTouchListener(new jz1((byte) 20));
            rt3 rt3Var = this.e0;
            if (rt3Var != null) {
                rt3Var.o();
            }
            this.e0 = new rt3(context, this.g0, null, 1, false, null);
            this.e0.setFilters(new InputFilter[]{new InputFilter.LengthFilter(na7.q1(y6c.t0).F0())});
            this.e0.setHint(k96.M0(2131754451, null));
            this.e0.s();
            gt3 editText = this.e0.getEditText();
            editText.setMaxLines(1);
            editText.setSingleLine(true);
            this.a0.addView(this.e0, nme.d(-1, -1.0f, 51, 0.0f, 0.0f, 84.0f, 0.0f));
            Editable editable = this.d;
            if (editable != null) {
                this.e0.setText(editable);
            }
            this.e0.getEditText().addTextChangedListener(new jf6(this, (byte) 5));
            oc6 oc6Var = new oc6((byte) 7, context, this);
            this.b0 = oc6Var;
            oc6Var.setFocusable(true);
            this.b0.setFocusableInTouchMode(true);
            this.b0.setVisibility(4);
            this.b0.setScaleX(0.2f);
            this.b0.setScaleY(0.2f);
            this.b0.setAlpha(0.0f);
            this.g0.addView(this.b0, nme.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
            this.f0 = new ImageView(context);
            this.f0.setBackgroundDrawable(bkb.h0(gl.L(56.0f), bkb.w0(null, bkb.R5, false), bkb.w0(null, bkb.S5, false)));
            this.f0.setImageResource(R.drawable.attach_send);
            this.f0.setImportantForAccessibility(2);
            zkb.s(this.f0, bkb.T5, null, PorterDuff.Mode.MULTIPLY);
            this.f0.setScaleType(ImageView.ScaleType.CENTER);
            byte b4 = 9;
            this.f0.setOutlineProvider(new xi(b4));
            this.b0.addView(this.f0, nme.d(56, 56.0f, 51, 2.0f, 0.0f, 0.0f, 0.0f));
            this.f0.setOnClickListener(new fr7(this, (byte) 12));
            this.f0.setOnLongClickListener(new zs(this, b4));
            float L = gl.L(12.0f);
            TextPaint textPaint = this.i0;
            textPaint.setTextSize(L);
            textPaint.setTypeface(gl.o());
            sb sbVar = new sb((byte) 24, context, this);
            this.c0 = sbVar;
            sbVar.setAlpha(0.0f);
            this.c0.setScaleX(0.2f);
            this.c0.setScaleY(0.2f);
            this.g0.addView(this.c0, nme.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
            if (this.U != 0) {
                this.e0.setVisibility(8);
            }
        }
        this.e = !(xl6Var == null && z && !z) && this.J;
        this.L.setEmptyView(this.O);
        o39 o39Var4 = this.L;
        o39Var4.X1 = true;
        o39Var4.Y1 = false;
        m0(0);
        return this.fragmentView;
    }

    public final /* synthetic */ void d0(TLObject tLObject, boolean z) {
        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
        na7.q1(this.currentAccount).a4(tL_contacts_resolvedPeer.users, false);
        na7.q1(this.currentAccount).U3(tL_contacts_resolvedPeer.chats, false);
        ad7.Y(this.currentAccount).j1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
        String str = this.H;
        this.H = null;
        h0(str, "", z, false);
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.s) {
            removeSelfFromStack(true);
        }
    }

    public final void e0(View view, Object obj) {
        boolean z = a0(-1, obj) == -1;
        if (view instanceof iba) {
            ((iba) view).b(this.c.contains(Integer.valueOf(((jm6) this.K.e.get(((Integer) view.getTag()).intValue())).C)), true);
        }
        m0(z ? 1 : 2);
        this.t0.e();
    }

    public final void f0(EditTextBoldCursor editTextBoldCursor) {
        if (editTextBoldCursor.getText().length() == 0) {
            return;
        }
        String obj = editTextBoldCursor.getText().toString();
        this.f.clear();
        this.h.clear();
        this.s = true;
        h0(obj, "", this.a, true);
        this.w = obj;
        if (obj.length() == 0) {
            this.w = null;
            this.O.d.setText(k96.M0(2131747977, null));
        } else {
            this.O.d.setText(k96.a0("NoResultFoundFor", null, 2131747974, this.w));
        }
        n0();
    }

    public final void g0() {
        SharedPreferences.Editor edit = a.b.getSharedPreferences("web_recent_search", 0).edit();
        edit.clear();
        edit.putInt("count", this.n.size());
        int size = this.n.size();
        for (int i = 0; i < size; i++) {
            edit.putString(de9.k(i, "recent"), (String) this.n.get(i));
        }
        edit.commit();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new blb(this.g0, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, this.v0));
        arrayList.add(new blb(this.actionBar, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, this.v0));
        arrayList.add(new blb(this.actionBar, 64, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, this.w0));
        arrayList.add(new blb(this.actionBar, 128, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, this.w0));
        arrayList.add(new blb(this.actionBar, 256, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, this.x0));
        arrayList.add(new blb(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, this.w0));
        r7 r7Var = this.Q;
        arrayList.add(new blb(r7Var != null ? r7Var.getSearchField() : null, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, this.w0));
        arrayList.add(new blb(this.L, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, this.v0));
        arrayList.add(new blb(this.L, 0, new Class[]{View.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.W9));
        return arrayList;
    }

    public final void h0(String str, String str2, boolean z, boolean z2) {
        if (this.r) {
            this.r = false;
            if (this.y != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.y, true);
                this.y = 0;
            }
        }
        this.H = str;
        this.r = true;
        na7 q1 = na7.q1(this.currentAccount);
        na7 q12 = na7.q1(this.currentAccount);
        TLObject a2 = q1.a2(z ? q12.o3 : q12.p3);
        if (!(a2 instanceof TLRPC.User)) {
            if (!z2 || this.G) {
                return;
            }
            this.G = true;
            TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
            na7 q13 = na7.q1(this.currentAccount);
            tL_contacts_resolveUsername.username = z ? q13.o3 : q13.p3;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_resolveUsername, new i81((byte) 10, this, z));
            return;
        }
        TLRPC.User user = (TLRPC.User) a2;
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.query = str == null ? "" : str;
        tL_messages_getInlineBotResults.bot = na7.q1(this.currentAccount).o1(user);
        tL_messages_getInlineBotResults.offset = str2;
        mu1 mu1Var = this.V;
        if (mu1Var != null) {
            long a = mu1Var.a();
            if (cf3.B(a)) {
                tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            } else {
                tL_messages_getInlineBotResults.peer = getMessagesController().h1(a);
            }
        } else {
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        }
        int i = this.E + 1;
        this.E = i;
        this.y = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getInlineBotResults, new h87(this, str, i, z, user));
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(this.y, this.classGuid);
    }

    public final void i0(int i, boolean z) {
        HashMap hashMap = this.b;
        if (hashMap.isEmpty() || this.t0 == null || this.T) {
            return;
        }
        rt3 rt3Var = this.e0;
        if (rt3Var != null && rt3Var.a.length() > 0) {
            Object obj = hashMap.get(this.c.get(0));
            if (obj instanceof jm6) {
                ((jm6) obj).a = this.e0.getText().toString();
            } else if (obj instanceof nm6) {
                ((nm6) obj).I = this.e0.getText().toString();
            }
        }
        this.T = true;
        this.t0.l(i, false, z);
        if (this.U != 2) {
            s58 s58Var = this.t0;
            if (s58Var == null || s58Var.c()) {
                finishFragment();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isLightStatusBar() {
        return gl.B(bkb.w0(null, bkb.Z6, false)) > 0.721f;
    }

    public final void j0(int i, boolean z) {
        this.I = i;
        this.J = z;
        if (i <= 0 || !this.a) {
            return;
        }
        this.I = 1;
    }

    public final boolean k0(boolean z, boolean z2) {
        if (this.e0 != null) {
            if (z != (this.a0.getTag() != null)) {
                AnimatorSet animatorSet = this.l0;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                this.a0.setTag(z ? 1 : null);
                if (this.e0.getEditText().isFocused()) {
                    gl.t1(this.e0.getEditText());
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
                    this.a0.setTranslationY(z ? 0.0f : gl.L(48.0f));
                    this.d0.setTranslationY(z ? 0.0f : gl.L(48.0f));
                    if (!z) {
                        this.a0.setVisibility(4);
                        this.b0.setVisibility(4);
                    }
                    return true;
                }
                this.l0 = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                oc6 oc6Var = this.b0;
                Property property = View.SCALE_X;
                arrayList.add(ObjectAnimator.ofFloat(oc6Var, (Property<oc6, Float>) property, z ? 1.0f : 0.2f));
                oc6 oc6Var2 = this.b0;
                Property property2 = View.SCALE_Y;
                arrayList.add(ObjectAnimator.ofFloat(oc6Var2, (Property<oc6, Float>) property2, z ? 1.0f : 0.2f));
                oc6 oc6Var3 = this.b0;
                Property property3 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(oc6Var3, (Property<oc6, Float>) property3, z ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.c0, (Property<sb, Float>) property, z ? 1.0f : 0.2f));
                arrayList.add(ObjectAnimator.ofFloat(this.c0, (Property<sb, Float>) property2, z ? 1.0f : 0.2f));
                arrayList.add(ObjectAnimator.ofFloat(this.c0, (Property<sb, Float>) property3, z ? 1.0f : 0.0f));
                FrameLayout frameLayout = this.a0;
                Property property4 = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property4, z ? 0.0f : gl.L(48.0f)));
                arrayList.add(ObjectAnimator.ofFloat(this.d0, (Property<View, Float>) property4, z ? 0.0f : gl.L(48.0f)));
                this.l0.playTogether(arrayList);
                this.l0.setInterpolator(new DecelerateInterpolator());
                this.l0.setDuration(180L);
                this.l0.addListener(new id4((byte) 21, this, z));
                this.l0.start();
                return true;
            }
        }
        return false;
    }

    public final void l0() {
        if (this.e) {
            int childCount = this.L.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.L.getChildAt(i);
                boolean z = childAt instanceof o48;
                xl6 xl6Var = this.K;
                ArrayList arrayList = this.c;
                if (z) {
                    o48 o48Var = (o48) childAt;
                    Integer num = (Integer) childAt.getTag();
                    if (xl6Var != null) {
                        o48Var.setNum(this.e ? arrayList.indexOf(Integer.valueOf(((jm6) xl6Var.e.get(num.intValue())).C)) : -1);
                    } else {
                        o48Var.setNum(this.e ? arrayList.indexOf(((nm6) this.f.get(num.intValue())).B) : -1);
                    }
                } else if (childAt instanceof iba) {
                    ((iba) childAt).b(arrayList.indexOf(Integer.valueOf(((jm6) xl6Var.e.get(((Integer) childAt.getTag()).intValue())).C)) != 0, false);
                }
            }
        }
    }

    public final void m0(int i) {
        int size = this.b.size();
        sb sbVar = this.c0;
        if (size == 0) {
            sbVar.setPivotX(0.0f);
            this.c0.setPivotY(0.0f);
            k0(false, i != 0);
            return;
        }
        sbVar.invalidate();
        if (k0(true, i != 0) || i == 0) {
            this.c0.setPivotX(0.0f);
            this.c0.setPivotY(0.0f);
            return;
        }
        this.c0.setPivotX(gl.L(21.0f));
        this.c0.setPivotY(gl.L(12.0f));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.c0, (Property<sb, Float>) View.SCALE_X, i == 1 ? 1.1f : 0.9f, 1.0f), ObjectAnimator.ofFloat(this.c0, (Property<sb, Float>) View.SCALE_Y, i == 1 ? 1.1f : 0.9f, 1.0f));
        animatorSet.setInterpolator(new OvershootInterpolator());
        animatorSet.setDuration(180L);
        animatorSet.start();
    }

    public final void n0() {
        String str;
        s20 s20Var = this.M;
        if (s20Var != null) {
            s20Var.f();
        }
        if (this.r || (this.n.size() > 0 && ((str = this.w) == null || TextUtils.isEmpty(str)))) {
            this.O.e(true, true);
        } else {
            this.O.e(false, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onBackPressed(boolean z) {
        rt3 rt3Var = this.e0;
        if (rt3Var == null || !rt3Var.e) {
            return super.onBackPressed(z);
        }
        if (!z) {
            return false;
        }
        rt3Var.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        kk7.f(this.currentAccount).b(this, kk7.s);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        kk7.f(this.currentAccount).n(this, kk7.s);
        if (this.y != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.y, true);
            this.y = 0;
        }
        rt3 rt3Var = this.e0;
        if (rt3Var != null) {
            rt3Var.o();
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onPanTranslationUpdate(float f) {
        o39 o39Var = this.L;
        if (o39Var == null) {
            return;
        }
        if (!this.e0.e) {
            o39Var.setTranslationY(f);
        } else {
            this.fragmentView.setTranslationY(f);
            this.L.setTranslationY(0.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        s20 s20Var = this.M;
        if (s20Var != null) {
            s20Var.f();
        }
        rt3 rt3Var = this.e0;
        if (rt3Var != null) {
            rt3Var.s();
        }
        r7 r7Var = this.Q;
        if (r7Var != null) {
            r7Var.G(true);
            if (!TextUtils.isEmpty(this.q0)) {
                this.Q.P(this.q0, false);
                this.q0 = null;
                f0(this.Q.getSearchField());
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
        gl.F3(r7Var.getSearchField());
    }
}

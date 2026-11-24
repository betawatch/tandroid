// default package

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class w32 extends a22 implements vlb, jm7, g94 {
    public boolean E;
    public final q32 F;
    public final s32 G;
    public final r34 H;
    public final h22 I;
    public final e22 J;
    public n32 K;
    public boolean L;
    public final fn0 n;
    public final FrameLayout r;
    public final fv s;
    public final l32 w;
    public final HashMap x;
    public final ArrayList y;

    public w32(i22 i22Var, ylb ylbVar, Context context) {
        super(i22Var, ylbVar, context);
        this.n = new fn0(0, this, d53.h, 380L, false);
        this.x = new HashMap();
        this.y = new ArrayList();
        this.E = false;
        this.G = new s32(this, context);
        h22 h22Var = new h22(cmb.c6, ylbVar, context);
        this.I = h22Var;
        h22Var.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        e22 e22Var = new e22(this.b, ylbVar, context);
        this.J = e22Var;
        e22Var.setPadding(gm.L(4.0f), gm.L(4.0f), gm.L(4.0f), gm.L(4.0f));
        String M0 = jb6.M0(2131745501, null);
        l7 l7Var = e22Var.r;
        l7Var.setHint(M0);
        byte b = 9;
        l7Var.addTextChangedListener(new b7(this, b));
        frameLayout.addView(h22Var, qoe.g());
        FrameLayout.LayoutParams d = qoe.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += gm.m;
        frameLayout.addView(e22Var, d);
        r34 r34Var = new r34(context, ylbVar);
        this.H = r34Var;
        r34Var.c();
        r34Var.setText(jb6.M0(2131747957, null));
        addView(r34Var, qoe.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        fv fvVar = new fv(this, context, ylbVar, (byte) 8);
        this.s = fvVar;
        setBlur3Capture(fvVar);
        this.d = fvVar;
        this.h = true;
        this.f = true;
        fvVar.r1();
        fvVar.setClipToPadding(false);
        getContext();
        l32 l32Var = new l32(this, gm.L(9.0f), fvVar, (byte) 0);
        this.w = l32Var;
        fvVar.setLayoutManager(l32Var);
        l32Var.P = false;
        fvVar.setHorizontalScrollBarEnabled(false);
        fvVar.setVerticalScrollBarEnabled(false);
        fvVar.setClipToPadding(false);
        addView(fvVar, qoe.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        q32 q32Var = new q32(this, context);
        this.F = q32Var;
        fvVar.setAdapter(q32Var);
        anb.l(fvVar, 21, cmb.z5, ylbVar);
        fvVar.setOnItemClickListener(new k0(this, ylbVar, b));
        fvVar.setOnScrollListener(new y(this, (byte) 19));
        fvVar.setOnItemLongClickListener(new i32(this));
        FrameLayout.LayoutParams e = qoe.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e).height += gm.m;
        addView(frameLayout, e);
        nm7.f(this.b.G3).b(this, nm7.N);
        R();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentTop() {
        fv fvVar = this.s;
        if (fvVar.getChildCount() == 0) {
            return -1000;
        }
        int i = 0;
        View childAt = fvVar.getChildAt(0);
        b59 b59Var = (b59) fvVar.G(childAt);
        if (b59Var == null) {
            return -1000;
        }
        int paddingTop = fvVar.getPaddingTop();
        if (b59Var.b() == 0 && childAt.getTop() >= 0) {
            i = childAt.getTop();
        }
        return paddingTop - i;
    }

    @Override // a22
    public final void B(int i, int i2) {
        int i3;
        i22 i22Var = this.b;
        if (i22Var.o3.Q() > gm.L(20.0f)) {
            i3 = gm.L(8.0f);
            i22Var.r0 = false;
        } else {
            if (!gm.O1()) {
                Point point = gm.q;
                if (point.x > point.y) {
                    i3 = (int) (i2 / 3.5f);
                    i22Var.r0 = true;
                }
            }
            i3 = (i2 / 5) << 1;
            i22Var.r0 = true;
        }
        this.s.q1(0, i3 + gm.m, 0, this.e);
    }

    @Override // g94
    public final void D(int i, float f, float f2, h94 h94Var) {
        if (i == 0) {
            h22 h22Var = this.I;
            h22Var.setAlpha(f);
            h22Var.setVisibility(f > 0.0f ? 0 : 4);
        }
    }

    @Override // a22
    public final void H(a22 a22Var) {
        this.w.g1(0, 0);
    }

    @Override // a22
    public final void J() {
        this.s.z0(0);
    }

    @Override // a22
    public final boolean K(final boolean z, final int i, int i2, final long j, final boolean z2) {
        HashMap hashMap = this.x;
        int i3 = 0;
        if ((hashMap.size() == 0 && this.K == null) || this.E) {
            return false;
        }
        this.E = true;
        final ArrayList arrayList = new ArrayList(hashMap.size());
        ArrayList arrayList2 = this.y;
        int size = arrayList2.size();
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            arrayList.add(Q(hashMap.get((m32) obj)));
        }
        i22 i22Var = this.b;
        return ik.Y(i22Var.G3, i22Var.V0(), i22Var.R0() + arrayList.size(), new qac() { // from class: j32
            @Override // qac
            public final void a(Object obj2) {
                w32 w32Var = w32.this;
                n32 n32Var = w32Var.K;
                i22 i22Var2 = w32Var.b;
                String obj3 = i22Var2.U0().getText().toString();
                ((Long) obj2).getClass();
                n32Var.a(arrayList, obj3, z, i, j, z2);
                i22Var2.dismiss();
            }
        }, 0L);
    }

    public final void P(v32 v32Var, Object obj) {
        boolean z;
        HashMap hashMap = this.x;
        if (hashMap.isEmpty() && !this.L) {
            String a0 = jb6.a0("AttachContactsSlowMode", null, 2131753943, new Object[0]);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.a, getContext());
            String M0 = jb6.M0(R.string.AppName, null);
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            heVar.U = a0;
            b10.t(null, 2131747564, alertDialog$Builder, null);
            return;
        }
        m32 a = m32.a(obj);
        boolean containsKey = hashMap.containsKey(a);
        ArrayList arrayList = this.y;
        if (containsKey) {
            hashMap.remove(a);
            arrayList.remove(a);
            z = false;
        } else {
            hashMap.put(a, obj);
            arrayList.add(a);
            z = true;
        }
        jh2 jh2Var = v32Var.d;
        if (jh2Var.getVisibility() != 0) {
            jh2Var.setVisibility(0);
        }
        jh2Var.a(z, true);
        this.b.F1(z ? 1 : 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TLRPC.TL_userContact_old2 Q(Object obj) {
        String str;
        yv2 yv2Var;
        String str2;
        ArrayList arrayList;
        ArrayList<TLRPC.RestrictionReason> arrayList2;
        int lastIndexOf;
        if (obj instanceof yv2) {
            yv2Var = (yv2) obj;
            TLRPC.User user = yv2Var.m;
            if (user != null) {
                str = user.first_name;
                str2 = user.last_name;
            } else {
                str = yv2Var.i;
                str2 = yv2Var.j;
            }
        } else {
            TLRPC.User user2 = (TLRPC.User) obj;
            yv2 yv2Var2 = new yv2();
            str = user2.first_name;
            yv2Var2.i = str;
            String str3 = user2.last_name;
            yv2Var2.j = str3;
            yv2Var2.e.add(user2.phone);
            yv2Var2.m = user2;
            yv2Var = yv2Var2;
            str2 = str3;
        }
        String m = bw2.m(0, str, str2);
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        String str4 = yv2Var.b;
        if (str4 != null) {
            arrayList = gm.c2(Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_VCARD_URI, str4), this.b.G3, true, arrayList3, m);
        } else {
            fm fmVar = new fm();
            fmVar.c = 0;
            String str5 = "TEL;MOBILE:+" + yv2Var.m.phone;
            fmVar.b = str5;
            fmVar.a.add(str5);
            arrayList4.add(fmVar);
            arrayList = null;
        }
        TLRPC.User user3 = yv2Var.m;
        if (arrayList != null) {
            for (int i = 0; i < arrayList3.size(); i++) {
                fm fmVar2 = (fm) arrayList3.get(i);
                if (fmVar2.c == 0) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= arrayList4.size()) {
                            arrayList4.add(fmVar2);
                            break;
                        }
                        if (((fm) arrayList4.get(i2)).c(false).equals(fmVar2.c(false))) {
                            fmVar2.d = false;
                            break;
                        }
                        i2++;
                    }
                } else {
                    arrayList5.add(fmVar2);
                }
            }
            if (!arrayList.isEmpty()) {
                TLRPC.User user4 = (TLRPC.User) arrayList.get(0);
                arrayList2 = user4.restriction_reason;
                if (TextUtils.isEmpty(str)) {
                    str = user4.first_name;
                    str2 = user4.last_name;
                }
                TLRPC.TL_userContact_old2 tL_userContact_old2 = new TLRPC.TL_userContact_old2();
                if (user3 == null) {
                    tL_userContact_old2.id = user3.id;
                    tL_userContact_old2.access_hash = user3.access_hash;
                    tL_userContact_old2.photo = user3.photo;
                    tL_userContact_old2.status = user3.status;
                    tL_userContact_old2.first_name = user3.first_name;
                    tL_userContact_old2.last_name = user3.last_name;
                    tL_userContact_old2.phone = user3.phone;
                    if (arrayList2 != null) {
                        tL_userContact_old2.restriction_reason = arrayList2;
                    }
                } else {
                    tL_userContact_old2.first_name = str;
                    tL_userContact_old2.last_name = str2;
                }
                StringBuilder sb = tL_userContact_old2.restriction_reason.isEmpty() ? new StringBuilder(tL_userContact_old2.restriction_reason.get(0).text) : new StringBuilder(String.format(Locale.US, "BEGIN:VCARD\nVERSION:3.0\nFN:%1$s\nEND:VCARD", bw2.m(0, tL_userContact_old2.first_name, tL_userContact_old2.last_name)));
                lastIndexOf = sb.lastIndexOf("END:VCARD");
                if (lastIndexOf >= 0) {
                    tL_userContact_old2.phone = null;
                    for (int size = arrayList4.size() - 1; size >= 0; size--) {
                        fm fmVar3 = (fm) arrayList4.get(size);
                        boolean z = fmVar3.d;
                        ArrayList arrayList6 = fmVar3.a;
                        if (z) {
                            if (tL_userContact_old2.phone == null) {
                                tL_userContact_old2.phone = fmVar3.c(false);
                            }
                            for (int i3 = 0; i3 < arrayList6.size(); i3++) {
                                sb.insert(lastIndexOf, ((String) arrayList6.get(i3)) + "\n");
                            }
                        }
                    }
                    for (int size2 = arrayList5.size() - 1; size2 >= 0; size2--) {
                        fm fmVar4 = (fm) arrayList5.get(size2);
                        boolean z2 = fmVar4.d;
                        ArrayList arrayList7 = fmVar4.a;
                        if (z2) {
                            for (int size3 = arrayList7.size() - 1; size3 >= 0; size3 += -1) {
                                sb.insert(lastIndexOf, ((String) arrayList7.get(size3)) + "\n");
                            }
                        }
                    }
                    tL_userContact_old2.restriction_reason.clear();
                    TLRPC.RestrictionReason restrictionReason = new TLRPC.RestrictionReason();
                    restrictionReason.text = sb.toString();
                    restrictionReason.reason = "";
                    restrictionReason.platform = "";
                    tL_userContact_old2.restriction_reason.add(restrictionReason);
                }
                return tL_userContact_old2;
            }
        }
        arrayList2 = null;
        TLRPC.TL_userContact_old2 tL_userContact_old22 = new TLRPC.TL_userContact_old2();
        if (user3 == null) {
        }
        if (tL_userContact_old22.restriction_reason.isEmpty()) {
        }
        lastIndexOf = sb.lastIndexOf("END:VCARD");
        if (lastIndexOf >= 0) {
        }
        return tL_userContact_old22;
    }

    public final void R() {
        this.H.setVisibility(this.s.getAdapter().b() == 2 ? 0 : 8);
        S();
    }

    public final void S() {
        View childAt;
        r34 r34Var = this.H;
        if (r34Var.getVisibility() != 0 || (childAt = this.s.getChildAt(0)) == null) {
            return;
        }
        r34Var.setTranslationY((childAt.getTop() + (r34Var.getMeasuredHeight() - getMeasuredHeight())) / 2);
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.T7));
        hashSet.add(Integer.valueOf(cmb.S7));
        hashSet.add(Integer.valueOf(cmb.R7));
        hashSet.add(Integer.valueOf(cmb.Q7));
        hashSet.add(Integer.valueOf(cmb.P7));
        hashSet.add(Integer.valueOf(cmb.O7));
        hashSet.add(Integer.valueOf(cmb.N7));
        hashSet.add(Integer.valueOf(cmb.I7));
        hashSet.add(Integer.valueOf(cmb.p5));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.h6));
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        q32 q32Var;
        if (i != nm7.N || (q32Var = this.F) == null) {
            return;
        }
        q32Var.f();
    }

    @Override // a22
    public int getCurrentItemTop() {
        fv fvVar = this.s;
        if (fvVar.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = fvVar.getChildAt(0);
        b59 b59Var = (b59) fvVar.G(childAt);
        int top = (childAt.getTop() - gm.m) - gm.L(8.0f);
        int i = (top <= 0 || b59Var == null || b59Var.b() != 0) ? 0 : top;
        fn0 fn0Var = this.n;
        if (top < 0 || b59Var == null || b59Var.b() != 0) {
            fn0Var.a(true, true);
            top = i;
        } else {
            fn0Var.a(false, true);
        }
        this.r.setTranslationY(top);
        return gm.L(12.0f) + top;
    }

    @Override // a22
    public int getFirstOffset() {
        return gm.L(4.0f) + getListTopPadding();
    }

    @Override // a22
    public int getListTopPadding() {
        return this.s.getPaddingTop();
    }

    public ArrayList<TLRPC.User> getSelected() {
        HashMap hashMap = this.x;
        ArrayList<TLRPC.User> arrayList = new ArrayList<>(hashMap.size());
        ArrayList arrayList2 = this.y;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList.add(Q(hashMap.get((m32) obj)));
        }
        return arrayList;
    }

    @Override // a22
    public int getSelectedItemsCount() {
        return this.x.size();
    }

    @Override // a22
    public ArrayList<cnb> getThemeDescriptions() {
        ArrayList<cnb> arrayList = new ArrayList<>();
        arrayList.add(new cnb(this.H, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.b7));
        arrayList.add(new cnb(this.H, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.g6));
        int i = cmb.p5;
        arrayList.add(new cnb(this.s, 0, new Class[]{v32.class}, new String[]{"nameTextView"}, (Drawable[]) null, (bnb) null, i));
        return arrayList;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        S();
    }

    @Override // a22
    public final void p() {
        nm7.f(this.b.G3).n(this, nm7.N);
    }

    public void setDelegate(n32 n32Var) {
        this.K = n32Var;
    }

    public void setMultipleSelectionAllowed(boolean z) {
        this.L = z;
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.b.b.invalidate();
    }

    public void setupBlurredSearchField(km0 km0Var) {
        e22 e22Var = this.J;
        if (e22Var != null) {
            e22Var.setupBlurredBackground(km0Var.c(e22Var, qqd.a(this.a), false));
        }
    }

    @Override // vlb
    public final void updateColors() {
        try {
            e22 e22Var = this.J;
            if (e22Var != null) {
                e22Var.updateColors();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // g94
    public final void V(float f, int i) {
    }
}

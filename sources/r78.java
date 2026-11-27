// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Paint;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class r78 extends nx0 {
    public static final /* synthetic */ int I1 = 0;
    public final int A1;
    public final int B1;
    public final int C1;
    public final boolean D1;
    public s22 E1;
    public final ArrayList F1;
    public final ArrayList G1;
    public final TLRPC.TL_userContact_old2 H1;
    public final xh4 l1;
    public final k78 m1;
    public final LinearLayout n1;
    public final l78 o1;
    public final View p1;
    public final View q1;
    public final TextView r1;
    public final e s1;
    public boolean t1;
    public final Paint u1;
    public int v1;
    public AnimatorSet w1;
    public AnimatorSet x1;
    public final int y1;
    public final int z1;

    /* JADX WARN: Removed duplicated region for block: B:36:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r78(e eVar, iv2 iv2Var, TLRPC.User user, Uri uri, File file, String str, String str2, String str3, final vnb vnbVar) {
        super(1, vnbVar, (Context) eVar.getParentActivity(), false);
        ArrayList c2;
        ArrayList<TLRPC.RestrictionReason> arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i;
        final int i2;
        this.u1 = new Paint(1);
        this.F1 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        this.G1 = arrayList4;
        String str4 = str2;
        String str5 = str3;
        String m = lv2.m(0, str4, str5);
        ArrayList arrayList5 = new ArrayList();
        if (uri != null) {
            c2 = hl.c2(uri, this.a, false, arrayList5, m);
        } else if (file != null) {
            c2 = hl.c2(Uri.fromFile(file), this.a, false, arrayList5, m);
            file.delete();
            this.D1 = true;
        } else {
            if (str != null) {
                gl glVar = new gl();
                glVar.c = 0;
                String concat = "TEL;MOBILE:+".concat(str);
                glVar.b = concat;
                glVar.a.add(concat);
                arrayList4.add(glVar);
                this.D1 = true;
            } else {
                String str6 = iv2Var.b;
                if (str6 != null) {
                    c2 = hl.c2(Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_VCARD_URI, str6), this.a, true, arrayList5, m);
                } else {
                    gl glVar2 = new gl();
                    glVar2.c = 0;
                    String str7 = "TEL;MOBILE:+" + iv2Var.m.phone;
                    glVar2.b = str7;
                    glVar2.a.add(str7);
                    arrayList4.add(glVar2);
                }
            }
            c2 = null;
        }
        TLRPC.User user2 = (user != null || iv2Var == null) ? user : iv2Var.m;
        if (c2 != null) {
            for (int i3 = 0; i3 < arrayList5.size(); i3++) {
                gl glVar3 = (gl) arrayList5.get(i3);
                if (glVar3.c == 0) {
                    int i4 = 0;
                    while (true) {
                        int size = this.G1.size();
                        ArrayList arrayList6 = this.G1;
                        if (i4 >= size) {
                            arrayList6.add(glVar3);
                            break;
                        } else {
                            if (((gl) arrayList6.get(i4)).c(false).equals(glVar3.c(false))) {
                                glVar3.d = false;
                                break;
                            }
                            i4++;
                        }
                    }
                } else {
                    this.F1.add(glVar3);
                }
            }
            if (!c2.isEmpty()) {
                TLRPC.User user3 = (TLRPC.User) c2.get(0);
                arrayList = user3.restriction_reason;
                if (TextUtils.isEmpty(str4)) {
                    String str8 = user3.first_name;
                    str5 = user3.last_name;
                    str4 = str8;
                }
                TLRPC.TL_userContact_old2 tL_userContact_old2 = new TLRPC.TL_userContact_old2();
                this.H1 = tL_userContact_old2;
                if (user2 == null) {
                    tL_userContact_old2.id = user2.id;
                    tL_userContact_old2.access_hash = user2.access_hash;
                    tL_userContact_old2.photo = user2.photo;
                    tL_userContact_old2.status = user2.status;
                    tL_userContact_old2.first_name = user2.first_name;
                    tL_userContact_old2.last_name = user2.last_name;
                    tL_userContact_old2.phone = user2.phone;
                    if (arrayList != null) {
                        tL_userContact_old2.restriction_reason = arrayList;
                    }
                } else {
                    tL_userContact_old2.first_name = str4;
                    tL_userContact_old2.last_name = str5;
                }
                this.s1 = eVar;
                final Activity parentActivity = eVar.getParentActivity();
                arrayList2 = this.F1;
                this.y1 = 1;
                arrayList3 = this.G1;
                if (arrayList3.size() <= 1 || !arrayList2.isEmpty()) {
                    if (arrayList3.isEmpty()) {
                        int i5 = this.y1;
                        this.z1 = i5;
                        int size2 = arrayList3.size() + i5;
                        this.y1 = size2;
                        this.A1 = size2;
                    } else {
                        this.z1 = -1;
                        this.A1 = -1;
                    }
                    if (arrayList2.isEmpty()) {
                        int i6 = this.y1;
                        this.B1 = i6;
                        int size3 = arrayList2.size() + i6;
                        this.y1 = size3;
                        this.C1 = size3;
                    } else {
                        this.B1 = -1;
                        this.C1 = -1;
                    }
                } else {
                    this.z1 = -1;
                    this.A1 = -1;
                    this.B1 = -1;
                    this.C1 = -1;
                }
                j78 j78Var = new j78(this, parentActivity, parentActivity);
                j78Var.setWillNotDraw(false);
                this.b = j78Var;
                this.v0 = false;
                this.w0 = false;
                this.l1 = new xh4((Object) this, (byte) 21);
                k78 k78Var = new k78(this, parentActivity);
                this.m1 = k78Var;
                k78Var.setClipToPadding(false);
                k78Var.setVerticalScrollBarEnabled(false);
                j78Var.addView(k78Var, tre.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 77.0f));
                LinearLayout linearLayout = new LinearLayout(parentActivity);
                this.n1 = linearLayout;
                linearLayout.setOrientation(1);
                k78Var.addView(linearLayout, tre.x(-1, -1, 51));
                k78Var.setOnScrollChangeListener(new h78(this));
                i = this.y1;
                for (i2 = 0; i2 < i; i2++) {
                    ViewGroup y = this.l1.y(parentActivity, i2);
                    this.n1.addView(y, tre.o(-1, -2));
                    if ((i2 >= this.z1 && i2 < this.A1) || (i2 >= this.B1 && i2 < this.C1)) {
                        y.setBackgroundDrawable(aob.L0(false));
                        y.setOnClickListener(new ae((Object) this, i2, (Object) y, (byte) 12));
                        y.setOnLongClickListener(new View.OnLongClickListener() { // from class: i78
                            @Override // android.view.View.OnLongClickListener
                            public final boolean onLongClick(View view) {
                                gl glVar4;
                                r78 r78Var = r78.this;
                                int i7 = i2;
                                vnb vnbVar2 = vnbVar;
                                Activity activity = parentActivity;
                                int i8 = r78Var.z1;
                                if (i7 < i8 || i7 >= r78Var.A1) {
                                    int i9 = r78Var.B1;
                                    glVar4 = (i7 < i9 || i7 >= r78Var.C1) ? null : (gl) r78Var.F1.get(i7 - i9);
                                } else {
                                    glVar4 = (gl) r78Var.G1.get(i7 - i8);
                                }
                                if (glVar4 == null) {
                                    return false;
                                }
                                ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", glVar4.c(false)));
                                if (d31.a(r78Var.s1)) {
                                    if (glVar4.c == 3) {
                                        new d31((FrameLayout) r78Var.b, vnbVar2).k(false).j();
                                        return true;
                                    }
                                    n21 n21Var = new n21(activity, vnbVar2);
                                    int i10 = glVar4.c;
                                    p66 p66Var = n21Var.b;
                                    if (i10 == 0) {
                                        p66Var.setText(ob6.M0(2131747022, null));
                                        n21Var.a.setImageResource(R.drawable.msg_calls);
                                    } else if (i10 == 1) {
                                        p66Var.setText(ob6.M0(2131751168, null));
                                        n21Var.a.setImageResource(R.drawable.msg_mention);
                                    } else {
                                        p66Var.setText(ob6.M0(2131743847, null));
                                        n21Var.a.setImageResource(R.drawable.msg_info);
                                    }
                                    if (hl.C3()) {
                                        v21.f((FrameLayout) r78Var.b, n21Var, 1500).j();
                                    }
                                }
                                return true;
                            }
                        });
                    }
                }
                l78 l78Var = new l78(this, parentActivity);
                this.o1 = l78Var;
                yob.h(aob.h5, vnbVar, l78Var);
                l78Var.setBackButtonImage(R.drawable.ic_ab_back);
                int i7 = aob.j5;
                yob.l(l78Var, 1, i7, vnbVar);
                yob.l(l78Var, 3, aob.I5, vnbVar);
                yob.l(l78Var, 5, i7, vnbVar);
                l78Var.setOccupyStatusBar(false);
                l78Var.setAlpha(0.0f);
                if (this.D1) {
                    l78Var.setTitle(ob6.M0(2131745188, null));
                } else {
                    l78Var.setTitle(ob6.M0(2131754442, null));
                }
                this.b.addView(l78Var, tre.c(-2.0f, -1));
                l78Var.setActionBarMenuOnItemClick(new m78(this));
                View view = new View(parentActivity);
                this.p1 = view;
                view.setAlpha(0.0f);
                int i8 = aob.V5;
                yob.h(i8, vnbVar, view);
                this.b.addView(view, tre.c(1.0f, -1));
                View view2 = new View(parentActivity);
                this.q1 = view2;
                yob.h(i8, vnbVar, view2);
                view2.setAlpha(0.0f);
                this.b.addView(view2, tre.d(-1, 1.0f, 83, 0.0f, 0.0f, 0.0f, 77.0f));
                TextView textView = new TextView(parentActivity);
                this.r1 = textView;
                textView.setPadding(hl.L(34.0f), 0, hl.L(34.0f), 0);
                textView.setGravity(17);
                textView.setTextColor(aob.v0(aob.Ji, this.J0));
                textView.setTextSize(1, 14.0f);
                if (this.D1) {
                    textView.setText(ob6.M0(2131745188, null));
                } else {
                    textView.setText(ob6.M0(2131754442, null));
                }
                textView.setTypeface(hl.o());
                int L = hl.L(8.0f);
                int i9 = aob.Fi;
                int v0 = aob.v0(i9, this.J0);
                int i10 = aob.Hi;
                int v02 = aob.v0(i10, this.J0);
                hf0 i0 = aob.i0(L, L, L, L, v0, v02, v02);
                uob M = yob.M(i9);
                uob M2 = yob.M(i10);
                textView.setBackground(i0);
                yob.j(textView, i0, M, M2, vnbVar);
                j78Var.addView(textView, tre.d(-1, 48.0f, 83, 14.0f, 14.0f, 14.0f, 14.0f));
                textView.setOnClickListener(new uv5(this, vnbVar, (byte) 19));
            }
        }
        arrayList = null;
        TLRPC.TL_userContact_old2 tL_userContact_old22 = new TLRPC.TL_userContact_old2();
        this.H1 = tL_userContact_old22;
        if (user2 == null) {
        }
        this.s1 = eVar;
        final Activity parentActivity2 = eVar.getParentActivity();
        arrayList2 = this.F1;
        this.y1 = 1;
        arrayList3 = this.G1;
        if (arrayList3.size() <= 1) {
        }
        if (arrayList3.isEmpty()) {
        }
        if (arrayList2.isEmpty()) {
        }
        j78 j78Var2 = new j78(this, parentActivity2, parentActivity2);
        j78Var2.setWillNotDraw(false);
        this.b = j78Var2;
        this.v0 = false;
        this.w0 = false;
        this.l1 = new xh4((Object) this, (byte) 21);
        k78 k78Var2 = new k78(this, parentActivity2);
        this.m1 = k78Var2;
        k78Var2.setClipToPadding(false);
        k78Var2.setVerticalScrollBarEnabled(false);
        j78Var2.addView(k78Var2, tre.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 77.0f));
        LinearLayout linearLayout2 = new LinearLayout(parentActivity2);
        this.n1 = linearLayout2;
        linearLayout2.setOrientation(1);
        k78Var2.addView(linearLayout2, tre.x(-1, -1, 51));
        k78Var2.setOnScrollChangeListener(new h78(this));
        i = this.y1;
        while (i2 < i) {
        }
        l78 l78Var2 = new l78(this, parentActivity2);
        this.o1 = l78Var2;
        yob.h(aob.h5, vnbVar, l78Var2);
        l78Var2.setBackButtonImage(R.drawable.ic_ab_back);
        int i72 = aob.j5;
        yob.l(l78Var2, 1, i72, vnbVar);
        yob.l(l78Var2, 3, aob.I5, vnbVar);
        yob.l(l78Var2, 5, i72, vnbVar);
        l78Var2.setOccupyStatusBar(false);
        l78Var2.setAlpha(0.0f);
        if (this.D1) {
        }
        this.b.addView(l78Var2, tre.c(-2.0f, -1));
        l78Var2.setActionBarMenuOnItemClick(new m78(this));
        View view3 = new View(parentActivity2);
        this.p1 = view3;
        view3.setAlpha(0.0f);
        int i82 = aob.V5;
        yob.h(i82, vnbVar, view3);
        this.b.addView(view3, tre.c(1.0f, -1));
        View view22 = new View(parentActivity2);
        this.q1 = view22;
        yob.h(i82, vnbVar, view22);
        view22.setAlpha(0.0f);
        this.b.addView(view22, tre.d(-1, 1.0f, 83, 0.0f, 0.0f, 0.0f, 77.0f));
        TextView textView2 = new TextView(parentActivity2);
        this.r1 = textView2;
        textView2.setPadding(hl.L(34.0f), 0, hl.L(34.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(aob.v0(aob.Ji, this.J0));
        textView2.setTextSize(1, 14.0f);
        if (this.D1) {
        }
        textView2.setTypeface(hl.o());
        int L2 = hl.L(8.0f);
        int i92 = aob.Fi;
        int v03 = aob.v0(i92, this.J0);
        int i102 = aob.Hi;
        int v022 = aob.v0(i102, this.J0);
        hf0 i02 = aob.i0(L2, L2, L2, L2, v03, v022, v022);
        uob M3 = yob.M(i92);
        uob M22 = yob.M(i102);
        textView2.setBackground(i02);
        yob.j(textView2, i02, M3, M22, vnbVar);
        j78Var2.addView(textView2, tre.d(-1, 48.0f, 83, 14.0f, 14.0f, 14.0f, 14.0f));
        textView2.setOnClickListener(new uv5(this, vnbVar, (byte) 19));
    }

    @Override // nx0
    public final boolean D() {
        return false;
    }

    public final void E0() {
        TextView textView = this.r1;
        if (textView != null) {
            int v0 = aob.v0(aob.Ji, this.J0);
            if (!textView.isEnabled()) {
                v0 &= ConnectionsManager.DEFAULT_DATACENTER_ID;
            }
            if (textView.getCurrentTextColor() != v0) {
                textView.setTextColor(v0);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F0(boolean z) {
        Integer num;
        AnimatorSet animatorSet;
        Integer num2 = 1;
        k78 k78Var = this.m1;
        View childAt = k78Var.getChildAt(0);
        int top = childAt.getTop() - k78Var.getScrollY();
        if (top < 0) {
            top = 0;
        }
        boolean z2 = top <= 0;
        l78 l78Var = this.o1;
        Object tag = l78Var.getTag();
        if (z2) {
            if (tag == null) {
                num = num2;
                l78Var.setTag(num);
                animatorSet = this.w1;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.w1 = null;
                }
                View view = this.p1;
                if (z) {
                    l78Var.setAlpha(z2 ? 1.0f : 0.0f);
                    view.setAlpha(z2 ? 1.0f : 0.0f);
                } else {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.w1 = animatorSet2;
                    animatorSet2.setDuration(180L);
                    AnimatorSet animatorSet3 = this.w1;
                    Property property = View.ALPHA;
                    animatorSet3.playTogether(ObjectAnimator.ofFloat(l78Var, (Property<l78, Float>) property, z2 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property, z2 ? 1.0f : 0.0f));
                    this.w1.addListener(new o78(this, (byte) 0));
                    this.w1.start();
                }
            }
        } else if (tag != null) {
            num = null;
            l78Var.setTag(num);
            animatorSet = this.w1;
            if (animatorSet != null) {
            }
            View view2 = this.p1;
            if (z) {
            }
        }
        if (this.v1 != top) {
            this.v1 = top;
            this.b.invalidate();
        }
        childAt.getBottom();
        k78Var.getMeasuredHeight();
        boolean z3 = childAt.getBottom() - k78Var.getScrollY() > k78Var.getMeasuredHeight();
        View view3 = this.q1;
        if (z3) {
            if (view3.getTag() != null) {
                return;
            }
        } else if (view3.getTag() == null) {
            return;
        } else {
            num2 = null;
        }
        view3.setTag(num2);
        AnimatorSet animatorSet4 = this.x1;
        if (animatorSet4 != null) {
            animatorSet4.cancel();
            this.x1 = null;
        }
        if (!z) {
            view3.setAlpha(z3 ? 1.0f : 0.0f);
            return;
        }
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.x1 = animatorSet5;
        animatorSet5.setDuration(180L);
        this.x1.playTogether(ObjectAnimator.ofFloat(view3, (Property<View, Float>) View.ALPHA, z3 ? 1.0f : 0.0f));
        this.x1.addListener(new o78(this, (byte) 1));
        this.x1.start();
    }

    @Override // nx0, android.app.Dialog
    public final void onStart() {
        super.onStart();
        v21.a((FrameLayout) this.b, new py((byte) 10));
    }

    @Override // android.app.Dialog
    public final void onStop() {
        super.onStop();
        v21.h((FrameLayout) this.b);
    }

    @Override // nx0
    public final void p0() {
        super.p0();
        try {
            E0();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}

// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class p3c extends d {
    public s71 E;
    public c7 F;
    public boolean G;
    public int H;
    public boolean I;
    public AnimatorSet J;
    public final ArrayList K;
    public AnimatorSet L;
    public RadialProgressView M;
    public boolean N;
    public boolean O;
    public final byte P;
    public String Q;
    public String R;
    public String S;
    public boolean T;
    public boolean U;
    public TL_account.Password V;
    public byte[] W;
    public long X;
    public byte[] Y;
    public boolean Z;
    public ry8 a;
    public boolean a0;
    public TextView b;
    public String b0;
    public TextView c;
    public vk9 c0;
    public wla d;
    public un4 d0;
    public TextView e;
    public wyb e0;
    public TextView f;
    public s43 f0;
    public oy8[] g0;
    public TextView h;
    public f3c h0;
    public final Runnable i0;
    public final Runnable j0;
    public t36 k0;
    public EditTextBoldCursor n;
    public EditTextBoldCursor r;
    public er7 s;
    public er7 w;
    public yc6 x;
    public o3c y;

    /* JADX WARN: Multi-variable type inference failed */
    public p3c(int i, int i2, TL_account.Password password) {
        super(null);
        this.G = false;
        this.H = -1;
        this.K = new ArrayList();
        this.W = new byte[0];
        this.i0 = new f3c(this, (byte) 0);
        this.j0 = new f3c(this, (byte) 1);
        this.currentAccount = i;
        this.P = i2;
        this.V = password;
        this.U = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        if (this.V == null) {
            if (i2 == 6 || i2 == 8) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new h3c(this, (byte) 0), 10);
            }
        }
    }

    public final void A0() {
        this.d0.f(false, true);
    }

    public final void B0() {
        if (getParentActivity() == null || getParentActivity().isFinishing()) {
            return;
        }
        this.d0.f(true, true);
    }

    public final void C0() {
        for (sj2 sj2Var : this.x.f) {
            sj2Var.setText("");
            sj2Var.A(1.0f);
        }
        this.x.f[0].requestFocus();
        gl.A3(8.0f, this.x, new f3c(this, (byte) 6));
    }

    public final void D0(er7 er7Var, EditTextBoldCursor editTextBoldCursor, boolean z) {
        if (getParentActivity() == null) {
            return;
        }
        try {
            editTextBoldCursor.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z) {
            editTextBoldCursor.setText("");
        }
        gl.A3(5.0f, er7Var, null);
    }

    public final void E0() {
        TL_account.Password password = this.V;
        if (password.has_recovery) {
            this.S = "";
            I0(false);
            return;
        }
        p3c p3cVar = new p3c(this.currentAccount, 3, password);
        p3cVar.I = this.I;
        p3cVar.H0(this.W, this.X, this.Y, this.a0);
        p3cVar.Q = this.Q;
        p3cVar.R = this.R;
        ArrayList arrayList = this.K;
        ArrayList arrayList2 = p3cVar.K;
        arrayList2.addAll(arrayList);
        arrayList2.add(this);
        p3cVar.Z = this.Z;
        p3cVar.H = this.H;
        presentFragment(p3cVar);
    }

    public final void G0() {
        if (getParentActivity() != null) {
            byte b = 0;
            switch (this.P) {
                case 0:
                case 1:
                    if (this.n.length() == 0) {
                        D0(this.s, this.n, false);
                        break;
                    } else if (this.n.getText().toString().equals(this.Q) || this.P != 1) {
                        p3c p3cVar = new p3c(this.currentAccount, this.P == 0 ? (byte) 1 : (byte) 2, this.V);
                        p3cVar.I = this.I;
                        p3cVar.Q = this.n.getText().toString();
                        p3cVar.H0(this.W, this.X, this.Y, this.a0);
                        p3cVar.b0 = this.b0;
                        p3cVar.K.addAll(this.K);
                        p3cVar.K.add(this);
                        p3cVar.Z = this.Z;
                        p3cVar.H = this.H;
                        presentFragment(p3cVar);
                        break;
                    } else {
                        gl.A3(5.0f, this.s, null);
                        try {
                            this.s.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        try {
                            Toast.makeText(getParentActivity(), k96.M0(2131747253, null), 0).show();
                            break;
                        } catch (Exception e) {
                            fa4.g(e, true);
                            return;
                        }
                    }
                    break;
                case 2:
                    String obj = this.n.getText().toString();
                    this.R = obj;
                    if (!obj.equalsIgnoreCase(this.Q)) {
                        E0();
                        break;
                    } else {
                        try {
                            Toast.makeText(getParentActivity(), k96.M0(2131747255, null), 0).show();
                        } catch (Exception e2) {
                            fa4.g(e2, true);
                        }
                        D0(this.s, this.n, false);
                        break;
                    }
                case 3:
                    if (!this.a0 && this.h.getAlpha() < 1.0f) {
                        this.h.animate().cancel();
                        this.h.animate().alpha(1.0f).start();
                    }
                    String obj2 = this.n.getText().toString();
                    this.S = obj2;
                    if (obj2 != null && obj2.length() >= 3) {
                        int lastIndexOf = obj2.lastIndexOf(46);
                        int lastIndexOf2 = obj2.lastIndexOf(64);
                        if (lastIndexOf2 >= 0 && lastIndexOf >= lastIndexOf2) {
                            I0(false);
                            break;
                        }
                    }
                    D0(this.s, this.n, false);
                    break;
                case 4:
                    String code = this.x.getCode();
                    TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
                    tL_auth_checkRecoveryPassword.code = code;
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_checkRecoveryPassword, new apa(this, code, (byte) 18), 10);
                    break;
                case 5:
                    TL_account.confirmPasswordEmail confirmpasswordemail = new TL_account.confirmPasswordEmail();
                    confirmpasswordemail.code = this.x.getCode();
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmpasswordemail, new h3c(this, r1), 10);
                    B0();
                    break;
                case 6:
                    TL_account.Password password = this.V;
                    if (password != null) {
                        p3c p3cVar2 = new p3c(this.currentAccount, 0, password);
                        p3cVar2.I = this.I;
                        p3cVar2.Z = this.Z;
                        p3cVar2.H = this.H;
                        presentFragment(p3cVar2, true);
                        break;
                    } else {
                        B0();
                        this.O = true;
                        break;
                    }
                case 7:
                    if (!this.Z) {
                        if (!this.I) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.z0(this.V, this.W, this.X, this.Y);
                            twoStepVerificationActivity.Y = this.H;
                            presentFragment(twoStepVerificationActivity, true);
                            t36 t36Var = this.k0;
                            if (t36Var != null) {
                                gl.c3(t36Var);
                                this.k0 = null;
                                break;
                            }
                        } else {
                            Bundle l = ir2.l("afterSignup", true);
                            ah6 ah6Var = new ah6();
                            ah6Var.q0(l);
                            presentFragment(ah6Var, true);
                            break;
                        }
                    } else {
                        finishFragment();
                        break;
                    }
                    break;
                case 8:
                    if (this.V != null) {
                        String obj3 = this.n.getText().toString();
                        if (obj3.length() != 0) {
                            byte[] g1 = gl.g1(obj3);
                            B0();
                            Utilities.e.c(new i3c(this, g1, b));
                            break;
                        } else {
                            D0(this.s, this.n, false);
                            break;
                        }
                    } else {
                        B0();
                        this.O = true;
                        break;
                    }
                case 9:
                    finishFragment();
                    break;
            }
        }
    }

    public final void H0(byte[] bArr, long j, byte[] bArr2, boolean z) {
        this.W = bArr;
        this.Y = bArr2;
        this.X = j;
        this.a0 = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I0(boolean z) {
        TL_account.Password password;
        TL_account.updatePasswordSettings updatepasswordsettings;
        byte b = 3;
        if (z && this.U && this.V.has_password) {
            B0();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.cancelPasswordEmail(), new h3c(this, b));
            return;
        }
        String str = this.Q;
        TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
        String str2 = "";
        if (z) {
            y6c.h(this.currentAccount).t();
            this.Y = null;
            if (this.U) {
                passwordinputsettings.flags = 2;
                passwordinputsettings.email = "";
            } else {
                passwordinputsettings.flags = 3;
                passwordinputsettings.hint = "";
                passwordinputsettings.new_password_hash = new byte[0];
                passwordinputsettings.new_algo = new TLRPC.TL_passwordKdfAlgoUnknown();
                passwordinputsettings.email = "";
            }
        } else {
            String str3 = this.R;
            if (str3 == null && (password = this.V) != null) {
                str3 = password.hint;
                this.R = str3;
            }
            if (str3 == null) {
                this.R = "";
            } else {
                str2 = str3;
            }
            if (str != null) {
                passwordinputsettings.flags |= 1;
                passwordinputsettings.hint = str2;
                passwordinputsettings.new_algo = this.V.new_algo;
            }
            if (this.S.length() > 0) {
                passwordinputsettings.flags |= 2;
                passwordinputsettings.email = this.S.trim();
            }
        }
        if (this.b0 != null) {
            TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
            tL_auth_recoverPassword.code = this.b0;
            tL_auth_recoverPassword.new_settings = passwordinputsettings;
            tL_auth_recoverPassword.flags |= 1;
            updatepasswordsettings = tL_auth_recoverPassword;
        } else {
            TL_account.updatePasswordSettings updatepasswordsettings2 = new TL_account.updatePasswordSettings();
            byte[] bArr = this.W;
            if (bArr == null || bArr.length == 0 || (z && this.U)) {
                updatepasswordsettings2.password = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            updatepasswordsettings2.new_settings = passwordinputsettings;
            updatepasswordsettings = updatepasswordsettings2;
        }
        TL_account.updatePasswordSettings updatepasswordsettings3 = updatepasswordsettings;
        B0();
        Utilities.e.c(new z77((Object) this, (Object) updatepasswordsettings3, z, (Object) str, (Object) passwordinputsettings, (byte) 23));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
    
        if (r0.l0 != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J0(boolean z) {
        if (this.P != 0) {
            return;
        }
        f3c f3cVar = this.h0;
        if (f3cVar != null) {
            gl.r(f3cVar);
        }
        oy8 animatedDrawable = this.a.getAnimatedDrawable();
        if (!z) {
            oy8[] oy8VarArr = this.g0;
            if (animatedDrawable != oy8VarArr[0]) {
                if (animatedDrawable != oy8VarArr[1]) {
                    if (this.n.length() == 0) {
                        if (animatedDrawable != null) {
                        }
                    }
                    f3c f3cVar2 = new f3c(this, (byte) 4);
                    this.h0 = f3cVar2;
                    gl.d3(f3cVar2, Utilities.b.nextInt(2000) + 5000);
                }
            }
        }
        int nextInt = Utilities.b.nextInt() % 2;
        ry8 ry8Var = this.a;
        oy8[] oy8VarArr2 = this.g0;
        if (nextInt == 0) {
            ry8Var.setAnimation(oy8VarArr2[0]);
            this.g0[0].O(true, 0.0f);
        } else {
            ry8Var.setAnimation(oy8VarArr2[1]);
            this.g0[1].O(true, 0.0f);
        }
        if (!z) {
            this.a.d();
        }
        f3c f3cVar22 = new f3c(this, (byte) 4);
        this.h0 = f3cVar22;
        gl.d3(f3cVar22, Utilities.b.nextInt(2000) + 5000);
    }

    public final void K0(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.j(k96.M0(2131747638, null), null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = str;
        hdVar.U = str2;
        showDialog(hdVar);
    }

    public final void L0(boolean z) {
        if (z == (this.b.getTag() != null)) {
            return;
        }
        AnimatorSet animatorSet = this.J;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.b.setTag(z ? 1 : null);
        this.J = new AnimatorSet();
        if (z) {
            this.b.setVisibility(0);
            AnimatorSet animatorSet2 = this.J;
            TextView textView = this.e;
            Property property = View.SCALE_X;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.9f);
            TextView textView2 = this.e;
            Property property2 = View.SCALE_Y;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, 0.9f);
            TextView textView3 = this.e;
            Property property3 = View.ALPHA;
            animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.b, (Property<TextView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.b, (Property<TextView, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.b, (Property<TextView, Float>) property3, 1.0f));
        } else {
            this.e.setVisibility(0);
            AnimatorSet animatorSet3 = this.J;
            TextView textView4 = this.b;
            Property property4 = View.SCALE_X;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView4, (Property<TextView, Float>) property4, 0.9f);
            TextView textView5 = this.b;
            Property property5 = View.SCALE_Y;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textView5, (Property<TextView, Float>) property5, 0.9f);
            TextView textView6 = this.b;
            Property property6 = View.ALPHA;
            animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(textView6, (Property<TextView, Float>) property6, 0.0f), ObjectAnimator.ofFloat(this.e, (Property<TextView, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.e, (Property<TextView, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.e, (Property<TextView, Float>) property6, 1.0f));
        }
        this.J.addListener(new pu9((byte) 13, this, z));
        this.J.setDuration(150L);
        this.J.start();
    }

    public final void M0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = k96.M0(2131742685, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = k96.G(this.H, "ForceSetPasswordAlertMessageShort", new Object[0]);
        alertDialog$Builder.j(k96.M0(2131743694, null), null);
        alertDialog$Builder.g(k96.M0(2131750577, null), new g3c(this, (byte) 0));
        zkb.X((TextView) alertDialog$Builder.o().c(-2), bkb.p7, null);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.r8));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v79 */
    /* JADX WARN: Type inference failed for: r10v80, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v81 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21, types: [int[], java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v22 */
    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        char c;
        byte b;
        ?? r12;
        ?? r10;
        this.actionBar.setBackgroundDrawable(null);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final byte b2 = 0;
        this.actionBar.setAllowOverlayTitle(false);
        a aVar = this.actionBar;
        int i = bkb.F6;
        final byte b3 = 5;
        zkb.l(aVar, 5, i, null);
        final byte b4 = 1;
        zkb.l(this.actionBar, 1, i, null);
        zkb.l(this.actionBar, 3, bkb.t8, null);
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new n3c(this));
        byte b5 = this.P;
        if (b5 == 5) {
            this.actionBar.t().a(0, R.drawable.ic_ab_other).g(1, k96.M0(2131754947, null));
        }
        un4 un4Var = new un4(this.resourceProvider, context, false);
        this.d0 = un4Var;
        this.c0 = new vk9(un4Var);
        this.d0.setOnClickListener(new View.OnClickListener(this) { // from class: c3c
            public final /* synthetic */ p3c b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b6 = b2;
                byte b7 = 1;
                p3c p3cVar = this.b;
                switch (b6) {
                    case 0:
                        p3cVar.G0();
                        break;
                    case 1:
                        byte b8 = p3cVar.P;
                        p3cVar.N = true;
                        TransformationMethod transformationMethod = p3cVar.n.getTransformationMethod();
                        EditTextBoldCursor editTextBoldCursor = p3cVar.n;
                        if (transformationMethod == null) {
                            editTextBoldCursor.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            zkb.s(p3cVar.F, bkb.Ne, null, PorterDuff.Mode.MULTIPLY);
                            if (b8 == 0 && p3cVar.n.length() > 0 && p3cVar.n.hasFocus()) {
                                p3cVar.g0[3].K(-1);
                                oy8 animatedDrawable = p3cVar.a.getAnimatedDrawable();
                                oy8 oy8Var = p3cVar.g0[3];
                                if (animatedDrawable != oy8Var) {
                                    p3cVar.a.setAnimation(oy8Var);
                                    p3cVar.g0[3].I(18, false, false);
                                }
                                p3cVar.a.d();
                            }
                        } else {
                            editTextBoldCursor.setTransformationMethod(null);
                            zkb.s(p3cVar.F, bkb.Oe, null, PorterDuff.Mode.MULTIPLY);
                            if (b8 == 0 && p3cVar.n.length() > 0 && p3cVar.n.hasFocus()) {
                                p3cVar.g0[3].K(18);
                                oy8 animatedDrawable2 = p3cVar.a.getAnimatedDrawable();
                                oy8 oy8Var2 = p3cVar.g0[3];
                                if (animatedDrawable2 != oy8Var2) {
                                    p3cVar.a.setAnimation(oy8Var2);
                                }
                                p3cVar.g0[3].O(false, 0.0f);
                                p3cVar.a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor2 = p3cVar.n;
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                        p3cVar.N = false;
                        break;
                    case 2:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p3cVar.getParentActivity());
                        alertDialog$Builder.g(k96.M0(2131752577, null), null);
                        alertDialog$Builder.j(k96.M0(2131745925, null), new g3c(p3cVar, (byte) 1));
                        String M0 = k96.M0(2131745900, null);
                        hd hdVar = alertDialog$Builder.a;
                        hdVar.S = M0;
                        hdVar.U = k96.M0(2131745881, null);
                        p3cVar.showDialog(hdVar);
                        break;
                    case 3:
                        p3cVar.m0();
                        break;
                    case 4:
                        if (p3cVar.h.getAlpha() >= 0.5f) {
                            byte b9 = p3cVar.P;
                            if (b9 != 0) {
                                if (b9 != 3) {
                                    if (b9 == 2) {
                                        p3cVar.E0();
                                        break;
                                    }
                                } else {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(p3cVar.getParentActivity());
                                    String M02 = k96.M0(2131742552, null);
                                    hd hdVar2 = alertDialog$Builder2.a;
                                    hdVar2.U = M02;
                                    hdVar2.S = k96.M0(2131742553, null);
                                    alertDialog$Builder2.j(k96.M0(2131742554, null), new g3c(p3cVar, (byte) 2));
                                    alertDialog$Builder2.g(k96.M0(2131752577, null), null);
                                    p3cVar.showDialog(hdVar2);
                                    TextView textView = (TextView) hdVar2.c(-1);
                                    if (textView != null) {
                                        zkb.X(textView, bkb.p7, null);
                                        break;
                                    }
                                }
                            } else {
                                p3cVar.B0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = p3cVar.b0;
                                p3cVar.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new h3c(p3cVar, b7));
                                break;
                            }
                        }
                        break;
                    case 5:
                        if (p3cVar.P == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.X = true;
                            twoStepVerificationActivity.J = p3cVar.V;
                            twoStepVerificationActivity.K = false;
                            twoStepVerificationActivity.Y = p3cVar.H;
                            p3cVar.presentFragment(twoStepVerificationActivity, true);
                            t36 t36Var = p3cVar.k0;
                            if (t36Var != null) {
                                gl.c3(t36Var);
                                p3cVar.k0 = null;
                                break;
                            }
                        }
                        break;
                    default:
                        p3cVar.G0();
                        break;
                }
            }
        });
        wyb wybVar = new wyb(context);
        this.e0 = wybVar;
        wybVar.setTransformType(1);
        this.e0.setProgress(0.0f);
        this.e0.setColor(bkb.w0(null, bkb.N9, false));
        this.e0.setDrawBackground(false);
        this.d0.setContentDescription(k96.M0(2131748058, null));
        this.d0.addView(this.e0, nme.e(56, 56, 17));
        this.d0.a(this.e0);
        TextView textView = new TextView(context);
        this.h = textView;
        zkb.X(textView, bkb.n6, null);
        this.h.setTextSize(1, 14.0f);
        this.h.setGravity(19);
        this.h.setVisibility(8);
        vk9.c(this.h);
        this.h.setPadding(gl.L(32.0f), 0, gl.L(32.0f), 0);
        final byte b6 = 4;
        this.h.setOnClickListener(new View.OnClickListener(this) { // from class: c3c
            public final /* synthetic */ p3c b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b62 = b6;
                byte b7 = 1;
                p3c p3cVar = this.b;
                switch (b62) {
                    case 0:
                        p3cVar.G0();
                        break;
                    case 1:
                        byte b8 = p3cVar.P;
                        p3cVar.N = true;
                        TransformationMethod transformationMethod = p3cVar.n.getTransformationMethod();
                        EditTextBoldCursor editTextBoldCursor = p3cVar.n;
                        if (transformationMethod == null) {
                            editTextBoldCursor.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            zkb.s(p3cVar.F, bkb.Ne, null, PorterDuff.Mode.MULTIPLY);
                            if (b8 == 0 && p3cVar.n.length() > 0 && p3cVar.n.hasFocus()) {
                                p3cVar.g0[3].K(-1);
                                oy8 animatedDrawable = p3cVar.a.getAnimatedDrawable();
                                oy8 oy8Var = p3cVar.g0[3];
                                if (animatedDrawable != oy8Var) {
                                    p3cVar.a.setAnimation(oy8Var);
                                    p3cVar.g0[3].I(18, false, false);
                                }
                                p3cVar.a.d();
                            }
                        } else {
                            editTextBoldCursor.setTransformationMethod(null);
                            zkb.s(p3cVar.F, bkb.Oe, null, PorterDuff.Mode.MULTIPLY);
                            if (b8 == 0 && p3cVar.n.length() > 0 && p3cVar.n.hasFocus()) {
                                p3cVar.g0[3].K(18);
                                oy8 animatedDrawable2 = p3cVar.a.getAnimatedDrawable();
                                oy8 oy8Var2 = p3cVar.g0[3];
                                if (animatedDrawable2 != oy8Var2) {
                                    p3cVar.a.setAnimation(oy8Var2);
                                }
                                p3cVar.g0[3].O(false, 0.0f);
                                p3cVar.a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor2 = p3cVar.n;
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                        p3cVar.N = false;
                        break;
                    case 2:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p3cVar.getParentActivity());
                        alertDialog$Builder.g(k96.M0(2131752577, null), null);
                        alertDialog$Builder.j(k96.M0(2131745925, null), new g3c(p3cVar, (byte) 1));
                        String M0 = k96.M0(2131745900, null);
                        hd hdVar = alertDialog$Builder.a;
                        hdVar.S = M0;
                        hdVar.U = k96.M0(2131745881, null);
                        p3cVar.showDialog(hdVar);
                        break;
                    case 3:
                        p3cVar.m0();
                        break;
                    case 4:
                        if (p3cVar.h.getAlpha() >= 0.5f) {
                            byte b9 = p3cVar.P;
                            if (b9 != 0) {
                                if (b9 != 3) {
                                    if (b9 == 2) {
                                        p3cVar.E0();
                                        break;
                                    }
                                } else {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(p3cVar.getParentActivity());
                                    String M02 = k96.M0(2131742552, null);
                                    hd hdVar2 = alertDialog$Builder2.a;
                                    hdVar2.U = M02;
                                    hdVar2.S = k96.M0(2131742553, null);
                                    alertDialog$Builder2.j(k96.M0(2131742554, null), new g3c(p3cVar, (byte) 2));
                                    alertDialog$Builder2.g(k96.M0(2131752577, null), null);
                                    p3cVar.showDialog(hdVar2);
                                    TextView textView2 = (TextView) hdVar2.c(-1);
                                    if (textView2 != null) {
                                        zkb.X(textView2, bkb.p7, null);
                                        break;
                                    }
                                }
                            } else {
                                p3cVar.B0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = p3cVar.b0;
                                p3cVar.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new h3c(p3cVar, b7));
                                break;
                            }
                        }
                        break;
                    case 5:
                        if (p3cVar.P == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.X = true;
                            twoStepVerificationActivity.J = p3cVar.V;
                            twoStepVerificationActivity.K = false;
                            twoStepVerificationActivity.Y = p3cVar.H;
                            p3cVar.presentFragment(twoStepVerificationActivity, true);
                            t36 t36Var = p3cVar.k0;
                            if (t36Var != null) {
                                gl.c3(t36Var);
                                p3cVar.k0 = null;
                                break;
                            }
                        }
                        break;
                    default:
                        p3cVar.G0();
                        break;
                }
            }
        });
        ry8 ry8Var = new ry8(context);
        this.a = ry8Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        ry8Var.setScaleType(scaleType);
        if (b5 == 2 && gl.M1()) {
            this.a.setVisibility(8);
        } else if (b5 != 6 && b5 != 9 && b5 != 7) {
            ry8 ry8Var2 = this.a;
            Point point = gl.q;
            ry8Var2.setVisibility(point.x > point.y ? 8 : 0);
        }
        TextView textView2 = new TextView(context);
        this.c = textView2;
        zkb.X(textView2, i, null);
        this.c.setGravity(1);
        this.c.setPadding(gl.L(32.0f), 0, gl.L(32.0f), 0);
        this.c.setTextSize(1, 24.0f);
        wla wlaVar = new wla(context);
        this.d = wlaVar;
        int i2 = bkb.C6;
        zkb.X(wlaVar, i2, null);
        this.d.setGravity(1);
        this.d.setLineSpacing(gl.L(2.0f), 1.0f);
        this.d.setTextSize(1, 15.0f);
        this.d.setVisibility(8);
        this.d.setPadding(gl.L(32.0f), 0, gl.L(32.0f), 0);
        TextView textView3 = new TextView(context);
        this.e = textView3;
        zkb.X(textView3, i2, null);
        this.e.setGravity(1);
        this.e.setTextSize(1, 14.0f);
        this.e.setLineSpacing(gl.L(2.0f), 1.0f);
        this.e.setPadding(gl.L(32.0f), 0, gl.L(32.0f), 0);
        this.e.setVisibility(8);
        this.e.setOnClickListener(new View.OnClickListener(this) { // from class: c3c
            public final /* synthetic */ p3c b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b62 = b3;
                byte b7 = 1;
                p3c p3cVar = this.b;
                switch (b62) {
                    case 0:
                        p3cVar.G0();
                        break;
                    case 1:
                        byte b8 = p3cVar.P;
                        p3cVar.N = true;
                        TransformationMethod transformationMethod = p3cVar.n.getTransformationMethod();
                        EditTextBoldCursor editTextBoldCursor = p3cVar.n;
                        if (transformationMethod == null) {
                            editTextBoldCursor.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            zkb.s(p3cVar.F, bkb.Ne, null, PorterDuff.Mode.MULTIPLY);
                            if (b8 == 0 && p3cVar.n.length() > 0 && p3cVar.n.hasFocus()) {
                                p3cVar.g0[3].K(-1);
                                oy8 animatedDrawable = p3cVar.a.getAnimatedDrawable();
                                oy8 oy8Var = p3cVar.g0[3];
                                if (animatedDrawable != oy8Var) {
                                    p3cVar.a.setAnimation(oy8Var);
                                    p3cVar.g0[3].I(18, false, false);
                                }
                                p3cVar.a.d();
                            }
                        } else {
                            editTextBoldCursor.setTransformationMethod(null);
                            zkb.s(p3cVar.F, bkb.Oe, null, PorterDuff.Mode.MULTIPLY);
                            if (b8 == 0 && p3cVar.n.length() > 0 && p3cVar.n.hasFocus()) {
                                p3cVar.g0[3].K(18);
                                oy8 animatedDrawable2 = p3cVar.a.getAnimatedDrawable();
                                oy8 oy8Var2 = p3cVar.g0[3];
                                if (animatedDrawable2 != oy8Var2) {
                                    p3cVar.a.setAnimation(oy8Var2);
                                }
                                p3cVar.g0[3].O(false, 0.0f);
                                p3cVar.a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor2 = p3cVar.n;
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                        p3cVar.N = false;
                        break;
                    case 2:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p3cVar.getParentActivity());
                        alertDialog$Builder.g(k96.M0(2131752577, null), null);
                        alertDialog$Builder.j(k96.M0(2131745925, null), new g3c(p3cVar, (byte) 1));
                        String M0 = k96.M0(2131745900, null);
                        hd hdVar = alertDialog$Builder.a;
                        hdVar.S = M0;
                        hdVar.U = k96.M0(2131745881, null);
                        p3cVar.showDialog(hdVar);
                        break;
                    case 3:
                        p3cVar.m0();
                        break;
                    case 4:
                        if (p3cVar.h.getAlpha() >= 0.5f) {
                            byte b9 = p3cVar.P;
                            if (b9 != 0) {
                                if (b9 != 3) {
                                    if (b9 == 2) {
                                        p3cVar.E0();
                                        break;
                                    }
                                } else {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(p3cVar.getParentActivity());
                                    String M02 = k96.M0(2131742552, null);
                                    hd hdVar2 = alertDialog$Builder2.a;
                                    hdVar2.U = M02;
                                    hdVar2.S = k96.M0(2131742553, null);
                                    alertDialog$Builder2.j(k96.M0(2131742554, null), new g3c(p3cVar, (byte) 2));
                                    alertDialog$Builder2.g(k96.M0(2131752577, null), null);
                                    p3cVar.showDialog(hdVar2);
                                    TextView textView22 = (TextView) hdVar2.c(-1);
                                    if (textView22 != null) {
                                        zkb.X(textView22, bkb.p7, null);
                                        break;
                                    }
                                }
                            } else {
                                p3cVar.B0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = p3cVar.b0;
                                p3cVar.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new h3c(p3cVar, b7));
                                break;
                            }
                        }
                        break;
                    case 5:
                        if (p3cVar.P == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.X = true;
                            twoStepVerificationActivity.J = p3cVar.V;
                            twoStepVerificationActivity.K = false;
                            twoStepVerificationActivity.Y = p3cVar.H;
                            p3cVar.presentFragment(twoStepVerificationActivity, true);
                            t36 t36Var = p3cVar.k0;
                            if (t36Var != null) {
                                gl.c3(t36Var);
                                p3cVar.k0 = null;
                                break;
                            }
                        }
                        break;
                    default:
                        p3cVar.G0();
                        break;
                }
            }
        });
        TextView textView4 = new TextView(context);
        this.b = textView4;
        textView4.setMinWidth(gl.L(220.0f));
        this.b.setPadding(gl.L(34.0f), 0, gl.L(34.0f), 0);
        this.b.setGravity(17);
        zkb.X(this.b, bkb.Ii, null);
        this.b.setTextSize(1, 15.0f);
        this.b.setTypeface(gl.o());
        this.b.setBackground(sjb.f(bkb.Ei, 24.0f));
        final byte b7 = 6;
        this.b.setOnClickListener(new View.OnClickListener(this) { // from class: c3c
            public final /* synthetic */ p3c b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b62 = b7;
                byte b72 = 1;
                p3c p3cVar = this.b;
                switch (b62) {
                    case 0:
                        p3cVar.G0();
                        break;
                    case 1:
                        byte b8 = p3cVar.P;
                        p3cVar.N = true;
                        TransformationMethod transformationMethod = p3cVar.n.getTransformationMethod();
                        EditTextBoldCursor editTextBoldCursor = p3cVar.n;
                        if (transformationMethod == null) {
                            editTextBoldCursor.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            zkb.s(p3cVar.F, bkb.Ne, null, PorterDuff.Mode.MULTIPLY);
                            if (b8 == 0 && p3cVar.n.length() > 0 && p3cVar.n.hasFocus()) {
                                p3cVar.g0[3].K(-1);
                                oy8 animatedDrawable = p3cVar.a.getAnimatedDrawable();
                                oy8 oy8Var = p3cVar.g0[3];
                                if (animatedDrawable != oy8Var) {
                                    p3cVar.a.setAnimation(oy8Var);
                                    p3cVar.g0[3].I(18, false, false);
                                }
                                p3cVar.a.d();
                            }
                        } else {
                            editTextBoldCursor.setTransformationMethod(null);
                            zkb.s(p3cVar.F, bkb.Oe, null, PorterDuff.Mode.MULTIPLY);
                            if (b8 == 0 && p3cVar.n.length() > 0 && p3cVar.n.hasFocus()) {
                                p3cVar.g0[3].K(18);
                                oy8 animatedDrawable2 = p3cVar.a.getAnimatedDrawable();
                                oy8 oy8Var2 = p3cVar.g0[3];
                                if (animatedDrawable2 != oy8Var2) {
                                    p3cVar.a.setAnimation(oy8Var2);
                                }
                                p3cVar.g0[3].O(false, 0.0f);
                                p3cVar.a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor2 = p3cVar.n;
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                        p3cVar.N = false;
                        break;
                    case 2:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p3cVar.getParentActivity());
                        alertDialog$Builder.g(k96.M0(2131752577, null), null);
                        alertDialog$Builder.j(k96.M0(2131745925, null), new g3c(p3cVar, (byte) 1));
                        String M0 = k96.M0(2131745900, null);
                        hd hdVar = alertDialog$Builder.a;
                        hdVar.S = M0;
                        hdVar.U = k96.M0(2131745881, null);
                        p3cVar.showDialog(hdVar);
                        break;
                    case 3:
                        p3cVar.m0();
                        break;
                    case 4:
                        if (p3cVar.h.getAlpha() >= 0.5f) {
                            byte b9 = p3cVar.P;
                            if (b9 != 0) {
                                if (b9 != 3) {
                                    if (b9 == 2) {
                                        p3cVar.E0();
                                        break;
                                    }
                                } else {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(p3cVar.getParentActivity());
                                    String M02 = k96.M0(2131742552, null);
                                    hd hdVar2 = alertDialog$Builder2.a;
                                    hdVar2.U = M02;
                                    hdVar2.S = k96.M0(2131742553, null);
                                    alertDialog$Builder2.j(k96.M0(2131742554, null), new g3c(p3cVar, (byte) 2));
                                    alertDialog$Builder2.g(k96.M0(2131752577, null), null);
                                    p3cVar.showDialog(hdVar2);
                                    TextView textView22 = (TextView) hdVar2.c(-1);
                                    if (textView22 != null) {
                                        zkb.X(textView22, bkb.p7, null);
                                        break;
                                    }
                                }
                            } else {
                                p3cVar.B0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = p3cVar.b0;
                                p3cVar.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new h3c(p3cVar, b72));
                                break;
                            }
                        }
                        break;
                    case 5:
                        if (p3cVar.P == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.X = true;
                            twoStepVerificationActivity.J = p3cVar.V;
                            twoStepVerificationActivity.K = false;
                            twoStepVerificationActivity.Y = p3cVar.H;
                            p3cVar.presentFragment(twoStepVerificationActivity, true);
                            t36 t36Var = p3cVar.k0;
                            if (t36Var != null) {
                                gl.c3(t36Var);
                                p3cVar.k0 = null;
                                break;
                            }
                        }
                        break;
                    default:
                        p3cVar.G0();
                        break;
                }
            }
        });
        if (b5 == 6 || b5 == 7 || b5 == 9) {
            this.c.setTypeface(Typeface.DEFAULT);
            this.c.setTextSize(1, 24.0f);
        } else {
            this.c.setTypeface(gl.o());
            this.c.setTextSize(1, 18.0f);
        }
        switch (b5) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                c = 5;
                zab zabVar = new zab((byte) 4, context, this);
                hv7 hv7Var = new hv7(this, context, zabVar, b4);
                hv7Var.addView(zabVar);
                aa1 aa1Var = new aa1(this, context, hv7Var);
                o3c o3cVar = new o3c(this, context);
                this.y = o3cVar;
                o3cVar.setVerticalScrollBarEnabled(false);
                zabVar.addView(this.y, nme.c(-1.0f, -1));
                zabVar.addView(this.h, nme.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
                zabVar.addView(this.d0, un4.b());
                aa1Var.addView(hv7Var, nme.c(-1.0f, -1));
                pkb pkbVar = new pkb((byte) 22, context, this);
                pkbVar.setOrientation(1);
                this.y.addView(pkbVar, nme.x(-1, -1, 51));
                pkbVar.addView(this.a, nme.t(-2, -2, 49, 0, 69, 0, 0));
                pkbVar.addView(this.c, nme.t(-2, -2, 49, 0, 8, 0, 0));
                pkbVar.addView(this.d, nme.t(-2, -2, 49, 0, 9, 0, 0));
                er7 er7Var = new er7(context, null);
                this.s = er7Var;
                er7Var.b(1.0f, 1.0f, false);
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.n = editTextBoldCursor;
                editTextBoldCursor.setTextSize(1, 18.0f);
                int L = gl.L(16.0f);
                this.n.setPadding(L, L, L, L);
                EditTextBoldCursor editTextBoldCursor2 = this.n;
                int i3 = bkb.k6;
                zkb.v(editTextBoldCursor2, i3, null);
                zkb.X(this.n, i, null);
                this.n.setBackground(null);
                this.n.setMaxLines(1);
                this.n.setLines(1);
                this.n.setGravity(3);
                this.n.setCursorSize(gl.L(20.0f));
                this.n.setSingleLine(true);
                this.n.setCursorWidth(1.5f);
                this.n.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: d3c
                    public final /* synthetic */ p3c b;

                    {
                        this.b = this;
                    }

                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView5, int i4, KeyEvent keyEvent) {
                        byte b8 = b4;
                        p3c p3cVar = this.b;
                        switch (b8) {
                            case 0:
                                if (i4 != 5 && i4 != 6) {
                                    return false;
                                }
                                p3cVar.G0();
                                return true;
                            default:
                                if (i4 != 5 && i4 != 6) {
                                    return false;
                                }
                                if (p3cVar.w.getVisibility() == 0) {
                                    p3cVar.r.requestFocus();
                                } else {
                                    p3cVar.G0();
                                }
                                return true;
                        }
                    }
                });
                this.s.e(this.n);
                final byte b8 = 2;
                this.n.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: e3c
                    public final /* synthetic */ p3c b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z) {
                        float f;
                        byte b9 = b8;
                        p3c p3cVar = this.b;
                        switch (b9) {
                            case 0:
                                er7 er7Var2 = p3cVar.w;
                                f = z ? 1.0f : 0.0f;
                                er7Var2.b(f, f, true);
                                break;
                            case 1:
                                if (z) {
                                    p3cVar.f0.setEditText((EditText) view);
                                    p3cVar.f0.setDispatchBackWhenEmpty(true);
                                    break;
                                }
                                break;
                            default:
                                er7 er7Var3 = p3cVar.s;
                                f = z ? 1.0f : 0.0f;
                                er7Var3.b(f, f, true);
                                break;
                        }
                    }
                });
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.addView(this.n, nme.l(1.0f, 0, -2));
                c7 c7Var = new c7((byte) 4, context, this);
                this.F = c7Var;
                c7Var.setImageResource(R.drawable.msg_message);
                this.F.setScaleType(scaleType);
                this.F.setContentDescription(k96.M0(2131743693, null));
                c7 c7Var2 = this.F;
                int i4 = bkb.h6;
                final byte b9 = 1;
                zkb.R(c7Var2, bkb.f0(bkb.w0(null, i4, false), 1, -1), null, zkb.M(i4), null);
                zkb.s(this.F, bkb.Ne, null, PorterDuff.Mode.MULTIPLY);
                gl.T3(this.F, false, 0.1f, true, false);
                this.F.setOnClickListener(new View.OnClickListener(this) { // from class: c3c
                    public final /* synthetic */ p3c b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b62 = b9;
                        byte b72 = 1;
                        p3c p3cVar = this.b;
                        switch (b62) {
                            case 0:
                                p3cVar.G0();
                                break;
                            case 1:
                                byte b82 = p3cVar.P;
                                p3cVar.N = true;
                                TransformationMethod transformationMethod = p3cVar.n.getTransformationMethod();
                                EditTextBoldCursor editTextBoldCursor3 = p3cVar.n;
                                if (transformationMethod == null) {
                                    editTextBoldCursor3.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                    zkb.s(p3cVar.F, bkb.Ne, null, PorterDuff.Mode.MULTIPLY);
                                    if (b82 == 0 && p3cVar.n.length() > 0 && p3cVar.n.hasFocus()) {
                                        p3cVar.g0[3].K(-1);
                                        oy8 animatedDrawable = p3cVar.a.getAnimatedDrawable();
                                        oy8 oy8Var = p3cVar.g0[3];
                                        if (animatedDrawable != oy8Var) {
                                            p3cVar.a.setAnimation(oy8Var);
                                            p3cVar.g0[3].I(18, false, false);
                                        }
                                        p3cVar.a.d();
                                    }
                                } else {
                                    editTextBoldCursor3.setTransformationMethod(null);
                                    zkb.s(p3cVar.F, bkb.Oe, null, PorterDuff.Mode.MULTIPLY);
                                    if (b82 == 0 && p3cVar.n.length() > 0 && p3cVar.n.hasFocus()) {
                                        p3cVar.g0[3].K(18);
                                        oy8 animatedDrawable2 = p3cVar.a.getAnimatedDrawable();
                                        oy8 oy8Var2 = p3cVar.g0[3];
                                        if (animatedDrawable2 != oy8Var2) {
                                            p3cVar.a.setAnimation(oy8Var2);
                                        }
                                        p3cVar.g0[3].O(false, 0.0f);
                                        p3cVar.a.d();
                                    }
                                }
                                EditTextBoldCursor editTextBoldCursor22 = p3cVar.n;
                                editTextBoldCursor22.setSelection(editTextBoldCursor22.length());
                                p3cVar.N = false;
                                break;
                            case 2:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p3cVar.getParentActivity());
                                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                                alertDialog$Builder.j(k96.M0(2131745925, null), new g3c(p3cVar, (byte) 1));
                                String M0 = k96.M0(2131745900, null);
                                hd hdVar = alertDialog$Builder.a;
                                hdVar.S = M0;
                                hdVar.U = k96.M0(2131745881, null);
                                p3cVar.showDialog(hdVar);
                                break;
                            case 3:
                                p3cVar.m0();
                                break;
                            case 4:
                                if (p3cVar.h.getAlpha() >= 0.5f) {
                                    byte b92 = p3cVar.P;
                                    if (b92 != 0) {
                                        if (b92 != 3) {
                                            if (b92 == 2) {
                                                p3cVar.E0();
                                                break;
                                            }
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(p3cVar.getParentActivity());
                                            String M02 = k96.M0(2131742552, null);
                                            hd hdVar2 = alertDialog$Builder2.a;
                                            hdVar2.U = M02;
                                            hdVar2.S = k96.M0(2131742553, null);
                                            alertDialog$Builder2.j(k96.M0(2131742554, null), new g3c(p3cVar, (byte) 2));
                                            alertDialog$Builder2.g(k96.M0(2131752577, null), null);
                                            p3cVar.showDialog(hdVar2);
                                            TextView textView22 = (TextView) hdVar2.c(-1);
                                            if (textView22 != null) {
                                                zkb.X(textView22, bkb.p7, null);
                                                break;
                                            }
                                        }
                                    } else {
                                        p3cVar.B0();
                                        TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                        tL_auth_recoverPassword.code = p3cVar.b0;
                                        p3cVar.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new h3c(p3cVar, b72));
                                        break;
                                    }
                                }
                                break;
                            case 5:
                                if (p3cVar.P == 8) {
                                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                    twoStepVerificationActivity.X = true;
                                    twoStepVerificationActivity.J = p3cVar.V;
                                    twoStepVerificationActivity.K = false;
                                    twoStepVerificationActivity.Y = p3cVar.H;
                                    p3cVar.presentFragment(twoStepVerificationActivity, true);
                                    t36 t36Var = p3cVar.k0;
                                    if (t36Var != null) {
                                        gl.c3(t36Var);
                                        p3cVar.k0 = null;
                                        break;
                                    }
                                }
                                break;
                            default:
                                p3cVar.G0();
                                break;
                        }
                    }
                });
                linearLayout.addView(this.F, nme.t(24, 24, 16, 0, 0, 16, 0));
                this.n.addTextChangedListener(new m3c(this, (byte) 1));
                this.s.addView(linearLayout, nme.c(-2.0f, -1));
                pkbVar.addView(this.s, nme.d(-1, -2.0f, 49, 24.0f, 32.0f, 24.0f, 32.0f));
                this.w = new er7(context, null);
                EditTextBoldCursor editTextBoldCursor3 = new EditTextBoldCursor(context);
                this.r = editTextBoldCursor3;
                editTextBoldCursor3.setTextSize(1, 18.0f);
                int L2 = gl.L(16.0f);
                this.r.setPadding(L2, L2, L2, L2);
                zkb.v(this.r, i3, null);
                zkb.X(this.r, i, null);
                this.r.setBackground(null);
                this.r.setMaxLines(1);
                this.r.setLines(1);
                this.r.setGravity(3);
                this.r.setCursorSize(gl.L(20.0f));
                this.r.setSingleLine(true);
                this.r.setCursorWidth(1.5f);
                final byte b10 = 0;
                this.r.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: d3c
                    public final /* synthetic */ p3c b;

                    {
                        this.b = this;
                    }

                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView5, int i42, KeyEvent keyEvent) {
                        byte b82 = b10;
                        p3c p3cVar = this.b;
                        switch (b82) {
                            case 0:
                                if (i42 != 5 && i42 != 6) {
                                    return false;
                                }
                                p3cVar.G0();
                                return true;
                            default:
                                if (i42 != 5 && i42 != 6) {
                                    return false;
                                }
                                if (p3cVar.w.getVisibility() == 0) {
                                    p3cVar.r.requestFocus();
                                } else {
                                    p3cVar.G0();
                                }
                                return true;
                        }
                    }
                });
                this.w.e(this.r);
                this.r.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: e3c
                    public final /* synthetic */ p3c b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z) {
                        float f;
                        byte b92 = b10;
                        p3c p3cVar = this.b;
                        switch (b92) {
                            case 0:
                                er7 er7Var2 = p3cVar.w;
                                f = z ? 1.0f : 0.0f;
                                er7Var2.b(f, f, true);
                                break;
                            case 1:
                                if (z) {
                                    p3cVar.f0.setEditText((EditText) view);
                                    p3cVar.f0.setDispatchBackWhenEmpty(true);
                                    break;
                                }
                                break;
                            default:
                                er7 er7Var3 = p3cVar.s;
                                f = z ? 1.0f : 0.0f;
                                er7Var3.b(f, f, true);
                                break;
                        }
                    }
                });
                this.w.addView(this.r, nme.c(-2.0f, -1));
                pkbVar.addView(this.w, nme.d(-1, -2.0f, 49, 24.0f, 16.0f, 24.0f, 0.0f));
                this.w.setVisibility(8);
                s43 s43Var = new s43(context);
                this.f0 = s43Var;
                s43Var.setVisibility(8);
                hv7Var.addView(this.f0);
                yc6 yc6Var = new yc6((byte) 3, context, this);
                this.x = yc6Var;
                final byte b11 = 1;
                yc6Var.b(6, 1);
                sj2[] sj2VarArr = this.x.f;
                int length = sj2VarArr.length;
                int i5 = 0;
                while (i5 < length) {
                    sj2 sj2Var = sj2VarArr[i5];
                    sj2Var.setShowSoftInputOnFocusCompat((l0() ? 1 : 0) ^ b11);
                    sj2Var.addTextChangedListener(new xh1(this));
                    sj2Var.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: e3c
                        public final /* synthetic */ p3c b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnFocusChangeListener
                        public final void onFocusChange(View view, boolean z) {
                            float f;
                            byte b92 = b11;
                            p3c p3cVar = this.b;
                            switch (b92) {
                                case 0:
                                    er7 er7Var2 = p3cVar.w;
                                    f = z ? 1.0f : 0.0f;
                                    er7Var2.b(f, f, true);
                                    break;
                                case 1:
                                    if (z) {
                                        p3cVar.f0.setEditText((EditText) view);
                                        p3cVar.f0.setDispatchBackWhenEmpty(true);
                                        break;
                                    }
                                    break;
                                default:
                                    er7 er7Var3 = p3cVar.s;
                                    f = z ? 1.0f : 0.0f;
                                    er7Var3.b(f, f, true);
                                    break;
                            }
                        }
                    });
                    i5++;
                    b11 = 1;
                }
                this.x.setVisibility(8);
                pkbVar.addView(this.x, nme.t(-2, -2, 1, 0, 32, 0, 0));
                FrameLayout frameLayout = new FrameLayout(context);
                pkbVar.addView(frameLayout, nme.t(-1, -2, 51, 0, 36, 0, 22));
                frameLayout.addView(this.e, nme.e(-2, -2, 49));
                if (b5 == 4) {
                    TextView textView5 = new TextView(context);
                    this.f = textView5;
                    zkb.X(textView5, bkb.I6, null);
                    this.f.setGravity(1);
                    this.f.setTextSize(1, 14.0f);
                    this.f.setLineSpacing(gl.L(2.0f), 1.0f);
                    this.f.setPadding(gl.L(32.0f), 0, gl.L(32.0f), 0);
                    this.f.setText(k96.M0(2131745883, null));
                    pkbVar.addView(this.f, nme.t(-2, -2, 49, 0, 0, 0, 25));
                    final byte b12 = 2;
                    this.f.setOnClickListener(new View.OnClickListener(this) { // from class: c3c
                        public final /* synthetic */ p3c b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            byte b62 = b12;
                            byte b72 = 1;
                            p3c p3cVar = this.b;
                            switch (b62) {
                                case 0:
                                    p3cVar.G0();
                                    break;
                                case 1:
                                    byte b82 = p3cVar.P;
                                    p3cVar.N = true;
                                    TransformationMethod transformationMethod = p3cVar.n.getTransformationMethod();
                                    EditTextBoldCursor editTextBoldCursor32 = p3cVar.n;
                                    if (transformationMethod == null) {
                                        editTextBoldCursor32.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                        zkb.s(p3cVar.F, bkb.Ne, null, PorterDuff.Mode.MULTIPLY);
                                        if (b82 == 0 && p3cVar.n.length() > 0 && p3cVar.n.hasFocus()) {
                                            p3cVar.g0[3].K(-1);
                                            oy8 animatedDrawable = p3cVar.a.getAnimatedDrawable();
                                            oy8 oy8Var = p3cVar.g0[3];
                                            if (animatedDrawable != oy8Var) {
                                                p3cVar.a.setAnimation(oy8Var);
                                                p3cVar.g0[3].I(18, false, false);
                                            }
                                            p3cVar.a.d();
                                        }
                                    } else {
                                        editTextBoldCursor32.setTransformationMethod(null);
                                        zkb.s(p3cVar.F, bkb.Oe, null, PorterDuff.Mode.MULTIPLY);
                                        if (b82 == 0 && p3cVar.n.length() > 0 && p3cVar.n.hasFocus()) {
                                            p3cVar.g0[3].K(18);
                                            oy8 animatedDrawable2 = p3cVar.a.getAnimatedDrawable();
                                            oy8 oy8Var2 = p3cVar.g0[3];
                                            if (animatedDrawable2 != oy8Var2) {
                                                p3cVar.a.setAnimation(oy8Var2);
                                            }
                                            p3cVar.g0[3].O(false, 0.0f);
                                            p3cVar.a.d();
                                        }
                                    }
                                    EditTextBoldCursor editTextBoldCursor22 = p3cVar.n;
                                    editTextBoldCursor22.setSelection(editTextBoldCursor22.length());
                                    p3cVar.N = false;
                                    break;
                                case 2:
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p3cVar.getParentActivity());
                                    alertDialog$Builder.g(k96.M0(2131752577, null), null);
                                    alertDialog$Builder.j(k96.M0(2131745925, null), new g3c(p3cVar, (byte) 1));
                                    String M0 = k96.M0(2131745900, null);
                                    hd hdVar = alertDialog$Builder.a;
                                    hdVar.S = M0;
                                    hdVar.U = k96.M0(2131745881, null);
                                    p3cVar.showDialog(hdVar);
                                    break;
                                case 3:
                                    p3cVar.m0();
                                    break;
                                case 4:
                                    if (p3cVar.h.getAlpha() >= 0.5f) {
                                        byte b92 = p3cVar.P;
                                        if (b92 != 0) {
                                            if (b92 != 3) {
                                                if (b92 == 2) {
                                                    p3cVar.E0();
                                                    break;
                                                }
                                            } else {
                                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(p3cVar.getParentActivity());
                                                String M02 = k96.M0(2131742552, null);
                                                hd hdVar2 = alertDialog$Builder2.a;
                                                hdVar2.U = M02;
                                                hdVar2.S = k96.M0(2131742553, null);
                                                alertDialog$Builder2.j(k96.M0(2131742554, null), new g3c(p3cVar, (byte) 2));
                                                alertDialog$Builder2.g(k96.M0(2131752577, null), null);
                                                p3cVar.showDialog(hdVar2);
                                                TextView textView22 = (TextView) hdVar2.c(-1);
                                                if (textView22 != null) {
                                                    zkb.X(textView22, bkb.p7, null);
                                                    break;
                                                }
                                            }
                                        } else {
                                            p3cVar.B0();
                                            TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                            tL_auth_recoverPassword.code = p3cVar.b0;
                                            p3cVar.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new h3c(p3cVar, b72));
                                            break;
                                        }
                                    }
                                    break;
                                case 5:
                                    if (p3cVar.P == 8) {
                                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                        twoStepVerificationActivity.X = true;
                                        twoStepVerificationActivity.J = p3cVar.V;
                                        twoStepVerificationActivity.K = false;
                                        twoStepVerificationActivity.Y = p3cVar.H;
                                        p3cVar.presentFragment(twoStepVerificationActivity, true);
                                        t36 t36Var = p3cVar.k0;
                                        if (t36Var != null) {
                                            gl.c3(t36Var);
                                            p3cVar.k0 = null;
                                            break;
                                        }
                                    }
                                    break;
                                default:
                                    p3cVar.G0();
                                    break;
                            }
                        }
                    });
                }
                this.fragmentView = aa1Var;
                s71 s71Var = new s71(this, context);
                this.E = s71Var;
                s71Var.setAlpha(0.0f);
                aa1Var.addView(this.E);
                aa1Var.addView(this.actionBar);
                RadialProgressView radialProgressView = new RadialProgressView(context, null);
                this.M = radialProgressView;
                radialProgressView.setSize(gl.L(20.0f));
                this.M.setAlpha(0.0f);
                this.M.setScaleX(0.1f);
                this.M.setScaleY(0.1f);
                this.M.setProgressColor(bkb.w0(null, bkb.k6, false));
                zabVar.addView(this.M, nme.d(32, 32.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
                break;
            case 6:
            case 7:
            case 9:
                s8 s8Var = new s8((byte) 2, context, this);
                s8Var.setOnTouchListener(new wmb((byte) 3));
                s8Var.addView(this.actionBar);
                s8Var.addView(this.a);
                s8Var.addView(this.c);
                s8Var.addView(this.d);
                s8Var.addView(this.b);
                this.fragmentView = s8Var;
            default:
                c = 5;
                break;
        }
        zkb.h(bkb.c6, null, this.fragmentView);
        switch (b5) {
            case 0:
            case 1:
                if (this.V.has_password) {
                    this.actionBar.setTitle(k96.M0(2131747018, null));
                    this.c.setText(k96.M0(2131747018, null));
                } else {
                    String M0 = k96.M0(b5 == 0 ? 2131751693 : 2131746220, null);
                    this.actionBar.setTitle(M0);
                    this.c.setText(M0);
                }
                if (!TextUtils.isEmpty(this.b0)) {
                    this.h.setVisibility(0);
                    this.h.setText(k96.M0(2131742554, null));
                }
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.s.setText(k96.M0(b5 == 0 ? 2131751104 : 2131746220, null));
                this.n.setContentDescription(k96.M0(b5 == 0 ? 2131751104 : 2131746220, null));
                this.n.setImeOptions(268435461);
                this.n.setInputType(kk7.M1);
                this.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.n.setTypeface(Typeface.DEFAULT);
                this.G = b5 == 0;
                gl.T3(this.F, false, 0.1f, true, false);
                oy8[] oy8VarArr = new oy8[7];
                this.g0 = oy8VarArr;
                oy8VarArr[0] = new oy8(R.raw.tsv_setup_monkey_idle1, gl.L(120.0f), gl.L(120.0f), true, null);
                this.g0[1] = new oy8(R.raw.tsv_setup_monkey_idle2, gl.L(120.0f), gl.L(120.0f), true, null);
                this.g0[2] = new oy8(R.raw.tsv_monkey_close, gl.L(120.0f), gl.L(120.0f), true, null);
                this.g0[3] = new oy8(R.raw.tsv_setup_monkey_peek, gl.L(120.0f), gl.L(120.0f), true, null);
                this.g0[4] = new oy8(R.raw.tsv_setup_monkey_close_and_peek_to_idle, gl.L(120.0f), gl.L(120.0f), true, null);
                this.g0[c] = new oy8(R.raw.tsv_setup_monkey_close_and_peek, gl.L(120.0f), gl.L(120.0f), true, null);
                this.g0[6] = new oy8(R.raw.tsv_setup_monkey_tracking, gl.L(120.0f), gl.L(120.0f), true, null);
                oy8 oy8Var = this.g0[6];
                oy8Var.h = true;
                oy8Var.K(19);
                this.g0[2].N(97, this.j0);
                J0(true);
                if (!(b5 == 1)) {
                    EditTextBoldCursor editTextBoldCursor4 = this.n;
                    ArrayList arrayList = editTextBoldCursor4.g1;
                    int size = arrayList.size();
                    int i6 = 0;
                    while (i6 < size) {
                        Object obj = arrayList.get(i6);
                        i6++;
                        TextWatcher textWatcher = (TextWatcher) obj;
                        textWatcher.beforeTextChanged("", 0, editTextBoldCursor4.length(), editTextBoldCursor4.length());
                        textWatcher.onTextChanged(editTextBoldCursor4.getText(), 0, editTextBoldCursor4.length(), editTextBoldCursor4.length());
                        textWatcher.afterTextChanged(editTextBoldCursor4.getText());
                    }
                    b = 0;
                    J0(true);
                    break;
                } else {
                    f3c f3cVar = this.h0;
                    if (f3cVar != null) {
                        gl.r(f3cVar);
                    }
                    this.a.setAnimation(this.g0[6]);
                    this.a.d();
                    b = 0;
                    break;
                }
            case 2:
                this.actionBar.setTitle(k96.M0(2131747251, null));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.h.setVisibility(0);
                this.h.setText(k96.M0(2131742554, null));
                this.c.setText(k96.M0(2131747251, null));
                this.d.setText(k96.M0(2131747250, null));
                this.d.setVisibility(0);
                this.s.setText(k96.M0(2131747249, null));
                this.n.setContentDescription(k96.M0(2131747249, null));
                this.n.setImeOptions(268435461);
                this.w.setVisibility(8);
                this.a.f(R.raw.tsv_setup_hint, 120, 120, null);
                this.a.d();
                b = 0;
                break;
            case 3:
                this.actionBar.setTitle(k96.M0(2131746151, null));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                if (this.a0) {
                    r12 = 0;
                } else {
                    this.h.setVisibility(0);
                    this.h.setAlpha(0.0f);
                    r12 = 0;
                    this.h.setText(k96.M0(2131742554, null));
                }
                this.c.setText(k96.M0(2131746151, r12));
                this.d.setText(k96.M0(2131746152, r12));
                this.d.setVisibility(0);
                this.s.setText(k96.M0(2131747183, r12));
                this.n.setContentDescription(k96.M0(2131747183, r12));
                this.n.setImeOptions(268435461);
                this.n.setInputType(33);
                this.w.setVisibility(8);
                this.a.f(R.raw.tsv_setup_email_sent, 120, 120, r12);
                this.a.d();
                b = 0;
                break;
            case 4:
                this.actionBar.setTitle(k96.M0(2131747244, null));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.c.setText(k96.M0(2131747244, null));
                this.f0.setVisibility(0);
                this.s.setVisibility(8);
                String str = this.V.email_unconfirmed_pattern;
                String str2 = str != null ? str : "";
                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str2);
                int indexOf = str2.indexOf(42);
                int lastIndexOf = str2.lastIndexOf(42);
                if (indexOf == lastIndexOf || indexOf == -1 || lastIndexOf == -1) {
                    r10 = 0;
                } else {
                    vib vibVar = new vib();
                    vibVar.a |= 256;
                    vibVar.b = indexOf;
                    int i7 = lastIndexOf + 1;
                    vibVar.c = i7;
                    r10 = 0;
                    valueOf.setSpan(new wib(vibVar, 0), indexOf, i7, 0);
                }
                wla wlaVar2 = this.d;
                String M02 = k96.M0(2131745887, null);
                CharSequence[] charSequenceArr = new CharSequence[1];
                charSequenceArr[r10] = valueOf;
                wlaVar2.setText(gl.m0(M02, charSequenceArr));
                this.d.setVisibility(r10);
                this.d0.e(r10, r10);
                this.x.setVisibility(r10);
                this.a.f(R.raw.tsv_setup_mail, 120, 120, null);
                this.a.d();
                b = 0;
                break;
            case 5:
                this.actionBar.setTitle(k96.M0(2131743380, null));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.c.setText(k96.M0(2131743380, null));
                this.s.setVisibility(8);
                this.f0.setVisibility(0);
                wla wlaVar3 = this.d;
                String str3 = this.V.email_unconfirmed_pattern;
                wlaVar3.setText(k96.a0("EmailPasswordConfirmText2", null, 2131751187, str3 != null ? str3 : ""));
                this.d.setVisibility(0);
                this.d0.e(false, false);
                this.h.setVisibility(0);
                this.h.setGravity(17);
                ((ViewGroup.MarginLayoutParams) this.h.getLayoutParams()).bottomMargin = 0;
                this.h.setText(k96.M0(2131745928, null));
                final byte b13 = 3;
                this.h.setOnClickListener(new View.OnClickListener(this) { // from class: c3c
                    public final /* synthetic */ p3c b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b62 = b13;
                        byte b72 = 1;
                        p3c p3cVar = this.b;
                        switch (b62) {
                            case 0:
                                p3cVar.G0();
                                break;
                            case 1:
                                byte b82 = p3cVar.P;
                                p3cVar.N = true;
                                TransformationMethod transformationMethod = p3cVar.n.getTransformationMethod();
                                EditTextBoldCursor editTextBoldCursor32 = p3cVar.n;
                                if (transformationMethod == null) {
                                    editTextBoldCursor32.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                    zkb.s(p3cVar.F, bkb.Ne, null, PorterDuff.Mode.MULTIPLY);
                                    if (b82 == 0 && p3cVar.n.length() > 0 && p3cVar.n.hasFocus()) {
                                        p3cVar.g0[3].K(-1);
                                        oy8 animatedDrawable = p3cVar.a.getAnimatedDrawable();
                                        oy8 oy8Var2 = p3cVar.g0[3];
                                        if (animatedDrawable != oy8Var2) {
                                            p3cVar.a.setAnimation(oy8Var2);
                                            p3cVar.g0[3].I(18, false, false);
                                        }
                                        p3cVar.a.d();
                                    }
                                } else {
                                    editTextBoldCursor32.setTransformationMethod(null);
                                    zkb.s(p3cVar.F, bkb.Oe, null, PorterDuff.Mode.MULTIPLY);
                                    if (b82 == 0 && p3cVar.n.length() > 0 && p3cVar.n.hasFocus()) {
                                        p3cVar.g0[3].K(18);
                                        oy8 animatedDrawable2 = p3cVar.a.getAnimatedDrawable();
                                        oy8 oy8Var22 = p3cVar.g0[3];
                                        if (animatedDrawable2 != oy8Var22) {
                                            p3cVar.a.setAnimation(oy8Var22);
                                        }
                                        p3cVar.g0[3].O(false, 0.0f);
                                        p3cVar.a.d();
                                    }
                                }
                                EditTextBoldCursor editTextBoldCursor22 = p3cVar.n;
                                editTextBoldCursor22.setSelection(editTextBoldCursor22.length());
                                p3cVar.N = false;
                                break;
                            case 2:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p3cVar.getParentActivity());
                                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                                alertDialog$Builder.j(k96.M0(2131745925, null), new g3c(p3cVar, (byte) 1));
                                String M03 = k96.M0(2131745900, null);
                                hd hdVar = alertDialog$Builder.a;
                                hdVar.S = M03;
                                hdVar.U = k96.M0(2131745881, null);
                                p3cVar.showDialog(hdVar);
                                break;
                            case 3:
                                p3cVar.m0();
                                break;
                            case 4:
                                if (p3cVar.h.getAlpha() >= 0.5f) {
                                    byte b92 = p3cVar.P;
                                    if (b92 != 0) {
                                        if (b92 != 3) {
                                            if (b92 == 2) {
                                                p3cVar.E0();
                                                break;
                                            }
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(p3cVar.getParentActivity());
                                            String M022 = k96.M0(2131742552, null);
                                            hd hdVar2 = alertDialog$Builder2.a;
                                            hdVar2.U = M022;
                                            hdVar2.S = k96.M0(2131742553, null);
                                            alertDialog$Builder2.j(k96.M0(2131742554, null), new g3c(p3cVar, (byte) 2));
                                            alertDialog$Builder2.g(k96.M0(2131752577, null), null);
                                            p3cVar.showDialog(hdVar2);
                                            TextView textView22 = (TextView) hdVar2.c(-1);
                                            if (textView22 != null) {
                                                zkb.X(textView22, bkb.p7, null);
                                                break;
                                            }
                                        }
                                    } else {
                                        p3cVar.B0();
                                        TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                        tL_auth_recoverPassword.code = p3cVar.b0;
                                        p3cVar.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new h3c(p3cVar, b72));
                                        break;
                                    }
                                }
                                break;
                            case 5:
                                if (p3cVar.P == 8) {
                                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                    twoStepVerificationActivity.X = true;
                                    twoStepVerificationActivity.J = p3cVar.V;
                                    twoStepVerificationActivity.K = false;
                                    twoStepVerificationActivity.Y = p3cVar.H;
                                    p3cVar.presentFragment(twoStepVerificationActivity, true);
                                    t36 t36Var = p3cVar.k0;
                                    if (t36Var != null) {
                                        gl.c3(t36Var);
                                        p3cVar.k0 = null;
                                        break;
                                    }
                                }
                                break;
                            default:
                                p3cVar.G0();
                                break;
                        }
                    }
                });
                this.x.setVisibility(0);
                this.a.f(R.raw.tsv_setup_mail, 120, 120, null);
                this.a.d();
                b = 0;
                break;
            case 6:
                this.c.setText(k96.M0(2131743692, null));
                this.d.setText(k96.M0(2131745356, null));
                this.b.setText(k96.M0(2131743694, null));
                this.d.setVisibility(0);
                this.a.f(R.raw.tsv_setup_intro, kk7.V1, kk7.V1, null);
                this.a.d();
                b = 0;
                break;
            case 7:
                this.c.setText(k96.M0(2131743696, null));
                this.d.setText(k96.M0(2131743695, null));
                if (this.Z) {
                    this.b.setText(k96.M0(2131743698, null));
                } else {
                    boolean z = this.I;
                    TextView textView6 = this.b;
                    if (z) {
                        textView6.setText(k96.M0(2131751759, null));
                    } else {
                        textView6.setText(k96.M0(2131743697, null));
                    }
                }
                this.d.setVisibility(0);
                this.a.f(R.raw.wallet_allset, kk7.p2, kk7.p2, null);
                this.a.d();
                b = 0;
                break;
            case 8:
                this.actionBar.setTitle(k96.M0(2131747024, null));
                this.c.setText(k96.M0(2131747024, null));
                this.d.setText(k96.M0(2131752148, null));
                this.d.setVisibility(0);
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.e.setText(k96.M0(2131750574, null));
                zkb.X(this.e, bkb.n6, null);
                this.s.setText(k96.M0(2131748534, null));
                this.n.setContentDescription(k96.M0(2131748534, null));
                this.n.setImeOptions(268435462);
                this.n.setInputType(kk7.M1);
                this.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.n.setTypeface(Typeface.DEFAULT);
                this.a.f(R.raw.wallet_science, 120, 120, null);
                this.a.d();
                b = 0;
                break;
            case 9:
                this.c.setText(k96.M0(2131752147, null));
                this.d.setText(k96.M0(2131752146, null));
                this.b.setText(k96.M0(2131752149, null));
                this.d.setVisibility(0);
                this.a.f(R.raw.wallet_perfect, kk7.V1, kk7.V1, null);
                this.a.d();
                b = 0;
                break;
            default:
                b = 0;
                break;
        }
        EditTextBoldCursor editTextBoldCursor5 = this.n;
        if (editTextBoldCursor5 != null) {
            editTextBoldCursor5.addTextChangedListener(new m3c(this, b));
        }
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean finishFragment(boolean z) {
        for (d dVar : getParentLayout().getFragmentStack()) {
            if (dVar != this && (dVar instanceof p3c)) {
                ((bac) ((p3c) dVar).c0.b).b = true;
            }
        }
        return super.finishFragment(z);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new blb(this.fragmentView, 262145, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Z6));
        arrayList.add(new blb(this.c, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.C6));
        arrayList.add(new blb(this.n, TLObject.FLAG_23, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.G6));
        arrayList.add(new blb(this.n, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.j6));
        arrayList.add(new blb(this.n, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.k6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean hasForceLightStatusBar() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean hideKeyboardOnShow() {
        byte b = this.P;
        return b == 7 || b == 9;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isLightStatusBar() {
        return bm2.h(bkb.w0(null, bkb.c6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.H < 0 || this.parentLayout.getFragmentStack().size() != 1) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    public final void k0(Runnable runnable) {
        int i = 0;
        while (true) {
            yc6 yc6Var = this.x;
            sj2[] sj2VarArr = yc6Var.f;
            byte b = 1;
            if (i >= sj2VarArr.length) {
                yc6Var.postDelayed(new l3c(this, runnable, b), (sj2VarArr.length * 75) + 350);
                return;
            } else {
                sj2 sj2Var = sj2VarArr[i];
                sj2Var.postDelayed(new gv7(sj2Var, b), i * 75);
                i++;
            }
        }
    }

    public final boolean l0() {
        byte b = this.P;
        if ((b != 5 && b != 4) || gl.O1()) {
            return false;
        }
        Point point = gl.q;
        return point.x < point.y && !gl.A1();
    }

    public final void m0() {
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.resendPasswordEmail(), new ce2((byte) 0));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = k96.M0(2131745927, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.U = M0;
        hdVar.S = k96.M0(2131743692, null);
        alertDialog$Builder.j(k96.M0(2131747638, null), null);
        showDialog(hdVar);
    }

    public final /* synthetic */ void n0() {
        ArrayList arrayList = this.K;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((d) arrayList.get(i)).removeSelfFromStack();
        }
        kk7.f(this.currentAccount).k(kk7.o0, new Object[0]);
        finishFragment();
    }

    public final void o0(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            this.V = password;
            if (!TwoStepVerificationActivity.a0(password, false)) {
                ij.u0(getParentActivity(), k96.M0(2131743581, null), true);
                return;
            }
            this.U = !TextUtils.isEmpty(this.V.email_unconfirmed_pattern);
            TwoStepVerificationActivity.e0(this.V);
            if (!this.T && this.Z) {
                TL_account.Password password2 = this.V;
                if (password2.has_password) {
                    TLRPC.PasswordKdfAlgo passwordKdfAlgo = password2.current_algo;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = password2.new_secure_algo;
                    byte[] bArr = password2.secure_random;
                    String str = password2.has_recovery ? "1" : null;
                    String str2 = password2.hint;
                    if (str2 == null) {
                        str2 = "";
                    }
                    if (!this.U && passwordKdfAlgo != null) {
                        kk7.f(this.currentAccount).k(kk7.o0, null, passwordKdfAlgo, securePasswordKdfAlgo, bArr, str, str2, null, null);
                        finishFragment();
                    }
                }
            }
            if (this.O) {
                A0();
                G0();
            }
            kk7.f(this.currentAccount).k(kk7.p0, this.V);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onBackPressed(boolean z) {
        if (this.H < 0 || this.parentLayout.getFragmentStack().size() != 1) {
            if (z) {
                finishFragment();
            }
            return true;
        }
        if (!z) {
            return false;
        }
        M0();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.a != null) {
            byte b = this.P;
            if (b == 2 && gl.M1()) {
                this.a.setVisibility(8);
            } else if (b != 6 && b != 9 && b != 7) {
                ry8 ry8Var = this.a;
                Point point = gl.q;
                ry8Var.setVisibility(point.x > point.y ? 8 : 0);
            }
        }
        s43 s43Var = this.f0;
        if (s43Var != null) {
            s43Var.setVisibility(l0() ? 0 : 8);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.O = false;
        f3c f3cVar = this.h0;
        if (f3cVar != null) {
            gl.r(f3cVar);
            this.h0 = null;
        }
        if (this.g0 != null) {
            int i = 0;
            while (true) {
                oy8[] oy8VarArr = this.g0;
                if (i >= oy8VarArr.length) {
                    break;
                }
                oy8VarArr[i].x(false);
                i++;
            }
            this.g0 = null;
        }
        gl.y2(getParentActivity(), this.classGuid);
        if (l0()) {
            gl.z2(getParentActivity(), this.classGuid);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onPause() {
        super.onPause();
        this.T = true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        this.T = false;
        gl.V2(getParentActivity(), this.classGuid);
        if (l0()) {
            gl.W2(getParentActivity(), this.classGuid);
            gl.t1(this.fragmentView);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            wyb wybVar = this.e0;
            if (wybVar != null) {
                wybVar.setColor(bkb.w0(null, bkb.N9, false));
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
        try {
            int w0 = bkb.w0(null, bkb.k6, false);
            RadialProgressView radialProgressView = this.M;
            if (radialProgressView != null) {
                radialProgressView.setProgressColor(w0);
            }
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z) {
            if (this.n != null && !l0()) {
                gl.d3(new f3c(this, (byte) 2), 200L);
            }
            yc6 yc6Var = this.x;
            if (yc6Var == null || yc6Var.getVisibility() != 0) {
                return;
            }
            gl.d3(new f3c(this, (byte) 3), 200L);
        }
    }

    public final /* synthetic */ void p0(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            this.V = password;
            TwoStepVerificationActivity.e0(password);
            kk7.f(this.currentAccount).k(kk7.p0, this.V);
            G0();
        }
    }

    public final void q0(TLRPC.TL_error tL_error) {
        if ("SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new h3c(this, (byte) 4), 8);
            return;
        }
        A0();
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            this.d.setText(k96.M0(2131752145, null));
            zkb.X(this.d, bkb.o7, null);
            D0(this.s, this.n, true);
            L0(false);
            return;
        }
        if (!tL_error.text.startsWith("FLOOD_WAIT")) {
            K0(k96.M0(R.string.AppName, null), tL_error.text);
        } else {
            int intValue = Utilities.z(tL_error.text).intValue();
            K0(k96.M0(R.string.AppName, null), k96.a0("FloodWaitTime", null, 2131750669, intValue < 60 ? k96.G(intValue, "Seconds", new Object[0]) : k96.G(intValue / 60, "Minutes", new Object[0])));
        }
    }

    public final /* synthetic */ void r0(byte[] bArr) {
        TL_account.getPasswordSettings getpasswordsettings = new TL_account.getPasswordSettings();
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = this.V.current_algo;
        byte[] c = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow ? mo9.c(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
        apa apaVar = new apa(this, c, (byte) 19);
        TL_account.Password password = this.V;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (!(passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            apaVar.run(null, tL_error);
            return;
        }
        TLRPC.TL_inputCheckPasswordSRP d = mo9.d(c, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
        getpasswordsettings.password = d;
        if (d != null) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(getpasswordsettings, apaVar, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "ALGO_INVALID";
        apaVar.run(null, tL_error2);
    }

    public final void s0(String str) {
        p3c p3cVar = new p3c(this.currentAccount, 0, this.V);
        p3cVar.I = this.I;
        p3cVar.K.addAll(this.K);
        p3cVar.K.add(this);
        p3cVar.b0 = str;
        p3cVar.H = this.H;
        presentFragment(p3cVar, true);
    }

    public final void t0() {
        ArrayList arrayList = this.K;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((d) arrayList.get(i)).removeSelfFromStack();
        }
        kk7 f = kk7.f(this.currentAccount);
        byte[] bArr = this.W;
        TL_account.Password password = this.V;
        f.k(kk7.o0, bArr, password.new_algo, password.new_secure_algo, password.secure_random, this.S, this.R, null, this.Q);
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        TL_account.Password password2 = this.V;
        password2.has_password = true;
        password2.has_recovery = true;
        password2.email_unconfirmed_pattern = "";
        twoStepVerificationActivity.z0(password2, this.W, this.X, this.Y);
        twoStepVerificationActivity.Y = this.H;
        presentFragment(twoStepVerificationActivity, true);
        kk7.f(this.currentAccount).k(kk7.p0, this.V);
        t36 t36Var = this.k0;
        if (t36Var != null) {
            gl.c3(t36Var);
            this.k0 = null;
        }
    }

    public final void u0() {
        byte b = 4;
        if (this.V.has_password) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.j(k96.M0(2131747638, null), new g3c(this, b));
            boolean z = this.V.has_recovery;
            hd hdVar = alertDialog$Builder.a;
            if (z) {
                hdVar.U = k96.M0(2131742551, null);
            } else {
                hdVar.U = k96.M0(2131742550, null);
            }
            hdVar.S = k96.M0(2131742535, null);
            Dialog showDialog = showDialog(hdVar);
            if (showDialog != null) {
                showDialog.setCanceledOnTouchOutside(false);
                showDialog.setCancelable(false);
                return;
            }
            return;
        }
        ArrayList arrayList = this.K;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((d) arrayList.get(i)).removeSelfFromStack();
        }
        TL_account.Password password = this.V;
        password.has_password = true;
        password.has_recovery = true;
        password.email_unconfirmed_pattern = "";
        p3c p3cVar = new p3c(7, password);
        p3cVar.I = this.I;
        p3cVar.H0(this.W, this.X, this.Y, this.a0);
        p3cVar.K.addAll(arrayList);
        p3cVar.Z = this.Z;
        p3cVar.H = this.H;
        presentFragment(p3cVar, true);
        kk7 f = kk7.f(this.currentAccount);
        byte[] bArr = this.W;
        TL_account.Password password2 = this.V;
        f.k(kk7.o0, bArr, password2.new_algo, password2.new_secure_algo, password2.secure_random, this.S, this.R, null, this.Q);
        kk7.f(this.currentAccount).k(kk7.p0, this.V);
    }

    public final void v0(TLRPC.TL_error tL_error) {
        A0();
        if (tL_error == null) {
            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
            TL_account.Password password = this.V;
            password.has_recovery = false;
            password.email_unconfirmed_pattern = "";
            twoStepVerificationActivity.z0(password, this.W, this.X, this.Y);
            twoStepVerificationActivity.Y = this.H;
            presentFragment(twoStepVerificationActivity, true);
            kk7.f(this.currentAccount).k(kk7.q0, new Object[0]);
            t36 t36Var = this.k0;
            if (t36Var != null) {
                gl.c3(t36Var);
                this.k0 = null;
            }
        }
    }

    public final /* synthetic */ void w0(TLObject tLObject, TLRPC.TL_error tL_error, boolean z) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            this.V = password;
            TwoStepVerificationActivity.e0(password);
            I0(z);
            kk7.f(this.currentAccount).k(kk7.p0, this.V);
        }
    }

    public final void x0(byte[] bArr) {
        ArrayList arrayList = this.K;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((d) arrayList.get(i)).removeSelfFromStack();
        }
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        TL_account.Password password = this.V;
        password.has_password = true;
        if (!password.has_recovery) {
            password.has_recovery = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        }
        TL_account.Password password2 = this.V;
        if (bArr == null) {
            bArr = this.W;
        }
        twoStepVerificationActivity.z0(password2, bArr, this.X, this.Y);
        twoStepVerificationActivity.Y = this.H;
        presentFragment(twoStepVerificationActivity, true);
        kk7.f(this.currentAccount).k(kk7.p0, this.V);
        t36 t36Var = this.k0;
        if (t36Var != null) {
            gl.c3(t36Var);
            this.k0 = null;
        }
    }

    public final void y0(TLRPC.TL_error tL_error, boolean z, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        TL_account.Password password;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new i81((byte) 11, this, z), 8);
            return;
        }
        A0();
        int i = kk7.o0;
        ArrayList arrayList = this.K;
        byte b = 1;
        if (tL_error != null) {
            if (!"EMAIL_UNCONFIRMED".equals(tL_error.text) && !tL_error.text.startsWith("EMAIL_UNCONFIRMED_")) {
                if ("EMAIL_INVALID".equals(tL_error.text)) {
                    K0(k96.M0(R.string.AppName, null), k96.M0(2131747252, null));
                    return;
                }
                if ("EMAIL_NOT_ALLOWED".equals(tL_error.text)) {
                    K0(k96.M0(R.string.AppName, null), k96.M0(2131751188, null));
                    return;
                } else if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                    K0(k96.M0(R.string.AppName, null), tL_error.text);
                    return;
                } else {
                    int intValue = Utilities.z(tL_error.text).intValue();
                    K0(k96.M0(R.string.AppName, null), k96.a0("FloodWaitTime", null, 2131750669, intValue < 60 ? k96.G(intValue, "Seconds", new Object[0]) : k96.G(intValue / 60, "Minutes", new Object[0])));
                    return;
                }
            }
            kk7.f(this.currentAccount).k(i, new Object[0]);
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((d) arrayList.get(i2)).removeSelfFromStack();
            }
            kk7 f = kk7.f(this.currentAccount);
            TLRPC.PasswordKdfAlgo passwordKdfAlgo = passwordinputsettings.new_algo;
            TL_account.Password password2 = this.V;
            TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = password2.new_secure_algo;
            byte[] bArr2 = password2.secure_random;
            String str2 = this.S;
            f.k(i, bArr, passwordKdfAlgo, securePasswordKdfAlgo, bArr2, str2, this.R, str2, this.Q);
            TL_account.Password password3 = this.V;
            password3.email_unconfirmed_pattern = this.S;
            p3c p3cVar = new p3c(5, password3);
            p3cVar.I = this.I;
            p3cVar.H0(bArr != null ? bArr : this.W, this.X, this.Y, this.a0);
            p3cVar.Z = this.Z;
            p3cVar.H = this.H;
            presentFragment(p3cVar, true);
            return;
        }
        if ((tLObject instanceof TLRPC.TL_boolTrue) || (tLObject instanceof TLRPC.auth_Authorization)) {
            getMessagesController().n4(0L, "VALIDATE_PASSWORD");
            int i3 = kk7.p0;
            if (z) {
                int size2 = arrayList.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    ((d) arrayList.get(i4)).removeSelfFromStack();
                }
                kk7.f(this.currentAccount).k(kk7.q0, new Object[0]);
                kk7.f(this.currentAccount).k(i3, new Object[0]);
                finishFragment();
                return;
            }
            if (getParentActivity() != null) {
                if (this.V.has_password) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder.j(k96.M0(2131747638, null), new cwb(this, bArr, b));
                    hd hdVar = alertDialog$Builder.a;
                    if (str == null && (password = this.V) != null && password.has_password) {
                        hdVar.U = k96.M0(2131742550, null);
                    } else {
                        hdVar.U = k96.M0(2131742541, null);
                    }
                    hdVar.S = k96.M0(2131742535, null);
                    Dialog showDialog = showDialog(hdVar);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        return;
                    }
                    return;
                }
                int size3 = arrayList.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    ((d) arrayList.get(i5)).removeSelfFromStack();
                }
                TL_account.Password password4 = this.V;
                password4.has_password = true;
                if (!password4.has_recovery) {
                    password4.has_recovery = !TextUtils.isEmpty(password4.email_unconfirmed_pattern);
                }
                if (this.Z) {
                    kk7.f(this.currentAccount).k(i, new Object[0]);
                }
                p3c p3cVar2 = new p3c(7, this.V);
                p3cVar2.I = this.I;
                p3cVar2.H0(bArr != null ? bArr : this.W, this.X, this.Y, this.a0);
                p3cVar2.Z = this.Z;
                p3cVar2.H = this.H;
                presentFragment(p3cVar2, true);
                kk7.f(this.currentAccount).k(i3, this.V);
            }
        }
    }

    public final void z0(TLObject tLObject, boolean z, String str, TL_account.passwordInputSettings passwordinputsettings) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        if (tLObject instanceof TL_account.updatePasswordSettings) {
            TL_account.updatePasswordSettings updatepasswordsettings = (TL_account.updatePasswordSettings) tLObject;
            if (updatepasswordsettings.password == null) {
                TL_account.Password password = this.V;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
                updatepasswordsettings.password = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow ? mo9.d(this.W, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
            }
        }
        if (z || str == null) {
            bArr = null;
            bArr2 = null;
        } else {
            byte[] g1 = gl.g1(str);
            TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = this.V.new_algo;
            if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                bArr2 = g1;
                bArr = mo9.c(g1, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
            } else {
                bArr2 = g1;
                bArr = null;
            }
        }
        pf2 pf2Var = new pf2(this, z, bArr, str, passwordinputsettings, (byte) 5);
        if (z) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLObject, pf2Var, 10);
            return;
        }
        if (str != null && (bArr3 = this.Y) != null && bArr3.length == 32) {
            TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = this.V.new_secure_algo;
            if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                byte[] m = Utilities.m(bArr2, tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                byte[] bArr4 = new byte[32];
                System.arraycopy(m, 0, bArr4, 0, 32);
                byte[] bArr5 = new byte[16];
                System.arraycopy(m, 32, bArr5, 0, 16);
                byte[] bArr6 = new byte[32];
                System.arraycopy(this.Y, 0, bArr6, 0, 32);
                Utilities.b(bArr6, bArr4, bArr5, 0, 32, 0, 1);
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings = new TLRPC.TL_secureSecretSettings();
                passwordinputsettings.new_secure_settings = tL_secureSecretSettings;
                tL_secureSecretSettings.secure_algo = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000;
                tL_secureSecretSettings.secure_secret = bArr6;
                tL_secureSecretSettings.secure_secret_id = this.X;
                passwordinputsettings.flags |= 4;
            }
        }
        TLRPC.PasswordKdfAlgo passwordKdfAlgo3 = this.V.new_algo;
        if (!(passwordKdfAlgo3 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            pf2Var.run(null, tL_error);
            return;
        }
        if (str != null) {
            byte[] b = mo9.b(bArr2, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo3);
            passwordinputsettings.new_password_hash = b;
            if (b == null) {
                TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
                tL_error2.text = "ALGO_INVALID";
                pf2Var.run(null, tL_error2);
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLObject, pf2Var, 10);
    }

    public void F0() {
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void finishFragment() {
        if (this.H >= 0 && this.parentLayout.getFragmentStack().size() == 1) {
            Bundle l = ir2.l("afterSignup", true);
            ah6 ah6Var = new ah6();
            ah6Var.q0(l);
            presentFragment(ah6Var, true);
            return;
        }
        super.finishFragment();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p3c(int i, TL_account.Password password) {
        super(null);
        this.G = false;
        this.H = -1;
        this.K = new ArrayList();
        this.W = new byte[0];
        this.i0 = new f3c(this, (byte) 0);
        this.j0 = new f3c(this, (byte) 1);
        this.P = i;
        this.V = password;
        if (password == null && (i == 6 || i == 8)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new h3c(this, (byte) 0), 10);
        } else {
            this.U = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        }
    }
}

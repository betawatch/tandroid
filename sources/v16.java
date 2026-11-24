// default package

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.p;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class v16 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v16(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    private final void a(View view) {
        boolean z;
        st8 st8Var = (st8) this.c;
        h45 h45Var = (h45) this.b;
        if (st8Var.K.getTag() == null) {
            int max = (int) Math.max(1.0f, st8Var.getValue());
            qa6 qa6Var = (qa6) h45Var.b;
            TLRPC.User user = (TLRPC.User) h45Var.c;
            if (qa6Var.getLocationController().h(qa6Var.m0) == null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qa6Var.getParentActivity());
                String M0 = k96.M0(2131745261, null);
                hd hdVar = alertDialog$Builder.a;
                hdVar.S = M0;
                hdVar.U = k96.M0(2131745262, null);
                alertDialog$Builder.j(k96.M0(2131745263, null), new yf((Object) qa6Var, (Object) user, max, (byte) 7));
                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                qa6Var.showDialog(hdVar);
                z = false;
            } else {
                qa6Var.O.M = true;
                qa6Var.c.setImageResource(R.drawable.msg_location_alert2);
                qa6Var.q0().k(0L, 24, Integer.valueOf(max), user, null, null);
                qa6Var.getLocationController().o(max, qa6Var.m0, true);
                z = true;
            }
            if (z) {
                st8Var.a();
            }
        }
    }

    private final void b(View view) {
        String str;
        fu8 fu8Var = (fu8) this.c;
        Context context = (Context) this.b;
        StringBuilder sb = new StringBuilder();
        String obj = fu8Var.a[0].getText().toString();
        String obj2 = fu8Var.a[3].getText().toString();
        String obj3 = fu8Var.a[2].getText().toString();
        String obj4 = fu8Var.a[1].getText().toString();
        String obj5 = fu8Var.a[4].getText().toString();
        try {
            if (fu8Var.w == 3) {
                i46 a = au8.a();
                a.o(fu8Var.w);
                if (obj == null) {
                    obj = "";
                }
                a.c = obj;
                if (obj5 == null) {
                    obj5 = "";
                }
                a.f = obj5;
                fu8Var.a0(context, a.c().e());
                return;
            }
            if (!TextUtils.isEmpty(obj)) {
                sb.append("server=");
                sb.append(URLEncoder.encode(obj, "UTF-8"));
            }
            if (!TextUtils.isEmpty(obj4)) {
                if (sb.length() != 0) {
                    sb.append("&");
                }
                sb.append("port=");
                sb.append(URLEncoder.encode(obj4, "UTF-8"));
            }
            if (fu8Var.w == 2) {
                str = "https://t.me/proxy?";
                if (sb.length() != 0) {
                    sb.append("&");
                }
                sb.append("secret=");
                sb.append(URLEncoder.encode(obj5, "UTF-8"));
            } else {
                str = "https://t.me/socks?";
                if (!TextUtils.isEmpty(obj3)) {
                    if (sb.length() != 0) {
                        sb.append("&");
                    }
                    sb.append("user=");
                    sb.append(URLEncoder.encode(obj3, "UTF-8"));
                }
                if (!TextUtils.isEmpty(obj2)) {
                    if (sb.length() != 0) {
                        sb.append("&");
                    }
                    sb.append("pass=");
                    sb.append(URLEncoder.encode(obj2, "UTF-8"));
                }
            }
            if (sb.length() != 0) {
                fu8Var.a0(context, str.concat(sb.toString()));
            }
        } catch (Exception unused) {
        }
    }

    private final void c(View view) {
        zu8 zu8Var = (zu8) this.c;
        Context context = (Context) this.b;
        Uri B0 = gl.B0(zu8Var.l1, "qr_tmp.png", Bitmap.CompressFormat.PNG);
        if (B0 != null) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("image/*");
            intent.putExtra("android.intent.extra.STREAM", B0);
            try {
                gl.W(context).startActivityForResult(Intent.createChooser(intent, zu8Var.m0.getText()), 500);
            } catch (ActivityNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13, types: [int] */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r5v9, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
    /* JADX WARN: Type inference failed for: r6v8, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        char c;
        String a0;
        int i;
        TLRPC.TL_auth_sentCode tL_auth_sentCode;
        int i2;
        int i3;
        Integer num;
        t28 t28Var;
        byte b = 10;
        byte b2 = 14;
        byte b3 = 27;
        byte b4 = 2;
        boolean z = false;
        int i4 = 0;
        byte b5 = 1;
        switch (this.a) {
            case 0:
                h26 h26Var = (h26) this.c;
                Context context = (Context) this.b;
                d dVar = h26Var.F2;
                int i5 = h26Var.c2;
                if (i5 != 11 && i5 != 34) {
                    if (i5 != 19 && i5 != 32 && !h26Var.j1()) {
                        if (i5 != 18 && i5 != 20 && i5 != 24 && i5 != 25 && i5 != 26 && i5 != 29 && i5 != 22 && i5 != 23 && i5 != 21 && i5 != 27 && i5 != 28 && i5 != 30 && i5 != 35) {
                            if (!y6c.h(h26Var.a).p() && !na7.q1(h26Var.a).F3() && !h26Var.I2) {
                                if (dVar != null) {
                                    if (dVar.getVisibleDialog() != null) {
                                        dVar.getVisibleDialog().dismiss();
                                    }
                                    dVar.presentFragment(new PremiumPreviewFragment(0, h26.l1(i5)));
                                    h26Var.dismiss();
                                    break;
                                }
                            } else {
                                h26Var.dismiss();
                                break;
                            }
                        } else {
                            gl.g(h26Var.b1());
                            h26Var.dismiss();
                            break;
                        }
                    } else {
                        ng1 ng1Var = h26Var.X1;
                        if (ng1Var.b) {
                            if (!y6c.h(h26Var.a).p() || !on0.k()) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, h26Var.J0, context);
                                alertDialog$Builder.a.S = k96.M0(2131746841, null);
                                alertDialog$Builder.a.U = gl.S2(k96.M0(h26Var.i1() ? 2131746839 : 2131746840, null));
                                alertDialog$Builder.j(k96.M0(2131752140, null), new t16(h26Var, (byte) 0));
                                alertDialog$Builder.g(k96.M0(2131752577, null), new wn4((byte) 28));
                                alertDialog$Builder.o();
                                break;
                            } else {
                                ym0.i(h26Var.V1, h26Var);
                                break;
                            }
                        } else if (ng1Var.a) {
                            if (ng1Var.c == 0) {
                                if (!ng1Var.e || !on0.k()) {
                                    h26Var.Z0();
                                    break;
                                } else {
                                    h26Var.a2 = true;
                                    h26Var.s2.e0 = false;
                                    d dVar2 = h26Var.r1;
                                    ng1 ng1Var2 = h26Var.X1;
                                    u19 u19Var = new u19(dVar2, ng1Var2.h, ng1Var2.k);
                                    u19Var.show();
                                    u19Var.I0 = new n1(h26Var, (byte) 24);
                                    break;
                                }
                            } else {
                                ?? frameLayout = new FrameLayout(h26Var.getContext());
                                be0 be0Var = new be0(h26Var.getContext());
                                be0Var.setRoundRadius(gl.L(30.0f));
                                frameLayout.addView(be0Var, nme.c(60.0f, 60));
                                frameLayout.setClipChildren(false);
                                Paint paint = new Paint(1);
                                paint.setColor(bkb.w0(null, bkb.g5, false));
                                frameLayout.addView(new s71(h26Var.getContext(), paint, h26Var.getContext().getDrawable(R.drawable.filled_limit_boost)), nme.d(28, 28.0f, 0, 34.0f, 34.0f, 0.0f, 0.0f));
                                ImageView imageView = new ImageView(h26Var.getContext());
                                imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                zkb.s(imageView, bkb.l6, null, PorterDuff.Mode.SRC_ATOP);
                                frameLayout.addView(imageView, nme.e(24, 24, 17));
                                be0 be0Var2 = new be0(h26Var.getContext());
                                be0Var2.setRoundRadius(gl.L(30.0f));
                                frameLayout.addView(be0Var2, nme.d(60, 60.0f, 0, 96.0f, 0.0f, 0.0f, 0.0f));
                                ?? frameLayout2 = new FrameLayout(h26Var.getContext());
                                frameLayout2.addView(frameLayout, nme.e(-2, 60, 1));
                                frameLayout2.setClipChildren(false);
                                TextView textView = new TextView(context);
                                textView.setLetterSpacing(0.025f);
                                zkb.X(textView, bkb.i5, null);
                                textView.setTextSize(1, 16.0f);
                                frameLayout2.addView(textView, nme.t(-1, -2, 0, 24, 80, 24, 0));
                                pb0 pb0Var = new pb0((wjb) null);
                                TLRPC.Chat K0 = na7.q1(h26Var.a).K0(Long.valueOf(-h26Var.X1.c));
                                pb0Var.p(K0);
                                be0Var.f(K0, pb0Var);
                                pb0 pb0Var2 = new pb0((wjb) null);
                                TLRPC.Chat K02 = na7.q1(h26Var.a).K0(Long.valueOf(-h26Var.V1));
                                pb0Var2.p(K02);
                                be0Var2.f(K02, pb0Var2);
                                ?? alertDialog$Builder2 = new AlertDialog$Builder(context);
                                alertDialog$Builder2.n(frameLayout2);
                                de9.r("ReplaceBoostChannelDescription", null, 2131746077, new Object[]{K0.title, K02.title}, textView);
                                alertDialog$Builder2.j(k96.M0(2131746079, null), new t16(h26Var, b5));
                                alertDialog$Builder2.g(k96.M0(2131752577, null), new wn4((byte) 29));
                                alertDialog$Builder2.o();
                                break;
                            }
                        } else {
                            int i6 = ng1Var.f;
                            if (i6 != 0) {
                                ym0.g(i6);
                                break;
                            }
                        }
                    }
                }
                break;
            case 1:
                ij.x((Context) this.b, k96.M0(2131750865, null), k96.M0(2131745318, null), -1L, new i36((s36) this.c, (byte) 0));
                break;
            case 2:
                s36 s36Var = (s36) this.c;
                Runnable[] runnableArr = (Runnable[]) this.b;
                if (s36Var.e == null) {
                    p36 p36Var = s36Var.f;
                    if (p36Var.e.h) {
                        int i7 = -s36Var.N;
                        s36Var.N = i7;
                        gl.A3(i7, p36Var, null);
                        break;
                    } else {
                        ahb ahbVar = (ahb) view;
                        Switch r5 = ahbVar.e;
                        ahbVar.setChecked(!r5.h);
                        s36Var.r.setVisibility(r5.h ? 0 : 8);
                        gl.r(runnableArr[0]);
                        boolean z2 = r5.h;
                        p36 p36Var2 = s36Var.f;
                        if (z2) {
                            p36Var2.setChecked(false);
                            s36Var.f.setCheckBoxIcon(R.drawable.permission_locked);
                            s36Var.h.setText(k96.M0(2131754198, null));
                            l36 l36Var = new l36(s36Var, b5);
                            runnableArr[0] = l36Var;
                            gl.d3(l36Var, 60L);
                            break;
                        } else {
                            p36Var2.setCheckBoxIcon(0);
                            s36Var.h.setText(k96.M0(2131754199, null));
                            l36 l36Var2 = new l36(s36Var, b4);
                            runnableArr[0] = l36Var2;
                            gl.c3(l36Var2);
                            break;
                        }
                    }
                }
                break;
            case 3:
                qa6 qa6Var = (qa6) this.c;
                qa6Var.A0((la6) this.b);
                ka6 ka6Var = qa6Var.P0;
                if (ka6Var != null) {
                    ka6Var.dismiss();
                    break;
                }
                break;
            case 4:
                ad6 ad6Var = (ad6) this.c;
                Context context2 = (Context) this.b;
                String string = ad6Var.E.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    vib vibVar = new vib();
                    vibVar.a |= 256;
                    vibVar.b = indexOf;
                    int i8 = lastIndexOf + 1;
                    vibVar.c = i8;
                    spannableStringBuilder.setSpan(new wib(vibVar, 0), indexOf, i8, 0);
                }
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context2);
                alertDialog$Builder3.a.S = k96.M0(2131748536, null);
                SpannableStringBuilder S2 = gl.S2(k96.M0(2131748540, null));
                int i9 = ad6Var.H;
                int i10 = i9 / 86400;
                int i11 = i9 % 86400;
                int i12 = i11 / 3600;
                int i13 = (i11 % 3600) / 60;
                if (i10 == 0 && i12 == 0) {
                    i13 = Math.max(1, i13);
                }
                if (i10 == 0 || i12 == 0) {
                    c = 0;
                    a0 = (i12 == 0 || i13 == 0) ? i10 != 0 ? k96.a0(null, null, 2131748542, k96.G(i10, "Days", new Object[0])) : i12 != 0 ? k96.a0(null, null, 2131748542, k96.G(i10, "Hours", new Object[0])) : k96.a0(null, null, 2131748542, k96.G(i13, "Minutes", new Object[0])) : k96.a0(null, null, 2131748543, k96.G(i12, "Hours", new Object[0]), k96.G(i13, "Minutes", new Object[0]));
                } else {
                    c = 0;
                    a0 = k96.a0(null, null, 2131748543, k96.G(i10, "Days", new Object[0]), k96.G(i12, "Hours", new Object[0]));
                }
                CharSequence[] charSequenceArr = new CharSequence[2];
                charSequenceArr[c] = spannableStringBuilder;
                charSequenceArr[1] = a0;
                alertDialog$Builder3.a.U = gl.m0(S2, charSequenceArr);
                alertDialog$Builder3.j(k96.M0(2131748544, null), new ry4((Object) ad6Var, (byte) 24));
                alertDialog$Builder3.g(k96.M0(2131752577, null), null);
                alertDialog$Builder3.o();
                break;
            case 5:
                jd6 jd6Var = (jd6) this.c;
                Context context3 = (Context) this.b;
                mf6 mf6Var = jd6Var.E;
                if (mf6Var.W.getTag() == null) {
                    if (jd6Var.n.has_recovery) {
                        mf6Var.A1(0, true);
                        TLRPC.TL_auth_requestPasswordRecovery tL_auth_requestPasswordRecovery = new TLRPC.TL_auth_requestPasswordRecovery();
                        i = ((d) mf6Var).currentAccount;
                        ConnectionsManager.getInstance(i).sendRequest(tL_auth_requestPasswordRecovery, new hd6(jd6Var, b5), 10);
                        break;
                    } else {
                        gl.t1(jd6Var.a);
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(context3);
                        alertDialog$Builder4.a.S = k96.M0(2131745878, null);
                        alertDialog$Builder4.a.U = k96.M0(2131745880, null);
                        alertDialog$Builder4.j(k96.M0(2131752029, null), null);
                        alertDialog$Builder4.g(k96.M0(2131745924, null), new ry4((Object) jd6Var, (byte) 25));
                        alertDialog$Builder4.o();
                        break;
                    }
                }
                break;
            case 6:
                qe6 qe6Var = (qe6) this.c;
                Context context4 = (Context) this.b;
                Bundle bundle = qe6Var.r0;
                if (bundle != null && (tL_auth_sentCode = qe6Var.s0) != null) {
                    qe6Var.v0.p1(bundle, tL_auth_sentCode, true);
                    break;
                } else if (!qe6Var.g0) {
                    oe6 oe6Var = qe6Var.w;
                    if ((oe6Var == null || oe6Var.getVisibility() == 8) && !qe6Var.l0) {
                        if (qe6Var.j0 == 0) {
                            TLRPC.TL_auth_reportMissingCode tL_auth_reportMissingCode = new TLRPC.TL_auth_reportMissingCode();
                            tL_auth_reportMissingCode.phone_number = qe6Var.d;
                            tL_auth_reportMissingCode.phone_code_hash = qe6Var.c;
                            tL_auth_reportMissingCode.mnc = "";
                            try {
                                String networkOperator = ((TelephonyManager) a.b.getSystemService("phone")).getNetworkOperator();
                                if (!TextUtils.isEmpty(networkOperator)) {
                                    networkOperator.substring(0, 3);
                                    tL_auth_reportMissingCode.mnc = networkOperator.substring(3);
                                }
                            } catch (Exception e) {
                                fa4.g(e, true);
                            }
                            qe6Var.v0.getConnectionsManager().sendRequest(tL_auth_reportMissingCode, null, 8);
                            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(context4);
                            alertDialog$Builder5.a.S = k96.M0(2131745878, null);
                            alertDialog$Builder5.a.U = gl.S2(k96.a0(null, null, 2131751433, qe6Var.b));
                            alertDialog$Builder5.h(k96.M0(2131751434, null), new h45(qe6Var, context4, (byte) 21));
                            alertDialog$Builder5.j(k96.M0(2131752029, null), null);
                            alertDialog$Builder5.g(k96.M0(2131751436, null), new ge6(qe6Var, b5));
                            alertDialog$Builder5.o();
                            break;
                        } else if (qe6Var.v0.W.getTag() == null) {
                            qe6Var.v();
                            break;
                        }
                    }
                }
                break;
            case 7:
                lf6 lf6Var = (lf6) this.c;
                Context context5 = (Context) this.b;
                Toast toast = lf6Var.R;
                if (toast != null) {
                    toast.cancel();
                    lf6Var.R = null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                int i14 = lf6Var.P;
                if (i14 <= 0 || currentTimeMillis - lf6Var.Q <= 1500) {
                    i2 = 0;
                    i3 = i14;
                } else {
                    i2 = 0;
                    lf6Var.P = 0;
                    i3 = 0;
                }
                int i15 = i3 + 1;
                lf6Var.P = i15;
                lf6Var.Q = currentTimeMillis;
                if (i15 >= 5) {
                    lf6Var.P = i2;
                    lf6Var.Q = 0L;
                    AlertDialog$Builder alertDialog$Builder6 = new AlertDialog$Builder(lf6Var.getContext());
                    alertDialog$Builder6.a.S = k96.M0(2131745294, null);
                    alertDialog$Builder6.e(new String[]{k96.M0(w01.a ? 2131751627 : 2131751619, null), k96.M0(2131751601, null)}, new r20(lf6Var, b4));
                    alertDialog$Builder6.o();
                    break;
                } else if (i15 > 1) {
                    Toast makeText = Toast.makeText(context5, k96.G(5 - i15, "DebugMenuLoginToast", new Object[0]), 0);
                    lf6Var.R = makeText;
                    makeText.show();
                    break;
                }
                break;
            case 8:
                q47 q47Var = (q47) this.c;
                k27 k27Var = (k27) this.b;
                s47 s47Var = q47Var.d;
                if (!s47Var.c0(k27Var)) {
                    s47Var.getOrCreateStoryViewer().J(s47Var.getParentActivity(), k27Var.l, p2b.a(s47Var.f));
                    break;
                }
                break;
            case 9:
                mp7 mp7Var = (mp7) this.c;
                az0 az0Var = (az0) this.b;
                if (!mp7Var.g2) {
                    az0Var.run();
                    break;
                }
                break;
            case 10:
                jq7 jq7Var = (jq7) this.c;
                p8c p8cVar = (p8c) this.b;
                u41 u41Var = jq7Var.q1;
                if (u41Var.e0 && !u41Var.R) {
                    gl.t1(jq7Var.n1);
                    p8cVar.a(Long.valueOf(jq7Var.s1));
                    break;
                }
                break;
            case 11:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                atomicBoolean.set(!atomicBoolean.get());
                int selectionStart = passcodeActivity.h.getSelectionStart();
                int selectionEnd = passcodeActivity.h.getSelectionEnd();
                passcodeActivity.h.setInputType((atomicBoolean.get() ? kk7.Z1 : 128) | 1);
                passcodeActivity.h.setSelection(selectionStart, selectionEnd);
                zkb.s(passcodeActivity.s, atomicBoolean.get() ? bkb.k6 : bkb.G6, null, PorterDuff.Mode.SRC_ATOP);
                break;
            case 12:
                ((p) this.c).n0(view, (String) this.b);
                break;
            case 13:
                y28 y28Var = (y28) this.c;
                f3b f3bVar = (f3b) this.b;
                m8b m8bVar = y28Var.z0;
                if (f3bVar.b != null) {
                    Bundle bundle2 = new Bundle();
                    long longValue = f3bVar.b.longValue();
                    Long l = f3bVar.b;
                    if (longValue >= 0) {
                        bundle2.putLong("user_id", l.longValue());
                    } else {
                        bundle2.putLong("chat_id", -l.longValue());
                    }
                    if (!f3bVar.e || (num = f3bVar.d) == null) {
                        m8bVar.L(new ProfileActivity(bundle2, null));
                        break;
                    } else {
                        bundle2.putInt("message_id", num.intValue());
                        m8bVar.L(new mu1(bundle2));
                        break;
                    }
                } else {
                    m21 Q = new u21(y28Var.S0, y28Var.r0).Q(R.raw.error, 36, k96.M0(2131744424, null));
                    Q.a = (byte) 3;
                    Q.k(true);
                    break;
                }
                break;
            case 14:
                y28 y28Var2 = (y28) this.c;
                fx0 fx0Var = (fx0) this.b;
                ((d8b) y28Var2.G1).h(new jh8(y28Var2.z0.f, 14, false));
                fx0Var.dismiss();
                break;
            case 15:
                s28 s28Var = (s28) this.c;
                x3b x3bVar = (x3b) this.b;
                y28 y28Var3 = s28Var.x;
                qx3 alert = x3bVar.getAlert();
                if (alert != null && (t28Var = y28Var3.G1) != null) {
                    ((d8b) t28Var).h(alert);
                    y28Var3.j1.a();
                    break;
                }
                break;
            case 16:
                b48 b48Var = (b48) this.c;
                wjb wjbVar = (wjb) this.b;
                ArrayList arrayList = b48Var.F1;
                ArrayList arrayList2 = b48Var.G1;
                d dVar3 = b48Var.s1;
                TLRPC.TL_userContact_old2 tL_userContact_old2 = b48Var.H1;
                if (b48Var.D1) {
                    AlertDialog$Builder alertDialog$Builder7 = new AlertDialog$Builder(b48Var.getContext());
                    alertDialog$Builder7.a.S = k96.M0(2131754441, null);
                    alertDialog$Builder7.g(k96.M0(2131752577, null), null);
                    alertDialog$Builder7.e(new CharSequence[]{k96.M0(2131751705, null), k96.M0(2131754372, null)}, new x38(b48Var));
                    alertDialog$Builder7.o();
                    break;
                } else {
                    StringBuilder sb = !tL_userContact_old2.restriction_reason.isEmpty() ? new StringBuilder(tL_userContact_old2.restriction_reason.get(0).text) : new StringBuilder(String.format(Locale.US, "BEGIN:VCARD\nVERSION:3.0\nFN:%1$s\nEND:VCARD", qu2.m(0, tL_userContact_old2.first_name, tL_userContact_old2.last_name)));
                    int lastIndexOf2 = sb.lastIndexOf("END:VCARD");
                    if (lastIndexOf2 >= 0) {
                        tL_userContact_old2.phone = null;
                        int size = arrayList2.size() - 1;
                        while (size >= 0) {
                            fl flVar = (fl) arrayList2.get(size);
                            boolean z3 = flVar.d;
                            ?? r15 = flVar.a;
                            if (z3) {
                                if (tL_userContact_old2.phone == null) {
                                    tL_userContact_old2.phone = flVar.c(z);
                                }
                                for (?? r13 = z; r13 < r15.size(); r13++) {
                                    sb.insert(lastIndexOf2, ((String) r15.get(r13)) + "\n");
                                }
                            }
                            size--;
                            z = false;
                        }
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            fl flVar2 = (fl) arrayList.get(size2);
                            boolean z4 = flVar2.d;
                            ArrayList arrayList3 = flVar2.a;
                            if (z4) {
                                for (int size3 = arrayList3.size() - 1; size3 >= 0; size3 += -1) {
                                    sb.insert(lastIndexOf2, ((String) arrayList3.get(size3)) + "\n");
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
                    boolean z5 = dVar3 instanceof mu1;
                    if (z5) {
                        mu1 mu1Var = (mu1) dVar3;
                        if (mu1Var.P7()) {
                            ij.J(b48Var.getContext(), mu1Var.a(), new r38(b48Var), wjbVar);
                            break;
                        }
                    }
                    ij.X(b48Var.a, z5 ? ((mu1) dVar3).a() : 0L, 1, new zf7(b48Var, (byte) 13));
                    break;
                }
            case 17:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                cs5 cs5Var = (cs5) this.b;
                Drawable[] drawableArr = PhotoViewer.d9;
                if (photoViewer.S4 != null) {
                    cs5Var.u();
                    d dVar4 = photoViewer.l4;
                    if (dVar4 instanceof mu1) {
                        ((mu1) dVar4).O9(photoViewer.S4, false, true);
                    }
                    d01.s(photoViewer.F, Uri.parse(photoViewer.S4.T0), true, false, false, null, null, false, na7.q1(photoViewer.U).k4.A2.f, false, false);
                    break;
                }
                break;
            case 18:
                PhotoViewer photoViewer2 = (PhotoViewer) this.c;
                Activity activity = (Activity) this.b;
                Drawable[] drawableArr2 = PhotoViewer.d9;
                if (!photoViewer2.K0() && !photoViewer2.r) {
                    int i16 = photoViewer2.O4;
                    if (i16 >= 0 && i16 < photoViewer2.f7.size()) {
                        Object obj = photoViewer2.f7.get(photoViewer2.O4);
                        if (obj instanceof jm6) {
                            jm6 jm6Var = (jm6) obj;
                            if (!jm6Var.b || jm6Var.d()) {
                                jm6Var.z = Boolean.valueOf(!jm6Var.c());
                                photoViewer2.k1.setPhotoState(jm6Var.c());
                                boolean c2 = jm6Var.c();
                                je5 je5Var = photoViewer2.l1;
                                if (je5Var != null) {
                                    je5Var.f(true);
                                    photoViewer2.l1 = null;
                                }
                                if (photoViewer2.F != null) {
                                    photoViewer2.l1 = new je5(photoViewer2.F, 3);
                                    SpannableStringBuilder append = new SpannableStringBuilder("x ").append((CharSequence) k96.M0(c2 ? 2131747068 : 2131747067, null));
                                    append.setSpan(new cm2(c2 ? R.drawable.menu_quality_hd_filled : R.drawable.menu_quality_sd_filled, 0), 0, 1, 33);
                                    photoViewer2.l1.t(append);
                                    photoViewer2.f0.addView(photoViewer2.l1, nme.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 48.0f));
                                    photoViewer2.l1.setTranslationY(photoViewer2.Q0.getTranslationY());
                                    photoViewer2.l1.o(0.0f, (photoViewer2.k1.getWidth() / 2.0f) + photoViewer2.k1.getX() + photoViewer2.I0.getX());
                                    je5 je5Var2 = photoViewer2.l1;
                                    je5Var2.r0 = new hh(je5Var2, (byte) 6);
                                    je5Var2.d = 3500L;
                                    je5Var2.v();
                                }
                                gba.d1 = jm6Var.c();
                                a.b.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoHighQualityDefault", gba.d1).apply();
                                break;
                            }
                        }
                    }
                    if (photoViewer2.k1.getTag() == null) {
                        if (photoViewer2.p8) {
                            jtb jtbVar = photoViewer2.n1;
                            if (jtbVar == null) {
                                k98 k98Var = photoViewer2.f0;
                                jtbVar = new jtb(activity);
                                jtbVar.d = new cib(jtbVar, b);
                                jtbVar.setBackgroundDrawable(bkb.b0(gl.L(3.0f), -871296751));
                                jtbVar.setTextColor(-1);
                                jtbVar.setTextSize(1, 14.0f);
                                jtbVar.setPadding(gl.L(8.0f), gl.L(7.0f), gl.L(8.0f), gl.L(7.0f));
                                jtbVar.setGravity(16);
                                k98Var.addView(jtbVar, nme.d(-2, -2.0f, 51, 5.0f, 0.0f, 5.0f, 3.0f));
                                jtbVar.setVisibility(8);
                                photoViewer2.n1 = jtbVar;
                            }
                            jtbVar.setText(k96.M0(2131743344, "VideoQualityIsTooLow"));
                            jtb jtbVar2 = photoViewer2.n1;
                            iac iacVar = photoViewer2.k1;
                            cib cibVar = jtbVar2.d;
                            if (iacVar != null) {
                                jtbVar2.a = iacVar;
                                jtbVar2.a();
                                jtbVar2.c = true;
                                gl.r(cibVar);
                                gl.d3(cibVar, 2000L);
                                ViewPropertyAnimator viewPropertyAnimator = jtbVar2.b;
                                if (viewPropertyAnimator != null) {
                                    viewPropertyAnimator.setListener(null);
                                    jtbVar2.b.cancel();
                                    jtbVar2.b = null;
                                }
                                if (jtbVar2.getVisibility() != 0) {
                                    jtbVar2.setAlpha(0.0f);
                                    jtbVar2.setVisibility(0);
                                    ViewPropertyAnimator listener = jtbVar2.animate().setDuration(300L).alpha(1.0f).setListener(null);
                                    jtbVar2.b = listener;
                                    listener.start();
                                    break;
                                }
                            }
                        }
                    } else {
                        photoViewer2.h2(true);
                        photoViewer2.x1(1);
                        break;
                    }
                }
                break;
            case 19:
                k62.g0((mu1) this.b, 41026, new zf7((jd8) this.c, b2), null);
                break;
            case 20:
                ((cs5) this.c).L((cs5) this.b);
                break;
            case 21:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.c;
                AlertDialog$Builder alertDialog$Builder8 = (AlertDialog$Builder) this.b;
                privacySettingsActivity.getClass();
                alertDialog$Builder8.a.M0.run();
                Integer num2 = (Integer) view.getTag();
                int i17 = num2.intValue() == 0 ? 30 : num2.intValue() == 1 ? 90 : num2.intValue() == 2 ? kk7.L2 : num2.intValue() == 3 ? 365 : num2.intValue() == 4 ? 548 : num2.intValue() == 5 ? 730 : 0;
                hd hdVar = new hd(3, null, privacySettingsActivity.getParentActivity());
                hdVar.j0 = false;
                hdVar.show();
                TL_account.setAccountTTL setaccountttl = new TL_account.setAccountTTL();
                TLRPC.TL_accountDaysTTL tL_accountDaysTTL = new TLRPC.TL_accountDaysTTL();
                setaccountttl.ttl = tL_accountDaysTTL;
                tL_accountDaysTTL.days = i17;
                privacySettingsActivity.getConnectionsManager().sendRequest(setaccountttl, new ck8(privacySettingsActivity, hdVar, setaccountttl, z ? (byte) 1 : (byte) 0));
                break;
            case 22:
                mk8 mk8Var = (mk8) this.c;
                oy8 oy8Var = (oy8) this.b;
                boolean z6 = mk8Var.w;
                mk8Var.w = !z6;
                if (z6) {
                    oy8Var.H(69);
                    oy8Var.K(99);
                } else {
                    oy8Var.H(36);
                    oy8Var.K(69);
                }
                oy8Var.start();
                break;
            case 23:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) this.b;
                RectF rectF = ProfileActivity.Z6;
                m21.e();
                d01.t(profileActivity.getParentActivity(), tL_collectibleInfo.url);
                break;
            case 24:
                ProfileActivity profileActivity2 = (ProfileActivity) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.b;
                RectF rectF2 = ProfileActivity.Z6;
                long j = profileActivity2.e1;
                long j2 = profileActivity2.E1;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = chat.default_banned_rights;
                TLRPC.ChannelParticipant channelParticipant = profileActivity2.H2;
                zc2 zc2Var = new zc2(j, j2, null, tL_chatBannedRights, channelParticipant != null ? channelParticipant.banned_rights : null, "", 1, true, false, null);
                zc2Var.Y0 = new vm8(profileActivity2, chat, zc2Var);
                profileActivity2.presentFragment(zc2Var);
                break;
            case 25:
                a(view);
                break;
            case 26:
                b(view);
                break;
            case 27:
                c(view);
                break;
            case 28:
                String str = (String) this.c;
                Context context6 = (Context) this.b;
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", str);
                Intent createChooser = Intent.createChooser(intent, k96.M0(2131745266, null));
                createChooser.setFlags(TLObject.FLAG_28);
                context6.startActivity(createChooser);
                break;
            default:
                u19 u19Var2 = (u19) this.c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.b;
                ArrayList arrayList4 = u19Var2.S1;
                if (!arrayList4.isEmpty()) {
                    ez4 ez4Var = u19Var2.V1;
                    if (!ez4Var.R) {
                        ez4Var.setLoading(true);
                        ArrayList arrayList5 = new ArrayList();
                        HashSet hashSet = new HashSet();
                        int size4 = arrayList4.size();
                        while (i4 < size4) {
                            Object obj2 = arrayList4.get(i4);
                            i4++;
                            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) obj2;
                            arrayList5.add(Integer.valueOf(tL_myBoost.slot));
                            hashSet.add(Long.valueOf(cf3.n(tL_myBoost.peer)));
                        }
                        on0.a(chat2.id, arrayList5, new au0((Object) u19Var2, (Object) chat2, (Object) arrayList5, (Object) hashSet, (byte) 17), new zf7(u19Var2, b3));
                        break;
                    }
                }
                break;
        }
    }
}

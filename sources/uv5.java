// default package

import android.app.Activity;
import android.content.Context;
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
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.p;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class uv5 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uv5(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    private final void a(View view) {
        PhotoViewer photoViewer = (PhotoViewer) this.b;
        Activity activity = (Activity) this.c;
        Drawable[] drawableArr = PhotoViewer.d9;
        if (photoViewer.K0() || photoViewer.r) {
            return;
        }
        int i = photoViewer.O4;
        if (i >= 0 && i < photoViewer.f7.size()) {
            Object obj = photoViewer.f7.get(photoViewer.O4);
            if (obj instanceof no6) {
                no6 no6Var = (no6) obj;
                if (!no6Var.b || no6Var.d()) {
                    no6Var.z = Boolean.valueOf(!no6Var.c());
                    photoViewer.k1.setPhotoState(no6Var.c());
                    boolean c = no6Var.c();
                    kg5 kg5Var = photoViewer.l1;
                    if (kg5Var != null) {
                        kg5Var.f(true);
                        photoViewer.l1 = null;
                    }
                    if (photoViewer.F != null) {
                        photoViewer.l1 = new kg5(photoViewer.F, 3);
                        SpannableStringBuilder append = new SpannableStringBuilder("x ").append((CharSequence) ob6.M0(c ? 2131746988 : 2131746987, null));
                        append.setSpan(new wm2(c ? R.drawable.menu_quality_hd_filled : R.drawable.menu_quality_sd_filled, 0), 0, 1, 33);
                        photoViewer.l1.t(append);
                        photoViewer.f0.addView(photoViewer.l1, tre.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 48.0f));
                        photoViewer.l1.setTranslationY(photoViewer.Q0.getTranslationY());
                        photoViewer.l1.o(0.0f, (photoViewer.k1.getWidth() / 2.0f) + photoViewer.k1.getX() + photoViewer.I0.getX());
                        kg5 kg5Var2 = photoViewer.l1;
                        kg5Var2.r0 = new ug(kg5Var2, (byte) 6);
                        kg5Var2.d = 3500L;
                        kg5Var2.v();
                    }
                    xea.d1 = no6Var.c();
                    a.b.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoHighQualityDefault", xea.d1).apply();
                    return;
                }
            }
        }
        if (photoViewer.k1.getTag() != null) {
            photoViewer.h2(true);
            photoViewer.x1(1);
            return;
        }
        if (photoViewer.p8) {
            kxb kxbVar = photoViewer.n1;
            if (kxbVar == null) {
                ad8 ad8Var = photoViewer.f0;
                kxbVar = new kxb(activity);
                kxbVar.d = new s8b(kxbVar, (byte) 27);
                kxbVar.setBackgroundDrawable(aob.b0(hl.L(3.0f), -871296751));
                kxbVar.setTextColor(-1);
                kxbVar.setTextSize(1, 14.0f);
                kxbVar.setPadding(hl.L(8.0f), hl.L(7.0f), hl.L(8.0f), hl.L(7.0f));
                kxbVar.setGravity(16);
                ad8Var.addView(kxbVar, tre.d(-2, -2.0f, 51, 5.0f, 0.0f, 5.0f, 3.0f));
                kxbVar.setVisibility(8);
                photoViewer.n1 = kxbVar;
            }
            kxbVar.setText(ob6.M0(2131743238, "VideoQualityIsTooLow"));
            kxb kxbVar2 = photoViewer.n1;
            iec iecVar = photoViewer.k1;
            s8b s8bVar = kxbVar2.d;
            if (iecVar != null) {
                kxbVar2.a = iecVar;
                kxbVar2.a();
                kxbVar2.c = true;
                hl.r(s8bVar);
                hl.d3(s8bVar, 2000L);
                ViewPropertyAnimator viewPropertyAnimator = kxbVar2.b;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.setListener(null);
                    kxbVar2.b.cancel();
                    kxbVar2.b = null;
                }
                if (kxbVar2.getVisibility() != 0) {
                    kxbVar2.setAlpha(0.0f);
                    kxbVar2.setVisibility(0);
                    ViewPropertyAnimator listener = kxbVar2.animate().setDuration(300L).alpha(1.0f).setListener(null);
                    kxbVar2.b = listener;
                    listener.start();
                }
            }
        }
    }

    private final void b(View view) {
        boolean z;
        bx8 bx8Var = (bx8) this.b;
        u34 u34Var = (u34) this.c;
        if (bx8Var.K.getTag() == null) {
            int max = (int) Math.max(1.0f, bx8Var.getValue());
            uc6 uc6Var = (uc6) u34Var.b;
            TLRPC.User user = (TLRPC.User) u34Var.c;
            if (uc6Var.getLocationController().h(uc6Var.m0) == null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uc6Var.getParentActivity());
                String M0 = ob6.M0(2131745181, null);
                id idVar = alertDialog$Builder.a;
                idVar.S = M0;
                idVar.U = ob6.M0(2131745182, null);
                alertDialog$Builder.j(ob6.M0(2131745183, null), new bf((Object) uc6Var, (Object) user, max, (byte) 8));
                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                uc6Var.showDialog(idVar);
                z = false;
            } else {
                uc6Var.O.M = true;
                uc6Var.c.setImageResource(R.drawable.msg_location_alert2);
                uc6Var.q0().k(0L, 24, Integer.valueOf(max), user, null, null);
                uc6Var.getLocationController().o(max, uc6Var.m0, true);
                z = true;
            }
            if (z) {
                bx8Var.a();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v16, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r3v26, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
    /* JADX WARN: Type inference failed for: r4v17, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r8v29, types: [java.util.ArrayList] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        char c;
        char c2;
        String a0;
        int i;
        int i2;
        TLRPC.TL_auth_sentCode tL_auth_sentCode;
        int i3;
        int i4;
        Integer num;
        k68 k68Var;
        StringBuilder sb;
        long j;
        int i5;
        String str;
        byte b = 14;
        byte b2 = 2;
        boolean z = false;
        boolean z2 = false;
        int i6 = 1;
        switch (this.a) {
            case 0:
                bw5 bw5Var = (bw5) this.b;
                zv5 zv5Var = (zv5) this.c;
                TLRPC.InputPeer j1 = uc7.s1(bw5Var.a).j1(r47.B1(bw5Var.w1));
                if (bw5Var.v1 != 2) {
                    bw5Var.y1 = j1;
                } else if (bw5Var.w1 != bw5Var.x1) {
                    zv5Var.a(j1, bw5Var.s1.size() > 1, false, false);
                }
                bw5Var.dismiss();
                break;
            case 1:
                ox5 ox5Var = (ox5) this.b;
                e eVar = (e) this.c;
                ox5Var.R.dismiss();
                if (ox5Var.g0.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("checkCanWrite", false);
                    int i7 = ox5Var.d0;
                    if (i7 == 1) {
                        bundle.putInt("dialogsType", 6);
                    } else if (i7 == 2) {
                        bundle.putInt("dialogsType", 5);
                    } else {
                        bundle.putInt("dialogsType", 4);
                    }
                    bundle.putBoolean("allowGlobalSearch", false);
                    uj3 uj3Var = new uj3(bundle);
                    uj3Var.E2 = new u34(ox5Var, uj3Var, (byte) 9);
                    eVar.presentFragment(uj3Var);
                    break;
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, ox5Var.d0);
                    d61 d61Var = new d61(bundle2);
                    d61Var.d = ox5Var.g0;
                    d61Var.Y();
                    eVar.presentFragment(d61Var);
                    break;
                }
            case 2:
                mb6[] mb6VarArr = (mb6[]) this.b;
                cz5[] cz5VarArr = (cz5[]) this.c;
                String str2 = LaunchActivity.C1;
                Integer num2 = (Integer) view.getTag();
                mb6VarArr[0] = ((cz5) view).getCurrentLocale();
                int i8 = 0;
                while (i8 < 2) {
                    cz5VarArr[i8].a.a(i8 == num2.intValue(), true);
                    i8++;
                }
                break;
            case 3:
                l46 l46Var = (l46) this.b;
                Context context = (Context) this.c;
                e eVar2 = l46Var.F2;
                int i9 = l46Var.c2;
                if (i9 != 11 && i9 != 34) {
                    byte b3 = 24;
                    if (i9 != 19 && i9 != 32 && !l46Var.k1()) {
                        if (i9 != 18 && i9 != 20 && i9 != 24 && i9 != 25 && i9 != 26 && i9 != 29 && i9 != 22 && i9 != 23 && i9 != 21 && i9 != 27 && i9 != 28 && i9 != 30 && i9 != 35) {
                            if (!yac.h(l46Var.a).p() && !uc7.s1(l46Var.a).M3() && !l46Var.I2) {
                                if (eVar2 != null) {
                                    if (eVar2.getVisibleDialog() != null) {
                                        eVar2.getVisibleDialog().dismiss();
                                    }
                                    eVar2.presentFragment(new PremiumPreviewFragment(0, l46.m1(i9)));
                                    l46Var.dismiss();
                                    break;
                                }
                            } else {
                                l46Var.dismiss();
                                break;
                            }
                        } else {
                            hl.g(l46Var.c1());
                            l46Var.dismiss();
                            break;
                        }
                    } else {
                        wg1 wg1Var = l46Var.X1;
                        if (wg1Var.b) {
                            if (!yac.h(l46Var.a).p() || !on0.k()) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, l46Var.J0, context);
                                alertDialog$Builder.a.S = ob6.M0(2131746761, null);
                                alertDialog$Builder.a.U = hl.S2(ob6.M0(l46Var.j1() ? 2131746759 : 2131746760, null));
                                alertDialog$Builder.j(ob6.M0(2131752117, null), new x36(l46Var, (byte) 0));
                                alertDialog$Builder.g(ob6.M0(2131752570, null), new lq5((byte) 10));
                                alertDialog$Builder.o();
                                break;
                            } else {
                                ym0.i(l46Var.V1, l46Var);
                                break;
                            }
                        } else if (wg1Var.a) {
                            if (wg1Var.c == 0) {
                                if (!wg1Var.e || !on0.k()) {
                                    l46Var.a1();
                                    break;
                                } else {
                                    l46Var.a2 = true;
                                    l46Var.s2.e0 = false;
                                    e eVar3 = l46Var.r1;
                                    wg1 wg1Var2 = l46Var.X1;
                                    j59 j59Var = new j59(eVar3, wg1Var2.h, wg1Var2.k);
                                    j59Var.show();
                                    j59Var.I0 = new o1(l46Var, b3);
                                    break;
                                }
                            } else {
                                ?? frameLayout = new FrameLayout(l46Var.getContext());
                                de0 de0Var = new de0(l46Var.getContext());
                                de0Var.setRoundRadius(hl.L(30.0f));
                                frameLayout.addView(de0Var, tre.c(60.0f, 60));
                                frameLayout.setClipChildren(false);
                                Paint paint = new Paint(1);
                                paint.setColor(aob.w0(null, aob.h5, false));
                                frameLayout.addView(new a81(l46Var.getContext(), paint, l46Var.getContext().getDrawable(R.drawable.filled_limit_boost)), tre.d(28, 28.0f, 0, 34.0f, 34.0f, 0.0f, 0.0f));
                                ImageView imageView = new ImageView(l46Var.getContext());
                                imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                yob.s(imageView, aob.m6, null, PorterDuff.Mode.SRC_ATOP);
                                frameLayout.addView(imageView, tre.e(24, 24, 17));
                                de0 de0Var2 = new de0(l46Var.getContext());
                                de0Var2.setRoundRadius(hl.L(30.0f));
                                frameLayout.addView(de0Var2, tre.d(60, 60.0f, 0, 96.0f, 0.0f, 0.0f, 0.0f));
                                ?? frameLayout2 = new FrameLayout(l46Var.getContext());
                                frameLayout2.addView(frameLayout, tre.e(-2, 60, 1));
                                frameLayout2.setClipChildren(false);
                                TextView textView = new TextView(context);
                                textView.setLetterSpacing(0.025f);
                                yob.X(textView, aob.j5, null);
                                textView.setTextSize(1, 16.0f);
                                frameLayout2.addView(textView, tre.t(-1, -2, 0, 24, 80, 24, 0));
                                rb0 rb0Var = new rb0((vnb) null);
                                TLRPC.Chat M0 = uc7.s1(l46Var.a).M0(Long.valueOf(-l46Var.X1.c));
                                rb0Var.p(M0);
                                de0Var.f(M0, rb0Var);
                                rb0 rb0Var2 = new rb0((vnb) null);
                                TLRPC.Chat M02 = uc7.s1(l46Var.a).M0(Long.valueOf(-l46Var.V1));
                                rb0Var2.p(M02);
                                de0Var2.f(M02, rb0Var2);
                                ?? alertDialog$Builder2 = new AlertDialog$Builder(context);
                                alertDialog$Builder2.n(frameLayout2);
                                uh9.r("ReplaceBoostChannelDescription", null, 2131745997, new Object[]{M0.title, M02.title}, textView);
                                alertDialog$Builder2.j(ob6.M0(2131745999, null), new x36(l46Var, (byte) 1));
                                alertDialog$Builder2.g(ob6.M0(2131752570, null), new lq5((byte) 11));
                                alertDialog$Builder2.o();
                                break;
                            }
                        } else {
                            int i10 = wg1Var.f;
                            if (i10 != 0) {
                                ym0.g(i10);
                                break;
                            }
                        }
                    }
                }
                break;
            case 4:
                jj.x((Context) this.c, ob6.M0(2131750842, null), ob6.M0(2131745238, null), -1L, new l56((v56) this.b, (byte) 0));
                break;
            case 5:
                v56 v56Var = (v56) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                if (v56Var.e == null) {
                    s56 s56Var = v56Var.f;
                    if (s56Var.e.h) {
                        int i11 = -v56Var.N;
                        v56Var.N = i11;
                        hl.A3(i11, s56Var, null);
                        break;
                    } else {
                        wkb wkbVar = (wkb) view;
                        Switch r3 = wkbVar.e;
                        wkbVar.setChecked(!r3.h);
                        v56Var.r.setVisibility(r3.h ? 0 : 8);
                        hl.r(runnableArr[0]);
                        boolean z3 = r3.h;
                        s56 s56Var2 = v56Var.f;
                        if (z3) {
                            s56Var2.setChecked(false);
                            v56Var.f.setCheckBoxIcon(R.drawable.permission_locked);
                            v56Var.h.setText(ob6.M0(2131754194, null));
                            o56 o56Var = new o56(v56Var, (byte) 1);
                            runnableArr[0] = o56Var;
                            hl.d3(o56Var, 60L);
                            break;
                        } else {
                            s56Var2.setCheckBoxIcon(0);
                            v56Var.h.setText(ob6.M0(2131754195, null));
                            o56 o56Var2 = new o56(v56Var, b2);
                            runnableArr[0] = o56Var2;
                            hl.c3(o56Var2);
                            break;
                        }
                    }
                }
                break;
            case 6:
                uc6 uc6Var = (uc6) this.b;
                uc6Var.B0((pc6) this.c);
                oc6 oc6Var = uc6Var.P0;
                if (oc6Var != null) {
                    oc6Var.dismiss();
                    break;
                }
                break;
            case 7:
                df6 df6Var = (df6) this.b;
                Context context2 = (Context) this.c;
                String string = df6Var.E.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    rmb rmbVar = new rmb();
                    rmbVar.a |= 256;
                    rmbVar.b = indexOf;
                    int i12 = lastIndexOf + 1;
                    rmbVar.c = i12;
                    spannableStringBuilder.setSpan(new smb(rmbVar, 0), indexOf, i12, 0);
                }
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context2);
                alertDialog$Builder3.a.S = ob6.M0(2131748482, null);
                SpannableStringBuilder S2 = hl.S2(ob6.M0(2131748486, null));
                int i13 = df6Var.H;
                int i14 = i13 / 86400;
                int i15 = i13 % 86400;
                int i16 = i15 / 3600;
                int i17 = (i15 % 3600) / 60;
                if (i14 == 0 && i16 == 0) {
                    i17 = Math.max(1, i17);
                }
                if (i14 == 0 || i16 == 0) {
                    c = 0;
                    if (i16 == 0 || i17 == 0) {
                        c2 = 1;
                        a0 = i14 != 0 ? ob6.a0(null, null, 2131748488, ob6.G(i14, "Days", new Object[0])) : i16 != 0 ? ob6.a0(null, null, 2131748488, ob6.G(i14, "Hours", new Object[0])) : ob6.a0(null, null, 2131748488, ob6.G(i17, "Minutes", new Object[0]));
                    } else {
                        c2 = 1;
                        a0 = ob6.a0(null, null, 2131748489, ob6.G(i16, "Hours", new Object[0]), ob6.G(i17, "Minutes", new Object[0]));
                    }
                } else {
                    c = 0;
                    a0 = ob6.a0(null, null, 2131748489, ob6.G(i14, "Days", new Object[0]), ob6.G(i16, "Hours", new Object[0]));
                    c2 = 1;
                }
                CharSequence[] charSequenceArr = new CharSequence[2];
                charSequenceArr[c] = spannableStringBuilder;
                charSequenceArr[c2] = a0;
                alertDialog$Builder3.a.U = hl.m0(S2, charSequenceArr);
                alertDialog$Builder3.j(ob6.M0(2131748490, null), new e05((Object) df6Var, (byte) 26));
                alertDialog$Builder3.g(ob6.M0(2131752570, null), null);
                alertDialog$Builder3.o();
                break;
            case 8:
                lf6 lf6Var = (lf6) this.b;
                Context context3 = (Context) this.c;
                qh6 qh6Var = lf6Var.E;
                if (qh6Var.W.getTag() == null) {
                    if (lf6Var.n.has_recovery) {
                        qh6Var.B1(0, true);
                        TLRPC.TL_auth_requestPasswordRecovery tL_auth_requestPasswordRecovery = new TLRPC.TL_auth_requestPasswordRecovery();
                        i = ((e) qh6Var).currentAccount;
                        ConnectionsManager.getInstance(i).sendRequest(tL_auth_requestPasswordRecovery, new jf6(lf6Var, (byte) 1), 10);
                        break;
                    } else {
                        hl.t1(lf6Var.a);
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(context3);
                        alertDialog$Builder4.a.S = ob6.M0(2131745798, null);
                        alertDialog$Builder4.a.U = ob6.M0(2131745800, null);
                        alertDialog$Builder4.j(ob6.M0(2131752006, null), null);
                        alertDialog$Builder4.g(ob6.M0(2131745844, null), new e05((Object) lf6Var, (byte) 27));
                        alertDialog$Builder4.o();
                        break;
                    }
                }
                break;
            case 9:
                tg6 tg6Var = (tg6) this.b;
                Context context4 = (Context) this.c;
                Bundle bundle3 = tg6Var.r0;
                if (bundle3 != null && (tL_auth_sentCode = tg6Var.s0) != null) {
                    tg6Var.v0.q1(bundle3, tL_auth_sentCode, true);
                    break;
                } else if (!tg6Var.g0) {
                    rg6 rg6Var = tg6Var.w;
                    if ((rg6Var == null || rg6Var.getVisibility() == 8) && !tg6Var.l0) {
                        if (tg6Var.j0 == 0) {
                            TLRPC.TL_auth_reportMissingCode tL_auth_reportMissingCode = new TLRPC.TL_auth_reportMissingCode();
                            tL_auth_reportMissingCode.phone_number = tg6Var.d;
                            tL_auth_reportMissingCode.phone_code_hash = tg6Var.c;
                            tL_auth_reportMissingCode.mnc = "";
                            try {
                                String networkOperator = ((TelephonyManager) a.b.getSystemService("phone")).getNetworkOperator();
                                if (!TextUtils.isEmpty(networkOperator)) {
                                    networkOperator.substring(0, 3);
                                    tL_auth_reportMissingCode.mnc = networkOperator.substring(3);
                                }
                                i2 = 1;
                            } catch (Exception e) {
                                i2 = 1;
                                cc4.g(e, true);
                            }
                            tg6Var.v0.getConnectionsManager().sendRequest(tL_auth_reportMissingCode, null, 8);
                            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(context4);
                            alertDialog$Builder5.a.S = ob6.M0(2131745798, null);
                            Object[] objArr = new Object[i2];
                            objArr[0] = tg6Var.b;
                            alertDialog$Builder5.a.U = hl.S2(ob6.a0(null, null, 2131751410, objArr));
                            alertDialog$Builder5.h(ob6.M0(2131751411, null), new u34(tg6Var, context4, (byte) 26));
                            alertDialog$Builder5.j(ob6.M0(2131752006, null), null);
                            alertDialog$Builder5.g(ob6.M0(2131751413, null), new ig6(tg6Var, (byte) 1));
                            alertDialog$Builder5.o();
                            break;
                        } else if (tg6Var.v0.W.getTag() == null) {
                            tg6Var.v();
                            break;
                        }
                    }
                }
                break;
            case 10:
                ph6 ph6Var = (ph6) this.b;
                Context context5 = (Context) this.c;
                Toast toast = ph6Var.R;
                if (toast != null) {
                    toast.cancel();
                    ph6Var.R = null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                int i18 = ph6Var.P;
                if (i18 <= 0 || currentTimeMillis - ph6Var.Q <= 1500) {
                    i3 = 0;
                    i4 = i18;
                } else {
                    i3 = 0;
                    ph6Var.P = 0;
                    i4 = 0;
                }
                int i19 = i4 + 1;
                ph6Var.P = i19;
                ph6Var.Q = currentTimeMillis;
                if (i19 >= 5) {
                    ph6Var.P = i3;
                    ph6Var.Q = 0L;
                    AlertDialog$Builder alertDialog$Builder6 = new AlertDialog$Builder(ph6Var.getContext());
                    alertDialog$Builder6.a.S = ob6.M0(2131745214, null);
                    alertDialog$Builder6.e(new String[]{ob6.M0(f11.a ? 2131751604 : 2131751596, null), ob6.M0(2131751578, null)}, new s20(ph6Var, b2));
                    alertDialog$Builder6.o();
                    break;
                } else if (i19 > 1) {
                    Toast makeText = Toast.makeText(context5, ob6.G(5 - i19, "DebugMenuLoginToast", new Object[0]), 0);
                    ph6Var.R = makeText;
                    makeText.show();
                    break;
                }
                break;
            case 11:
                x67 x67Var = (x67) this.b;
                r47 r47Var = (r47) this.c;
                z67 z67Var = x67Var.d;
                if (!z67Var.c0(r47Var)) {
                    z67Var.getOrCreateStoryViewer().J(z67Var.getParentActivity(), r47Var.l, l6b.a(z67Var.f));
                    break;
                }
                break;
            case 12:
                ms7 ms7Var = (ms7) this.b;
                iz0 iz0Var = (iz0) this.c;
                if (!ms7Var.g2) {
                    iz0Var.run();
                    break;
                }
                break;
            case 13:
                pt7 pt7Var = (pt7) this.b;
                pcc pccVar = (pcc) this.c;
                c51 c51Var = pt7Var.q1;
                if (c51Var.e0 && !c51Var.R) {
                    hl.t1(pt7Var.n1);
                    pccVar.a(Long.valueOf(pt7Var.s1));
                    break;
                }
                break;
            case 14:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                atomicBoolean.set(!atomicBoolean.get());
                int selectionStart = passcodeActivity.h.getSelectionStart();
                int selectionEnd = passcodeActivity.h.getSelectionEnd();
                passcodeActivity.h.setInputType((atomicBoolean.get() ? jn7.Z1 : 128) | 1);
                passcodeActivity.h.setSelection(selectionStart, selectionEnd);
                yob.s(passcodeActivity.s, atomicBoolean.get() ? aob.l6 : aob.H6, null, PorterDuff.Mode.SRC_ATOP);
                break;
            case 15:
                ((p) this.b).n0(view, (String) this.c);
                break;
            case 16:
                o68 o68Var = (o68) this.b;
                nx0 nx0Var = (nx0) this.c;
                ((ccb) o68Var.A1).h(new xk8(o68Var.t0.f, 14, false));
                nx0Var.dismiss();
                break;
            case 17:
                o68 o68Var2 = (o68) this.b;
                b7b b7bVar = (b7b) this.c;
                lcb lcbVar = o68Var2.t0;
                if (b7bVar.b != null) {
                    Bundle bundle4 = new Bundle();
                    long longValue = b7bVar.b.longValue();
                    Long l = b7bVar.b;
                    if (longValue >= 0) {
                        bundle4.putLong("user_id", l.longValue());
                    } else {
                        bundle4.putLong("chat_id", -l.longValue());
                    }
                    if (!b7bVar.e || (num = b7bVar.d) == null) {
                        lcbVar.L(new ProfileActivity(bundle4, null));
                        break;
                    } else {
                        bundle4.putInt("message_id", num.intValue());
                        lcbVar.L(new zu1(bundle4));
                        break;
                    }
                } else {
                    v21 Q = new d31(o68Var2.M0, o68Var2.l0).Q(R.raw.error, 36, ob6.M0(2131744318, null));
                    Q.a = 3;
                    Q.k(true);
                    break;
                }
                break;
            case 18:
                j68 j68Var = (j68) this.b;
                u7b u7bVar = (u7b) this.c;
                o68 o68Var3 = j68Var.x;
                ly3 alert = u7bVar.getAlert();
                if (alert != null && (k68Var = o68Var3.A1) != null) {
                    ((ccb) k68Var).h(alert);
                    o68Var3.d1.a();
                    break;
                }
                break;
            case 19:
                r78 r78Var = (r78) this.b;
                vnb vnbVar = (vnb) this.c;
                ArrayList arrayList = r78Var.F1;
                ArrayList arrayList2 = r78Var.G1;
                e eVar4 = r78Var.s1;
                TLRPC.TL_userContact_old2 tL_userContact_old2 = r78Var.H1;
                if (r78Var.D1) {
                    AlertDialog$Builder alertDialog$Builder7 = new AlertDialog$Builder(r78Var.getContext());
                    alertDialog$Builder7.a.S = ob6.M0(2131754437, null);
                    alertDialog$Builder7.g(ob6.M0(2131752570, null), null);
                    alertDialog$Builder7.e(new CharSequence[]{ob6.M0(2131751682, null), ob6.M0(2131754368, null)}, new n78(r78Var));
                    alertDialog$Builder7.o();
                    break;
                } else {
                    if (tL_userContact_old2.restriction_reason.isEmpty()) {
                        j = 0;
                        sb = new StringBuilder(String.format(Locale.US, "BEGIN:VCARD\nVERSION:3.0\nFN:%1$s\nEND:VCARD", lv2.m(0, tL_userContact_old2.first_name, tL_userContact_old2.last_name)));
                    } else {
                        sb = new StringBuilder(tL_userContact_old2.restriction_reason.get(0).text);
                        j = 0;
                    }
                    int lastIndexOf2 = sb.lastIndexOf("END:VCARD");
                    if (lastIndexOf2 >= 0) {
                        tL_userContact_old2.phone = null;
                        int size = arrayList2.size() - 1;
                        while (size >= 0) {
                            gl glVar = (gl) arrayList2.get(size);
                            boolean z4 = glVar.d;
                            int i20 = i6;
                            ?? r8 = glVar.a;
                            if (z4) {
                                if (tL_userContact_old2.phone == null) {
                                    tL_userContact_old2.phone = glVar.c(z);
                                }
                                for (?? r13 = z; r13 < r8.size(); r13++) {
                                    sb.insert(lastIndexOf2, ((String) r8.get(r13)) + "\n");
                                }
                            }
                            size--;
                            i6 = i20;
                            z = false;
                        }
                        i5 = i6;
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            gl glVar2 = (gl) arrayList.get(size2);
                            boolean z5 = glVar2.d;
                            ArrayList arrayList3 = glVar2.a;
                            if (z5) {
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
                    } else {
                        i5 = 1;
                    }
                    boolean z6 = eVar4 instanceof zu1;
                    if (z6) {
                        zu1 zu1Var = (zu1) eVar4;
                        if (zu1Var.X7()) {
                            jj.J(r78Var.getContext(), zu1Var.a(), new h78(r78Var), vnbVar);
                            break;
                        }
                    }
                    jj.X(r78Var.a, z6 ? ((zu1) eVar4).a() : j, i5, new ji7(r78Var, b));
                    break;
                }
            case 20:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                fu5 fu5Var = (fu5) this.c;
                Drawable[] drawableArr = PhotoViewer.d9;
                if (photoViewer.S4 != null) {
                    fu5Var.u();
                    e eVar5 = photoViewer.l4;
                    if (eVar5 instanceof zu1) {
                        ((zu1) eVar5).Z9(photoViewer.S4, false, true);
                    }
                    m01.t(photoViewer.F, Uri.parse(photoViewer.S4.T0), true, false, false, null, null, false, uc7.s1(photoViewer.U).l4.I2.f, false, false);
                    break;
                }
                break;
            case 21:
                a(view);
                break;
            case 22:
                a72.f0((zu1) this.c, 41026, new ji7((xg8) this.b, (byte) 15), null);
                break;
            case 23:
                ((fu5) this.b).L((fu5) this.c);
                break;
            case 24:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                AlertDialog$Builder alertDialog$Builder8 = (AlertDialog$Builder) this.c;
                privacySettingsActivity.getClass();
                alertDialog$Builder8.a.M0.run();
                Integer num3 = (Integer) view.getTag();
                int i21 = num3.intValue() == 0 ? 30 : num3.intValue() == 1 ? 90 : num3.intValue() == 2 ? jn7.L2 : num3.intValue() == 3 ? 365 : num3.intValue() == 4 ? 548 : num3.intValue() == 5 ? 730 : 0;
                id idVar = new id(3, null, privacySettingsActivity.getParentActivity());
                idVar.j0 = false;
                idVar.show();
                TL_account.setAccountTTL setaccountttl = new TL_account.setAccountTTL();
                TLRPC.TL_accountDaysTTL tL_accountDaysTTL = new TLRPC.TL_accountDaysTTL();
                setaccountttl.ttl = tL_accountDaysTTL;
                tL_accountDaysTTL.days = i21;
                privacySettingsActivity.getConnectionsManager().sendRequest(setaccountttl, new qn8((Object) privacySettingsActivity, (Object) idVar, (Object) setaccountttl, (byte) (z2 ? 1 : 0)));
                break;
            case 25:
                zn8 zn8Var = (zn8) this.b;
                b29 b29Var = (b29) this.c;
                boolean z7 = zn8Var.w;
                zn8Var.w = !z7;
                if (z7) {
                    b29Var.H(69);
                    b29Var.K(99);
                } else {
                    b29Var.H(36);
                    b29Var.K(69);
                }
                b29Var.start();
                break;
            case 26:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) this.c;
                RectF rectF = ProfileActivity.Z6;
                v21.e();
                m01.u(profileActivity.getParentActivity(), tL_collectibleInfo.url);
                break;
            case 27:
                ProfileActivity profileActivity2 = (ProfileActivity) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                RectF rectF2 = ProfileActivity.Z6;
                long j2 = profileActivity2.e1;
                long j3 = profileActivity2.E1;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = chat.default_banned_rights;
                TLRPC.ChannelParticipant channelParticipant = profileActivity2.H2;
                pd2 pd2Var = new pd2(j2, j3, null, tL_chatBannedRights, channelParticipant != null ? channelParticipant.banned_rights : null, "", 1, true, false, null);
                pd2Var.Y0 = new gq8(profileActivity2, chat, pd2Var);
                profileActivity2.presentFragment(pd2Var);
                break;
            case 28:
                b(view);
                break;
            default:
                ox8 ox8Var = (ox8) this.b;
                Context context6 = (Context) this.c;
                StringBuilder sb2 = new StringBuilder();
                String obj = ox8Var.a[0].getText().toString();
                String obj2 = ox8Var.a[3].getText().toString();
                String obj3 = ox8Var.a[2].getText().toString();
                String obj4 = ox8Var.a[1].getText().toString();
                String obj5 = ox8Var.a[4].getText().toString();
                try {
                    if (ox8Var.w == 3) {
                        m66 a = jx8.a();
                        a.o(ox8Var.w);
                        if (obj == null) {
                            obj = "";
                        }
                        a.c = obj;
                        a.f = obj5 != null ? obj5 : "";
                        ox8Var.a0(context6, a.c().e());
                        break;
                    } else {
                        if (!TextUtils.isEmpty(obj)) {
                            sb2.append("server=");
                            sb2.append(URLEncoder.encode(obj, "UTF-8"));
                        }
                        if (!TextUtils.isEmpty(obj4)) {
                            if (sb2.length() != 0) {
                                sb2.append("&");
                            }
                            sb2.append("port=");
                            sb2.append(URLEncoder.encode(obj4, "UTF-8"));
                        }
                        if (ox8Var.w == 2) {
                            str = "https://t.me/proxy?";
                            if (sb2.length() != 0) {
                                sb2.append("&");
                            }
                            sb2.append("secret=");
                            sb2.append(URLEncoder.encode(obj5, "UTF-8"));
                        } else {
                            str = "https://t.me/socks?";
                            if (!TextUtils.isEmpty(obj3)) {
                                if (sb2.length() != 0) {
                                    sb2.append("&");
                                }
                                sb2.append("user=");
                                sb2.append(URLEncoder.encode(obj3, "UTF-8"));
                            }
                            if (!TextUtils.isEmpty(obj2)) {
                                if (sb2.length() != 0) {
                                    sb2.append("&");
                                }
                                sb2.append("pass=");
                                sb2.append(URLEncoder.encode(obj2, "UTF-8"));
                            }
                        }
                        if (sb2.length() != 0) {
                            ox8Var.a0(context6, str.concat(sb2.toString()));
                            break;
                        }
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
        }
    }
}

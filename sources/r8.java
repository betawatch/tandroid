// default package

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class r8 extends c6 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r8(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // c6
    public final void b(int i) {
        k47 k47Var;
        a aVar;
        a aVar2;
        rja rjaVar;
        rja rjaVar2;
        int i2;
        int i3;
        byte b = this.a;
        final byte b2 = 0;
        final byte b3 = 1;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (i == -1) {
                    ((u8) obj).finishFragment();
                    break;
                }
                break;
            case 1:
                if (i == -1) {
                    ((ct) obj).finishFragment();
                    break;
                }
                break;
            case 2:
                if (i == -1) {
                    ((ht) obj).finishFragment();
                    break;
                }
                break;
            case 3:
                i30 i30Var = (i30) obj;
                if (i != -1) {
                    i30Var.J0(i);
                    break;
                } else {
                    i30Var.dismiss();
                    break;
                }
            case 4:
                if (i == -1) {
                    ((vn9) obj).finishFragment();
                    break;
                }
                break;
            case 5:
                if (i == -1) {
                    ((v70) obj).finishFragment();
                    break;
                }
                break;
            case 6:
                be0 be0Var = (be0) obj;
                if (i != -1) {
                    if (i == 1) {
                        be0Var.c0();
                        break;
                    }
                } else if (be0Var.onBackPressed(true)) {
                    be0Var.finishFragment();
                    break;
                }
                break;
            case 7:
                dn0 dn0Var = (dn0) obj;
                HashSet hashSet = dn0Var.y;
                if (i != -1) {
                    if (i != R.id.menu_delete) {
                        if (i == R.id.menu_link) {
                            dn0Var.h0();
                            break;
                        }
                    } else {
                        HashSet hashSet2 = new HashSet();
                        ArrayList arrayList = new ArrayList();
                        HashSet hashSet3 = new HashSet();
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            int intValue = ((Integer) it.next()).intValue();
                            ArrayList arrayList2 = dn0Var.e.a;
                            int size = arrayList2.size();
                            int i4 = 0;
                            while (true) {
                                if (i4 < size) {
                                    Object obj2 = arrayList2.get(i4);
                                    i4++;
                                    k47Var = (k47) obj2;
                                    if (k47Var == null || k47Var.e1() != intValue) {
                                    }
                                } else {
                                    k47Var = null;
                                }
                            }
                            cb cbVar = dn0Var.f;
                            if (cbVar != null && k47Var == null) {
                                ArrayList arrayList3 = cbVar.a;
                                int size2 = arrayList3.size();
                                int i5 = 0;
                                while (true) {
                                    if (i5 < size2) {
                                        Object obj3 = arrayList3.get(i5);
                                        i5++;
                                        k47 k47Var2 = (k47) obj3;
                                        if (k47Var2 != null && k47Var2.e1() == intValue) {
                                            k47Var = k47Var2;
                                        }
                                    }
                                }
                            }
                            if (k47Var != null) {
                                arrayList.add(k47Var);
                                hashSet3.add(Integer.valueOf(k47Var.e1()));
                                hashSet2.add(eb.a(k47Var));
                            }
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, dn0Var.getResourceProvider(), dn0Var.getParentActivity());
                        String G = jb6.G(hashSet3.size(), "DeleteOptionsTitle", new Object[0]);
                        he heVar = alertDialog$Builder.a;
                        heVar.S = G;
                        heVar.U = jb6.N0(hashSet3.size() == 1 ? "AreYouSureUnsaveSingleMessage" : "AreYouSureUnsaveFewMessages");
                        alertDialog$Builder.j(jb6.M0(2131751535, null), new o(dn0Var, hashSet3, (byte) 18));
                        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                        alertDialog$Builder.c(-1);
                        alertDialog$Builder.o();
                        break;
                    }
                } else {
                    aVar = ((d) dn0Var).actionBar;
                    if (!aVar.y()) {
                        dn0Var.finishFragment();
                        break;
                    } else {
                        aVar2 = ((d) dn0Var).actionBar;
                        aVar2.x();
                        hashSet.clear();
                        gm.d0(dn0Var.a, new bn0(b2));
                        break;
                    }
                }
                break;
            case 8:
                if (i == -1) {
                    ((vp0) obj).finishFragment();
                    break;
                }
                break;
            case 9:
                ((rs0) obj).g0(i);
                break;
            case 10:
                if (i == -1) {
                    ((au0) obj).finishFragment();
                    break;
                }
                break;
            case 11:
                if (i == -1) {
                    ((mz0) obj).dismiss();
                    break;
                }
                break;
            case 12:
                f51 f51Var = (f51) obj;
                if (i != -1) {
                    if (i == 1) {
                        f51Var.k0();
                        break;
                    }
                } else if (f51Var.onBackPressed(true)) {
                    f51Var.finishFragment();
                    break;
                }
                break;
            case 13:
                if (i == -1) {
                    ((c71) obj).finishFragment();
                    break;
                }
                break;
            case 14:
                y71 y71Var = (y71) obj;
                if (i != -1) {
                    if (i != 1) {
                        if (i != 3) {
                            if (i == 4) {
                                y71Var.h0(true);
                                break;
                            }
                        } else {
                            y71Var.h0(false);
                            break;
                        }
                    } else {
                        y71Var.i0();
                        break;
                    }
                } else {
                    rjaVar = ((d) y71Var).simpleActionBar;
                    if (!rjaVar.x()) {
                        y71Var.finishFragment();
                        break;
                    } else {
                        c81 c81Var = y71Var.e0;
                        if (c81Var != null) {
                            c81Var.d();
                        }
                        k71 k71Var = y71Var.N;
                        if (k71Var != null) {
                            k71Var.f(false);
                            y71Var.N.e();
                            break;
                        }
                    }
                }
                break;
            case 15:
                k91 k91Var = (k91) obj;
                if (i == -1) {
                    if (k91Var.Q != 0 || k91Var.R != 0 || k91Var.H) {
                        k91Var.H = false;
                        k91Var.Q = 0;
                        k91Var.R = 0;
                        k91Var.B0();
                        k91Var.s0();
                        break;
                    } else {
                        k91Var.finishFragment();
                        break;
                    }
                }
                break;
            case 16:
                ia1 ia1Var = (ia1) obj;
                if (i != -1) {
                    if (i != 2) {
                        if (i == 3) {
                            ia1Var.m0(true);
                            break;
                        }
                    } else {
                        ia1Var.m0(false);
                        break;
                    }
                } else {
                    rjaVar2 = ((d) ia1Var).simpleActionBar;
                    if (!rjaVar2.x()) {
                        ia1Var.finishFragment();
                        break;
                    } else {
                        ia1Var.e0(true);
                        break;
                    }
                }
                break;
            case 17:
                if (i == -1) {
                    ((lb1) obj).finishFragment();
                    break;
                }
                break;
            case 18:
                hf1 hf1Var = (hf1) obj;
                if (i != -1) {
                    if (i == 1 && hf1Var.a.getText().length() != 0) {
                        hf1Var.Z();
                        hf1Var.finishFragment();
                        break;
                    }
                } else {
                    hf1Var.finishFragment();
                    break;
                }
                break;
            case 19:
                uf1 uf1Var = (uf1) obj;
                if (i != -1) {
                    if (i == 1) {
                        uf1Var.l0();
                        uf1Var.k0();
                        break;
                    }
                } else {
                    uf1Var.finishFragment();
                    break;
                }
                break;
            case 20:
                if (i == -1) {
                    ((vg1) obj).finishFragment();
                    break;
                }
                break;
            case 21:
                vi1 vi1Var = (vi1) obj;
                if (i != -1) {
                    if (i == 1) {
                        FrameLayout frameLayout = (FrameLayout) vi1Var.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        vi1Var.M.setAlpha(0.0f);
                        frameLayout.draw(canvas);
                        vi1Var.M.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        vi1Var.M.getLocationInWindow(iArr);
                        float f = iArr[0];
                        float f2 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + gm.n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        fi1 fi1Var = new fi1(vi1Var, vi1Var.getParentActivity(), canvas, (vi1Var.M.getMeasuredWidth() / 2.0f) + f, (vi1Var.M.getMeasuredHeight() / 2.0f) + f2, max, paint, createBitmap, paint2, f, f2, (byte) 0);
                        vi1Var.n0 = fi1Var;
                        fi1Var.setOnTouchListener(new p8((byte) 25));
                        vi1Var.o0 = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        vi1Var.p0 = ofFloat;
                        ofFloat.addUpdateListener(new gi1(vi1Var, b2));
                        vi1Var.p0.addListener(new b91((Object) vi1Var, (byte) 6));
                        vi1Var.p0.setDuration(400L);
                        vi1Var.p0.setInterpolator(vt3.e);
                        vi1Var.p0.start();
                        frameLayout.addView(vi1Var.n0, new ViewGroup.LayoutParams(-1, -1));
                        gm.c3(new ai1(vi1Var, b2));
                        break;
                    }
                } else if (vi1Var.b >= vi1Var.Z0() && vi1Var.U0()) {
                    vi1Var.c1();
                    break;
                } else {
                    vi1Var.finishFragment();
                    break;
                }
                break;
            case 22:
                fj1 fj1Var = (fj1) obj;
                long j = fj1Var.k0;
                wi1 wi1Var = fj1Var.x0;
                if (i != -1) {
                    if (i == 1) {
                        int i6 = fj1Var.j0;
                        if (i6 != 0) {
                            if (i6 == 1) {
                                if (fj1Var.c0) {
                                    jac jacVar = fj1Var.v0;
                                    if (jacVar != null) {
                                        jacVar.a(fj1Var, Long.valueOf(j));
                                    }
                                } else if (fj1Var.y.length() == 0) {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(fj1Var.getParentActivity());
                                    String M0 = jb6.M0(2131752258, null);
                                    he heVar2 = alertDialog$Builder2.a;
                                    heVar2.S = M0;
                                    heVar2.U = jb6.M0(2131752259, null);
                                    alertDialog$Builder2.j(jb6.M0(2131751978, null), null);
                                    fj1Var.showDialog(heVar2);
                                    break;
                                } else if (!fj1Var.b0) {
                                    Vibrator vibrator = (Vibrator) fj1Var.getParentActivity().getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                    }
                                    gm.z3(fj1Var.W);
                                    break;
                                } else {
                                    gm.d3(wi1Var, 200L);
                                    i2 = ((d) fj1Var).currentAccount;
                                    oc7 r1 = oc7.r1(i2);
                                    long j2 = fj1Var.k0;
                                    String str = fj1Var.Z;
                                    Runnable runnable = new Runnable(this) { // from class: bj1
                                        public final /* synthetic */ r8 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b4 = b2;
                                            r8 r8Var = this.b;
                                            switch (b4) {
                                                case 0:
                                                    fj1 fj1Var2 = (fj1) r8Var.b;
                                                    fj1Var2.m0(false);
                                                    jac jacVar2 = fj1Var2.v0;
                                                    if (jacVar2 != null) {
                                                        jacVar2.a(fj1Var2, Long.valueOf(fj1Var2.k0));
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    fj1 fj1Var3 = (fj1) r8Var.b;
                                                    fj1Var3.m0(false);
                                                    jac jacVar3 = fj1Var3.v0;
                                                    if (jacVar3 != null) {
                                                        jacVar3.a(fj1Var3, Long.valueOf(fj1Var3.k0));
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    };
                                    Runnable runnable2 = new Runnable(this) { // from class: bj1
                                        public final /* synthetic */ r8 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b4 = b3;
                                            r8 r8Var = this.b;
                                            switch (b4) {
                                                case 0:
                                                    fj1 fj1Var2 = (fj1) r8Var.b;
                                                    fj1Var2.m0(false);
                                                    jac jacVar2 = fj1Var2.v0;
                                                    if (jacVar2 != null) {
                                                        jacVar2.a(fj1Var2, Long.valueOf(fj1Var2.k0));
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    fj1 fj1Var3 = (fj1) r8Var.b;
                                                    fj1Var3.m0(false);
                                                    jac jacVar3 = fj1Var3.v0;
                                                    if (jacVar3 != null) {
                                                        jacVar3.a(fj1Var3, Long.valueOf(fj1Var3.k0));
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    };
                                    TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                                    tL_channels_updateUsername.channel = r1.g1(j2);
                                    tL_channels_updateUsername.username = str;
                                    r1.getConnectionsManager().sendRequest(tL_channels_updateUsername, new s97(r1, j2, str, runnable, fj1Var, tL_channels_updateUsername, runnable2), 64);
                                }
                                if (fj1Var.v0 == null) {
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("step", 2);
                                    bundle.putLong("chatId", j);
                                    bundle.putInt("chatType", 2);
                                    fj1Var.presentFragment(new oc5(bundle), true);
                                    break;
                                }
                            }
                        } else if (fj1Var.getParentActivity() != null) {
                            if (!fj1Var.t0) {
                                if (fj1Var.d.a.length() != 0) {
                                    fj1Var.t0 = true;
                                    gm.d3(wi1Var, 200L);
                                    if (!fj1Var.x.g()) {
                                        i3 = ((d) fj1Var).currentAccount;
                                        fj1Var.u0 = Integer.valueOf(oc7.r1(i3).Q(fj1Var.d.getText().toString(), new ArrayList(), fj1Var.y.getText().toString(), 2, false, null, null, -1, fj1Var));
                                        break;
                                    } else {
                                        fj1Var.s0 = true;
                                        break;
                                    }
                                } else {
                                    Vibrator vibrator2 = (Vibrator) fj1Var.getParentActivity().getSystemService("vibrator");
                                    if (vibrator2 != null) {
                                        vibrator2.vibrate(200L);
                                    }
                                    gm.z3(fj1Var.d);
                                    break;
                                }
                            } else {
                                fj1Var.k0();
                                break;
                            }
                        }
                    }
                } else if (!fj1Var.t0) {
                    fj1Var.finishFragment();
                    break;
                } else {
                    fj1Var.k0();
                    break;
                }
                break;
            case 23:
                i22 i22Var = (i22) obj;
                a22 a22Var = i22Var.v2;
                if (i != -1) {
                    a22Var.w(i);
                    break;
                } else if (!a22Var.k()) {
                    i22Var.dismiss();
                    break;
                }
                break;
            case 24:
                n92 n92Var = (n92) obj;
                if (i == -1 && !n92Var.d0(true)) {
                    n92Var.finishFragment();
                    break;
                }
                break;
            case 25:
                ba2 ba2Var = (ba2) obj;
                if (i != -1) {
                    if (i == 1) {
                        ba2Var.o0();
                        break;
                    }
                } else if (ba2Var.c0(true)) {
                    ba2Var.finishFragment();
                    break;
                }
                break;
            case 26:
                if (i == -1) {
                    ((ib2) obj).finishFragment();
                    break;
                }
                break;
            case 27:
                if (i == -1) {
                    ((zd2) obj).finishFragment();
                    break;
                }
                break;
            case 28:
                ke2 ke2Var = (ke2) obj;
                if (i != -1) {
                    if (i == 1) {
                        ke2Var.o0(true);
                        break;
                    }
                } else if (ke2Var.c0(true)) {
                    ke2Var.finishFragment();
                    break;
                }
                break;
            default:
                wg2 wg2Var = (wg2) obj;
                if (i != -1) {
                    if (i == 1) {
                        wg2Var.y0();
                        break;
                    }
                } else if (wg2Var.h0(true)) {
                    wg2Var.finishFragment();
                    break;
                }
                break;
        }
    }
}

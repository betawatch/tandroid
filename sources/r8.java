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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
        k27 k27Var;
        a aVar;
        a aVar2;
        pha phaVar;
        pha phaVar2;
        int i2;
        int i3;
        byte b = this.a;
        byte b2 = 4;
        final byte b3 = 0;
        final byte b4 = 1;
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
                    ((cs) obj).finishFragment();
                    break;
                }
                break;
            case 2:
                if (i == -1) {
                    ((hs) obj).finishFragment();
                    break;
                }
                break;
            case 3:
                i20 i20Var = (i20) obj;
                if (i != -1) {
                    i20Var.J0(i);
                    break;
                } else {
                    i20Var.dismiss();
                    break;
                }
            case 4:
                if (i == -1) {
                    ((vl9) obj).finishFragment();
                    break;
                }
                break;
            case 5:
                if (i == -1) {
                    ((v60) obj).finishFragment();
                    break;
                }
                break;
            case 6:
                bd0 bd0Var = (bd0) obj;
                if (i != -1) {
                    if (i == 1) {
                        bd0Var.b0();
                        break;
                    }
                } else if (bd0Var.onBackPressed(true)) {
                    bd0Var.finishFragment();
                    break;
                }
                break;
            case 7:
                dm0 dm0Var = (dm0) obj;
                HashSet hashSet = dm0Var.y;
                if (i != -1) {
                    if (i != R.id.menu_delete) {
                        if (i == R.id.menu_link) {
                            dm0Var.g0();
                            break;
                        }
                    } else {
                        HashSet hashSet2 = new HashSet();
                        ArrayList arrayList = new ArrayList();
                        HashSet hashSet3 = new HashSet();
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            int intValue = ((Integer) it.next()).intValue();
                            ArrayList arrayList2 = dm0Var.e.a;
                            int size = arrayList2.size();
                            int i4 = 0;
                            while (true) {
                                if (i4 < size) {
                                    Object obj2 = arrayList2.get(i4);
                                    i4++;
                                    k27Var = (k27) obj2;
                                    if (k27Var == null || k27Var.e1() != intValue) {
                                    }
                                } else {
                                    k27Var = null;
                                }
                            }
                            cb cbVar = dm0Var.f;
                            if (cbVar != null && k27Var == null) {
                                ArrayList arrayList3 = cbVar.a;
                                int size2 = arrayList3.size();
                                int i5 = 0;
                                while (true) {
                                    if (i5 < size2) {
                                        Object obj3 = arrayList3.get(i5);
                                        i5++;
                                        k27 k27Var2 = (k27) obj3;
                                        if (k27Var2 != null && k27Var2.e1() == intValue) {
                                            k27Var = k27Var2;
                                        }
                                    }
                                }
                            }
                            if (k27Var != null) {
                                arrayList.add(k27Var);
                                hashSet3.add(Integer.valueOf(k27Var.e1()));
                                hashSet2.add(eb.a(k27Var));
                            }
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, dm0Var.getResourceProvider(), dm0Var.getParentActivity());
                        String G = k96.G(hashSet3.size(), "DeleteOptionsTitle", new Object[0]);
                        hd hdVar = alertDialog$Builder.a;
                        hdVar.S = G;
                        hdVar.U = k96.N0(hashSet3.size() == 1 ? "AreYouSureUnsaveSingleMessage" : "AreYouSureUnsaveFewMessages");
                        alertDialog$Builder.j(k96.M0(2131751586, null), new o(dm0Var, hashSet3, (byte) 18));
                        alertDialog$Builder.g(k96.M0(2131752577, null), null);
                        alertDialog$Builder.c(-1);
                        alertDialog$Builder.o();
                        break;
                    }
                } else {
                    aVar = ((d) dm0Var).actionBar;
                    if (!aVar.y()) {
                        dm0Var.finishFragment();
                        break;
                    } else {
                        aVar2 = ((d) dm0Var).actionBar;
                        aVar2.x();
                        hashSet.clear();
                        gl.d0(dm0Var.a, new bm0(b3));
                        break;
                    }
                }
                break;
            case 8:
                if (i == -1) {
                    ((vo0) obj).finishFragment();
                    break;
                }
                break;
            case 9:
                if (i == -1) {
                    ((ss0) obj).finishFragment();
                    break;
                }
                break;
            case 10:
                if (i == -1) {
                    ((fy0) obj).dismiss();
                    break;
                }
                break;
            case 11:
                y31 y31Var = (y31) obj;
                if (i != -1) {
                    if (i == 1) {
                        y31Var.j0();
                        break;
                    }
                } else if (y31Var.onBackPressed(true)) {
                    y31Var.finishFragment();
                    break;
                }
                break;
            case 12:
                if (i == -1) {
                    ((v51) obj).finishFragment();
                    break;
                }
                break;
            case 13:
                r61 r61Var = (r61) obj;
                if (i != -1) {
                    if (i != 1) {
                        if (i != 3) {
                            if (i == 4) {
                                r61Var.g0(true);
                                break;
                            }
                        } else {
                            r61Var.g0(false);
                            break;
                        }
                    } else {
                        r61Var.h0();
                        break;
                    }
                } else {
                    phaVar = ((d) r61Var).simpleActionBar;
                    if (!phaVar.x()) {
                        r61Var.finishFragment();
                        break;
                    } else {
                        v61 v61Var = r61Var.e0;
                        if (v61Var != null) {
                            v61Var.d();
                        }
                        d61 d61Var = r61Var.N;
                        if (d61Var != null) {
                            d61Var.f(false);
                            r61Var.N.e();
                            break;
                        }
                    }
                }
                break;
            case 14:
                b81 b81Var = (b81) obj;
                if (i == -1) {
                    if (b81Var.Q != 0 || b81Var.R != 0 || b81Var.H) {
                        b81Var.H = false;
                        b81Var.Q = 0;
                        b81Var.R = 0;
                        b81Var.A0();
                        b81Var.r0();
                        break;
                    } else {
                        b81Var.finishFragment();
                        break;
                    }
                }
                break;
            case 15:
                z81 z81Var = (z81) obj;
                if (i != -1) {
                    if (i != 2) {
                        if (i == 3) {
                            z81Var.m0(true);
                            break;
                        }
                    } else {
                        z81Var.m0(false);
                        break;
                    }
                } else {
                    phaVar2 = ((d) z81Var).simpleActionBar;
                    if (!phaVar2.x()) {
                        z81Var.finishFragment();
                        break;
                    } else {
                        z81Var.d0(true);
                        break;
                    }
                }
                break;
            case 16:
                if (i == -1) {
                    ((da1) obj).finishFragment();
                    break;
                }
                break;
            case 17:
                zd1 zd1Var = (zd1) obj;
                if (i != -1) {
                    if (i == 1 && zd1Var.a.getText().length() != 0) {
                        zd1Var.Y();
                        zd1Var.finishFragment();
                        break;
                    }
                } else {
                    zd1Var.finishFragment();
                    break;
                }
                break;
            case 18:
                me1 me1Var = (me1) obj;
                if (i != -1) {
                    if (i == 1) {
                        me1Var.k0();
                        me1Var.j0();
                        break;
                    }
                } else {
                    me1Var.finishFragment();
                    break;
                }
                break;
            case 19:
                if (i == -1) {
                    ((nf1) obj).finishFragment();
                    break;
                }
                break;
            case 20:
                nh1 nh1Var = (nh1) obj;
                if (i != -1) {
                    if (i == 1) {
                        FrameLayout frameLayout = (FrameLayout) nh1Var.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        nh1Var.M.setAlpha(0.0f);
                        frameLayout.draw(canvas);
                        nh1Var.M.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        nh1Var.M.getLocationInWindow(iArr);
                        float f = iArr[0];
                        float f2 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + gl.n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        xg1 xg1Var = new xg1(nh1Var, nh1Var.getParentActivity(), canvas, (nh1Var.M.getMeasuredWidth() / 2.0f) + f, (nh1Var.M.getMeasuredHeight() / 2.0f) + f2, max, paint, createBitmap, paint2, f, f2, (byte) 0);
                        nh1Var.n0 = xg1Var;
                        xg1Var.setOnTouchListener(new p8((byte) 25));
                        nh1Var.o0 = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        nh1Var.p0 = ofFloat;
                        ofFloat.addUpdateListener(new yg1(nh1Var, b3));
                        nh1Var.p0.addListener(new bb1(nh1Var, b2));
                        nh1Var.p0.setDuration(400L);
                        nh1Var.p0.setInterpolator(ls3.e);
                        nh1Var.p0.start();
                        frameLayout.addView(nh1Var.n0, new ViewGroup.LayoutParams(-1, -1));
                        gl.d3(new sg1(nh1Var, b3));
                        break;
                    }
                } else if (nh1Var.b >= nh1Var.Y0() && nh1Var.T0()) {
                    nh1Var.b1();
                    break;
                } else {
                    nh1Var.finishFragment();
                    break;
                }
                break;
            case 21:
                yh1 yh1Var = (yh1) obj;
                long j = yh1Var.k0;
                oh1 oh1Var = yh1Var.x0;
                if (i != -1) {
                    if (i == 1) {
                        int i6 = yh1Var.j0;
                        if (i6 != 0) {
                            if (i6 == 1) {
                                if (yh1Var.c0) {
                                    i8c i8cVar = yh1Var.v0;
                                    if (i8cVar != null) {
                                        i8cVar.a(yh1Var, Long.valueOf(j));
                                    }
                                } else if (yh1Var.y.length() == 0) {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(yh1Var.getParentActivity());
                                    String M0 = k96.M0(2131752304, null);
                                    hd hdVar2 = alertDialog$Builder2.a;
                                    hdVar2.S = M0;
                                    hdVar2.U = k96.M0(2131752305, null);
                                    alertDialog$Builder2.j(k96.M0(2131752029, null), null);
                                    yh1Var.showDialog(hdVar2);
                                    break;
                                } else if (!yh1Var.b0) {
                                    Vibrator vibrator = (Vibrator) yh1Var.getParentActivity().getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                    }
                                    gl.A3(yh1Var.W);
                                    break;
                                } else {
                                    gl.e3(oh1Var, 200L);
                                    i2 = ((d) yh1Var).currentAccount;
                                    na7 q1 = na7.q1(i2);
                                    long j2 = yh1Var.k0;
                                    String str = yh1Var.Z;
                                    Runnable runnable = new Runnable(this) { // from class: uh1
                                        public final /* synthetic */ r8 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b5 = b3;
                                            r8 r8Var = this.b;
                                            switch (b5) {
                                                case 0:
                                                    yh1 yh1Var2 = (yh1) r8Var.b;
                                                    yh1Var2.l0(false);
                                                    i8c i8cVar2 = yh1Var2.v0;
                                                    if (i8cVar2 != null) {
                                                        i8cVar2.a(yh1Var2, Long.valueOf(yh1Var2.k0));
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    yh1 yh1Var3 = (yh1) r8Var.b;
                                                    yh1Var3.l0(false);
                                                    i8c i8cVar3 = yh1Var3.v0;
                                                    if (i8cVar3 != null) {
                                                        i8cVar3.a(yh1Var3, Long.valueOf(yh1Var3.k0));
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    };
                                    Runnable runnable2 = new Runnable(this) { // from class: uh1
                                        public final /* synthetic */ r8 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b5 = b4;
                                            r8 r8Var = this.b;
                                            switch (b5) {
                                                case 0:
                                                    yh1 yh1Var2 = (yh1) r8Var.b;
                                                    yh1Var2.l0(false);
                                                    i8c i8cVar2 = yh1Var2.v0;
                                                    if (i8cVar2 != null) {
                                                        i8cVar2.a(yh1Var2, Long.valueOf(yh1Var2.k0));
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    yh1 yh1Var3 = (yh1) r8Var.b;
                                                    yh1Var3.l0(false);
                                                    i8c i8cVar3 = yh1Var3.v0;
                                                    if (i8cVar3 != null) {
                                                        i8cVar3.a(yh1Var3, Long.valueOf(yh1Var3.k0));
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    };
                                    TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                                    tL_channels_updateUsername.channel = q1.f1(j2);
                                    tL_channels_updateUsername.username = str;
                                    q1.getConnectionsManager().sendRequest(tL_channels_updateUsername, new p77(q1, j2, str, runnable, yh1Var, tL_channels_updateUsername, runnable2), 64);
                                }
                                if (yh1Var.v0 == null) {
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("step", 2);
                                    bundle.putLong("chatId", j);
                                    bundle.putInt("chatType", 2);
                                    yh1Var.presentFragment(new qa5(bundle), true);
                                    break;
                                }
                            }
                        } else if (yh1Var.getParentActivity() != null) {
                            if (!yh1Var.t0) {
                                if (yh1Var.d.a.length() != 0) {
                                    yh1Var.t0 = true;
                                    gl.e3(oh1Var, 200L);
                                    if (!yh1Var.x.g()) {
                                        i3 = ((d) yh1Var).currentAccount;
                                        yh1Var.u0 = Integer.valueOf(na7.q1(i3).Q(yh1Var.d.getText().toString(), new ArrayList(), yh1Var.y.getText().toString(), 2, false, null, null, -1, yh1Var));
                                        break;
                                    } else {
                                        yh1Var.s0 = true;
                                        break;
                                    }
                                } else {
                                    Vibrator vibrator2 = (Vibrator) yh1Var.getParentActivity().getSystemService("vibrator");
                                    if (vibrator2 != null) {
                                        vibrator2.vibrate(200L);
                                    }
                                    gl.A3(yh1Var.d);
                                    break;
                                }
                            } else {
                                yh1Var.j0();
                                break;
                            }
                        }
                    }
                } else if (!yh1Var.t0) {
                    yh1Var.finishFragment();
                    break;
                } else {
                    yh1Var.j0();
                    break;
                }
                break;
            case 22:
                x02 x02Var = (x02) obj;
                p02 p02Var = x02Var.v2;
                if (i != -1) {
                    p02Var.x(i);
                    break;
                } else if (!p02Var.k()) {
                    x02Var.dismiss();
                    break;
                }
                break;
            case 23:
                c82 c82Var = (c82) obj;
                if (i == -1 && !c82Var.c0(true)) {
                    c82Var.finishFragment();
                    break;
                }
                break;
            case 24:
                p82 p82Var = (p82) obj;
                if (i != -1) {
                    if (i == 1) {
                        p82Var.n0();
                        break;
                    }
                } else if (p82Var.b0(true)) {
                    p82Var.finishFragment();
                    break;
                }
                break;
            case 25:
                if (i == -1) {
                    ((x92) obj).finishFragment();
                    break;
                }
                break;
            case 26:
                if (i == -1) {
                    ((oc2) obj).finishFragment();
                    break;
                }
                break;
            case 27:
                zc2 zc2Var = (zc2) obj;
                if (i != -1) {
                    if (i == 1) {
                        zc2Var.n0(true);
                        break;
                    }
                } else if (zc2Var.b0(true)) {
                    zc2Var.finishFragment();
                    break;
                }
                break;
            case 28:
                kf2 kf2Var = (kf2) obj;
                if (i != -1) {
                    if (i == 1) {
                        kf2Var.x0();
                        break;
                    }
                } else if (kf2Var.g0(true)) {
                    kf2Var.finishFragment();
                    break;
                }
                break;
            default:
                uf2 uf2Var = (uf2) obj;
                if (i != -1) {
                    if (i == 1) {
                        uf2Var.e0();
                        break;
                    }
                } else if (uf2Var.onBackPressed(true)) {
                    uf2Var.finishFragment();
                    break;
                }
                break;
        }
    }
}

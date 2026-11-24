// default package

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zf7 implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zf7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:197:0x0405, code lost:
    
        if (android.text.TextUtils.isEmpty(r0.L1.y) != false) goto L179;
     */
    @Override // p8c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        float height;
        ArrayList<TLRPC.Document> arrayList;
        byte b = this.a;
        int i = 2;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                gg7 gg7Var = (gg7) obj2;
                gg7Var.e2 = (String) obj;
                bg7 bg7Var = gg7Var.o2;
                gl.r(bg7Var);
                gl.e3(bg7Var, 100L);
                break;
            case 1:
                dh7 dh7Var = (dh7) obj2;
                View view = (View) obj;
                va vaVar = dh7Var.b;
                if (view instanceof ch7) {
                    vaVar.getClass();
                    int R = RecyclerView.R(view);
                    c4c G = vaVar.g3.G(R);
                    if (G != null) {
                        ch7 ch7Var = (ch7) view;
                        ch7Var.setPosition(dh7Var.b(R));
                        ch7Var.b(dh7Var.f == G.d, true);
                        boolean contains = dh7Var.e.contains(Integer.valueOf(G.d));
                        if (ch7Var.h != contains) {
                            ch7Var.h = contains;
                            ch7Var.invalidate();
                        }
                        view.setPressed(false);
                        break;
                    }
                }
                break;
            case 2:
                va vaVar2 = (va) obj2;
                View view2 = (View) obj;
                if (view2 instanceof ch7) {
                    p6b p6bVar = (p6b) vaVar2.o3;
                    p6bVar.b.getClass();
                    ((ch7) view2).setPosition(p6bVar.b(RecyclerView.R(view2)));
                    view2.setPressed(false);
                    break;
                }
                break;
            case 3:
                jj7 jj7Var = (jj7) obj2;
                if (((Boolean) obj).booleanValue()) {
                    jj7Var.D0();
                    break;
                }
                break;
            case 4:
                ((View) obj2).invalidate();
                break;
            case 5:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    vp7.s(2131749596, tL_starGiftUnique);
                    break;
                }
                break;
            case 6:
                ((u41) obj2).setLoading(((Boolean) obj).booleanValue());
                break;
            case 7:
                x6b x6bVar = (x6b) ((wt7) obj2);
                t7b t7bVar = x6bVar.u2;
                t7bVar.Y0.p((k27) obj);
                f4b f4bVar = t7bVar.L1;
                if (f4bVar != null && t7bVar.P1 != 1) {
                    boolean isEmpty = TextUtils.isEmpty(f4bVar.y);
                    boolean z = !isEmpty;
                    ((xb8) t7bVar.k1.c).a(!t7bVar.Y0.j(), false);
                    t7bVar.k1.setVisibility(0);
                    t7bVar.k1.animate().alpha(isEmpty ? 0.0f : 1.0f).withEndAction(new k08((byte) 21, (Object) x6bVar, z)).start();
                }
                if (t7bVar.B0.i()) {
                    ArrayList arrayList2 = t7bVar.B0.h;
                    int size = arrayList2.size();
                    while (true) {
                        if (r7 < size) {
                            Object obj3 = arrayList2.get(r7);
                            r7++;
                            f4b f4bVar2 = ((pk2) obj3).n;
                            if (f4bVar2 != null && f4bVar2.K) {
                                break;
                            }
                        }
                    }
                }
                i = -1;
                t7bVar.k0(i, true, true);
                break;
            case 8:
                yv7 yv7Var = (yv7) obj2;
                Integer num = (Integer) obj;
                FrameLayout frameLayout = yv7Var.h;
                if (yv7Var.getContext() != null) {
                    r7 = yv7Var.getContext().getResources().getConfiguration().orientation == 2 ? 1 : 0;
                    int intValue = num.intValue() - gl.n;
                    if (gba.q == 1) {
                        ViewPropertyAnimator animate = frameLayout.animate();
                        if (intValue <= gl.L(20.0f)) {
                            height = 0.0f;
                        } else {
                            height = (((yv7Var.getHeight() - intValue) / 2.0f) - (frameLayout.getHeight() / (r7 != 0 ? 1.0f : 2.0f))) - frameLayout.getTop();
                        }
                        ViewPropertyAnimator duration = animate.translationY(height).setDuration(320L);
                        s33 s33Var = s33.h;
                        duration.setInterpolator(s33Var).start();
                        yv7Var.N.animate().alpha(intValue > gl.L(20.0f) ? 0.0f : 1.0f).setDuration(320L).setInterpolator(s33Var);
                        break;
                    }
                }
                break;
            case 9:
                t08 t08Var = (t08) obj2;
                View view3 = (View) obj;
                a18 a18Var = t08Var.q0;
                if (!(view3 instanceof w08)) {
                    if (!(view3 instanceof wgb)) {
                        if (!(view3 instanceof s08)) {
                            if (!(view3 instanceof ld5)) {
                                if (!(view3 instanceof g08)) {
                                    if (!(view3 instanceof z08)) {
                                        if (view3 instanceof r08) {
                                            ((r08) view3).updateColors();
                                            break;
                                        }
                                    } else {
                                        t08Var.l((z08) view3);
                                        break;
                                    }
                                } else {
                                    ((g08) view3).d.invalidate();
                                    break;
                                }
                            } else {
                                view3.setBackgroundColor(a18Var.getThemedColor(bkb.c6));
                                break;
                            }
                        } else {
                            view3.setBackgroundColor(a18Var.getThemedColor(bkb.c6));
                            ((s08) view3).updateColors();
                            break;
                        }
                    } else {
                        view3.setBackgroundColor(a18Var.getThemedColor(bkb.c6));
                        ((wgb) view3).updateColors();
                        break;
                    }
                } else {
                    view3.setBackgroundColor(a18Var.getThemedColor(bkb.c6));
                    ((w08) view3).updateColors();
                    break;
                }
                break;
            case 10:
                ((o08) obj2).b((Canvas) obj);
                break;
            case 11:
                ((r08) obj2).c.d();
                break;
            case 12:
                m8b m8bVar = (m8b) obj2;
                m8bVar.k1 = false;
                m8bVar.U();
                break;
            case 13:
                b48 b48Var = (b48) obj2;
                b48Var.E1.b(b48Var.H1, true, 0, ((Long) obj).longValue());
                b48Var.dismiss();
                break;
            case 14:
                jd8 jd8Var = (jd8) obj2;
                ld8 ld8Var = (ld8) obj;
                jd8Var.h = ld8Var;
                jd8Var.c.a(ld8Var, true);
                gl.e3(new w88(jd8Var, (byte) 13), 200L);
                break;
            case 15:
                ((vq1) obj2).E(((Integer) obj).intValue());
                break;
            case 16:
                uf8 uf8Var = (uf8) obj2;
                uf8Var.r = ((Integer) obj).intValue();
                View B1 = uf8Var.d.B1(4);
                if (B1 instanceof mhb) {
                    mhb mhbVar = (mhb) B1;
                    if (mhbVar.getFixedSize() <= 0 && uf8Var.r > 0) {
                        mhbVar.setText(uf8Var.Z());
                        uf8Var.Y(true);
                        break;
                    }
                }
                uf8Var.d.g3.O(true);
                uf8Var.Y(true);
                break;
            case 17:
                e4b e4bVar = (e4b) obj;
                kac kacVar = ((zi8) obj2).n;
                if (kacVar != null) {
                    kacVar.setHDRInfo(e4bVar);
                    break;
                }
                break;
            case 18:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                ArrayList arrayList3 = privacySettingsActivity.Q;
                arrayList3.clear();
                arrayList3.addAll((ArrayList) obj);
                privacySettingsActivity.E0(true);
                break;
            case 19:
                l46[] l46VarArr = (l46[]) obj2;
                Boolean bool = (Boolean) obj;
                RectF rectF = ProfileActivity.Z6;
                ViewPropertyAnimator scaleY = l46VarArr[0].animate().alpha(bool.booleanValue() ? 0.0f : 1.0f).scaleX(bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 0.8f : 1.0f);
                s33 s33Var2 = s33.h;
                ug8.t(scaleY, s33Var2, 600L);
                l46VarArr[1].animate().alpha(bool.booleanValue() ? 1.0f : 0.0f).scaleX(!bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 1.0f : 0.8f).setInterpolator(s33Var2).setDuration(600L).start();
                break;
            case 20:
                sv8 sv8Var = (sv8) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (sv8Var.E == null) {
                    if (tL_messages_stickerSet == null || tL_messages_stickerSet.documents == null) {
                        sv8Var.G = true;
                    } else {
                        sv8Var.E = tL_messages_stickerSet;
                    }
                    sv8Var.e();
                    break;
                }
                break;
            case 21:
                d dVar = (d) obj2;
                Long l = (Long) obj;
                if (!dVar.isFinished) {
                    if (l != null && l.longValue() != Long.MAX_VALUE) {
                        dVar.presentFragment(ProfileActivity.P2(l.longValue()), true);
                        break;
                    } else {
                        gl.d3(new am6((byte) 14));
                        break;
                    }
                }
                break;
            case 22:
                kw8 kw8Var = (kw8) obj2;
                TLRPC.TL_exportedContactToken tL_exportedContactToken = (TLRPC.TL_exportedContactToken) obj;
                vw8 vw8Var = kw8Var.b;
                if (!kw8Var.F && tL_exportedContactToken != null) {
                    kw8Var.r = tL_exportedContactToken;
                    kw8Var.s = 0L;
                    String str = tL_exportedContactToken.url;
                    String str2 = kw8Var.c.b;
                    if (!TextUtils.equals(vw8Var.f, str2) || vw8Var.h) {
                        vw8Var.f = str2;
                        vw8Var.h = false;
                        vw8Var.H5 = null;
                        vw8Var.I5 = 0;
                    }
                    if (!TextUtils.equals(vw8Var.d, str)) {
                        vw8Var.d = str;
                        Utilities.e.c(new gm3(str, new nw8(vw8Var, str, (byte) 0)));
                    }
                    vw8Var.setLinkExpires(tL_exportedContactToken.expires);
                    break;
                }
                break;
            case 23:
                vw8 vw8Var2 = (vw8) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet2 != null && (arrayList = tL_messages_stickerSet2.documents) != null && !arrayList.isEmpty()) {
                    vw8Var2.p8 = tL_messages_stickerSet2.documents.get(0);
                }
                vw8Var2.invalidate();
                break;
            case 24:
                kx8 kx8Var = (kx8) obj2;
                kx8Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("chatMode", 5);
                bundle.putLong("user_id", kx8Var.getUserConfig().e());
                bundle.putString("quick_reply", (String) obj);
                mu1 mu1Var = new mu1(bundle);
                mu1Var.Z9 = true;
                kx8Var.presentFragment(mu1Var);
                break;
            case 25:
                gl.t1((p32) obj2);
                gl.e3((Runnable) obj, 80L);
                break;
            case 26:
                vx8 vx8Var = (vx8) obj2;
                Bitmap bitmap = (Bitmap) obj;
                Matrix matrix = vx8Var.L;
                if (!vx8Var.U) {
                    vx8Var.J = bitmap;
                    Bitmap bitmap2 = vx8Var.J;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    vx8Var.K = new BitmapShader(bitmap2, tileMode, tileMode);
                    Paint paint = new Paint(2);
                    vx8Var.M = paint;
                    paint.setShader(vx8Var.K);
                    ColorMatrix colorMatrix = new ColorMatrix();
                    gl.i(colorMatrix, bkb.I.o() ? 0.08f : 1.25f);
                    gl.h(colorMatrix, bkb.I.o() ? 0.02f : -0.15f);
                    vx8Var.M.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    matrix.reset();
                    matrix.setScale(15.0f, 15.0f);
                    vx8Var.K.setLocalMatrix(matrix);
                    break;
                } else {
                    vx8Var.J.recycle();
                    break;
                }
            case 27:
                u19 u19Var = (u19) obj2;
                u19Var.V1.setLoading(false);
                ym0.j(u19Var.getContext(), (TLRPC.TL_error) obj);
                break;
            case 28:
                ((Boolean) obj).getClass();
                u99 u99Var = ((x99) obj2).d;
                if (u99Var != null) {
                    u99Var.run();
                    break;
                }
                break;
            default:
                ((hd9) obj2).Q.Q1((TL_iv.RichMessage) obj);
                break;
        }
    }
}

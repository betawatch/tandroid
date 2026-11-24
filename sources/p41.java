// default package

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class p41 implements h27, pdd {
    public static final u21 f = new u21();
    public boolean a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public p41(s84 s84Var, go4 go4Var, vqb vqbVar, fgf fgfVar, boolean z) {
        this.b = s84Var;
        this.c = go4Var;
        this.d = vqbVar;
        this.e = fgfVar;
        this.a = z;
    }

    public static void j(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }

    @Override // h27
    public final boolean a() {
        return true;
    }

    @Override // h27
    public final void b(bka bkaVar, r7 r7Var) {
        boolean z = bkaVar != null;
        this.a = z;
        ((FrameLayout) this.b).setVisibility(z ? 4 : 0);
    }

    @Override // h27
    public final boolean c(r7 r7Var, RectF rectF) {
        float L = gm.L(6.0f);
        rectF.set(L, L, ((FrameLayout) this.b).getWidth() - r3, ((FrameLayout) this.b).getHeight() - r3);
        return true;
    }

    @Override // h27
    public final boolean d() {
        return false;
    }

    @Override // pdd
    public final ArrayList e(gq5 gq5Var) {
        Bitmap createBitmap;
        if (((fpd) this.e) == null) {
            zzb();
        }
        if (((fpd) this.e) == null) {
            throw new dg7("Waiting for the image labeling module to be downloaded. Please wait.", 14);
        }
        Bitmap bitmap = gq5Var.a;
        ite.h(bitmap);
        int i = gq5Var.d;
        int i2 = gq5Var.b;
        int i3 = gq5Var.c;
        if (i == 0) {
            createBitmap = Bitmap.createBitmap(bitmap, 0, 0, i2, i3);
        } else {
            Matrix matrix = new Matrix();
            matrix.postRotate(i);
            createBitmap = Bitmap.createBitmap(bitmap, 0, 0, i2, i3, matrix, true);
        }
        try {
            fpd fpdVar = (fpd) this.e;
            ite.h(fpdVar);
            eq7 eq7Var = new eq7(createBitmap);
            Parcel R = fpdVar.R();
            int i4 = wid.a;
            R.writeStrongBinder(eq7Var);
            R.writeInt(1);
            int r = mve.r(R, 20293);
            mve.q(R, 2, 4);
            R.writeInt(-1);
            mve.s(R, r);
            Parcel T = fpdVar.T(R, 1);
            eee[] eeeVarArr = (eee[]) T.createTypedArray(eee.CREATOR);
            T.recycle();
            ArrayList arrayList = new ArrayList();
            for (eee eeeVar : eeeVarArr) {
                arrayList.add(new fm5(eeeVar.c, eeeVar.d, eeeVar.b, eeeVar.a));
            }
            return arrayList;
        } catch (RemoteException e) {
            throw new dg7("Failed to run legacy image labeler.", e);
        }
    }

    @Override // h27
    public final boolean f() {
        return true;
    }

    @Override // h27
    public final boolean g() {
        return true;
    }

    @Override // h27
    public final int getButtonsGlassBackgroundColor() {
        nm0 nm0Var = ((zb9) this.e).N;
        return nm0Var.a(nm0Var.e);
    }

    @Override // h27
    public final am0 getButtonsGlassColorProvider() {
        return ((zb9) this.e).N;
    }

    @Override // h27
    public final int getMenuAnchorTint() {
        return 0;
    }

    @Override // h27
    public final int getMenuDimAlpha() {
        return -1;
    }

    @Override // h27
    public final int getMenuExtraBelow() {
        return 0;
    }

    @Override // h27
    public final am0 getMenuGlassColorProvider() {
        return ((zb9) this.e).N;
    }

    @Override // h27
    public final View getMenuHostView() {
        return (FrameLayout) this.b;
    }

    @Override // h27
    public final int getMenuMaxHeight() {
        return 0;
    }

    @Override // h27
    public final ylb getMenuResourcesProvider() {
        ylb ylbVar;
        ylbVar = ((d) ((zb9) this.e)).resourceProvider;
        return ylbVar;
    }

    @Override // h27
    public final int getMenuRise() {
        return gm.L(8.0f);
    }

    @Override // h27
    public final View getMenuView() {
        return (ib9) this.c;
    }

    @Override // h27
    public final bka getOpenMenuOverlay() {
        if (this.a) {
            return (bka) this.d;
        }
        return null;
    }

    @Override // h27
    public final boolean h() {
        return false;
    }

    @Override // h27
    public final im0 i(bka bkaVar) {
        zb9 zb9Var = (zb9) this.e;
        im0 c = zb9Var.getBaseSimpleGlass().d.c(bkaVar, null, false);
        c.p(zb9Var.N);
        wi8.r(c, gm.L(23.0f), 6.0f);
        return c;
    }

    @Override // h27
    public final void setMenuGlassFrostedProgress(float f2) {
        lz4 lz4Var = ((zb9) this.e).getBaseSimpleGlass().e;
        if (lz4Var != null) {
            lz4Var.k(f2);
        }
    }

    @Override // pdd
    public final void zzb() {
        b8e jvdVar;
        String str = (String) this.d;
        Context context = (Context) this.b;
        Log.d("LegacyLabelDelegate", "Try to load legacy label module.");
        if (((fpd) this.e) == null) {
            try {
                IBinder b = nt3.c(context, nt3.b, str).b("com.google.android.gms.vision.label.ChimeraNativeImageLabelerCreator");
                int i = r0e.b;
                if (b == null) {
                    jvdVar = null;
                } else {
                    IInterface queryLocalInterface = b.queryLocalInterface("com.google.android.gms.vision.label.internal.client.INativeImageLabelerCreator");
                    jvdVar = queryLocalInterface instanceof b8e ? (b8e) queryLocalInterface : new jvd(b, "com.google.android.gms.vision.label.internal.client.INativeImageLabelerCreator", (byte) 7);
                }
                fpd Z = ((jvd) jvdVar).Z(new eq7(context), (toe) this.c);
                this.e = Z;
                if (Z != null || this.a) {
                    return;
                }
                Log.d("LegacyLabelDelegate", "Request ICA optional module download.");
                ws7.a(context);
                this.a = true;
            } catch (RemoteException e) {
                throw new dg7("Failed to create legacy image labeler.", e);
            } catch (kt3 e2) {
                if (str.equals("com.google.android.gms.vision.dynamite")) {
                    throw new dg7("Failed to load deprecated vision dynamite module.", e2);
                }
                if (this.a) {
                    return;
                }
                Log.d("LegacyLabelDelegate", "Request ICA optional module download.");
                ws7.a(context);
                this.a = true;
            }
        }
    }

    @Override // pdd
    public final void zzc() {
        fpd fpdVar = (fpd) this.e;
        if (fpdVar != null) {
            try {
                fpdVar.V(fpdVar.R(), 2);
            } catch (RemoteException e) {
                Log.e("LegacyLabelDelegate", "Failed to release legacy image labeler.", e);
            }
            this.e = null;
        }
    }
}

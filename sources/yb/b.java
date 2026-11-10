package yb;

import a8.v1;
import a8.w2;
import a8.x3;
import a8.y4;
import a8.y6;
import a8.z0;
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
import c8.xb;
import fh.g;
import java.util.ArrayList;
import org.telegram.messenger.camera.q;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.r0;
import org.telegram.ui.ActionBar.t4;
import pb.j;
import q6.m;
import zh.m3;
import zh.u2;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class b implements a, t4 {
    public boolean a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    @Override // org.telegram.ui.ActionBar.t4
    public boolean a() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public boolean b(r0 r0Var, RectF rectF) {
        float L = g0.L(6.0f);
        rectF.set(L, L, ((FrameLayout) this.b).getWidth() - r4, ((FrameLayout) this.b).getHeight() - r4);
        return true;
    }

    @Override // yb.a
    public ArrayList c(ub.a aVar) {
        Bitmap createBitmap;
        if (((z0) this.e) == null) {
            zzb();
        }
        if (((z0) this.e) == null) {
            throw new lb.a("Waiting for the image labeling module to be downloaded. Please wait.", 14);
        }
        int i7 = aVar.e;
        if (i7 != -1) {
            if (i7 == 17) {
                m.g(null);
                throw null;
            }
            if (i7 == 35) {
                m.g(null);
                throw null;
            }
            if (i7 != 842094169) {
                throw new lb.a("Unsupported image format", 13);
            }
            m.g(null);
            throw null;
        }
        Bitmap bitmap = aVar.a;
        m.g(bitmap);
        int i10 = aVar.d;
        int i11 = aVar.b;
        int i12 = aVar.c;
        if (i10 == 0) {
            createBitmap = Bitmap.createBitmap(bitmap, 0, 0, i11, i12);
        } else {
            Matrix matrix = new Matrix();
            matrix.postRotate(i10);
            createBitmap = Bitmap.createBitmap(bitmap, 0, 0, i11, i12, matrix, true);
        }
        try {
            z0 z0Var = (z0) this.e;
            m.g(z0Var);
            a7.b bVar = new a7.b(createBitmap);
            Parcel p12 = z0Var.p1();
            int i13 = a8.g0.a;
            p12.writeStrongBinder(bVar);
            p12.writeInt(1);
            int r10 = xb.r(p12, 20293);
            xb.q(p12, 2, 4);
            p12.writeInt(-1);
            xb.s(p12, r10);
            Parcel r12 = z0Var.r1(p12, 1);
            y4[] y4VarArr = (y4[]) r12.createTypedArray(y4.CREATOR);
            r12.recycle();
            ArrayList arrayList = new ArrayList();
            for (y4 y4Var : y4VarArr) {
                arrayList.add(new wb.a(y4Var.c, y4Var.d, y4Var.b, y4Var.a));
            }
            return arrayList;
        } catch (RemoteException e10) {
            throw new lb.a("Failed to run legacy image labeler.", e10);
        }
    }

    @Override // org.telegram.ui.ActionBar.t4
    public /* synthetic */ boolean d() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public boolean e() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public g f(j5 j5Var) {
        m3 m3Var = (m3) this.e;
        g c10 = m3Var.getBaseSimpleGlass().d.c(j5Var, null, false);
        c10.p(m3Var.M);
        q.p(c10, g0.L(23.0f), 6.0f);
        return c10;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public void g(j5 j5Var, r0 r0Var) {
        boolean z9 = j5Var != null;
        this.a = z9;
        ((FrameLayout) this.b).setVisibility(z9 ? 4 : 0);
    }

    @Override // org.telegram.ui.ActionBar.t4
    public int getButtonsGlassBackgroundColor() {
        gh.e eVar = ((m3) this.e).M;
        return eVar.a(eVar.e);
    }

    @Override // org.telegram.ui.ActionBar.t4
    public gh.a getButtonsGlassColorProvider() {
        return ((m3) this.e).M;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public gh.a getMenuGlassColorProvider() {
        return ((m3) this.e).M;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public View getMenuHostView() {
        return (FrameLayout) this.b;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public h6 getMenuResourcesProvider() {
        h6 h6Var;
        h6Var = ((f2) ((m3) this.e)).resourceProvider;
        return h6Var;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public int getMenuRise() {
        return g0.L(8.0f);
    }

    @Override // org.telegram.ui.ActionBar.t4
    public View getMenuView() {
        return (u2) this.c;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public j5 getOpenMenuOverlay() {
        if (this.a) {
            return (j5) this.d;
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public void setMenuGlassFrostedProgress(float f10) {
        ri.d dVar = ((m3) this.e).getBaseSimpleGlass().e;
        if (dVar != null) {
            dVar.k(f10);
        }
    }

    @Override // yb.a
    public void zzb() {
        x3 v1Var;
        String str = (String) this.d;
        Context context = (Context) this.b;
        Log.d("LegacyLabelDelegate", "Try to load legacy label module.");
        if (((z0) this.e) != null) {
            return;
        }
        try {
            IBinder b10 = b7.f.c(context, b7.f.b, str).b("com.google.android.gms.vision.label.ChimeraNativeImageLabelerCreator");
            int i7 = w2.b;
            if (b10 == null) {
                v1Var = null;
            } else {
                IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.vision.label.internal.client.INativeImageLabelerCreator");
                v1Var = queryLocalInterface instanceof x3 ? (x3) queryLocalInterface : new v1(b10, "com.google.android.gms.vision.label.internal.client.INativeImageLabelerCreator", 0);
            }
            z0 x12 = ((v1) v1Var).x1(new a7.b(context), (y6) this.c);
            this.e = x12;
            if (x12 != null || this.a) {
                return;
            }
            Log.d("LegacyLabelDelegate", "Request ICA optional module download.");
            j.b(context);
            this.a = true;
        } catch (RemoteException e10) {
            throw new lb.a("Failed to create legacy image labeler.", e10);
        } catch (b7.b e11) {
            if (str.equals("com.google.android.gms.vision.dynamite")) {
                throw new lb.a("Failed to load deprecated vision dynamite module.", e11);
            }
            if (this.a) {
                return;
            }
            Log.d("LegacyLabelDelegate", "Request ICA optional module download.");
            j.b(context);
            this.a = true;
        }
    }

    @Override // yb.a
    public void zzc() {
        z0 z0Var = (z0) this.e;
        if (z0Var != null) {
            try {
                z0Var.t1(z0Var.p1(), 2);
            } catch (RemoteException e10) {
                Log.e("LegacyLabelDelegate", "Failed to release legacy image labeler.", e10);
            }
            this.e = null;
        }
    }
}

// default package

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class wn4 implements js4, Continuation, dn7, rj5, fi4, ed {
    public final /* synthetic */ byte a;

    public /* synthetic */ wn4(ep epVar) {
        this.a = (byte) 6;
    }

    public static /* bridge */ /* synthetic */ BlendMode e(Object obj) {
        return (BlendMode) obj;
    }

    public static /* synthetic */ void f() {
        throw new AssertionError();
    }

    public static /* synthetic */ void g(int i, String str) {
        throw new IllegalArgumentException(str + i);
    }

    public static /* synthetic */ void h(Object obj, Object obj2) {
        throw new mbb("Fragment " + obj + obj2);
    }

    public static /* synthetic */ void i(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void j(String str) {
        throw new RuntimeException(str);
    }

    public static /* synthetic */ void k(String str, int i, Object obj, int i2) {
        throw new IndexOutOfBoundsException(str + i + obj + i2);
    }

    public static /* synthetic */ void n(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void p(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    @Override // dn7
    public final String c(int i) {
        switch (this.a) {
        }
        return String.format("%02d", Integer.valueOf(i));
    }

    @Override // rj5
    public final boolean d(int i, int i2, int i3, int i4, int i5) {
        switch (this.a) {
            case 10:
                return false;
            default:
                return i != 2 ? !(i2 == 65 && i3 == 80 && i4 == 73 && i5 == 67) : !(i2 == 80 && i3 == 73 && i4 == 67);
        }
    }

    @Override // js4
    public final Object m(Object obj) {
        switch (this.a) {
            case 4:
                xl6 xl6Var = sr4.k0;
                return 0;
            case 21:
                int L = gl.L(150.0f);
                Bitmap createBitmap = Bitmap.createBitmap(gl.L(200.0f), L, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawColor(bkb.w0(null, bkb.c6, false));
                Paint paint = new Paint(1);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                canvas.drawCircle(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f, L / 2.0f, paint);
                return createBitmap;
            case 22:
                Paint paint2 = new Paint(1);
                paint2.setColor(-14509328);
                int L2 = gl.L(150.0f);
                Bitmap createBitmap2 = Bitmap.createBitmap(L2, L2, Bitmap.Config.ARGB_8888);
                float f = L2 / 2.0f;
                new Canvas(createBitmap2).drawCircle(f, f, f, paint2);
                return createBitmap2;
            default:
                String str = LaunchActivity.C1;
                return new ah6();
        }
    }

    @Override // fi4
    public final boolean run() {
        String str = LaunchActivity.C1;
        return gba.r.length() > 0 && !gba.z;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        Bundle bundle = (Bundle) task.getResult(IOException.class);
        if (bundle == null) {
            k93.f("SERVICE_NOT_AVAILABLE");
            return null;
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            k93.f("INSTANCE_ID_RESET");
            return null;
        }
        if (string3 != null) {
            k93.f(string3);
            return null;
        }
        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
        k93.f("SERVICE_NOT_AVAILABLE");
        return null;
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        switch (this.a) {
            case 28:
                hdVar.dismiss();
                break;
            default:
                hdVar.dismiss();
                break;
        }
    }

    public /* synthetic */ wn4(byte b) {
        this.a = b;
    }
}

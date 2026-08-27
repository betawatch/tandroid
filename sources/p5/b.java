package p5;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.t;
import n5.k;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class b extends AsyncTask {
    public static final r5.b c = new r5.b("FetchBitmapTask", null);
    public final e a;
    public final af.h b;

    public b(Context context, int i10, int i11, af.h hVar) {
        e eVar;
        this.b = hVar;
        Context applicationContext = context.getApplicationContext();
        k kVar = new k(this);
        r5.b bVar = com.google.android.gms.internal.cast.e.a;
        try {
            com.google.android.gms.internal.cast.g b10 = com.google.android.gms.internal.cast.e.b(applicationContext.getApplicationContext());
            i6.b bVar2 = new i6.b(applicationContext.getApplicationContext());
            Parcel O0 = b10.O0(b10.M0(), 8);
            int readInt = O0.readInt();
            O0.recycle();
            eVar = readInt >= 233700000 ? b10.Y0(bVar2, new i6.b(this), kVar, i10, i11) : b10.X0(new i6.b(this), kVar, i10, i11);
        } catch (RemoteException e9) {
            e = e9;
            com.google.android.gms.internal.cast.e.a.a(e, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", com.google.android.gms.internal.cast.g.class.getSimpleName());
            eVar = null;
            this.a = eVar;
        } catch (n5.d e10) {
            e = e10;
            com.google.android.gms.internal.cast.e.a.a(e, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", com.google.android.gms.internal.cast.g.class.getSimpleName());
            eVar = null;
            this.a = eVar;
        }
        this.a = eVar;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        Uri uri;
        e eVar;
        Uri[] uriArr = (Uri[]) objArr;
        if (uriArr.length == 1 && (uri = uriArr[0]) != null && (eVar = this.a) != null) {
            try {
                c cVar = (c) eVar;
                Parcel M0 = cVar.M0();
                t.c(M0, uri);
                Parcel O0 = cVar.O0(M0, 1);
                Bitmap bitmap = (Bitmap) t.a(O0, Bitmap.CREATOR);
                O0.recycle();
                return bitmap;
            } catch (RemoteException e9) {
                c.a(e9, "Unable to call %s on %s.", "doFetch", e.class.getSimpleName());
            }
        }
        return null;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        af.h hVar = this.b;
        if (hVar != null) {
            a aVar = (a) hVar.e;
            if (aVar != null) {
                aVar.z0(bitmap);
            }
            hVar.d = null;
        }
    }
}

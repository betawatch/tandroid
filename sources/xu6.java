// default package

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.util.Log;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class xu6 extends AsyncTask {
    public final Bitmap a;
    public final Uri b;
    public int c;
    public long d;
    public final /* synthetic */ bv6 e;

    public xu6(bv6 bv6Var) {
        this.e = bv6Var;
        MediaDescriptionCompat mediaDescriptionCompat = bv6Var.m0;
        Bitmap bitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.e;
        if (bitmap != null && bitmap.isRecycled()) {
            Log.w("MediaRouteCtrlDialog", "Can't fetch the given art bitmap because it's already recycled.");
            bitmap = null;
        }
        this.a = bitmap;
        MediaDescriptionCompat mediaDescriptionCompat2 = bv6Var.m0;
        this.b = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.f : null;
    }

    public final BufferedInputStream a(Uri uri) {
        InputStream openInputStream;
        String lowerCase = uri.getScheme().toLowerCase();
        if ("android.resource".equals(lowerCase) || "content".equals(lowerCase) || "file".equals(lowerCase)) {
            openInputStream = this.e.s.getContentResolver().openInputStream(uri);
        } else {
            URLConnection openConnection = new URL(uri.toString()).openConnection();
            short s = bv6.G0;
            openConnection.setConnectTimeout(s);
            openConnection.setReadTimeout(s);
            openInputStream = openConnection.getInputStream();
        }
        if (openInputStream == null) {
            return null;
        }
        return new BufferedInputStream(openInputStream);
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x00a6: MOVE (r3 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:167), block:B:61:0x00a6 */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ed  */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doInBackground(Object[] objArr) {
        InputStream inputStream;
        BufferedInputStream bufferedInputStream;
        InputStream inputStream2 = null;
        Bitmap bitmap = this.a;
        if (bitmap == null) {
            Uri uri = this.b;
            try {
                if (uri != null) {
                    try {
                        bufferedInputStream = a(uri);
                        try {
                            try {
                                if (bufferedInputStream == null) {
                                    Log.w("MediaRouteCtrlDialog", "Unable to open: " + uri);
                                    if (bufferedInputStream == null) {
                                        return null;
                                    }
                                } else {
                                    BitmapFactory.Options options = new BitmapFactory.Options();
                                    options.inJustDecodeBounds = true;
                                    BitmapFactory.decodeStream(bufferedInputStream, null, options);
                                    if (options.outWidth != 0 && options.outHeight != 0) {
                                        try {
                                            bufferedInputStream.reset();
                                        } catch (IOException unused) {
                                            bufferedInputStream.close();
                                            bufferedInputStream = a(uri);
                                            if (bufferedInputStream == null) {
                                                Log.w("MediaRouteCtrlDialog", "Unable to open: " + uri);
                                                if (bufferedInputStream == null) {
                                                    return null;
                                                }
                                            }
                                        }
                                        options.inJustDecodeBounds = false;
                                        options.inSampleSize = Math.max(1, Integer.highestOneBit(options.outHeight / this.e.k(options.outWidth, options.outHeight)));
                                        if (!isCancelled()) {
                                            bitmap = BitmapFactory.decodeStream(bufferedInputStream, null, options);
                                            try {
                                                bufferedInputStream.close();
                                            } catch (IOException unused2) {
                                            }
                                        }
                                        bufferedInputStream.close();
                                        return null;
                                    }
                                }
                                bufferedInputStream.close();
                                return null;
                            } catch (IOException e) {
                                e = e;
                                Log.w("MediaRouteCtrlDialog", "Unable to open: " + uri, e);
                                if (bufferedInputStream != null) {
                                    try {
                                        bufferedInputStream.close();
                                    } catch (IOException unused3) {
                                    }
                                }
                                bitmap = null;
                                if (bitmap == null) {
                                }
                                if (bitmap != null) {
                                    ux7 ux7Var = new ux7(bitmap);
                                    ux7Var.a = (byte) 1;
                                    ArrayList arrayList = (ArrayList) ux7Var.a().b;
                                    this.c = DesugarCollections.unmodifiableList(arrayList).isEmpty() ? 0 : ((vx7) DesugarCollections.unmodifiableList(arrayList).get(0)).d;
                                }
                                return bitmap;
                            }
                        } catch (IOException unused4) {
                            return null;
                        }
                    } catch (IOException e2) {
                        e = e2;
                        bufferedInputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (IOException unused5) {
                            }
                        }
                        throw th;
                    }
                }
                bitmap = null;
            } catch (Throwable th2) {
                th = th2;
                inputStream2 = inputStream;
            }
        }
        if (bitmap == null && bitmap.isRecycled()) {
            Log.w("MediaRouteCtrlDialog", "Can't use recycled bitmap: " + bitmap);
            return null;
        }
        if (bitmap != null && bitmap.getWidth() < bitmap.getHeight()) {
            ux7 ux7Var2 = new ux7(bitmap);
            ux7Var2.a = (byte) 1;
            ArrayList arrayList2 = (ArrayList) ux7Var2.a().b;
            this.c = DesugarCollections.unmodifiableList(arrayList2).isEmpty() ? 0 : ((vx7) DesugarCollections.unmodifiableList(arrayList2).get(0)).d;
        }
        return bitmap;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        bv6 bv6Var = this.e;
        bv6Var.n0 = null;
        Bitmap bitmap2 = bv6Var.o0;
        Bitmap bitmap3 = this.a;
        boolean equals = Objects.equals(bitmap2, bitmap3);
        Uri uri = this.b;
        if (equals && Objects.equals(bv6Var.p0, uri)) {
            return;
        }
        bv6Var.o0 = bitmap3;
        bv6Var.r0 = bitmap;
        bv6Var.p0 = uri;
        bv6Var.s0 = this.c;
        bv6Var.q0 = true;
        bv6Var.q(SystemClock.uptimeMillis() - this.d > 120);
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        this.d = SystemClock.uptimeMillis();
        bv6 bv6Var = this.e;
        bv6Var.q0 = false;
        bv6Var.r0 = null;
        bv6Var.s0 = 0;
    }
}

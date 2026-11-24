// default package

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Choreographer;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class z52 implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ z52(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0490  */
    @Override // qac
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        int i;
        int i2;
        k1b[] k1bVarArr;
        float f;
        Bitmap bitmap;
        byte b;
        float f2;
        float f3;
        float f4;
        float f5;
        byte b2 = 0;
        switch (this.a) {
            case 0:
                b62 b62Var = (b62) this.c;
                File file = (File) this.d;
                boolean z = this.b;
                Integer num = (Integer) obj;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = b62Var.e;
                chatAttachAlertPhotoLayout.t0 = false;
                if (file != null && !chatAttachAlertPhotoLayout.b.P1) {
                    ChatAttachAlertPhotoLayout.r1 = false;
                    try {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(new File(file.getAbsolutePath()).getAbsolutePath(), options);
                        i = options.outWidth;
                        try {
                            i2 = options.outHeight;
                        } catch (Exception unused) {
                            i2 = 0;
                            int i3 = i;
                            int i4 = ChatAttachAlertPhotoLayout.v1;
                            ChatAttachAlertPhotoLayout.v1 = i4 - 1;
                            jo6 jo6Var = new jo6(i4, file.getAbsolutePath(), num.intValue() != -1 ? 0 : num.intValue(), false, i3, i2);
                            jo6Var.L = true;
                            chatAttachAlertPhotoLayout.m0(jo6Var, z, false);
                            return;
                        }
                    } catch (Exception unused2) {
                        i = 0;
                    }
                    int i32 = i;
                    int i42 = ChatAttachAlertPhotoLayout.v1;
                    ChatAttachAlertPhotoLayout.v1 = i42 - 1;
                    jo6 jo6Var2 = new jo6(i42, file.getAbsolutePath(), num.intValue() != -1 ? 0 : num.intValue(), false, i32, i2);
                    jo6Var2.L = true;
                    chatAttachAlertPhotoLayout.m0(jo6Var2, z, false);
                }
                break;
            case 1:
                y24 y24Var = (y24) this.c;
                boolean z2 = this.b;
                Runnable runnable = (Runnable) this.d;
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = y24Var.r;
                z24 z24Var = y24Var.x;
                if (z24Var.N == y24Var.b) {
                    if (z2) {
                        int size = arrayList2.size();
                        arrayList2.clear();
                        z24Var.E = size == arrayList.size();
                    }
                    arrayList2.addAll(arrayList);
                    int size2 = arrayList.size();
                    int i5 = 0;
                    while (i5 < size2) {
                        Object obj2 = arrayList.get(i5);
                        i5++;
                        TLRPC.Document document = (TLRPC.Document) obj2;
                        y24Var.w.put(document.id, document);
                    }
                    y24Var.f.put(arrayList2, z24Var.O);
                    runnable.run();
                    break;
                }
                break;
            case 2:
                c cVar = (c) this.c;
                jac jacVar = (jac) this.d;
                boolean z3 = this.b;
                y25 y25Var = (y25) obj;
                if (y25Var == null) {
                    Exception exc = cVar.c.f;
                    String message = exc != null ? exc.getMessage() : null;
                    if (!"AUTH_CANCELED".equals(message)) {
                        c.m("getSecretPhrase: local phrase unavailable: " + message);
                        jacVar.a(null, (message == null || !message.startsWith("AUTH_")) ? "LOCAL_STORAGE_ERROR" : "WALLET_UNLOCK_FAILED");
                        break;
                    } else {
                        c.O("getSecretPhrase: unlock canceled");
                        if (z3) {
                            jacVar.a(null, "WALLET_SEND_CANCELLED");
                            break;
                        }
                    }
                } else {
                    jacVar.a(y25Var, null);
                    break;
                }
                break;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                boolean z4 = this.b;
                co6 co6Var = (co6) this.d;
                k1b k1bVar = (k1b) obj;
                Drawable[] drawableArr = PhotoViewer.d9;
                n1b n1bVar = photoViewer.o5;
                if (!n1bVar.E || (k1bVarArr = n1bVar.I) == null || k1bVarArr.length <= 0) {
                    photoViewer.s5.setCutOutState(true);
                    photoViewer.g2(false, true);
                } else {
                    jlb thanosEffect = photoViewer.o5.getThanosEffect();
                    n1b n1bVar2 = photoViewer.o5;
                    n1bVar2.M = true;
                    n1bVar2.F = k1bVar;
                    Bitmap n = photoViewer.B4.n();
                    int i6 = photoViewer.B4.V;
                    k1b k1bVar2 = n1bVar2.F;
                    Bitmap b3 = k1bVar2 == null ? n1bVar2.J : (!z4 || n == null) ? k1bVar2.b() : n1bVar2.e(n);
                    jo6 jo6Var3 = (jo6) photoViewer.f7.get(photoViewer.O4);
                    if (thanosEffect == null) {
                        Utilities.i.c(new w88(photoViewer, b3, b2));
                        photoViewer.o5.f();
                        photoViewer.f0.invalidate();
                        break;
                    } else {
                        n1b n1bVar3 = photoViewer.o5;
                        int i7 = photoViewer.B4.V;
                        n1bVar3.getClass();
                        String str = jo6Var3.i;
                        Bitmap decodeFile = str != null ? BitmapFactory.decodeFile(str) : n1bVar3.getSourceBitmap();
                        Bitmap decodeFile2 = BitmapFactory.decodeFile(jo6Var3.j);
                        int width = decodeFile.getWidth();
                        int height = decodeFile.getHeight();
                        Bitmap.Config config = Bitmap.Config.ARGB_8888;
                        Bitmap createBitmap = Bitmap.createBitmap(width, height, config);
                        Canvas canvas = new Canvas(createBitmap);
                        Paint paint = new Paint(3);
                        Paint paint2 = new Paint(3);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                        canvas.drawBitmap(decodeFile, 0.0f, 0.0f, paint2);
                        Rect rect = new Rect();
                        rect.set(0, 0, decodeFile.getWidth(), decodeFile.getHeight());
                        k1b k1bVar3 = n1bVar3.F;
                        if (k1bVar3 == null) {
                            k1b[] k1bVarArr2 = n1bVar3.I;
                            if (k1bVarArr2.length > 0) {
                                k1bVar3 = k1bVarArr2[0];
                            }
                        }
                        if (k1bVar3 == null) {
                            createBitmap = null;
                            f = 2.0f;
                            b = 2;
                        } else {
                            f = 2.0f;
                            if (k1bVar3.c == 0 || !jo6Var3.u) {
                                bitmap = decodeFile;
                                b = 2;
                                canvas.drawBitmap(k1bVar3.a(), (Rect) null, rect, paint);
                            } else {
                                Matrix matrix = new Matrix();
                                b = 2;
                                bitmap = decodeFile;
                                matrix.postRotate(k1bVar3.c, k1bVar3.a().getWidth() / 2.0f, k1bVar3.a().getHeight() / 2.0f);
                                if ((k1bVar3.c / 90) % 2 != 0) {
                                    float height2 = (k1bVar3.a().getHeight() - k1bVar3.a().getWidth()) / 2.0f;
                                    matrix.postTranslate(height2, -height2);
                                }
                                matrix.postScale(bitmap.getWidth() / k1bVar3.a().getHeight(), bitmap.getHeight() / k1bVar3.a().getWidth());
                                canvas.drawBitmap(k1bVar3.a(), matrix, paint);
                            }
                            if (decodeFile2 != null) {
                                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                                if (k1bVar3.c == 0 || jo6Var3.u) {
                                    canvas.drawBitmap(decodeFile2, (Rect) null, rect, paint);
                                } else {
                                    Matrix matrix2 = new Matrix();
                                    matrix2.postRotate(-k1bVar3.c, decodeFile2.getWidth() / 2.0f, decodeFile2.getHeight() / 2.0f);
                                    if ((k1bVar3.c / 90) % 2 != 0) {
                                        float height3 = (decodeFile2.getHeight() - decodeFile2.getWidth()) / 2.0f;
                                        matrix2.postTranslate(height3, -height3);
                                    }
                                    matrix2.postScale(bitmap.getWidth() / decodeFile2.getHeight(), bitmap.getHeight() / decodeFile2.getWidth());
                                    canvas.drawBitmap(decodeFile2, matrix2, paint);
                                }
                            }
                        }
                        if (createBitmap == null) {
                            Utilities.i.c(new w88(photoViewer, b3, (byte) 1));
                            photoViewer.o5.f();
                            photoViewer.f0.invalidate();
                            break;
                        } else {
                            ao6 ao6Var = co6Var.A;
                            if (ao6Var != null) {
                                ImageReceiver imageReceiver = photoViewer.B4;
                                createBitmap = PhotoViewer.E(createBitmap, ao6Var, new int[]{imageReceiver.V, imageReceiver.W}, true);
                            }
                            if (createBitmap == null) {
                                Utilities.i.c(new w88(photoViewer, b3, b));
                                photoViewer.o5.f();
                                photoViewer.f0.invalidate();
                                break;
                            } else {
                                Matrix matrix3 = new Matrix();
                                int width2 = createBitmap.getWidth();
                                int height4 = createBitmap.getHeight();
                                if (!jo6Var3.w && (photoViewer.B4.V / 90) % 2 != 0) {
                                    width2 = createBitmap.getHeight();
                                    height4 = createBitmap.getWidth();
                                }
                                float f6 = width2;
                                float f7 = height4;
                                float min = Math.min(photoViewer.i0(photoViewer.t4) / f6, photoViewer.g0() / f7);
                                float f8 = f6 * min;
                                float f9 = f7 * min;
                                if ((photoViewer.B4.V == 0 || jo6Var3.w) && photoViewer.a6 == 0.0f) {
                                    f2 = 0.0f;
                                    f3 = 0.0f;
                                    f4 = f8;
                                    f5 = f9;
                                } else {
                                    float width3 = createBitmap.getWidth();
                                    float height5 = createBitmap.getHeight();
                                    float f10 = width3 / f;
                                    float f11 = height5 / f;
                                    float sqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
                                    float f12 = sqrt * f;
                                    int i8 = (int) f12;
                                    Bitmap createBitmap2 = Bitmap.createBitmap(i8, i8, config);
                                    Canvas canvas2 = new Canvas(createBitmap2);
                                    canvas2.save();
                                    canvas2.rotate((jo6Var3.w ? 0 : photoViewer.B4.V) + photoViewer.a6, sqrt, sqrt);
                                    canvas2.drawBitmap(createBitmap, (f12 - width3) / f, (f12 - height5) / f, (Paint) null);
                                    createBitmap.recycle();
                                    float f13 = f8 / f;
                                    float f14 = f9 / f;
                                    f4 = ((float) Math.sqrt((f14 * f14) + (f13 * f13))) * f;
                                    f2 = (-(f4 - f8)) / f;
                                    f3 = (-(f4 - f9)) / f;
                                    f5 = f4;
                                    createBitmap = createBitmap2;
                                }
                                matrix3.postScale(f4, f5);
                                float f15 = photoViewer.Z5;
                                matrix3.postScale(f15, f15, f4 / f, f5 / f);
                                matrix3.postTranslate(photoViewer.W5 + f2 + Math.max(0, (int) ((photoViewer.i0(photoViewer.t4) - f8) / f)), photoViewer.X5 + f3 + Math.max(0, (int) ((photoViewer.g0() - f9) / f)));
                                photoViewer.o5.W = true;
                                Utilities.i.c(new w88(photoViewer, b3, (byte) 3));
                                n88 n88Var = new n88(photoViewer, (byte) 9);
                                ud7 ud7Var = new ud7((Object) photoViewer, (Object) b3, (Object) n88Var, (byte) 24);
                                bo6 bo6Var = new bo6((byte) 11);
                                hlb hlbVar = thanosEffect.a;
                                if (hlbVar != null) {
                                    hlbVar.c(matrix3, createBitmap, ud7Var, bo6Var);
                                    Choreographer.getInstance().postFrameCallback(thanosEffect.b);
                                } else {
                                    thanosEffect.c.add(new ilb(matrix3, createBitmap, ud7Var, bo6Var));
                                }
                                gm.d3(n88Var, 1200L);
                            }
                        }
                    }
                }
                photoViewer.o5.f();
                photoViewer.f0.invalidate();
                break;
            case 4:
                boolean z5 = this.b;
                String str2 = (String) this.c;
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.d;
                Runnable runnable2 = (Runnable) obj;
                if (!z5) {
                    runnable2.run();
                    break;
                } else {
                    u0b.G3.c(z8c.t0, str2, new gy9(linkedHashSet, runnable2, (byte) 1));
                    break;
                }
            default:
                boolean z6 = this.b;
                he heVar = (he) this.c;
                qac qacVar = (qac) this.d;
                iuc iucVar = (iuc) obj;
                if (z6) {
                    heVar.b(350L);
                }
                qacVar.a(iucVar);
                break;
        }
    }

    public /* synthetic */ z52(Object obj, boolean z, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }

    public /* synthetic */ z52(boolean z, Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = z;
        this.c = obj;
        this.d = obj2;
    }
}

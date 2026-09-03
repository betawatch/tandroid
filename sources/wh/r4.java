package wh;

import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildConfig;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class r4 {
    public static ColorMatrixColorFilter f;
    public final ImageReceiver a;
    public final ImageReceiver b;
    public Bitmap c;
    public final RadialProgress2 d;
    public t e;

    public r4(o4 o4Var, g6 g6Var) {
        this.a = new ImageReceiver(o4Var);
        this.b = new ImageReceiver(o4Var);
        RadialProgress2 radialProgress2 = new RadialProgress2(o4Var, g6Var);
        this.d = radialProgress2;
        radialProgress2.d = -1;
        radialProgress2.setColors(1711276032, 2130706432, -1, -2500135);
        radialProgress2.setIcon(3, false, false);
    }

    public final void a() {
        String sb;
        TLRPC.Photo photo;
        TLRPC.Document document;
        TLRPC.PhotoSize photoSize;
        int abs;
        t tVar = this.e;
        TLRPC.PhotoSize photoSize2 = null;
        ImageReceiver imageReceiver = this.a;
        if (tVar == null) {
            imageReceiver.setImageBitmap((Drawable) null);
            return;
        }
        int i10 = AndroidUtilities.displaySize.x;
        String h = e2.c.h(i10, "_", i10);
        StringBuilder sb2 = new StringBuilder();
        t tVar2 = this.e;
        if (tVar2 == null) {
            sb = BuildConfig.BETA_URL;
        } else {
            String str = tVar2.b ? "v" : tVar2.c ? "a" : "p";
            if (tVar2.e != null) {
                StringBuilder f10 = w.c.f(str, ":local:");
                f10.append(this.e.e);
                sb = f10.toString();
            } else {
                long j10 = 0;
                if (tVar2.b()) {
                    t tVar3 = this.e;
                    TLRPC.Document document2 = tVar3.h;
                    if (document2 != null) {
                        j10 = document2.id;
                    } else {
                        TLRPC.Photo photo2 = tVar3.g;
                        if (photo2 != null) {
                            j10 = photo2.id;
                        }
                    }
                }
                StringBuilder f11 = w.c.f(str, ":");
                f11.append(this.e.a);
                f11.append(":");
                f11.append(j10);
                sb = f11.toString();
            }
        }
        sb2.append(sb);
        sb2.append("@");
        sb2.append(h);
        if (sb2.toString().equals(null)) {
            return;
        }
        this.e.getClass();
        t tVar4 = this.e;
        if (!tVar4.b) {
            if (tVar4.e != null) {
                imageReceiver.setOrientation(tVar4.l, tVar4.m, true);
                imageReceiver.setImage(ImageLocation.getForPath(this.e.e), h, null, null, null, 0);
                return;
            } else {
                if (!tVar4.b() || (photo = this.e.g) == null) {
                    imageReceiver.setImageBitmap((Drawable) null);
                    return;
                }
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(this.e.g.sizes, 100);
                imageReceiver.setOrientation(0, 0, false);
                imageReceiver.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.e.g), h, ImageLocation.getForPhoto(closestPhotoSizeWithSize2, this.e.g), h, null, 0L, null, this.e.g, 0);
                return;
            }
        }
        if (tVar4.e != null) {
            imageReceiver.setOrientation(0, 0, false);
            imageReceiver.setImage(ImageLocation.getForVideoPath(this.e.e), ImageLoader.AUTOPLAY_FILTER, null, h, null, h, null, 0L, null, null, 0);
            return;
        }
        if (!tVar4.b() || (document = this.e.h) == null) {
            imageReceiver.setImageBitmap((Drawable) null);
            return;
        }
        ArrayList<TLRPC.PhotoSize> arrayList = document.thumbs;
        int photoSize3 = AndroidUtilities.getPhotoSize();
        if (arrayList == null) {
            photoSize = null;
        } else {
            int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            photoSize = null;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                TLRPC.PhotoSize photoSize4 = arrayList.get(i12);
                if (!(photoSize4 instanceof TLRPC.TL_photoStrippedSize) && !(photoSize4 instanceof TLRPC.TL_photoPathSize) && (abs = Math.abs(Math.max(photoSize4.w, photoSize4.h) - photoSize3)) < i11) {
                    photoSize = photoSize4;
                    i11 = abs;
                }
            }
        }
        ArrayList<TLRPC.PhotoSize> arrayList2 = this.e.h.thumbs;
        if (arrayList2 != null) {
            int i13 = 0;
            while (true) {
                if (i13 >= arrayList2.size()) {
                    break;
                }
                if (arrayList2.get(i13) instanceof TLRPC.TL_photoStrippedSize) {
                    photoSize2 = arrayList2.get(i13);
                    break;
                }
                i13++;
            }
        }
        imageReceiver.setOrientation(0, 0, false);
        imageReceiver.setImage(ImageLocation.getForDocument(this.e.h), ImageLoader.AUTOPLAY_FILTER, ImageLocation.getForDocument(photoSize, this.e.h), h, ImageLocation.getForDocument(photoSize2, this.e.h), h, null, 0L, null, this.e.h, 0);
    }

    public final boolean b() {
        ImageReceiver imageReceiver;
        Bitmap bitmap;
        if (c() && (bitmap = (imageReceiver = this.a).getBitmap()) != null && !bitmap.isRecycled()) {
            ImageReceiver imageReceiver2 = this.b;
            if ((imageReceiver2.getBitmap() == null || imageReceiver.getAnimation() == null) && (bitmap != this.c || imageReceiver2.getBitmap() == null)) {
                this.c = bitmap;
                imageReceiver2.setImageBitmap(Utilities.stackBlurBitmapMax(bitmap, false));
                if (f == null) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.9f);
                    AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.6f);
                    f = new ColorMatrixColorFilter(colorMatrix);
                }
                imageReceiver2.setColorFilter(f);
            }
            if (imageReceiver2.getBitmap() != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        t tVar = this.e;
        if (tVar != null) {
            return tVar.e != null || tVar.b();
        }
        return false;
    }

    public final boolean d() {
        t tVar = this.e;
        if (tVar == null || tVar.b || tVar.b()) {
            return false;
        }
        int i10 = this.e.l;
        return i10 == 90 || i10 == 270;
    }
}

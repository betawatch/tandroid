package qh;

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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class o4 {
    public static ColorMatrixColorFilter f;
    public final ImageReceiver a;
    public final ImageReceiver b;
    public Bitmap c;
    public final RadialProgress2 d;
    public s e;

    public o4(l4 l4Var, b6 b6Var) {
        this.a = new ImageReceiver(l4Var);
        this.b = new ImageReceiver(l4Var);
        RadialProgress2 radialProgress2 = new RadialProgress2(l4Var, b6Var);
        this.d = radialProgress2;
        radialProgress2.d = -1;
        radialProgress2.setColors(1711276032, 2130706432, -1, -2500135);
        radialProgress2.setIcon(3, false, false);
    }

    public final void a() {
        String sb2;
        TLRPC.Photo photo;
        TLRPC.Document document;
        TLRPC.PhotoSize photoSize;
        int abs;
        s sVar = this.e;
        TLRPC.PhotoSize photoSize2 = null;
        ImageReceiver imageReceiver = this.a;
        if (sVar == null) {
            imageReceiver.setImageBitmap((Drawable) null);
            return;
        }
        int i9 = AndroidUtilities.displaySize.x;
        String l10 = e2.c.l(i9, "_", i9);
        StringBuilder sb3 = new StringBuilder();
        s sVar2 = this.e;
        if (sVar2 == null) {
            sb2 = BuildConfig.BETA_URL;
        } else {
            String str = sVar2.b ? "v" : sVar2.c ? "a" : "p";
            if (sVar2.e != null) {
                StringBuilder e10 = ta.b.e(str, ":local:");
                e10.append(this.e.e);
                sb2 = e10.toString();
            } else {
                long j10 = 0;
                if (sVar2.b()) {
                    s sVar3 = this.e;
                    TLRPC.Document document2 = sVar3.h;
                    if (document2 != null) {
                        j10 = document2.id;
                    } else {
                        TLRPC.Photo photo2 = sVar3.g;
                        if (photo2 != null) {
                            j10 = photo2.id;
                        }
                    }
                }
                StringBuilder e11 = ta.b.e(str, ":");
                e11.append(this.e.a);
                e11.append(":");
                e11.append(j10);
                sb2 = e11.toString();
            }
        }
        sb3.append(sb2);
        sb3.append("@");
        sb3.append(l10);
        if (sb3.toString().equals(null)) {
            return;
        }
        this.e.getClass();
        s sVar4 = this.e;
        if (!sVar4.b) {
            if (sVar4.e != null) {
                imageReceiver.setOrientation(sVar4.l, sVar4.m, true);
                imageReceiver.setImage(ImageLocation.getForPath(this.e.e), l10, null, null, null, 0);
                return;
            } else {
                if (!sVar4.b() || (photo = this.e.g) == null) {
                    imageReceiver.setImageBitmap((Drawable) null);
                    return;
                }
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(this.e.g.sizes, 100);
                imageReceiver.setOrientation(0, 0, false);
                imageReceiver.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.e.g), l10, ImageLocation.getForPhoto(closestPhotoSizeWithSize2, this.e.g), l10, null, 0L, null, this.e.g, 0);
                return;
            }
        }
        if (sVar4.e != null) {
            imageReceiver.setOrientation(0, 0, false);
            imageReceiver.setImage(ImageLocation.getForVideoPath(this.e.e), ImageLoader.AUTOPLAY_FILTER, null, l10, null, l10, null, 0L, null, null, 0);
            return;
        }
        if (!sVar4.b() || (document = this.e.h) == null) {
            imageReceiver.setImageBitmap((Drawable) null);
            return;
        }
        ArrayList<TLRPC.PhotoSize> arrayList = document.thumbs;
        int photoSize3 = AndroidUtilities.getPhotoSize();
        if (arrayList == null) {
            photoSize = null;
        } else {
            int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            photoSize = null;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TLRPC.PhotoSize photoSize4 = arrayList.get(i11);
                if (!(photoSize4 instanceof TLRPC.TL_photoStrippedSize) && !(photoSize4 instanceof TLRPC.TL_photoPathSize) && (abs = Math.abs(Math.max(photoSize4.w, photoSize4.h) - photoSize3)) < i10) {
                    photoSize = photoSize4;
                    i10 = abs;
                }
            }
        }
        ArrayList<TLRPC.PhotoSize> arrayList2 = this.e.h.thumbs;
        if (arrayList2 != null) {
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList2.size()) {
                    break;
                }
                if (arrayList2.get(i12) instanceof TLRPC.TL_photoStrippedSize) {
                    photoSize2 = arrayList2.get(i12);
                    break;
                }
                i12++;
            }
        }
        imageReceiver.setOrientation(0, 0, false);
        imageReceiver.setImage(ImageLocation.getForDocument(this.e.h), ImageLoader.AUTOPLAY_FILTER, ImageLocation.getForDocument(photoSize, this.e.h), l10, ImageLocation.getForDocument(photoSize2, this.e.h), l10, null, 0L, null, this.e.h, 0);
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
        s sVar = this.e;
        if (sVar != null) {
            return sVar.e != null || sVar.b();
        }
        return false;
    }

    public final boolean d() {
        s sVar = this.e;
        if (sVar == null || sVar.b || sVar.b()) {
            return false;
        }
        int i9 = this.e.l;
        return i9 == 90 || i9 == 270;
    }
}

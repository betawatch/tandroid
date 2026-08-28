package qh;

import android.view.View;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class n4 implements NotificationCenter.NotificationCenterDelegate {
    public final int a;
    public final a3 b;
    public MessageObject c;
    public VideoEditedInfo d;
    public String e;
    public boolean f;
    public boolean h;
    public boolean n;

    public n4(int i9, MediaController.PhotoEntry photoEntry, a3 a3Var) {
        this.a = i9;
        this.b = a3Var;
    }

    public static boolean c(MediaController.PhotoEntry photoEntry) {
        if (!photoEntry.isVideo) {
            ArrayList<VideoEditedInfo.MediaEntity> arrayList = photoEntry.croppedMediaEntities;
            ArrayList<VideoEditedInfo.MediaEntity> arrayList2 = (arrayList == null || arrayList.isEmpty()) ? photoEntry.mediaEntities : photoEntry.croppedMediaEntities;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i9 = 0; i9 < size; i9++) {
                    VideoEditedInfo.MediaEntity mediaEntity = arrayList2.get(i9);
                    if (mediaEntity != null) {
                        if (mediaEntity.type == 0) {
                            byte b10 = mediaEntity.subType;
                            if ((b10 & 1) != 0 || (b10 & 4) != 0) {
                                return true;
                            }
                        }
                        ArrayList<VideoEditedInfo.EmojiEntity> arrayList3 = mediaEntity.entities;
                        if (arrayList3 != null && !arrayList3.isEmpty()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void a() {
        if (this.n || this.h) {
            return;
        }
        this.h = true;
        if (this.c != null && this.d != null) {
            try {
                MediaController.getInstance().cancelVideoConvert(this.c);
            } catch (Throwable unused) {
            }
        }
        d();
    }

    public final void b() {
        if (this.n) {
            return;
        }
        this.n = true;
        d();
        a3 a3Var = this.b;
        o3 o3Var = a3Var.c;
        IdentityHashMap identityHashMap = o3Var.W3;
        s sVar = a3Var.a;
        identityHashMap.remove(sVar);
        sVar.a = 3;
        o3Var.q4(a3Var.b, sVar);
        o3Var.d3.onContentChanged();
    }

    public final void d() {
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.a);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingStarted);
        notificationCenter.removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingFailed);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        a3 a3Var = this.b;
        a aVar = a3Var.b;
        s sVar = a3Var.a;
        o3 o3Var = a3Var.c;
        if (this.h || this.n || i10 != this.a || objArr.length == 0 || objArr[0] != this.c) {
            return;
        }
        if (i9 != NotificationCenter.fileNewChunkAvailable) {
            if (i9 == NotificationCenter.filePreparingFailed) {
                b();
                return;
            }
            return;
        }
        long longValue = ((Long) objArr[3]).longValue();
        sVar.f = ((Float) objArr[4]).floatValue();
        View z12 = o3Var.z1(aVar);
        if (z12 instanceof l4) {
            z12.requestLayout();
            z12.invalidate();
        }
        if (longValue > 0) {
            this.n = true;
            d();
            String str = this.e;
            VideoEditedInfo videoEditedInfo = this.d;
            int i11 = videoEditedInfo.resultWidth;
            int i12 = videoEditedInfo.resultHeight;
            int ceil = (int) Math.ceil(videoEditedInfo.estimatedDuration / 1000.0d);
            o3Var.W3.remove(sVar);
            sVar.b = true;
            sVar.e = str;
            if (i11 > 0) {
                sVar.j = i11;
            }
            if (i12 > 0) {
                sVar.k = i12;
            }
            sVar.l = 0;
            sVar.m = 0;
            sVar.f = 0.0f;
            o3Var.n4(aVar);
            o3Var.L4(a3Var.b, sVar, str, true, sVar.j, sVar.k, ceil);
        }
    }
}

package vh;

import android.view.View;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class r4 implements NotificationCenter.NotificationCenterDelegate {
    public final int a;
    public final e3 b;
    public MessageObject c;
    public VideoEditedInfo d;
    public String e;
    public boolean f;
    public boolean h;
    public boolean n;

    public r4(int i10, MediaController.PhotoEntry photoEntry, e3 e3Var) {
        this.a = i10;
        this.b = e3Var;
    }

    public static boolean c(MediaController.PhotoEntry photoEntry) {
        if (!photoEntry.isVideo) {
            ArrayList<VideoEditedInfo.MediaEntity> arrayList = photoEntry.croppedMediaEntities;
            ArrayList<VideoEditedInfo.MediaEntity> arrayList2 = (arrayList == null || arrayList.isEmpty()) ? photoEntry.mediaEntities : photoEntry.croppedMediaEntities;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    VideoEditedInfo.MediaEntity mediaEntity = arrayList2.get(i10);
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
        e3 e3Var = this.b;
        s3 s3Var = e3Var.c;
        IdentityHashMap identityHashMap = s3Var.X3;
        t tVar = e3Var.a;
        identityHashMap.remove(tVar);
        tVar.a = 3;
        s3Var.p4(e3Var.b, tVar);
        s3Var.e3.onContentChanged();
    }

    public final void d() {
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.a);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingStarted);
        notificationCenter.removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingFailed);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        e3 e3Var = this.b;
        a aVar = e3Var.b;
        t tVar = e3Var.a;
        s3 s3Var = e3Var.c;
        if (this.h || this.n || i11 != this.a || objArr.length == 0 || objArr[0] != this.c) {
            return;
        }
        if (i10 != NotificationCenter.fileNewChunkAvailable) {
            if (i10 == NotificationCenter.filePreparingFailed) {
                b();
                return;
            }
            return;
        }
        long longValue = ((Long) objArr[3]).longValue();
        tVar.f = ((Float) objArr[4]).floatValue();
        View y12 = s3Var.y1(aVar);
        if (y12 instanceof p4) {
            y12.requestLayout();
            y12.invalidate();
        }
        if (longValue > 0) {
            this.n = true;
            d();
            String str = this.e;
            VideoEditedInfo videoEditedInfo = this.d;
            int i12 = videoEditedInfo.resultWidth;
            int i13 = videoEditedInfo.resultHeight;
            int ceil = (int) Math.ceil(videoEditedInfo.estimatedDuration / 1000.0d);
            s3Var.X3.remove(tVar);
            tVar.b = true;
            tVar.e = str;
            if (i12 > 0) {
                tVar.j = i12;
            }
            if (i13 > 0) {
                tVar.k = i13;
            }
            tVar.l = 0;
            tVar.m = 0;
            tVar.f = 0.0f;
            s3Var.m4(aVar);
            s3Var.K4(e3Var.b, tVar, str, true, tVar.j, tVar.k, ceil);
        }
    }
}

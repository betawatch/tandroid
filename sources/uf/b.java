package uf;

import android.app.PictureInPictureParams;
import android.app.PictureInPictureUiState;
import android.content.IntentFilter;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import android.view.Choreographer;
import androidx.mediarouter.app.f;
import cg.x;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.LaunchActivity;
import wf.e;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b {
    public final LaunchActivity d;
    public boolean e;
    public boolean f;
    public boolean g;
    public PictureInPictureParams h;
    public boolean n;
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final HashMap c = new HashMap();
    public float i = -1.0f;
    public final xf.a j = new xf.a("enter");
    public final xf.a k = new xf.a("leave");
    public final Choreographer l = Choreographer.getInstance();
    public final x m = new x(this, 2);
    public final f o = new f(this, 13);

    public b(LaunchActivity launchActivity) {
        this.d = launchActivity;
    }

    public final void a(boolean z10) {
        d(0.0f);
        this.k.a();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i3 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((e) obj).getClass();
        }
        if (this.n) {
            this.n = false;
            this.l.removeFrameCallback(this.m);
        }
        this.f = false;
        ArrayList arrayList2 = this.a;
        int size2 = arrayList2.size();
        while (i3 < size2) {
            Object obj2 = arrayList2.get(i3);
            i3++;
            ((vf.b) obj2).b();
        }
    }

    public final void b() {
        this.f = true;
        int i3 = 0;
        this.g = false;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((vf.b) obj).e();
        }
        xf.a aVar = this.j;
        long j10 = aVar.b;
        ArrayList arrayList2 = this.b;
        int size2 = arrayList2.size();
        while (i3 < size2) {
            Object obj2 = arrayList2.get(i3);
            i3++;
            ((e) obj2).getClass();
        }
        d(0.0f);
        aVar.c = SystemClock.uptimeMillis();
        if (this.n) {
            return;
        }
        this.n = true;
        this.l.postFrameCallback(this.m);
    }

    public final void c(boolean z10) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i3 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((vf.b) obj).d();
        }
        xf.a aVar = this.k;
        long j10 = aVar.b;
        ArrayList arrayList2 = this.b;
        int size2 = arrayList2.size();
        while (i3 < size2) {
            Object obj2 = arrayList2.get(i3);
            i3++;
            ((e) obj2).getClass();
        }
        d(1.0f);
        aVar.c = SystemClock.uptimeMillis();
        if (this.n) {
            return;
        }
        this.n = true;
        this.l.postFrameCallback(this.m);
    }

    public final void d(float f10) {
        if (f10 == this.i) {
            return;
        }
        this.i = f10;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            e eVar = (e) obj;
            eVar.o = f10;
            org.telegram.ui.e eVar2 = eVar.f;
            if (eVar2 != null) {
                eVar2.invalidate();
            }
        }
    }

    public final boolean e() {
        LaunchActivity launchActivity = this.d;
        return com.google.android.recaptcha.internal.a.u(launchActivity) && ((d) launchActivity.n0.e) != null;
    }

    public final void f() {
        int i3;
        if (!this.f && (i3 = Build.VERSION.SDK_INT) < 31 && i3 >= 26 && this.h != null && e()) {
            b();
            this.d.enterPictureInPictureMode(this.h);
        }
    }

    public final void g(PictureInPictureUiState pictureInPictureUiState) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31) {
            if (i3 >= 35) {
                Log.i("PIP_DEBUG", "[Activity] onPictureInPictureUiStateChanged " + pictureInPictureUiState.isStashed() + " " + pictureInPictureUiState.isTransitioningToPip());
                if (pictureInPictureUiState.isTransitioningToPip() && e()) {
                    b();
                }
            } else {
                Log.i("PIP_DEBUG", "[Activity] onPictureInPictureUiStateChanged " + pictureInPictureUiState.isStashed());
            }
            boolean isStashed = pictureInPictureUiState.isStashed();
            if (this.g != isStashed) {
                this.g = isStashed;
                int i10 = 0;
                ArrayList arrayList = this.a;
                if (isStashed) {
                    int size = arrayList.size();
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((vf.b) obj).a();
                    }
                    return;
                }
                int size2 = arrayList.size();
                while (i10 < size2) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    ((vf.b) obj2).c();
                }
            }
        }
    }

    public final void h() {
        Log.i("PIP_DEBUG", "[Activity] onStart");
        this.e = true;
        IntentFilter intentFilter = new IntentFilter("PIP_CUSTOM_EVENT");
        int i3 = Build.VERSION.SDK_INT;
        f fVar = this.o;
        LaunchActivity launchActivity = this.d;
        if (i3 >= 33) {
            launchActivity.registerReceiver(fVar, intentFilter, 4);
        } else {
            launchActivity.registerReceiver(fVar, intentFilter);
        }
    }
}

package pf;

import android.app.PictureInPictureParams;
import android.app.PictureInPictureUiState;
import android.content.IntentFilter;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import android.view.Choreographer;
import androidx.mediarouter.app.g;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class c {
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
    public final sf.a j = new sf.a("enter");
    public final sf.a k = new sf.a("leave");
    public final Choreographer l = Choreographer.getInstance();
    public final b m = new b(this, 0);
    public final g o = new g(this, 9);

    public c(LaunchActivity launchActivity) {
        this.d = launchActivity;
    }

    public final void a(boolean z10) {
        d(0.0f);
        this.k.a();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((qf.b) obj).getClass();
        }
        if (this.n) {
            this.n = false;
            this.l.removeFrameCallback(this.m);
        }
        this.f = false;
        ArrayList arrayList2 = this.a;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((qf.c) obj2).b();
        }
    }

    public final void b() {
        this.f = true;
        int i10 = 0;
        this.g = false;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((qf.c) obj).e();
        }
        sf.a aVar = this.j;
        long j3 = aVar.b;
        ArrayList arrayList2 = this.b;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((qf.b) obj2).getClass();
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
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((qf.c) obj).d();
        }
        sf.a aVar = this.k;
        long j3 = aVar.b;
        ArrayList arrayList2 = this.b;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((qf.b) obj2).getClass();
        }
        d(1.0f);
        aVar.c = SystemClock.uptimeMillis();
        if (this.n) {
            return;
        }
        this.n = true;
        this.l.postFrameCallback(this.m);
    }

    public final void d(float f7) {
        if (f7 == this.i) {
            return;
        }
        this.i = f7;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            rf.e eVar = (rf.e) ((qf.b) obj);
            eVar.o = f7;
            f fVar = eVar.f;
            if (fVar != null) {
                fVar.invalidate();
            }
        }
    }

    public final boolean e() {
        LaunchActivity launchActivity = this.d;
        return e2.u(launchActivity) && ((e) launchActivity.m0.e) != null;
    }

    public final void f() {
        int i10;
        if (!this.f && (i10 = Build.VERSION.SDK_INT) < 31 && i10 >= 26 && this.h != null && e()) {
            b();
            this.d.enterPictureInPictureMode(this.h);
        }
    }

    public final void g(PictureInPictureUiState pictureInPictureUiState) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            if (i10 >= 35) {
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
                int i11 = 0;
                ArrayList arrayList = this.a;
                if (isStashed) {
                    int size = arrayList.size();
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        ((qf.c) obj).a();
                    }
                    return;
                }
                int size2 = arrayList.size();
                while (i11 < size2) {
                    Object obj2 = arrayList.get(i11);
                    i11++;
                    ((qf.c) obj2).c();
                }
            }
        }
    }

    public final void h() {
        Log.i("PIP_DEBUG", "[Activity] onStart");
        this.e = true;
        IntentFilter intentFilter = new IntentFilter("PIP_CUSTOM_EVENT");
        int i10 = Build.VERSION.SDK_INT;
        g gVar = this.o;
        LaunchActivity launchActivity = this.d;
        if (i10 >= 33) {
            launchActivity.registerReceiver(gVar, intentFilter, 4);
        } else {
            launchActivity.registerReceiver(gVar, intentFilter);
        }
    }
}

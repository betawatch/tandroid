package xe;

import android.app.PictureInPictureParams;
import android.app.PictureInPictureUiState;
import android.content.IntentFilter;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import android.view.Choreographer;
import androidx.mediarouter.app.h;
import dh.m;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
    public final af.a j = new af.a("enter");
    public final af.a k = new af.a("leave");
    public final Choreographer l = Choreographer.getInstance();
    public final m m = new m(this, 3);
    public final h o = new h(this, 8);

    public b(LaunchActivity launchActivity) {
        this.d = launchActivity;
    }

    public final void a(boolean z10) {
        d(0.0f);
        this.k.a();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i9 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((ye.b) obj).getClass();
        }
        if (this.n) {
            this.n = false;
            this.l.removeFrameCallback(this.m);
        }
        this.f = false;
        ArrayList arrayList2 = this.a;
        int size2 = arrayList2.size();
        while (i9 < size2) {
            Object obj2 = arrayList2.get(i9);
            i9++;
            ((ye.c) obj2).b();
        }
    }

    public final void b() {
        this.f = true;
        int i9 = 0;
        this.g = false;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((ye.c) obj).e();
        }
        af.a aVar = this.j;
        long j10 = aVar.b;
        ArrayList arrayList2 = this.b;
        int size2 = arrayList2.size();
        while (i9 < size2) {
            Object obj2 = arrayList2.get(i9);
            i9++;
            ((ye.b) obj2).getClass();
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
        int i9 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((ye.c) obj).d();
        }
        af.a aVar = this.k;
        long j10 = aVar.b;
        ArrayList arrayList2 = this.b;
        int size2 = arrayList2.size();
        while (i9 < size2) {
            Object obj2 = arrayList2.get(i9);
            i9++;
            ((ye.b) obj2).getClass();
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
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ze.e eVar = (ze.e) ((ye.b) obj);
            eVar.o = f10;
            e eVar2 = eVar.f;
            if (eVar2 != null) {
                eVar2.invalidate();
            }
        }
    }

    public final boolean e() {
        LaunchActivity launchActivity = this.d;
        return e2.c.v(launchActivity) && ((d) launchActivity.i0.e) != null;
    }

    public final void f() {
        int i9;
        if (!this.f && (i9 = Build.VERSION.SDK_INT) < 31 && i9 >= 26 && this.h != null && e()) {
            b();
            this.d.enterPictureInPictureMode(this.h);
        }
    }

    public final void g(PictureInPictureUiState pictureInPictureUiState) {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 31) {
            if (i9 >= 35) {
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
                        ((ye.c) obj).a();
                    }
                    return;
                }
                int size2 = arrayList.size();
                while (i10 < size2) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    ((ye.c) obj2).c();
                }
            }
        }
    }

    public final void h() {
        Log.i("PIP_DEBUG", "[Activity] onStart");
        this.e = true;
        IntentFilter intentFilter = new IntentFilter("PIP_CUSTOM_EVENT");
        int i9 = Build.VERSION.SDK_INT;
        h hVar = this.o;
        LaunchActivity launchActivity = this.d;
        if (i9 >= 33) {
            launchActivity.registerReceiver(hVar, intentFilter, 4);
        } else {
            launchActivity.registerReceiver(hVar, intentFilter);
        }
    }
}

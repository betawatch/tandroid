package org.telegram.ui;

import android.view.Window;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class z90 {
    public final /* synthetic */ int a;
    public boolean b;
    public boolean c;
    public final Object d;

    public /* synthetic */ z90(Object obj, int i10) {
        this.a = i10;
        this.d = obj;
    }

    public void a() {
        if (this.b) {
            return;
        }
        this.b = true;
        Runnable runnable = (Runnable) this.d;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void b() {
        switch (this.a) {
            case 0:
                c(false);
                this.c = true;
                break;
            default:
                c(false);
                this.c = true;
                break;
        }
    }

    public void c(boolean z10) {
        switch (this.a) {
            case 0:
                if (this.b != z10 && !this.c) {
                    this.b = z10;
                    LaunchActivity launchActivity = (LaunchActivity) ((WeakReference) this.d).get();
                    if (launchActivity != null) {
                        int i10 = launchActivity.C1 + (z10 ? 1 : -1);
                        launchActivity.C1 = i10;
                        l0 l0Var = launchActivity.w0;
                        if (l0Var != null) {
                            l0Var.setVisibility(i10 > 0 ? 8 : 0);
                        }
                        launchActivity.getWindow();
                        break;
                    }
                }
                break;
            default:
                c5.e eVar = (c5.e) this.d;
                if (this.b != z10 && !this.c) {
                    this.b = z10;
                    if (z10) {
                        eVar.a++;
                    } else {
                        eVar.a--;
                    }
                    boolean z11 = eVar.a > 0;
                    if (eVar.b != z11) {
                        eVar.b = z11;
                        Window window = (Window) ((WeakReference) ((mg.l) eVar.c).b).get();
                        if (window != null) {
                            window.getDecorView().setVisibility(z11 ? 8 : 0);
                            break;
                        }
                    }
                }
                break;
        }
    }

    public z90(LaunchActivity launchActivity, boolean z10) {
        this.a = 0;
        this.d = new WeakReference(launchActivity);
    }
}

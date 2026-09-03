package org.telegram.ui;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class wa0 implements cf.c {
    public final kf.t0 a;
    public final /* synthetic */ LaunchActivity b;

    public wa0(LaunchActivity launchActivity) {
        this.b = launchActivity;
        Pattern pattern = LaunchActivity.y1;
        this.a = new kf.t0(launchActivity, false);
    }

    @Override // cf.c
    public final void b() {
        Pattern pattern = LaunchActivity.y1;
        this.b.getWindow();
    }

    @Override // cf.c
    public final void d() {
        this.a.a(false);
    }

    @Override // cf.c
    public final void f() {
        Pattern pattern = LaunchActivity.y1;
        LaunchActivity launchActivity = this.b;
        launchActivity.getClass();
        this.a.a(true);
        launchActivity.getWindow();
    }

    @Override // cf.c
    public final /* synthetic */ void a() {
    }

    @Override // cf.c
    public final /* synthetic */ void c() {
    }

    @Override // cf.c
    public final /* synthetic */ void e() {
    }
}

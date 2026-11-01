package org.telegram.ui;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class t90 implements kf.b {
    public final z90 a;
    public final /* synthetic */ LaunchActivity b;

    public t90(LaunchActivity launchActivity) {
        this.b = launchActivity;
        Pattern pattern = LaunchActivity.D1;
        this.a = new z90(launchActivity, false);
    }

    @Override // kf.b
    public final void b() {
        Pattern pattern = LaunchActivity.D1;
        this.b.getWindow();
    }

    @Override // kf.b
    public final void d() {
        this.a.c(false);
    }

    @Override // kf.b
    public final void f() {
        Pattern pattern = LaunchActivity.D1;
        LaunchActivity launchActivity = this.b;
        launchActivity.getClass();
        this.a.c(true);
        launchActivity.getWindow();
    }

    @Override // kf.b
    public final /* synthetic */ void a() {
    }

    @Override // kf.b
    public final /* synthetic */ void c() {
    }

    @Override // kf.b
    public final /* synthetic */ void e() {
    }
}

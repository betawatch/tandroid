package org.telegram.ui;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class u90 implements kf.b {
    public final aa0 a;
    public final /* synthetic */ LaunchActivity b;

    public u90(LaunchActivity launchActivity) {
        this.b = launchActivity;
        Pattern pattern = LaunchActivity.D1;
        this.a = new aa0(launchActivity, false);
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

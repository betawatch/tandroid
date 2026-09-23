package org.telegram.ui;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class za0 implements qf.c {
    public final fb0 a;
    public final /* synthetic */ LaunchActivity b;

    public za0(LaunchActivity launchActivity) {
        this.b = launchActivity;
        Pattern pattern = LaunchActivity.B1;
        this.a = new fb0(launchActivity, false);
    }

    @Override // qf.c
    public final void b() {
        Pattern pattern = LaunchActivity.B1;
        this.b.getWindow();
    }

    @Override // qf.c
    public final void d() {
        this.a.a(false);
    }

    @Override // qf.c
    public final void f() {
        Pattern pattern = LaunchActivity.B1;
        LaunchActivity launchActivity = this.b;
        launchActivity.getClass();
        this.a.a(true);
        launchActivity.getWindow();
    }

    @Override // qf.c
    public final /* synthetic */ void a() {
    }

    @Override // qf.c
    public final /* synthetic */ void c() {
    }

    @Override // qf.c
    public final /* synthetic */ void e() {
    }
}

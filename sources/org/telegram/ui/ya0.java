package org.telegram.ui;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class ya0 implements qf.c {
    public final eb0 a;
    public final /* synthetic */ LaunchActivity b;

    public ya0(LaunchActivity launchActivity) {
        this.b = launchActivity;
        Pattern pattern = LaunchActivity.B1;
        this.a = new eb0(launchActivity, false);
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

package org.telegram.ui;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class va0 implements df.c {
    public final lf.s0 a;
    public final /* synthetic */ LaunchActivity b;

    public va0(LaunchActivity launchActivity) {
        this.b = launchActivity;
        Pattern pattern = LaunchActivity.y1;
        this.a = new lf.s0(launchActivity, false);
    }

    @Override // df.c
    public final void b() {
        Pattern pattern = LaunchActivity.y1;
        this.b.getWindow();
    }

    @Override // df.c
    public final void d() {
        this.a.a(false);
    }

    @Override // df.c
    public final void f() {
        Pattern pattern = LaunchActivity.y1;
        LaunchActivity launchActivity = this.b;
        launchActivity.getClass();
        this.a.a(true);
        launchActivity.getWindow();
    }

    @Override // df.c
    public final /* synthetic */ void a() {
    }

    @Override // df.c
    public final /* synthetic */ void c() {
    }

    @Override // df.c
    public final /* synthetic */ void e() {
    }
}

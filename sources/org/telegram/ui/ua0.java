package org.telegram.ui;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ua0 implements df.c {
    public final lf.s0 a;
    public final /* synthetic */ LaunchActivity b;

    public ua0(LaunchActivity launchActivity) {
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

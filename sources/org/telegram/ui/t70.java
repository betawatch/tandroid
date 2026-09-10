package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public abstract class t70 {
    public String F;
    public int G;
    public org.telegram.ui.ActionBar.p1 H;
    public org.telegram.ui.ActionBar.h3 I;
    public org.telegram.ui.Components.n90 b;
    public c3 d;
    public int e;
    public View f;
    public boolean h;
    public TLRPC.Chat n;
    public boolean r;
    public View s;
    public org.telegram.ui.Components.q90 v;
    public VideoPlayerHolderBase w;
    public y2 x;
    public int a = 0;
    public final org.telegram.ui.Components.j90 c = new org.telegram.ui.Components.j90();
    public final a0.i y = new a0.i();
    public ArrayList E = new ArrayList();

    public abstract int a();

    public abstract int b();

    public abstract void c(h4 h4Var, org.telegram.ui.Components.x01 x01Var);

    public abstract boolean d(TL_iv.PageBlock pageBlock, h4 h4Var);
}

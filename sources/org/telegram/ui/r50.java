package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public abstract class r50 {
    public String F;
    public int G;
    public org.telegram.ui.ActionBar.g1 H;
    public org.telegram.ui.ActionBar.w2 I;
    public org.telegram.ui.Components.x70 b;
    public z2 d;
    public int e;
    public View f;
    public boolean h;
    public TLRPC.Chat n;
    public boolean r;
    public View s;
    public org.telegram.ui.Components.a80 w;
    public VideoPlayerHolderBase x;
    public v2 y;
    public int a = 0;
    public final n2.n0 c = new n2.n0();
    public final a0.h D = new a0.h();
    public ArrayList E = new ArrayList();

    public abstract void a(e4 e4Var, org.telegram.ui.Components.qy0 qy0Var);

    public abstract boolean b(TL_iv.PageBlock pageBlock, e4 e4Var);
}

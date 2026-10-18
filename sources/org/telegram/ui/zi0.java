package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class zi0 extends yg.c {
    @Override // yg.c
    public final int getHeaderHeight() {
        return getResources().getConfiguration().orientation == 2 ? AndroidUtilities.dp(48.0f) : AndroidUtilities.dp(54.0f);
    }
}

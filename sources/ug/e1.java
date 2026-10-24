package ug;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class e1 extends yg.c {
    @Override // yg.c
    public final int getHeaderHeight() {
        return getResources().getConfiguration().orientation == 2 ? AndroidUtilities.dp(48.0f) : AndroidUtilities.dp(54.0f);
    }
}

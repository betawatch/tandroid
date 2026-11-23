package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class y41 {
    public TL_stats.PostInteractionCounters a;
    public org.telegram.messenger.fj b;

    public final int a() {
        TL_stats.PostInteractionCounters postInteractionCounters = this.a;
        if (postInteractionCounters instanceof TL_stats.TL_postInteractionCountersMessage) {
            return ((TL_stats.TL_postInteractionCountersMessage) postInteractionCounters).forwards;
        }
        if (postInteractionCounters instanceof TL_stats.TL_postInteractionCountersStory) {
            return ((TL_stats.TL_postInteractionCountersStory) postInteractionCounters).forwards;
        }
        return 0;
    }

    public final int b() {
        TL_stats.PostInteractionCounters postInteractionCounters = this.a;
        if (postInteractionCounters instanceof TL_stats.TL_postInteractionCountersMessage) {
            return ((TL_stats.TL_postInteractionCountersMessage) postInteractionCounters).msg_id;
        }
        if (postInteractionCounters instanceof TL_stats.TL_postInteractionCountersStory) {
            return ((TL_stats.TL_postInteractionCountersStory) postInteractionCounters).story_id;
        }
        return 0;
    }

    public final int c() {
        TL_stats.PostInteractionCounters postInteractionCounters = this.a;
        if (postInteractionCounters instanceof TL_stats.TL_postInteractionCountersMessage) {
            return ((TL_stats.TL_postInteractionCountersMessage) postInteractionCounters).reactions;
        }
        if (postInteractionCounters instanceof TL_stats.TL_postInteractionCountersStory) {
            return ((TL_stats.TL_postInteractionCountersStory) postInteractionCounters).reactions;
        }
        return 0;
    }

    public final int d() {
        TL_stats.PostInteractionCounters postInteractionCounters = this.a;
        if (postInteractionCounters instanceof TL_stats.TL_postInteractionCountersMessage) {
            return ((TL_stats.TL_postInteractionCountersMessage) postInteractionCounters).views;
        }
        if (postInteractionCounters instanceof TL_stats.TL_postInteractionCountersStory) {
            return ((TL_stats.TL_postInteractionCountersStory) postInteractionCounters).views;
        }
        return 0;
    }
}
